//question 24
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vowels extends JFrame {
    private JTextField inputTextField;
    private JTextField outputTextField;

    public Vowels() {
        setTitle("Vowel Counter App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Enter a string: ");
        inputTextField = new JTextField(20);

        inputPanel.add(inputLabel);
        inputPanel.add(inputTextField);

        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new FlowLayout());

        JLabel outputLabel = new JLabel("Number of vowels: ");
        outputTextField = new JTextField(10);
        outputTextField.setEditable(false);

        outputPanel.add(outputLabel);
        outputPanel.add(outputTextField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton countButton = new JButton("CountVowel");
        JButton resetButton = new JButton("Reset");
        JButton exitButton = new JButton("Exit");

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                int vowelCount = countVowels(input);
                outputTextField.setText(Integer.toString(vowelCount));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputTextField.setText("");
                outputTextField.setText("");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttonPanel.add(countButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(outputPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);
    }

    private int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Vowels().setVisible(true);
            }
        });
    }
}

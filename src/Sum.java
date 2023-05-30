import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sum extends Frame {
    private Label firstNumber;
    private Label secondNumber;
    private TextField firstNumberTF;
    private TextField secondNumberTF;
    private Button submit;
    private Label result;
    private Label multiply;

    public Sum() {
        setLayout(new FlowLayout());
        firstNumber = new Label("First Number");
        secondNumber = new Label("Second Number");
        firstNumberTF = new TextField(10);
        secondNumberTF = new TextField(10);
        submit = new Button("Submit");
        result = new Label("Result");
        multiply = new Label("Product");
        multiply.setBounds(20, 50, 80, 20);
        add(firstNumber);
        add(firstNumberTF);
        add(secondNumber);
        add(secondNumberTF);
        add(submit);
        add(result);
        add(multiply);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int first = Integer.parseInt(firstNumberTF.getText());
                int second = Integer.parseInt(secondNumberTF.getText());
                int sum = first + second;
                result.setText("Result: " + sum);
                multiply.setText("Product: " + first * second);
            }
        });
        setTitle("sum");
        setSize(300, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Sum sum = new Sum();
    }
}

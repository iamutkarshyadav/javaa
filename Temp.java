//question 14
abstract class Temperature {
    double temp;

    void setTemp(double temp) {
        this.temp = temp;
    }
    abstract void changeTemp();
}

class Fahrenheit extends Temperature {
    double ctemp;

    void changeTemp() {
        ctemp = (temp - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + ctemp);
    }
}
class Celsius extends Temperature {
    double ftemp;

    void changeTemp() {
        ftemp = (temp * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + ftemp);
    }
}

public class Temp {
    public static void main(String[] args) {
        Fahrenheit f = new Fahrenheit();
        Celsius c = new Celsius();
        f.setTemp(100);
        f.changeTemp();
        c.setTemp(37.5);
        c.changeTemp();
    }
}
// output Temperature in Celsius: 37.77777777777778
// Temperature in Fahrenheit:
// 99.5
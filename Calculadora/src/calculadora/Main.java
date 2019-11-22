
package calculadora;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public double pow(double base, double exp){
        double result = Math.pow(base, exp);
        return result;
    }
}

public class Calculator{

    public Calculator();
    public double add(double x, double y){
        return x + y;
    }

    public double minus(double x, double y){
        return x - y;
    }
    
    public double div (double x, double y){
        return x/y;
    }
}

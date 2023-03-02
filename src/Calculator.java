import calculators.CalculatorT1;
import functions.CosFunction;
import functions.SinFunction;

public class Calculator {
    public static void main(String[] args) throws Exception {

        CalculatorT1 calculatorT1 = new CalculatorT1(2);
        calculatorT1.addFunction(new CosFunction());
        calculatorT1.addFunction(new SinFunction());

        calculatorT1.doCalculation("sin", 1.57);

        calculatorT1.listMathFunction();


    }
}

package functions;
import calculators.IMathFunction;

public class CosFunction implements IMathFunction {
    private String functionName = "Cos";

    public CosFunction(){}

    @Override
    public String getName() {
        return functionName;
    }

    @Override
    public double calculate(double arg) {
        return Math.cos(arg);
    }
    
}

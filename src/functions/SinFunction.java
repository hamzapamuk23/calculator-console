package functions;
import calculators.IMathFunction;

public class SinFunction implements IMathFunction {

    private String functionName = "Sin";

    public SinFunction(){}

    @Override
    public String getName() {
        return functionName;
    }

    @Override
    public double calculate(double arg) {
        return Math.sin(arg);
    }
    
}

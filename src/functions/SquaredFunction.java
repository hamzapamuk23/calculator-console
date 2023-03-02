package functions;
import calculators.IMathFunction;

public class SquaredFunction implements IMathFunction {

    private static final String FUNCTION_NAME = "Squared";

    

    @Override
    public String getName() {
        return FUNCTION_NAME;
    }

    @Override
    public double calculate(double arg) {
        return Math.sqrt(arg);
    }
    
}

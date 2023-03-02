package functions;
import calculators.IMathFunction;

public class LogFunction implements IMathFunction  {

    private static final String functionName = "Log";

    @Override
    public String getName() {
        return functionName;
    }

    @Override
    public double calculate(double arg) {
        return Math.log(arg);
    }

}
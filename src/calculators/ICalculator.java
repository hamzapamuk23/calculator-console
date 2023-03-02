package calculators;


public interface ICalculator {

    public void addFunction(IMathFunction mathFunction);

    public void listMathFunction();

    public double doCalculation(String functionName, double arg);
    
}

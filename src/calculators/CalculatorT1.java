package calculators;

public class CalculatorT1 implements ICalculator{

    private int functionCount;
    private int currentCount = 0;

    private IMathFunction[] mathFunctions;

    //private double argument;

    public CalculatorT1(int functionCount){
        this.functionCount = functionCount;
        mathFunctions = new IMathFunction[functionCount];
    }


    @Override
    public void addFunction(IMathFunction mathFunction) {
        if(currentCount < functionCount){
            mathFunctions[currentCount] = mathFunction;
            currentCount++;
        }
        else
         System.out.println("Makineye Verilen Fonksiyon Sayısından Daha Fazla Fonksiyon Ekliyemezsiniz.");
    }

    @Override
    public void listMathFunction() {
        System.out.println("Kullanılabilir Fonksiyonlar:");
        for (IMathFunction mathFunction : mathFunctions) {
            System.out.println(mathFunction.getName());
        }
    }

    @Override
    public double doCalculation(String functionName, double arg) {
        double result = 0.0;
        boolean isFunctionFound = false;

        for (IMathFunction mathFunction : mathFunctions) {
            if(functionName.equalsIgnoreCase(mathFunction.getName())){
                result = mathFunction.calculate(arg);
                System.out.println("Result: " + result);
                isFunctionFound = true;
            }
        }
        if(!isFunctionFound)
            System.out.println("Hesap makinanızda gerekli fonksiyon bulunamadı.");

        return result;
    }
    
}

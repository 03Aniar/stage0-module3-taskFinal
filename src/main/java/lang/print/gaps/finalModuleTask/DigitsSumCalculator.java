package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int f,s,t,fo;
        f = number % 10;
        number /= 10;
        s = number % 10;
        number /= 10;
        t = number % 10;
        number /= 10;
        fo = number;
        System.out.println(f + fo + t + s);

    }
}

package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int f,s,t;
        f = number % 10;
        number /= 10;
        s = number % 10;
        number /= 10;
        t = number;
        System.out.println(f * 100 + s * 10 + t);
    }
}

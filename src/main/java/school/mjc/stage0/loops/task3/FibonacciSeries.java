package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        int result =0;
        if (lastFibonacci >= 1){
            System.out.println(a);
        }
        if (lastFibonacci >=2){
            System.out.println(b);
        }
        for (int i = 2; i <lastFibonacci;  i++) {
            result = a+b;
            System.out.println(result);
            a = b;
            b= result;
        }
    }
}

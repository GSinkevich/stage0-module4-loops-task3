package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int x = 1;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            result = result + (10 * x) -1;
            x *= 10;
        }
        System.out.println(result);
    }
}

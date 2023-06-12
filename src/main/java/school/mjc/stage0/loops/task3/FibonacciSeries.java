package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0, second = 1;
        System.out.println(first);
        if (lastFibonacci < 1)
            return;

        for (int i = 1; i < lastFibonacci; i++) {
            System.out.println(second);
            int fib = first + second;
            first = second;
            second = fib;
        }
    }
}

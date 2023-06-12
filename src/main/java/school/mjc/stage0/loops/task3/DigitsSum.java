package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        if (number < 0) {
            while (number < 0) {
                sum -= number % 10;
                number = number / 10;
            }

        } else {
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
        }
        System.out.println(sum);
    }
}

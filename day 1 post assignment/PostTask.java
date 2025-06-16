package day1;

public class PostTask {
	public static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumDigits(number / 10);
    }

    public static void main(String[] args) {
        int num = 78965;
        int result = sumDigits(num);
        System.out.println("Sum of digits of " + num + " is: " + result);
    }

}

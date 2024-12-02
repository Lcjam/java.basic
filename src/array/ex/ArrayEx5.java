package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        System.out.println(count + "개의 정수를 입력하세요:");

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = sum / count;

        System.out.print("입력한 정수의 합계: " + sum);
        System.out.println();
        System.out.print("입력한 정수의 평균: " + average);
    }
}

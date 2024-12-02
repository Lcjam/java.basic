package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {

        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {

                balance = add(balance);
            } else if (menu == 2) {
                balance = odd(balance);
            } else if (menu == 3) {
                balanceCheck(balance);
            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 접근입니다.");
            }
        }
    }
    public static int add(int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입금액을 입력하세요: ");
        int add = sc.nextInt();
        balance += add;
        System.out.println(add + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }
    public static int odd(int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출금액을 입력하세요: ");
        int odd = sc.nextInt();
        if (odd <= balance) {
            balance -= odd;
            System.out.println(odd + "원을 입금하였습니다. 현재 잔액: " + balance);
            return balance;
        } else {
            System.out.println(odd + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
    }
    public static void balanceCheck(int balance) {
        System.out.println("현재 잔액: " + balance);
    }
}

package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        for (; ; ) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = sc.nextLine();
                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = sc.nextInt();
                sc.nextLine();
                continue;
            }
            if (menu == 2) {
                for (int i = 0; i <= productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i]);
                }
                continue;
            }

            if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}

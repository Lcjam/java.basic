package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return; //void일 경우 생략가능하다. 아래 메소드 참고
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}

package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        loop("Hello, world!",3);
    }

    public static void loop(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}


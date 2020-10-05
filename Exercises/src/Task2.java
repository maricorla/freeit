public class Task2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int result = method(a, b);
        System.out.println(result);

    }

    public static int method(int a, int b) {
        int c = 0;
        for (int i = 0; i < b; i++) {
            c += a;
        }
        return c;


    }
}


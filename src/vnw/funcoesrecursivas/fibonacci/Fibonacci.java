package vnw.funcoesrecursivas.fibonacci;

public class Fibonacci {

    public static int fibonacci(int num) {

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
        // 0, 1, 2, 3, 4, 5, 6,  7,  8,  9, 10, 11,  12

        if ((num == 1) || (num == 2)) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {

        System.out.println(fibonacci(12));
    }
}
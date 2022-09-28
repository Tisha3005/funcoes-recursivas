package vnw.funcoesrecursivas.fatorial;

public class Fatorial {

    public static long fatorial(long num) {

//        0! = 1
//        1! = 1
//        2! = 2 . 1 = 2
//        3! = 3 . 2 . 1 = 6
//        4! = 4. 3 . 2 . 1 = 24
//        5! = 5 . 4 . 3 . 2 . 1 = 120

        if (num <= 1)
            return 1;
        else return num * fatorial(num - 1);
    }

    public static void main(String args[]) {

        System.out.println(fatorial(5));
    }
}
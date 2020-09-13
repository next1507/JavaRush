public class sravn3chisel {
    public static int min(int a, int b, int c) {
        int m;
        if (a <= b && a <=c)
            m = a;
        else if (b <= c && b <=a)
            m = b;
        else
            m = c;
        return m;//напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(min(2, 3, 1));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}

public class sravn4chisel {
    public static int min(int a, int b, int c, int d) {
        int n = min(a, b); // n трансформировалась в min(a,b)
        if (a <= b && a <= c && a <= d)
        n = a;
            else if (b <= a && b <= c && b <= d)
                n = b;
            else if (c<=a && c <= b && c <= d)
                n = c;
            else
                n = d;
            return n;//напишите тут ваш код
    }
    public static int min(int a, int b) {
        int m;
        if (a < b)
            m = a;
        else
            m = b;
        return m;//напишите тут ваш код
    }
    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}

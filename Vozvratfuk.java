public class Vozvratfuk {
    public static int min(int a, int b) {
int m;
        if (a < b)
            m = a;
        else
            m =b;
           //напишите тут ваш код
        return m;
            }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }

}

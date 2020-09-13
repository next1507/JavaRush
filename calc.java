public class calc {
    public static int min(int a, int b) {
          int m = min(a, b);
          if (a < b)
              m = a;
          else
              m =b;
        return m;//напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }


}
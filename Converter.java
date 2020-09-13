public class Converter {

        public static void main(String[] args) {
            System.out.println(convertCelsiusToFahrenheit(41));
        }

        public static double convertCelsiusToFahrenheit(int celsius) {
            double TF;
            TF = (9.0/5*celsius + 32);//напишите тут ваш код
            return TF;
        }
}

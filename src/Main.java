import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //1.
        System.out.println("Exercise number 1:");
        printMyName();
        //2.
        System.out.println("Exercise number 2:");
        System.out.println("Rezultatul adunarii este: " + sum(5, 5));
        System.out.println("Rezultatul scaderii este: " + subtraction(7, 3));
        System.out.println("Rezultatul impartirii este: " + division(100, 40));
        System.out.println("Rezultatul inmultirii este: " + multiplication(49, 3));
        //3.
        System.out.println("Exercise number 3:");
        String result = JavaLogo();
        System.out.println(result);
        //4.

        //5.
        System.out.println("Exercise number 5:");
        String Frankenstein = Frank();
        System.out.println(Frankenstein);
        //6.
        System.out.println("Exercise number 6:");
        System.out.println("Rezultatul impartirii este: " + result6(5, 2));
        //7.
        System.out.println("Exercise number 7:");
        double celsius = temperature (150);
        System.out.println("Temperatura convertita in celsius este de: " + celsius + "\n");
        //8.
        System.out.println("Exercise number 8:");
        float metri = distance(100);
        System.out.println("Distanta convertita in metri este de: " + metri +"\n");
        //9.
    }

    //1.
    public static void printMyName() {

        System.out.println("Hello \n Nicola");

    }

    //2.
    public static int sum(int FirstNumber, int SecondNumber) {
        int result = FirstNumber + SecondNumber;
        return result;
    }

    public static int subtraction(int FirstNumber, int SecondNumber) {
        int result = FirstNumber - SecondNumber;
        return result;
    }

    public static double division(double FirstNumber, double SecondNumber) {
        double result = FirstNumber / SecondNumber;
        return result;
    }

    public static int multiplication(int FirstNumber, int SecondNumber) {
        int result = FirstNumber * SecondNumber;
        return result;
    }

    //3.
    public static String JavaLogo() {
        String result = ("" +
                "   J    a   v     v  a\n" +
                "   J   a a   v   v  a a\n" +
                "J  J  aaaaa   v v  aaaaa\n" +
                " JJ  a     a   v  a     a");
        return result;
    }

    //4.

    //5.
    public static String Frank () {
        String Frankenstein = ("  +\"\"\"\"\"+\n" +
                " [| ° ° |] \n" +
                "  |  ^  | \n" +
                "  | '_' | \n" +
                "  +-----+");
        return Frankenstein;
    }

    //6.
    public static double result6(double Numerouno, double Numeroduo) {
        double result6 = Numerouno / Numeroduo;
        return result6;
    }

    //7.
    public static double temperature (double Fahrenheit){

        double celsius = ((Fahrenheit-32)*5d/9);
        return celsius;
    }

    //8.
    public static float distance (float inch) {
        float metri = (inch * 0.0254F);
        return metri;
    }

    //9.
}







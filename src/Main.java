import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int number1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz");
        int number2 = scanner.nextInt();

        System.out.println("Yapacağınız işlemi seçiniz :\n1.Toplama\n2.Çıkartma\n3.Çarpma\n4.Bölme");
        int data = scanner.nextInt();

        switch (data) {
            case 1:
                System.out.println("Toplama işlemi : " + number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkartma işlemi : " + number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma işlemi : " + number1 + " x " + number2 + " = " + (number1 * number2));
                break;
            case 4:
                System.out.println("Bölme işlemi : " + number1 + " / " + number2 + " = " + (double) number1 / number2);
                break;
            default:
                System.out.println("geçersiz bir işlem girdiniz");
                break;

        }
    }
}

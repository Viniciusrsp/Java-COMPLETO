import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        if(codigo == 1) {
            System.out.printf("TOTAL: R$ %.2f", quantidade * 4.0);
        }
        else if(codigo == 2) {
            System.out.printf("TOTAL: R$ %.2f", quantidade * 4.5);
        }
        else if(codigo == 3) {
            System.out.printf("TOTAL: R$ %.2f", quantidade * 5.0);
        }
        else if(codigo == 4) {
            System.out.printf("TOTAL: R$ %.2f", quantidade * 2.0);
        }
        else {
            System.out.printf("TOTAL: R$ %.2f", quantidade * 1.5);
        }

        sc.close();
    }
}

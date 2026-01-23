import java.util.Scanner;

public class Ex03 {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        System.out.printf("DIFERENCA = %d\n", a * b - c * d);

        sc.close();
    }
}

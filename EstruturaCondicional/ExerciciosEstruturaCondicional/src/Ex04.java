import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int duracao;

        if (a < b) {
            duracao = b - a;
        }
        else {
            duracao = 24 - a + b;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}

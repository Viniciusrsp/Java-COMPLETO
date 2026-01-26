import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == 0 || b == 0){
            System.out.println("ERRO! DIVISAO POR 0");
        }
        else if (a % b == 0 || b % a == 0){
            System.out.println("SAO MULTIPLOS");
        }
        else{
            System.out.println("NAO SAO MULTIPLOS");
        }

        sc.close();
    }
}

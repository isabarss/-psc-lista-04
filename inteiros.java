package PSCexerciciosDaniel;
import java.util.Scanner;
public class inteiros {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1,num2;

        System.out.println("Digite o numero 1: ");
        num1 = leia.nextInt();
        System.out.println("Digite o numero 2: ");
        num2 = leia.nextInt();

        if (num1 >= num2) {
            System.out.println("O número 1 deve ser menor que o número 2.");
        } else {
            System.out.println("Números entre " + num1 + " e " + num2 + ":");
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
            }
        }

        leia.close();
    }
}

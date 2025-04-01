package PSCexerciciosDaniel;
import java.util.Scanner;
 public class numMaior {
    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
     int numero;
        
        System.out.println("Digite o número 1: ");
        int maior = leia.nextInt();

        for (int i = 2; i <= 5; i++) {
            System.out.println("Digite o número: ");
            numero = leia.nextInt();

         if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);

        leia.close();
     }
    }
 

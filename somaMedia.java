package PSCexerciciosDaniel;
import java.util.Scanner;
public class somaMedia {
    public static void main(String [] args) {
        Scanner leia = new Scanner(System.in);
        int numero, media;
        int soma = 0;

       

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o numero " + i +":");
            numero = leia.nextInt();
            soma += numero;
            
        }

        System.out.println("A soma dos numeros é: " + soma);
        media = soma / 5;
        System.out.println("A média aritmética é: " + media);
        leia.close();
    }
    }


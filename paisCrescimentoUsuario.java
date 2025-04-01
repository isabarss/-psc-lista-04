package PSCexerciciosDaniel;
import java.util.Scanner;
public class paisCrescimento {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int paisA,paisB;
        int anos = 0;
        double taxaA,taxaB;
         
        System.out.println("Digite o numero da população do país A: ");
        paisA = leia.nextInt();
        System.out.println("Qual numero da taxa de crescimento anual do país A? ");
        taxaA = leia.nextDouble();
        System.out.println("Digite o numero da população do país B: ");
        paisB = leia.nextInt();
        System.out.println("Qual numero da taxa de crescimento anual do país B? ");
        taxaB = leia.nextDouble();

        while (paisA <= paisB) {
            paisA += paisA * taxaA;
            paisB += paisB * taxaB;
            anos++;
        }

        System.out.println("Vai ser necessários " + anos + " anos para que a população do país A ultrapasse ou se iguale a população do país B.");
        System.out.println("População do país A: " + paisA);
        System.out.println("População do país B: " + paisB);
        

        leia.close();
    }
}

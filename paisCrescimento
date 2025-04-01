package PSCexerciciosDaniel;
import java.util.Scanner;
public class paisCrescimento {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int paisA = 80000;
        int paisB = 200000;
        int anos = 0;

        while (paisA < paisB) {
            paisA += paisA * 0.03;
            paisB += paisB * 0.015;
            anos++;
        }

        System.out.println("Vai ser necessários " + anos + " anos para que a população do país A ultrapasse a população do país B.");
        System.out.println("População do país A: " + paisA);
        System.out.println("População do país B: " + paisB);
        

        leia.close();
    }
}

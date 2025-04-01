package PSCexerciciosDaniel;
import java.util.Scanner;
public class impares {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);

       for (int i = 1; i <=50; i++) {
        if (i % 2 != 0) {
            System.out.println(i);
        }
       }
       leia.close();
    }
    
}

package PSCexerciciosDaniel;
import java.util.Scanner;
public class usuarioSenha {
    public static void main(String[] args) {
        java.util.Scanner leia = new Scanner(System.in);
        String usuario,senha;

        System.out.println("Digite um nome de usuário: ");
        usuario = leia.next();
        System.out.println("Digite uma senha: ");
        senha = leia.next();

        while (senha.equals(usuario)) {
            System.out.println("Sua senha não pode ser idêntica ao seu usuário. Tente novamente. ");
            System.out.println("Digite uma senha: ");
            senha = leia.next();

        }

        System.out.println("Seu usuário é: " + usuario + " e seu senha é: " + senha);
        leia.close();
    }
    
}

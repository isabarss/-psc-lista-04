package PSCexerciciosDaniel;
import java.util.Scanner;
public class dados {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo,estadoCivil;

        System.out.println("Digite seu nome: ");
        nome = leia.next();
        while (nome.length() < 3) {
            System.out.println("Nome inválido. Tente um nome com mais de 3 caracteres. ");
            System.out.println("Digite seu nome: ");
            nome = leia.next();
        }

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        while (idade < 0 || idade > 100) {
        System.out.println("Idade inválida! Tente novamente. ");
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        }

        System.out.println("Digite seu salário: ");
        salario = leia.nextDouble();
        while (salario <= 0) {
        System.out.println("Salário inválido! Tente novamente. ");
        System.out.println("Digite seu sálario: ");
        salario = leia.nextDouble();
        }

        System.out.println("Digite seu sexo (m/f): ");
        sexo = leia.next().charAt(0);
        while (sexo != 'f' && sexo != 'm') {
            System.out.println("Sexo inválido! Tente novamente. ");
            System.out.println("Digite seu sexo: ");
            sexo = leia.next().charAt(0);
        }
        
        System.out.println("Digite seu Estado Civil (s/c/v/d): ");
        estadoCivil = leia.next().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'd' && estadoCivil != 'v' && estadoCivil != 'd' ) {
            System.out.println("Estado civil inválido! Tente novamente. ");
            System.out.println("Digite seu estado civil: ");
            estadoCivil = leia.next().charAt(0);
        }

        System.out.println("Seu nome é: " + nome + ", sua idade é: " + idade + (", seu salário é: " + salario + ", seu sexo é: " + sexo + " e seu estado cívil é: " + estadoCivil));
        leia.close();
    }
}

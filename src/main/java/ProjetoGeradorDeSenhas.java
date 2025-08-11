import java.security.SecureRandom;
import java.util.Scanner;

public class ProjetoGeradorDeSenhas {

    private static final String CARACTERES = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ0123456789!@#$%&*()_+-=[]|,./?><";


    public static String gerarSenha(int comprimento){
        SecureRandom geradorDeNumeroAleatorio = new SecureRandom();
        StringBuilder senha = new StringBuilder(comprimento); // String mais dinâmica

        for (int i = 0; i < comprimento; i++){
             int indice = geradorDeNumeroAleatorio.nextInt(CARACTERES.length());
             senha.append(CARACTERES.charAt(indice));

        }

         return senha.toString();
    }

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in); //Cria um scanner para ler do teclado
        System.out.print("Digite o comprimento da senha que deseja: "); // Lê o comprimento da senha digitado
        int comprimentoSenha = scanner.nextInt(); // Lê o comprimento da senha digitado
        String senha = gerarSenha(comprimentoSenha);
        System.out.println("Senha gerada: " + senha);



    }

}



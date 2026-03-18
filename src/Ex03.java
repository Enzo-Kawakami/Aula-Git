import java.util.Scanner;

public class Ex03 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite seu Nickname: ");
        String nome = sc.nextLine();
        IO.println("Qual o seu jogo favorito: ");
        String jogo = sc.nextLine();

        IO.println("Seu Nick é: "+ nome);
        IO.println("O seu jogo favorito é: "+ jogo);
        IO.println("Sua pontuação é de 9999");
    }
}

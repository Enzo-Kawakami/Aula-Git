import java.util.Scanner;

public class Ex02 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite seu Nome: ");
        String nome = sc.nextLine();
        IO.println("Escolha seu Prato: Miojo, Ratazana ou X-Ratão ");
        String opcao = sc.nextLine();

        switch (opcao){
            case "Miojo":
                IO.println(nome +" Aproveite seu Miojo");
                IO.println("Valor do Prato: R$200,00");
                break;
            case "Ratazana":
                IO.println(nome +" Aproveite sua Ratazana");
                IO.println("Valor do Prato: R$199,99");
                break;
            case "X-Ratão":
                IO.println(nome +" Banheiro logo a sua direita");
                IO.println("Valor do Prato: R$999,99");

            default:
                IO.println("Não temos no Cardapio");
        }
    }
}

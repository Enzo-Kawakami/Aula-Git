import java.util.Scanner;


public class Loop2 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um número (ou 0 para sair): ");
        int numero = sc.nextInt();


        while (numero != 0) {
            if (numero % 2 == 0) {
                IO.println("O número " + numero + " é PAR.");
            } else {
                IO.println("O número " + numero + " é ÍMPAR.");
            }
            IO.println("Digite outro número (ou 0 para sair): ");
            numero = sc.nextInt();
        }
        IO.println("Você digitou 0. Programa encerrado!");
    }
}


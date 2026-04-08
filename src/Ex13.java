import java.util.Scanner;

public class Ex13 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("O Quanto de Dados Disponiveis(em GB)");
        double GB = sc.nextDouble();
        IO.println("Quanto que tu usou de Dados(em GB)");
        double gb = sc.nextDouble();

        double valor = (GB/gb);

        IO.println(valor);

    }
}

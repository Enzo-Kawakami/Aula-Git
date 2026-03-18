import java.util.Scanner;

public class Ex04 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Quantos passos se deu: ");
        int passo = sc.nextInt();
        int valor;
        if (passo >=0 & passo <=9999){
            IO.println("Voce Não Bateu a Meta");
            valor = (10000 - passo);
            IO.println("Voce ainda tem que andar: "+ valor +" passos");
        }else if (passo == 10000){
            IO.println("Voce Bateu a Meta Continue Assim!");
        }else if (passo > 10000){
            valor = (passo - 10000) ;
            IO.println("Voce foi bem "+ valor + " a mais que a Meta");
        }else
            IO.println("Passos invalidos");

    }
}

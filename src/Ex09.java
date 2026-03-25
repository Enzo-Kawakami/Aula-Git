import java.util.Scanner;

public class Ex09 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o Valor da Compra: ");
        double compra = sc.nextDouble();

        if(compra >=100){
            IO.println("Voce Ganhou Frete Grátis");
            IO.print("Aproveite sua Compra");
        }else if(compra >=0 & compra <100){
            IO.println("Voce poderia fazer mais compras");
            IO.print("Para poder Ganhar Frete Gratis");
        }else
            IO.println("Valor Invalido");
    }
}

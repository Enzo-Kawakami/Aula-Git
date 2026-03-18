import java.util.Scanner;

public class Ex05 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Quanto se conseguiu guardar: ");
        double money = sc.nextDouble();
        double valor;

        if (money >=0 & money <500){
            IO.println("Voce nao bateu a meta");
            valor = (500 - money);
            IO.println("Ainda falta: R$"+valor);
        }else if (money == 500){
            IO.println("Voce Atingiu a meta");
        }else if (money >500){
            IO.println("Voce ultrapassou a meta");
            valor = (money - 500);
            IO.println("Voce ganhou: R$"+valor +" a mais");
        }else
            IO.println("Voce ta Gastando?");

    }
}

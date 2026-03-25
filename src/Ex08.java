import java.util.Scanner;

public class Ex08 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            IO.println("Pode Entrar na Festa");
        }else if (idade >=0 & idade <18){
            IO.println("Nao pode entrar");

        }else
            IO.println("VAZA!!");
    }
}

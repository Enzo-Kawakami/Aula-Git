import java.util.Scanner;

public class Ex07 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite sua Nota Final: ");
        double nota = sc.nextDouble();

        if (nota >=7){
            IO.println("Aprovado");
        }else
            IO.println("Reprovado");
    }
}

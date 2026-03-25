import java.util.Scanner;

public class Ex06 {
    void main(){
        Scanner sc = new Scanner (System.in);
        IO.println("Digite Quantas Horas voce Estudou: ");
        double hora = sc.nextDouble();
        double valor;

        if (hora <40){
            IO.println("Voce não bateu a meta");
            valor = (40 - hora);
            IO.println("Ainda falta: "+ valor+"horas");
            IO.print("Vai Estudar!");

        }else if(hora >40){
            IO.println("Parabens Voce Ultrapassou a Meta!");
            valor = (hora - 40);
            IO.println("Voce Estudou: "+ valor+"horas a mais");

        }else
            IO.println("Voce bateu a Meta");


    }
}

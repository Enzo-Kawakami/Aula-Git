import java.util.Scanner;

public class Ex12 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Quantas aulas se tem pelo longo do curso: ");
        int aula = sc.nextInt();
        IO.println("Quantas aulas voce assistiu: ");
        int aluno = sc.nextInt();

        double valor = (aula / aluno)*100;
        IO.println("O seu percentual é: "+valor+"%");

        if(valor <50.0){
            IO.println("Voce esta começando o curso");
        }else if(valor >=50.0 & valor <100){
            IO.println("Voce esta Avançando bem");
        }else
            IO.println("Parabens! Curso Concluido");
    }
}

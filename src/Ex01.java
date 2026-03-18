import java.util.Scanner;

public class Ex01 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o seu Nome: ");
        String nome= sc.nextLine();
        IO.println("Qual curso voce esta: ");
        String curso = sc.nextLine();
        IO.println("Digite sua Idade: ");
        int idade = sc.nextInt();
      if (idade >=0 & idade <18){

          IO.println("Nao pode");
      }else if (idade >= 18 & idade <=200){
          IO.println("Pode entra");
          IO.println("      ");
          IO.println("Imformações do Aluno");

          IO.println("      ");
          IO.println("Seu curso é: "+ curso);
          IO.println("Seu nome é: "+ nome);
          IO.println("Sua idade é: "+ idade);
      }else
          IO.println("COMO TU TA VIVO!?");




    }
}

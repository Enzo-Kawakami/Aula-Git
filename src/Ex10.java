import java.util.Scanner;

public class Ex10 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Quantas paginas voce leu hoje?");
        int pag = sc.nextInt();
        int valor;
        if(pag >0 & pag <300){
            IO.println("Voce ainda nao terminou");
            valor = (300 - pag);
            IO.println("Ainda falta "+valor+" paginas");
        }else if(pag == 300){
            IO.println("Voce concluiu o livro");
        }else if(pag <0){
            IO.println("NÃO RASGUE O LIVRO!");
        }else
            IO.println("Voce esta lendo outro livro?");
    }
}

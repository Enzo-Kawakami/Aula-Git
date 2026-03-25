import java.util.Scanner;

public class Ex11 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("O Quanto o Dowload esta (em GB)");
        double gb = sc.nextDouble();
        double total = 2.0;

        double valor = (gb / total)*100;

        IO.println("O Dowload esta em "+valor+"%");

    }
}

import java.util.Scanner;

public class Uri1017{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int tempo, velocidade;
        double litros, qtde;

        // entrada
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();

        // processamento
        qtde = tempo * velocidade / 12.0;

        // saída
        System.out.printf("%.3f%n", qtde);
    }

}
import java.util.Scanner;

public class Uri1005{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, MEDIA;

        // entra = ler os valores de A e B
        A = teclado.nextDouble();
        B = teclado.nextDouble();

        // processamento = calcule a média do aluno
        MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0;

        // saída = exibir o valor de SOMA
        System.out.printf("MEDIA = %.5f%n", MEDIA);
    }

}
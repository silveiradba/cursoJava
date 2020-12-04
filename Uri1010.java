import java.util.Scanner;

public class Uri1010{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int c1, c2, q1, q2;
        double v1, v2, pagar;

        // entrada
        c1 = teclado.nextInt();
        q1 = teclado.nextInt();
        v1 = teclado.nextDouble();

        c2 = teclado.nextInt();
        q2 = teclado.nextInt();
        v2 = teclado.nextDouble();

        // processamento
        pagar = ((q1 * v1) + (q2 * v2));

        // saída
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagar);
    }

}
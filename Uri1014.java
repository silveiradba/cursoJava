import java.util.Scanner;

public class Uri1014{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        double Y, consumo;

        // entrada
        X = teclado.nextInt();
        Y = teclado.nextDouble();

        // processamento
        consumo = X / Y;

        // saída
        System.out.printf("%.3f km/l%n", consumo);
    }

}
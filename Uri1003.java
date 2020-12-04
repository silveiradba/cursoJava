import java.util.Scanner;

public class Uri1003{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, SOMA;

        // entra = ler os valores de A e B
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento = somar ambos os valores e armazenar em SOMA
        SOMA = A + B;

        // saída = exibir o valor de SOMA
        System.out.println("SOMA = " + SOMA);
    }

}
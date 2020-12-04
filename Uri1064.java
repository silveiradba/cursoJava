import java.util.Scanner;

public class Uri1064{

    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int i, qtdePositivos = 0;
        double valor, media = 0;

        for(i = 1; i <= 6; i++){
            valor = teclado.nextDouble();
            if(valor > 0){
                qtdePositivos++;
                media = media + valor;
            }
        }

        media = (media / qtdePositivos);

        System.out.println(qtdePositivos+ " valores positivos");
        System.out.printf("%.1f%n", media);

    }

}
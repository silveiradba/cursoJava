import java.util.Scanner;

public class Uri1065{

    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int i, valor, qtdePositivos = 0;

        for(i = 1; i <=5; i++){
            valor = teclado.nextInt();
            if(valor % 2 == 0){
                qtdePositivos++;
            }
        }
        System.out.println(qtdePositivos+ " valores pares");
    }
}
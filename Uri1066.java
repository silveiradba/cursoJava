import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int i, valor, qtdePares=0, qtdeImpares=0, qtdePositivos=0, qtdeNegativos=0;

        for(i=1; i <=5; i++){
            
            valor = teclado.nextInt();

            if(valor % 2 == 0){
                qtdePares++;
            } else {
                qtdeImpares++;
            }
            if(valor > 0){
                qtdePositivos++;
            } else if (valor < 0){
                qtdeNegativos++;
            }                
        }
        System.out.println(qtdePares+ " valor(es) par(es)");
        System.out.println(qtdeImpares+ " valor(es) impar(es)");
        System.out.println(qtdePositivos+ " valor(es) positivo(s)");
        System.out.println(qtdeNegativos+ " valor(es) negativo(s)");
    }
}
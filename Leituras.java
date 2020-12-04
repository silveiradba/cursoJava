import java.util.Scanner;
public class Leituras{
    public static void main(String args[]){
        Scanner teclado; // declaro um componente do tipo Scanner e chamo de teclado
        teclado = new Scanner(System.in); // este componente irá ler dados do dispositivo de entrada
        int a;
        float b;
        double c;
        System.out.println("Por favor, digite um valor inteiro");
        a = teclado.nextInt();
        System.out.println("Voce digitou " + a);

        System.out.println("Agora digite um valor float ");
        b = teclado.nextFloat();
        System.out.println("Voce digitou " + b);

        System.out.println("Digite outro valor double ");
        c = teclado.nextDouble();
        System.out.println("Voce digitou "+ c);    
   }
}
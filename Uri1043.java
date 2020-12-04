import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float A,B,C;
        float RES;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        /*
        Como saber se é um triângulo? A soma de 2 lados quaisquer tem que ser maior que o 3o lado
        para todos eles (todas as combinações)
        */
        if (A+B > C && B+C > A && A+C > B){
            RES = A + B + C;
            System.out.printf("Perimetro = %.1f%n",RES);
        }
        else{
            RES = (A+B)*C/2;
            System.out.printf("Area = %.1f%n",RES);
        }
    }
}
import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        int num=1;

        for (int cont = 1; cont <= N; cont++){
            System.out.println(num + " " + (num+1)+" "+ (num+2)+ " PUM");
            num += 4;
        }
    }
}
import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int i=1, x;

        x = teclado.nextInt();

        while(i<=6){
            if(x % 2 != 0){
                System.out.println(x);
                i++;
            }
            x++;
        }
    }
}
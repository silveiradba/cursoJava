import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int combustivel;
        int qtAlcool=0;
        int qtGasolina=0;
        int qtDiesel=0;

        do{
            combustivel = teclado.nextInt();
            if (combustivel == 1){
                qtAlcool++;
            }
            else if (combustivel == 2){
                qtGasolina++;
            }
            else if (combustivel == 3){
                qtDiesel++;
            }
        } while (combustivel != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+qtAlcool);
        System.out.println("Gasolina: "+qtGasolina);
        System.out.println("Diesel: "+qtDiesel);
    }
}
public class Continhas{
    public static void main(String args[]){
        
        int a,b,c;
        a = 11;
        b = 4;
        c = a + b;
        
        System.out.println("Valor da soma = " + c);
        c = a - b;
        System.out.println("Valor da subtracao = " + c);
        c = a * b;
        System.out.println("Valor da multiplicacao = " + c);
        c = a / b;
        System.out.println("Valor da divisao = " + c);
        c = a % b;
        System.out.println("Valor da resto = " + c);

        float f;
        //f = 11/4;
        //f = 11f/4; //funcionou
        //f = 11.0f/4; //funcionou
        f = (float)11/4; //funcionou
        
        System.out.println("Valor da divisao quebrada = " + f);

    }
}
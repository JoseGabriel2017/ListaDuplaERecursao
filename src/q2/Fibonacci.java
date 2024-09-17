package q2;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Série de Fibonacci até passar de 100:");
        int i = 0;
        while (true) {
            int valor = fibonacci(i);
            if (valor > 145)
                break;
            System.out.print(valor + " ");
            i++;
        }

        //chamando codigo de Igor
        System.out.println(imprimirSequencia(100));

    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //codigo de Igor
    public static int calcularFib(int a){

        if (a<=1){

            return a;

        }else{

            return calcularFib(a-1) + calcularFib(a-2);
        }

    }

    public static String imprimirSequencia(int qtd){

        String seq="[";

        for(int cont=0; cont<qtd;cont++){
 
            seq += calcularFib(cont) + " ";

            if(calcularFib(cont)>100){
                break;
            }
        }

        seq += "]";

        return seq;
    }

    
    
}

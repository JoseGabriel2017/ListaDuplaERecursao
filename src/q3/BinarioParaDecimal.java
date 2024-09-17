package q3;

import java.util.Scanner;

public class BinarioParaDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String binario = input.nextLine();
        int decimal = binarioParaDecimal(binario, binario.length() - 1);
        System.out.println("O número binário " + binario + " em decimal é: " + decimal);
    }

    //tentei, mas não consegui, pedi ajuda do GPT e não entendi
    public static int binarioParaDecimal(String binario, int posicao) {
        if (posicao < 0)
            return 0;
        int digito = binario.charAt(posicao) - '0';
        return (digito * (int) Math.pow(2, binario.length() - 1 - posicao)) + binarioParaDecimal(binario, posicao - 1);
    }

    public int decimal(String binario){
        
        int tamanho = binario.length();
        int bit = Integer.parseInt(binario.substring(0, 1));
        String bitrestante = binario.substring(1);

        if(tamanho>0){

            return bit*(int) Math.pow(2, bit);
        }
    }
}

package q5;

public class BinarioParaDecimal {
    public class DecimalToBinary {
    

        public static String decimalToBinary(int n) {

            if (n == 0) {
                return "0";
            }

            if (n == 1) {
                return "1";
             

            return decimalToBinary(n / 2) + (n % 2);
        }
    
        public static void main(String[] args) {
            int numeroDecimal = 1000;
            String binario = decimalToBinary(numeroDecimal);
            System.out.println("O número decimal " + numeroDecimal + " em binário é: " + binario);
        }
    }
    
}

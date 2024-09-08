package q4;

import java.util.Scanner;
import java.util.Stack;

public class Palindromo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String palavra = input.nextLine();
        boolean resultado = verificarPalindromo(palavra);
        System.out.println("A palavra '" + palavra + "' é um palíndromo? " + resultado);
    }

    public static boolean verificarPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        StringBuilder reverso = new StringBuilder();
        while (!pilha.isEmpty()) {
            reverso.append(pilha.pop());
        }

        return palavra.equals(reverso.toString());
    }
}

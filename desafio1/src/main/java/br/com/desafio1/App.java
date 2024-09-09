package br.com.desafio1;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int index = 12;
        int sum = 0;
        int k = 1;

        while (k < index) {
            k = k + 1;
            sum = sum + k;
        }

        // O valor da soma é 77
        System.out.println("O valor da soma é " + sum);
    }
}

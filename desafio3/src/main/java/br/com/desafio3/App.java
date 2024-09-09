package br.com.desafio3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Array simulando os 365 dias do ano
        int[] billingDailyOfBusinessWith0 = { 2500, 430, 0, 590, 10000 };

        int[] billingDailyOfBusiness = prepareArrayOfBilling(billingDailyOfBusinessWith0);
        int lowValue = calculeLowValueBillingDailyInAYear(billingDailyOfBusiness);
        int highValue = calculeHighValueBillingDailyInAYear(billingDailyOfBusiness);
        int media = calculeMedia(billingDailyOfBusiness);
        int[] valuesHighOfWhatMedia = calculeValuesHighOfWhatMedia(billingDailyOfBusiness, media);
        String valuesShowed = prepareString(valuesHighOfWhatMedia);

        System.out.println("O menor valor é: " + lowValue);
        System.out.println("O maior valor é: " + highValue);
        System.out.println("Os maiores valores acima da média " + media + " é: " + valuesShowed);
    }

    private static String prepareString(int[] array) {
        return Arrays.toString(array);
    }

    private static int[] prepareArrayOfBilling(int[] array) {
        int[] newValues;
        int quantityIfZero = 0;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                quantityIfZero++;
            }
        }

        newValues = new int[array.length - quantityIfZero];

        int index = 0;

        for (int i = quantityIfZero; i < array.length; i++) {
            newValues[index] = array[i];
            index++;
        }

        return newValues;
    }

    private static int calculeLowValueBillingDailyInAYear(int[] array) {
        return array[0];
    }

    private static int calculeHighValueBillingDailyInAYear(int[] array) {
        return array[array.length - 1];
    }

    private static int calculeMedia(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum / array.length;
    }

    private static int[] calculeValuesHighOfWhatMedia(int[] array, int media) {
        int[] newValuesHighWhatMedia;

        newValuesHighWhatMedia = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                newValuesHighWhatMedia[i] = array[i];
            }
        }

        return prepareArrayOfBilling(newValuesHighWhatMedia);
    }
}

package module6;

public final class ArraysUtils {

    static int sum(int array[])
    {
        int suma = 0;
        for (int balance:array)
            suma += balance;
        return suma;
    }

    static int max (int[] array)
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    static int min (int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    static int maxPozitive (int[] array)
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    static int modulus (int[]array)
    {
        int res = 0;
        if (array[array.length-1] == 0)
            res = -1;
        else res = array [0] % array[array.length-1];
        return res;
    }

    static int multiplication (int array[])
    {
        int res = 1;
        for (int balance:array)
            res *= balance;
        return res;
    }

    static int secondLargest (int[] array)
    {
        int min = array[0];
        int max = min;
        int secondLargest = max;
        for (int i = 1; i < array.length; i++){
            if (array[i] > max) max = array[i];
        }
        for (int j=0; j< array.length; j++){
            if (array[j] < max && array[j] > min) min = array[j];
            secondLargest = min;
        }
        return secondLargest;
    }

  static  int[] reverse(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int b = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]=b;}
        return array;
    }




  static  int[] findEvenElements(int[] array){
        int count = 0;
        int arrayHelp [];
        int b = 0;
        for(int i=0; i < array.length; i++){
            if (array[i]%2 == 0)
                count++;}
        arrayHelp = new int [count];
        for(int i=0; i < array.length; i++)
            if (array[i]%2 == 0) {
                arrayHelp[b] = array[i];
                b++;
            }
        return arrayHelp;
    }


}

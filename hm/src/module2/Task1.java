package module2;


public class Task1 {
    static int max (int[] balances1)
    {
        int max = balances1[0];
        for (int i = 1; i < balances1.length; i++){
            if (balances1[i] > max) max = balances1[i];
        }
        return max;
    }

    static double max (double[] balancesd1)
    {
        double max = balancesd1[0];
        for (int i = 1; i< balancesd1.length; i++){
            if (balancesd1[i] > max) max = balancesd1[i];
        }
        return max;
    }

    static int min (int[] balances2) {
        int min = balances2[0];
        for (int i = 1; i < balances2.length; ++i) {
            if (balances2[i] < min) min = balances2[i];
        }
        return min;
    }

    static double min (double[] balancesd2){
        double min = balancesd2[0];
        for (int i = 1; i < balancesd2.length; ++i) {
            if (balancesd2[i] < min) min = balancesd2[i];
        }
        return min;
    }

    static int maxPozitive (int[] balances)
    {
        int max = balances[0];
        for (int i = 1; i < balances.length; i++){
            if (balances[i] > max) max = balances[i];
        }
        return max;
    }

    static double maxPozitive (double[] balancesd)
    {
        double max = balancesd[0];
        for (int i = 1; i< balancesd.length; i++){
            if (balancesd[i] > max) max = balancesd[i];
        }
        return max;
    }

    static int modulus (int[]balances3)
    {
        int res = 0;
        if (balances3[balances3.length-1] == 0)
            res = -1;
        else res = balances3 [0] % balances3[balances3.length-1];
        return res;
    }

    static double modulus (double[]balancesd3)
    {
        double res = 0;
        if (balancesd3 [balancesd3.length-1] == 0)
            res = -1;
        else res = balancesd3 [0] % balancesd3 [balancesd3.length-1];
        return res;
    }

    static int multiplication (int balances4[])
    {
        int res = 1;
        for (int balance:balances4)
            res *= balance;
        return res;
    }
    static double multiplication (double balancesd4[])
    {
        double res = 1;
        for (double balance : balancesd4)
            res *= balance;
        return res;
    }

    static int secondLargest (int[] balances5)
    {
        int min = balances5[0];
        int max = min;
        int secondLargest = max;
        for (int i = 1; i < balances5.length; i++){
            if (balances5[i] > max) max = balances5[i];
        }
        for (int j=0; j< balances5.length; j++){
            if (balances5[j] < max && balances5[j] > min) min = balances5[j];
            secondLargest = min;
        }
        return secondLargest;
    }

    static double secondLargest (double[] balancesd5)
    {
        double min = balancesd5[0];
        double max = min;
        double secondLargest = max;
        for (int i = 1; i< balancesd5.length; i++){
            if (balancesd5[i] > max) max = balancesd5[i];
        }
        for (int j=0; j< balancesd5.length; j++){
            if (balancesd5[j] < max && balancesd5[j] > min) min = balancesd5[j];
            secondLargest = min;
        }
        return secondLargest;
    }

    static int sum(int balances6[])
    {
        int suma = 0;
        for (int balance:balances6)
            suma += balance;
        return suma;
    }
    static double sum (double balancesd6[])
    {
        double suma = 0;
        for (double balance:balancesd6)
            suma += balance;
        return suma;
    }

    public static void main(String[] args) {
        int[] balances = {-110,-65,-3,-419,-89,-6,-7,-43,-10,-3300};
        double[] balancesd = {34.4, 7.1, 1, 197.6, 2, 112.6, 200, 6, 3.7, 387.2};

        int result = maxPozitive(balances);
        double result1 = maxPozitive(balancesd);

        System.out.println("maxPozitive balances " + result);
        System.out.println("maxPozitive balancesd " + result1);

        if (result <= 0) System.out.println("No positive number");
        else System.out.println("maxPozitive balances "+result);
        if (result1 <= 0) System.out.println("No positive number");
        else System.out.println("maxPozitive balancesd "+result1);

        int[] balances1 = {11, 2, 3, 224, 54, 6, 7, 91, 10, 356};
        double[] balancesd1 = {239.4, 7.1, 1, 5.9, 22, 1.6, 4.3, 6, 31.7, 851.6};

        int result2 = max(balances1);
        double result3 = max(balancesd1);

        System.out.println("max balances " + result2);
        System.out.println("max balancesd " + result3);

        int [] balances2 = {11,2,3,4,5,6,7,9,10,3};
        double [] balancesd2 = {9.4,7.1,1,5.9,2,1.6,4.3,6,3.7,8.6};

        int result5 = min(balances2);
        double result6 = min(balancesd2);

        System.out.println("min balances "+result5);
        System.out.println("min balancesd "+result6);

        int [] balances3 = {11,2,3,4,5,6,7,9,10,1};
        double [] balancesd3 = {19.4,7.1,1,5.9,2,1.6,4.3,6,3.7,8.6};

        int result7 = modulus(balances3);
        if (result7 == -1)
            System.out.println("Error");
        else System.out.println("modulus balances "+result7);

        double result8 = modulus(balancesd3);
        if (result8 == -1) System.out.println("Error");
        else System.out.println("modulus balances "+result8);

        int [] balances4 = {1,2,3,4,5,6,7,9,10,8};
        double [] balancesd4 = {9.4,7.1,1,5.9,2,1.6,4.3,6,3.7,8.6};

        int res9 = multiplication(balances4);
        double res10 = multiplication(balancesd4);

        System.out.println("multiplication balances "+res9);
        System.out.println("multiplication balancesd "+res10);

        int [] balances5 = {110,65,3,419,89,6,7,43,10,3300};
        double [] balancesd5 = {34.4,7.1,1,197.6,2,112.6,200,6,3.7,387.2};

        int result11 = secondLargest(balances5);
        double result12 = secondLargest(balancesd5);

        System.out.println("secondLargest balances "+result11);
        System.out.println("secondLargest balancesd "+result12);

        int [] balances6 = {1,2,3,4,5,6,7,9,0,8};
        double [] balancesd6 = {9.4,7.1,0,5.9,2,1.6,4.3,6,3.7,8.6};

        int sum = sum(balances6);
        double sum1 = sum(balancesd6);

        System.out.println("Sum balances "+sum);
        System.out.println("Sum balancesd "+sum1);
    }
}

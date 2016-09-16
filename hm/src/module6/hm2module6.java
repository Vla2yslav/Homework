package module6;


public class hm2module6 {


    public static void main(String[] args) {
        int[] balances = {-110,-65,-3,-419,-89,-6,-7,-43,-10,-3300};
        int result = ArraysUtils.maxPozitive(balances);
        System.out.println("maxPozitive balances " + result);
        if (result <= 0) System.out.println("No positive number");
        else System.out.println("maxPozitive balances "+result);

        int[] balances1 = {11, 2, 3, 224, 54, 6, 7, 91, 10, 356};
        int result2 = ArraysUtils.max(balances1);
        System.out.println("max balances " + result2);


        int [] balances2 = {11,2,3,4,5,6,7,9,10,3};
        int result5 = ArraysUtils.min(balances2);
        System.out.println("min balances "+result5);


        int [] balances3 = {11,2,3,4,5,6,7,9,10,1};
        int result7 = ArraysUtils.modulus(balances3);
        if (result7 == -1)
            System.out.println("Error");
        else System.out.println("modulus balances "+result7);

        int [] balances4 = {1,2,3,4,5,6,7,9,10,8};
        int res9 = ArraysUtils.multiplication(balances4);
        System.out.println("multiplication balances "+res9);


        int [] balances5 = {110,65,3,419,89,6,7,43,10,3300};
        int result11 = ArraysUtils.secondLargest(balances5);
        System.out.println("secondLargest balances "+result11);


        int [] balances6 = {1,2,3,4,5,6,7,9,0,8};
        int sum = ArraysUtils.sum(balances6);
        System.out.println("Sum balances "+sum);
    }
}

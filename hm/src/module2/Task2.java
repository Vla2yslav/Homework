package module2;


public class Task2 {
    static double withdrawBalance(double balance, double withdrawal, double commission) {
        double commiss = withdrawal*commission;
        double balanceAfter = balance - withdrawal - commiss;
        return balanceAfter;
    }

    static double withdrawalBalance(String ownerName, double withdrawal1, String[] ownerNames, int[] balances, double commission1)
    {
        int poz = 0;
        int balance = 0;
        double commiss = withdrawal1*commission1;
        for (int i=1; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) poz = i;
            balance = balances[poz];
        }
        double withdrawBalance = balance - withdrawal1-commiss;
        return withdrawBalance;
    }

    static double fundBalance(String ownerName1, double fund, String[] ownerNames1, int[] balances1) {
        int poz = 0;
        int balance = 0;
        for (int i = 1; i < ownerNames1.length; i++) {
            if (ownerNames1[i] == ownerName1) poz = i;
            balance = balances1[poz];
        }

        double fundBalance = balance + fund;

        return fundBalance;
    }

    public static void main(String[] args) {
        double balance = 400;
        double withdrawal = 100;
        double commission = 0.05;
        double commiss = withdrawal*commission;

        double balanceAfter = withdrawBalance(balance, withdrawal, commission);
        if(balanceAfter >= 0) {
            System.out.println("Operation complete.");
            System.out.println("Commission: "+commiss);
            System.out.println("Your balance: "+balanceAfter);
        }
        else System.out.println("Not enough money");

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double withdrawal1 = 300;
        double commission1 = 0.05;
        boolean check = false;

        double balanceAfter1 = withdrawalBalance(ownerName, withdrawal1, ownerNames, balances, commission1);

        for (int i=0; i< ownerNames.length; i++) {
            check = ownerName.equals(ownerNames[i]);
            if (check == true) break;}
        if (check == true) {

            if (balanceAfter1 >= 0) {
                System.out.println("Operation complete.");
                System.out.println("Name: " + ownerName);
                System.out.println("Sum of withdrawal: " + withdrawal1);
                System.out.println("Your currently balance: " + balanceAfter1);
            } else {
                System.out.println("Not enough money");
            }
        }
        else System.out.println("User not create");

        int[] balances1 = {1200, 250, 2000, 500, 3200};
        String[] ownerNames1 = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double fund = 200;
        String ownerName1 = "Vlad";
        boolean check1= false;

        double fundBalance = fundBalance(ownerName1, fund, ownerNames1, balances1);


        for (int i=0; i< ownerNames1.length; i++) {
            check1 = ownerName1.equals(ownerNames1[i]);
            if (check1 == true) break;}
        if (check1 == true) {
            System.out.println("Operation complete.");
            System.out.println("Name: "+ownerName1);
            System.out.println("Your currently balance: "+fundBalance);}
        else System.out.println("User not create");

    }
}

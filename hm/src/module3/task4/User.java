package module3.task4;

public class User {
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary(){
        balance += salary;
    }

    public double withdraw(int summ){
        double commission = 0;
        if (summ < 1000)
            commission = summ*0.05;
        else
           commission = summ*0.1;
        balance = balance - summ - commission;
        return balance;
    }

     public int companyNameLenght(){
         int lenght = 0;
         lenght = companyName.length();
         return 0;
     }

    int monthIncreaser(int addMonth){
        monthsOfEmployment += addMonth;
     return monthsOfEmployment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public static void main(String[] args) {
        int summ;
        int addMonth;
    }
}

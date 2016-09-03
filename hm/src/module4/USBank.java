package module4;


public class USBank extends Bank {
    public USBank(long id, String bankCountry, java.util.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if (currency == Currency.USD)
            limitOfWithdrawal = 1000;
        if (currency = Currency.EUR)
            limitOfWithdrawal = 1200;
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;
        if (currency = Currency.EUR)
            limitOfFunding = 10000;
        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
      double monthlyRate = 0;
        if (currency = Currency.USD)
            monthlyRate = 0.001;
        if (currency = Currency.EUR)
            monthlyRate = 0.015;
        return monthlyRate;
    }

    @Override
    double getCommission() {
        double commission = 0;
        if (currency = Currency.USD & < 1000)
            commission = 0.05;
        if (currency = Currency.USD & > 1000)
            commission = 0.07;
        if (currency = Currency.EUR &  < 1000)
            commission = 0.06;
        if (currency = Currency.EUR &  > 1000)
            commission = 0.08;
        return commission;
    }
}

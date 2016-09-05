package module4;

public class EUBank extends Bank{
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (getCurrency()){
            case USD: return 2000;
            case EUR: return 2200;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        switch (getCurrency()){
            case USD: return 10000;
            case EUR: return 20000;
        }
        return 0;
    }

    @Override
    double getMonthlyRate() {
       double rate = 0;
        if (getCurrency() == Currency.EUR)
          rate = 0.01;
        return rate;
    }

    @Override
    double getCommission() {
        int limit = getLimitOfWithdrawal();
        switch (getCurrency()) {
            case USD:
                return limit <= 1000 ? 0.05 : 0.07;
            case EUR:
                return limit <= 1000 ? 0.02 : 0.04;
        }
        return 0;
    }


}
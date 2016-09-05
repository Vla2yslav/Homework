package module4;

public class ChinaBank extends Bank{
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (currency){
            case USD: return 100;
            case EUR: return 150;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        switch (currency){
            case USD: return 5000;
            case EUR: return 10000;
        }
        return 0;
    }

    @Override
    double getMonthlyRate() {
        double rate = 0;
        if (currency == Currency.USD)
            rate = 0.01;
        return rate;
    }

    @Override
    double getCommission() {
        int limit = getLimitOfWithdrawal();
        switch (currency) {
            case USD:
                return limit <= 1000 ? 0.03 : 0.05;
            case EUR:
                return limit <= 1000 ? 0.1 : 0.11;
        }
        return 0;
    }
}

package module4;


public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (currency){
            case USD: return 1000;
            case EUR: return 1200;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;
        if (currency == Currency.EUR)
            limitOfFunding = 10000;
        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        switch (currency){
            case USD: return 0.01;
            case EUR: return 0.15;
        }
        return 0;
    }

    @Override
    double getCommission() {
            int limit = getLimitOfWithdrawal();
            switch (currency) {
                case USD:
                    return limit <= 1000 ? 0.05 : 0.07;
                case EUR:
                    return limit <= 1000 ? 0.06 : 0.08;
            }
            return 0;
        }
}

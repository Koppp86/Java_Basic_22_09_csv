package src.main.java.myEnum;

public enum Currency implements Convertable {
    // "рубль", "рубля", "рублей"
    // "доллар", "доллара", "долларов"
    RUB(new String[]{"рубль", "рубля", "рублей"}){
    },
    USD(new String[]{"доллар", "доллара", "долларов"}){
    };

    private final String[] endings;

    Currency(String[] endings){
        this.endings = endings;
    }

    public String getEndingsMessage(int amount){
        if(amount == 1){
            return endings[0];
        } else if (amount <= 4 && amount >= 2) {
            return endings[1];
        } else {
            return endings[2];
        }
    }
    @Override
    public double convert(double amount, Currency currency){
        CurrencyRate rate = CurrencyRate.getRate(this, currency);
        return amount * rate.rate;
    }
}

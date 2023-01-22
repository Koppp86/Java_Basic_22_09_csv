package src.main.java.dz12_Lesson23PriceInWords.services;

import com.ibm.icu.text.RuleBasedNumberFormat;
import java.util.Locale;

public enum Currency {
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
    public String getCurrencyEnding (int i){
        return endings[i];
    }
}

package src.main.java.dz12_Lesson23PriceInWords.services;

import com.ibm.icu.text.RuleBasedNumberFormat;
import java.util.Locale;

public class PriceInWordsImpl implements PriceInWords {
    public String transformation(int n) {
        // Подключил Библиотеку icu4j
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"), RuleBasedNumberFormat.SPELLOUT);

        var preLastDigit = Math.abs (n) % 100 / 10;
        if (preLastDigit == 1)
        {
            return nf.format(n) + " рублей";
        }

        return switch (Math.abs (n) % 10) {
            case 1 -> nf.format(n) + " рубль";
            case 2, 3, 4 -> nf.format(n) + " рубля";
            default -> nf.format(n) + " рублей";
        };
    }
}
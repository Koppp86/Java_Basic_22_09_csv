package src.main.java.dz12_Lesson23PriceInWords.services.validator;
//package services.validator;

public class MinValueValidator implements Validator <Integer>  {
    private final Integer minValue;
    public MinValueValidator(Integer minValue){
        this.minValue = minValue;
    }

    @Override
    public boolean check(Integer value) {
        return (minValue <= value);
    }
    @Override
    public String errMesage(Integer value) {
        return "Ошибка_2.1. Введенное Число \"" + value + "\" МЕНЬШЕ Минимально допустимого Значения \"" + minValue + "\".";
    }
}

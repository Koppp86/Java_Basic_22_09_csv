package src.main.java.dz12_Lesson23PriceInWords.services.validator;
//package services.validator;

public interface Validator <T> {
    boolean check(T value);
    String errMesage(T value);
}

package src.main.java.dz12_Lesson23PriceInWords.services;

public interface IOService {
    void outputString(String message);
    void outputString(String template, Object ...args);
    String inputString();
}

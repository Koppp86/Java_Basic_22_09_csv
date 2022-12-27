package src.main.java.dz7Lesson14ErrorProcessing;

public interface IOService {
    void outputString(String message);
    void outputString(String template, Object ...args);
}

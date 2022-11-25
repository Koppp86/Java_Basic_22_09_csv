package src.main.java.dz7Lesson14ErrorProcessing;

import java.io.PrintStream;

public class IOStreamsService implements IOService {
    private final PrintStream out;

    public IOStreamsService(PrintStream out) {
        this.out = out;
    }

    @Override
    public void outputString(String message) {
        out.println(message);
    }
    @Override
    public void outputString(String template, Object... args) {
        out.printf(template + "%n", args);
    }
}

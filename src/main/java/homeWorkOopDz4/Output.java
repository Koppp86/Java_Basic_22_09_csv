package src.main.java.homeWorkOopDz4;

import java.io.PrintStream;

public class Output implements UserOutput{
    private String name;
    private final PrintStream out;
    Output(String name, PrintStream out) {
        this.name = name;
        this.out = out;
    }
    @Override
    public void consoleUserOutput(String message) {
        out.println(message);
    }
    @Override
    public void consoleUserOutput(String template, Object... args) {
        out.printf(template + "%n", args);
    }
}

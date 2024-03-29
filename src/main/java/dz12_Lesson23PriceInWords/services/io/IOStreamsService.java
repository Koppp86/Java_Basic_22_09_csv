package src.main.java.dz12_Lesson23PriceInWords.services.io;
//package services.io;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOStreamsService implements IOConsoleService {

    private final PrintStream out;
    private final Scanner in;

    public IOStreamsService(PrintStream out, InputStream in) {
        this.out = out;
        this.in = new Scanner(in);
    }

    @Override
    public void outputString(String message) {
        out.println(message);
    }

    @Override
    public void outputString(String template, Object... args) {
        out.printf(template + "%n", args);
    }

    @Override
    public String inputString() {
        return in.nextLine();
    }
}

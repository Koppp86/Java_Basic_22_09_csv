package src.main.java.homeWorkOopDz4;

import java.io.InputStream;
import java.util.Scanner;

public class Input implements UserInput {
    private final String name;
    private final Scanner in;
    public Input(String name, InputStream in) {
        this.name = name;
        this.in = new Scanner(in);
    }
    @Override
    public String consoleUserInput(){
        return in.nextLine();
    };
}
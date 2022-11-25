package src.main.java.dz7Lesson14ErrorProcessing;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MyInputStream extends InputStream {
    private final Scanner in;

    public MyInputStream(InputStream in) {
        this.in = new Scanner(in);
    }

    public String inputString() {
        return in.nextLine();
    }

    @Override
    public int read() throws IOException {
        return 0;
    }
}

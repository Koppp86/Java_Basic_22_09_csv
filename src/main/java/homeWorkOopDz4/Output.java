package src.main.java.homeWorkOopDz4;

public class Output {
    String name;
    String text;
    Output(String name, String text) {
        this.name = name;
        this.text = text;
    }
    void outputLn(){
        System.out.println(text);
    };
}

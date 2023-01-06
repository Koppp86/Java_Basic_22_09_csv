package src.main.java.homeWorkOopDz4;

public class Test implements UserTest {
    private final String name;
    private final String[] questions;
    private final String[][] answers;
    private final int[] correctAnswers;
    private final Input input;
    private int counterResultCorrect;
    private int counterResultInCorrect;

    Test(String name, String[] questions,  String[][] answers, int[] correctAnswers, Input input){
        this.name = name;
        this.questions = questions;
        this.answers = answers;
        this.correctAnswers = correctAnswers;
        this.input = input;
    }
    @Override
    public void passTest() {
        for (int i = 0; i < questions.length; i++){
            Question question = new Question(questions[i], answers[i], correctAnswers[i], input);
            boolean resultAsk = question.ask();
            if (resultAsk) {
                counterResultCorrect++;
            } else {
                counterResultInCorrect++;
            }
        }
        System.out.println();
        System.out.println("Результат. Вы набрали правильных ответов: " + counterResultCorrect +
                           ". Неправильных: " + counterResultInCorrect);
    }
}
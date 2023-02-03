package src.main.java.workingWithBankAccountsDz6Lesson12;

public class Client {
    private String name;

    public Client(){}
    public Client(String name, int age){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (getClass() != other.getClass()) return false;

        Client otherPerson = (Client) other;
        return this.name.equals(otherPerson.name);
    }
}

package StudentsApp;

public class Student {

    private String name;
    private double grade;
    private int id;
    private int lp;

    private static int nextID = 1;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.lp = 0;
        this.id = nextID;
        nextID++;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getID() {
        return id;
    }

    public int getLP() {
        return lp;
    }

    public void addLP(int lp) {
        this.lp += lp;
    }

    @Override
    public String toString() {
        return getName() + " (" + getLP() + " LP) ";
    }
}

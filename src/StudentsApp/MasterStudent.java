package StudentsApp;

public class MasterStudent extends Student {

    private double bachelorGrade;

    public MasterStudent(String name, double grade, double bachelorGrade) {
        super(name, grade);
        this.bachelorGrade = bachelorGrade;
        addLP(180);
    }

    @Override
    public String toString() {
        return super.toString() + " (MasterStudent, BA-Grade was " + this.bachelorGrade + ")";
    }
}

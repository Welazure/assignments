package me.welazure.project.modules.eigthmodule.firstexercise;

public class Mathematics extends Subject {
    private double participation, assignments, finalExam;
    public Mathematics(String name, double participation, double assignments, double finalExam) {
        super(name);
        this.participation = participation;
        this.assignments = assignments;
        this.finalExam = finalExam;
    }
    @Override
    public double calculateGrade() {
        return (participation + assignments + finalExam) / 3;
    }
}

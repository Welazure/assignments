package me.welazure.project.modules.eigthmodule.firstexercise;

public class Science extends Subject{
    private double finalExam, labReport, FinalProject;
    public Science(String name, double finalExam, double labReport, double FinalProject) {
        super(name);
        this.finalExam = finalExam;
        this.labReport = labReport;
        this.FinalProject = FinalProject;
    }
    @Override
    public double calculateGrade() {
        return (finalExam + labReport + FinalProject) / 3;
    }
}

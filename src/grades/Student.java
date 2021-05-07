package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public void Student(String studentName){
        this.name = studentName;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int sum = 0;
        for(int grade : this.grades){
            sum+=grade;
        }
        return (double)sum/this.grades.size();
    }

    public static void main(String[] args) {
        Student kelvon = new Student();
        kelvon.Student("Kelvon");
        kelvon.addGrade(90);
        kelvon.addGrade(79);
        kelvon.addGrade(88);
        System.out.println("kelvon = " + kelvon.getGradeAverage());
    }

}

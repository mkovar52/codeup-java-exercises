package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private String githubId;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(){

    }

    public Student(String name, String githubId){
        this.githubId = githubId;
        this.name = name;
//        didn't have this line before, but it still worked?
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGithubId() { return githubId; }


    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (int grade : grades){
             sum += grade;
        }
        return sum/grades.size();
    }

    public static void main(String[] args) {

//        grades.Student student1 = new grades.Student("Mykel");
//        System.out.println(student1.getName());
//        student1.addGrade(90);
//        student1.addGrade(90);
//        student1.addGrade(97);

//        System.out.println(student1.getGradeAverage());
//        System.out.println(student1.grades.size());

//        public void getStudentInfo(){
//            for (grades.Student student : students.values()){
//                System.out.println("Name: " + student.getName());
//            }
//        }

    }
}
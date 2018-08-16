package grades;

import java.util.HashMap;

import grades.Student;
import util.Input;

public class GradesApplication extends Student {

    public static void main(String[] args) {

// ======= my util package ======= \\
        Input input = new Input();

// ======= HashMap init ======= \\
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Mykel", "mkovar52");
        Student s2 = new Student("Tom", "tomfrommyspace");
        Student s3 = new Student("Frank", "frankthetank247");
        Student s4 = new Student("Nancy", "nancy123");

// ======= Grade Add ======= \\
        s1.addGrade(100);
        s1.addGrade(90);
        s1.addGrade(90);
        s2.addGrade(100);
        s2.addGrade(50);
        s2.addGrade(50);
        s3.addGrade(75);
        s3.addGrade(0);
        s3.addGrade(60);
        s4.addGrade(95);
        s4.addGrade(95);
        s4.addGrade(50);

// =======  putting students to HashMap ======= \\
        students.putIfAbsent(s1.getGithubId(), s1);
        students.putIfAbsent(s2.getGithubId(), s2);
        students.putIfAbsent(s3.getGithubId(), s3);
        students.putIfAbsent(s4.getGithubId(), s4);

        System.out.print("\nWelcome!\n\n" +
                "Here are the github usernames of our students: \n\n");

        for (Student student : students.values()) {
            System.out.print("| " + student.getGithubId() + " |");
        }

//  integer set to keep infinite loop until they wish to exit.
        int i = 1;
        //            boolean willContinue;
        do {

            System.out.print("\n\nWhat student would you like to see more information on?\n" +
                    "> ");

            String target = input.getString();

            if (students.containsKey(target)) {
                System.out.println("\nName: " + students.get(target).getName() + " - " + "Github Username: " + students.get(target).getGithubId());
                System.out.println("Current Average: " + students.get(target).getGradeAverage());

            } else {
                System.out.println("Sorry, no student found with username of " + target);
            }

            System.out.println("\nWould you like to see another student? ");
            boolean confirm = input.yesNo();


            if (!confirm) {
                System.out.println("ok, goodbye");
                i += 1;
            }
        } while (i == 1);

    }
}

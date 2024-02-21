

import java.util.Scanner;
public class LAB_6_1_ {
    public static void main(String[] args) {
        Student s1=new Student(0);
        s1.countSpi();
    }
}

class Student {
    int id_no;
    int no_of_subjects;
    String[] subject_code;
    int[] subject_credits;
    String[] grade;
    double spi;

    public Student(int no_of_subjects) {
        Scanner sc = new Scanner(System.in);
        this.no_of_subjects = no_of_subjects;
        subject_code = new String[no_of_subjects];
        subject_credits = new int[no_of_subjects];
        grade = new String[no_of_subjects];
        for (int i = 0; i < no_of_subjects; i++) {
            System.out.println("enter " + i + "subjects codes:-");
            this.subject_code[i] = sc.next();
            System.out.println("enter " + i + "subject credits:-");
            this.subject_credits[i] = sc.nextInt();
            System.out.println("enter" + i + " subject grade:-");
            this.grade[i] = sc.next();
        }
    }
    public void countSpi(){
        double totalCredits = 0;
        double Sum = 0;
        for(int i = 0; i < no_of_subjects; i++){
            totalCredits += this.subject_credits[i];
            Sum += getGrade(this.grade[i]) * subject_credits[i];
        }
        spi = Sum / totalCredits;
        System.out.println(spi);
    }
    public double getGrade(String  grade) {
        switch (grade) {
            case "A++":
                return 10.0;
            case "A+":
                return 9.0;
            case "A":
                return 8.0;
            case "B+":
                return 7.0;
            case "B":
                return 6.0;
            case "C":
                return 5.0;
            case "D":
                return 4.0;
            default:
                return 0.0; 
        }
    }
    
}



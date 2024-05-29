package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age,score;
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        name=scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        age=scanner.nextIntInt();
        // Prompt the user to enter their exam score
        System.out.print("Enter your score: ");
        score=scanner.nextIntInt();
        // Determine the grade
        String grade;
        if(score>=90){

        }
        elseif(score>=80){
            System.out.print("A ");
            if(age<25)
            System.out.print("eligible ");
        }
        elseif(score>=70){
            System.out.print("B ");
            if(age<25)
            System.out.print("eligible ");
            
        }
        elseif(score>=60){
            System.out.print("C ");
        }
        elseif(score<80){
            System.out.print("D");
        }

        // Print the student's details
        

       
    }
}

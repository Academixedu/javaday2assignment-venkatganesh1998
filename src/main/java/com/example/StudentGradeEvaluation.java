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
        age=scanner.nextInt();
        // Prompt the user to enter their exam score
        System.out.print("Enter your score: ");
        score=scanner.nextInt();
        // Determine the grade
        System.out.print("\n\n\nName: "+name+"\nAge: "+age+"\nExamScore: "+score+"\n");

        String grade;
        if(score>=90){
            System.out.print("Grade: A ");
            if(age<25)
            System.out.print("\neligible ");
        }
        else if(score>=80){
            System.out.print("Grade B ");
            if(age<25)
            System.out.print("\neligible ");
        }
        else if(score>=70){
         
            System.out.print("Grade C ");
            
        }
        else if(score>=60){
            System.out.print("Grade D ");
        }
        else{
            System.out.print("Grade F");
        }

        // Print the student's details
        

       
    

   
}}

import java.io.*;
import java.util.*;

public class GPA_Calculator {

   public static void command1() {
   		
      Scanner console = new Scanner(System.in);
      System.out.println("Please enter 1 to get started or 0 to exit");
      int number = console.nextInt();
   		
      int starter = 1;
         
      if(number == starter){
         System.out.println("********Please follow the command very carefully.********");
         System.out.println();
         gpaCalc();
      }
      else {
         System.out.println("Thank You!");
      }
   }
   
   public static void gpaCalc() {
   
      Scanner console = new Scanner(System.in);
      System.out.print("Enter total credit hours you taken: ");
      int totalHours = console.nextInt();
      System.out.println();
      System.out.print("Enter how many classes have you taken so far: ");
      int numClasses = console.nextInt();
      System.out.println();
      System.out.println("In the grade field, enter 4 for A, 3 for B, 2 for C, 1 for D, and 0 for F.");
      System.out.println(); 
      
      int count1 = numClasses;
      double gradeCounter = 0.0;
      double totalCreditsEarned = 0.0;
      double gpa = 0.0;
      for (int i=1; i<=count1; i++) { 
         System.out.print("Enter class " + i + " credit hours: ");
         double credits = console.nextInt();
         System.out.print("Enter class " + i + " grade: ");
         double grade = console.nextInt();
         System.out.println("Your points are: " + (credits*grade));
         System.out.println();
         
         gradeCounter =+ credits;
         totalCreditsEarned += (credits*grade);
         gpa = totalCreditsEarned/totalHours;
                 
      }
      
      
      System.out.println("Your total credits hours are: " + totalHours);
      System.out.println("Your total grade points are: " + totalCreditsEarned);
      System.out.println();
      System.out.printf("Your current GPA is: %.2f", + gpa);
      
   }

   public static void main(String[] args) {
   
      System.out.println("Welcome to myGPA Calculator");
      System.out.println();
      System.out.println("Credits: Harsh Jivani. Version: 1.0");
      System.out.println();
      command1();
      
   
   
   }
}
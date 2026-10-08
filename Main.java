import java.util.*;
class Student
{
    String studentName;
    String rollNumber;
    int marks;
    String courseName;
    int courseCredits;
    int totalFee;
    int courseFee;
    public void calculateCourseFee()
    {
        courseFee = 1500 * courseCredits;
    }
    public void checkEligibility()
    {
        if (marks >= 50)
        {
            System.out.println("Eligibility: TRUE");
        }
        else
        {
            System.out.println("Eligibility: FALSE");
        }
    }
    public void calculateFinalFee()
    {
        if (marks >= 85)
        {
            totalFee = courseFee / 5;
        }
        else if (marks >= 70 && marks <= 84)
        {
            totalFee = courseFee / 10;
        }
        else
        {
            totalFee = courseFee;
            System.out.println("You are not eligible for a scholarship.");
        }
        System.out.println("Your total calculated fee is: " + totalFee);
    }
    public void displayDetails()
    {
        System.out.println("\n--- STUDENT DETAILS ---");
        System.out.println("Student Name  : " + studentName);
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Marks         : " + marks);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Course Credit : " + courseCredits);
        System.out.println("Base Fee      : " + courseFee);
        System.out.println("Final Fee     : " + totalFee);
    }

    public static void main(String args[])
    {
        Scanner hi = new Scanner(System.in);
        Student why = new Student();

        System.out.println("Enter Student Name:");
        why.studentName = hi.nextLine();

        System.out.println("Enter Roll Number:");
        why.rollNumber = hi.nextLine();

        System.out.println("Enter Course Name :");
        why.courseName = hi.nextLine();

        System.out.println("Enter Marks :");
        why.marks = hi.nextInt();

        System.out.println("Enter Course Credit :");
        why.courseCredits = hi.nextInt();

        System.out.println("\n--- PROCESSING ---");
        why.calculateCourseFee();
        why.checkEligibility();
        why.calculateFinalFee();
        why.displayDetails();
    }
}
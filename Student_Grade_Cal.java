// Java Programming Internship 
// Task 2 Student Grade Calculator 
import java.util.Scanner;
public class Student_Grade_Cal
{
    public static void main(String args[])
    {
        int marks[] = new int[5];
        float total_marks= 0, Average;
        Scanner sc = new Scanner(System.in); 
        for(int i=0; i<5; i++) { 
           System.out.print("Enter Marks of Subject "+(i+1)+":");
           marks[i] = sc.nextInt();
           total_marks = total_marks + marks[i];
        }
        // For calculating Average
        Average = total_marks/5;
        System.out.print("The student Grade is: ");
        if(Average>=80)
        {
            System.out.print("Grade A");
        }
        else if(Average>=60 && Average<80)
        {
           System.out.print("Grade B");
        } 
        else if(Average>=40 && Average<60)
        {
            System.out.print("Grade C");
        }
        else
        {
            System.out.print("Grade D");
        }
    }
}

// Number Game Task Of Java Programming Internship (Task 1)
import java.util.Random;
import java.util.Scanner;

class Random_Number{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("Guess the Number Form  1 to 100");
    }
    public int computer_Number(){
        return computer;
    }
}
public class Guess_Number_Game {
    static int takeUserInput(){
        int user;
        System.out.println("Enter ");
        Scanner sc= new Scanner(System.in); 
        user=sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Congratulations you have guess correct number !");
        }
        else if(i>j){
            System.out.println("Opps Your No is Big than computer Number Please enter small number");
        }
        else {
            System.out.println("Opps Your No is Small than computer Number please enter big number");
        }
    }
    public static void main(String[] args) {
        int user=0,computer=0,Attempt=0;
        Random_Number g = new Random_Number();
        do {
            user = takeUserInput();
            computer = g.computer_Number();
            isCorrectNumber(user, computer);
            Attempt++;
        }while (user!=computer);
        System.out.println("You Guess Correct Number in  " + Attempt + " Attempts");
    }
}
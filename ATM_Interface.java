// Task 3 ATM Interface 
// Java Programming Intenship #Codsoft
import java.util.Scanner;    
public class ATM_Interface  
{    
    public static void main(String args[])  
    {   
        int balance = 5000, withdraw, deposit;  
        Scanner sc = new Scanner(System.in);  
        while(true)  
        {  
            System.out.println("---- WELCOME TO ATM -----");  
            System.out.println("1: Withdraw");  
            System.out.println("2: Deposit");  
            System.out.println("3: Check Balance");  
            System.out.println("4: EXIT");  
            System.out.println("Please Choose Any one operation :");  

            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                System.out.print("Enter amount to be withdrawn:");  
                      
                //get the withdrawl money from user  
                withdraw = sc.nextInt();    
                if(balance >= withdraw)  
                {   
                    balance = balance - withdraw;  
                    System.out.println("Please collect your money. Thank You!");  
                }  
                else  
                {     
                    System.out.println("Insufficient Balance");  
                }  
                System.out.println("");  
                break;  
   
                case 2:  
                    System.out.print("Enter amount to be deposited:");  
                    deposit = sc.nextInt();   
                    balance = balance + deposit;  
                    System.out.println("Your amount has been depsited successfully. Thank You!");  
                    System.out.println("");  
                    break;  
   
                case 3:  
                    System.out.println("Balance : "+ balance);  
                    System.out.println("");  
                    break;  
   
                case 4:    
                    System.exit(0);  
            }  
        }  
    }  
}
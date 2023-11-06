/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choiceproj;

/**
 *
 * @author Mthetheleli Ndlovu
 */
import java.util.Scanner;
public class ChoiceProj {

    /**
     * @param args the command line arguments
     */
   static  int total =0;
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer less than or equal to 15");
        number = sc.nextInt();
        
        if(number > 0 && number <=15)
        {
            System.out.println("To proceed enter a choice, either 1 or 2 or 3");
            System.out.println("                                             ");
            System.out.println("The entered choice is: ");
            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("The first five multiples of the entred number are: ");
                    for(int t=1; t<6; t++)
                    {
                        System.out.println(number*t);
                    }
                    
                    for(int x =1; x<6; x++)
                    {
                        total =total+number*x;
                        
                    }
                    System.out.println("The sum of the first five multiples of the entered number is "+total);
                    break;
                    
                    
                case 2:
                    System.out.println("The positive consecutive numbers up to the entered number are: ");
                    for(int w =1; w<=number; w++)
                    {
                        System.out.println(w);
                    }
                    break;
                    
                case 3:
                    System.out.println("The factorial of the chosen number is: ");
                    long fact =1;
                    for(int r =1; r<=number; r++)
                    {
                        fact = fact * r;
                    }
                    System.out.println(fact);
                    break;
                    
                default:
                    System.out.println("You have entered invalid option, enter either 1 or 2 or 3");
                    break;
            }
        }
        
        else 
                    System.out.println("You have entred an invalid number");
        
    }
    
}

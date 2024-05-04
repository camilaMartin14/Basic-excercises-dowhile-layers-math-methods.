
package basicsudemy4;

import basicsudemy4.JavaEnum.JobCategory;
import java.util.Locale;
import java.util.Scanner;


public class BasicsUdemy4 {
    /*
    Ask for a salary and category trough the console.
    Calculate the salary knowing:
    -if he is a seller, he charges 500 dollars more.
    -if he is a CEO, he charges 1000 dollares more.
    -if he is a concierge, he charges 100 dollars more.
    
    Use an enumerator to store job types.
    */
   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);
        
        System.out.println("Hello! Write a base salary:");
        double baseSalary  =sc.nextDouble();
        
        System.out.println("Now please write a job category (seller, CEO, concierge)");
        String category =sc.next().toUpperCase().trim();
       
        boolean exists = false;
        for (JobCategory j:JobCategory.values()) {//forint
            if (category.equals(j.name())) {
                exists = true;
            }
        }
    
    
        if (exists) {
            double salary = baseSalary;
            JobCategory j = JobCategory.valueOf(category);
            
            
            switch  (j) {
                case SELLER:
                    salary += 500;
                    break;
                case CEO:
                    salary +=1000;
                    break;
                case CONCIERGE:
                    salary += 100;
                    break;
            }
            
            System.out.println("The final salary is $"+salary);    
            
        }else  {    
            System.out.println("I cannot contabilize that category");
        }
    
        System.out.println("-----------------------------------------------------");   
    /*
    Ask for 3 numbers trough the console and solve a second grade equation.
    */
    Scanner kb = new Scanner (System.in);
        System.out.println("Now let's solve the bhaskara formula");
        System.out.println("Write the variable a:");
        int a = kb.nextInt();
        
        System.out.println("Write the variable b:");
        int b = kb.nextInt();
                
        System.out.println("Write the variable c:");
        int c = kb.nextInt();
        
        double discriminant = (Math.pow(b,2)- 4 * a * c);
        
        double x1, x2;
        
        if (discriminant > 0) {
         x1 = -b + (Math.sqrt(discriminant))/(2 * a);
        
         x2 = -b - (Math.sqrt(discriminant))/(2 * a);
         
            System.out.println("The roots of the equation are " + x1 + " "+ x2);

        }else if (discriminant == 0) {
        x1 = -b /(2 * a);

            System.out.println("The root of the equation is " + x1);

            
        }else {
            System.out.println("It has no solution");
        }
    
    System.out.println("-----------------------------------------------------");   
    /*
    Ask for a number trough the console and show if it is a perfect number.
    A prfect number is a natural wich is equal to the addition of
    its divisors propios positivos.
    For example, 28 its a perfect number: 28 = 1 + 2 + 4 + 7 + 14
    */
    Scanner keyb = new Scanner (System.in);
    
    int number;
    do {
        System.out.println("Write a number, I'm going to tell you if it is perfect");
        number = keyb.nextInt();
        
        if (!(number >= 0 )) {
            System.out.println("You must write a number greater than 0");
        } 
    } while (!(number >= 0));
    
    int add = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                add += i;
        }
        
    }
       if (number == add) {
           System.out.println("It is a perfect number");
       }else {
           System.out.println("It is not a perfect number");
       }
    System.out.println("-----------------------------------------------------");   

    
    
    
    
    }
    
}

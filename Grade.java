import java.util.Scanner;

public class Grade{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        
        int grade = scan.nextInt();
        
        String result = (grade >= 40)? "Pass" : "Fail";
        
        System.out.println(result);
        
        
        
        

    }
}
public class MathOperations {
    public static void main(String [] args){
        
        System.out.println("All data operator types:");
        System.out.println();
        
        int a = 10;
        int b = 10;
        
        //Arithmetic
        System.out.println("---Arithmetic operatorss---");
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + diff);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + quotient);
        System.out.println();
        
        System.out.println("---Unary operators---"); //unary post and pre increment
        
        int postIncrement = a++;
        int preIncrement = ++b;

        
        System.out.println("Post-increment: " + postIncrement);
        System.out.println(" after post-increment: " + a);
        System.out.println("Pre-increment : " + preIncrement);
        System.out.println("after pre-increment: " + b);
        System.out.println();
        
        System.out.println("Assignment operators");
        
        int assigned_value = 10;
        assigned_value += 3; 
        assigned_value -= 2;  
        assigned_value *= 4;  
        assigned_value /= 2; 
        assigned_value %= 3;  

        System.out.println("\nAssignment Operators:");
        System.out.println("Assigned value: " + assigned_value);
        
        System.out.println();
        
         boolean isGreater = a > b;
        boolean isEqual = a == b;

        System.out.println("\nRelational Operators:");
        System.out.println("Is num1 greater than num2? " + isGreater);
        System.out.println("Is num1 equal to num2? " + isEqual);

        // Logical operators (&&, ||, !)
        boolean andOperation = (a > 5) && (b < 10);  // AND operator
        boolean orOperation = (a > 5) || (b > 10);   // OR operator
        boolean notOperation = !(a == b);             // NOT operator

        System.out.println("\nLogical Operators:");
        System.out.println("AND operation (num1 > 5 && num2 < 10): " + andOperation);
        System.out.println("OR operation (num1 > 5 || num2 > 10): " + orOperation);
        System.out.println("NOT operation (!(num1 == num2)): " + notOperation);

        // Ternary operator (condition ? value_if_true : value_if_false)
        String result = (a > b) ? "num1 is greater" : "num2 is greater";
        System.out.println("\nTernary Operator:");
        System.out.println("Result of ternary operation: " + result);

        
        

    
    
        
    }
}
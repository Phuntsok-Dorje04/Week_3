import java.util.Scanner;

public class Rickshaw_Fare{
    public static void main(String [] args){
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("---Rickshaw Services---");
        System.out.println("---Our fare system:--\nBase_Fare = Rs 60\nCharge_per_km = 15\nNight_charge = 25\nCharge_per_minute = 3");
        System.out.println();
    
        
        System.out.println("How much distance did you travel?(in km)");
        double distance = scan.nextDouble();
        
        System.out.println("How much time did it take to reach your destination?(in mins)");
        double time = scan.nextDouble();
        
        System.out.println("Are you a local?(y/n)");
        String local = scan.nextLine();
        scan.nextLine();
        
        
        System.out.println("Did you travel during night time?(y/n)");
        String isnight = scan.nextLine();
        
        double base_fare = 60.0;
        
        double charge_per_km = 15.0;
        double charge_per_min = 3.0;
        double night_surcharge = 25.0;
        double discount_local = 17.0;
        
        
        double total_fare = base_fare + (charge_per_km * distance) + (charge_per_min * time);
        
        total_fare = local.equals("y") ? total_fare - discount_local : total_fare;
        total_fare = isnight.equals("y") ? total_fare + night_surcharge : total_fare;

        System.out.println("Your total fare is: Rs " + total_fare);
        
  
        
    
        
        
        
    
    }
}
import java.util.Scanner;
public class ComputingBMI {

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);

     System.out.print("Enter weight in pounds: ");
     double weight = input.nextDouble();

     System.out.print(" Enter height in inches: ");
     double height = input.nextDouble();

     //conversion to kg and meters
     double weight_kg = weight * 0.45359237;
     double height_meter = height * 0.0254;

     //Formula to calculate BMI

     double BMI = weight_kg / (height_meter * height_meter);

     System.out.print("The BMI is " + BMI);
     

        
    }
    
    
}

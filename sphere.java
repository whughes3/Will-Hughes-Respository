/*
 * Problem Statement: Write a program that takes the radius of a sphere (a floating point number) as input and outputs the sphere's diameter, 
 * circumference, surface area, and volume. Add comments to your program.
 * Author: William Hughes
 * Date: 08/30/2023
 */

 import java.util.Scanner;

 public class sphere {
     public static void main(String []args){
        // Step 1: Declare Variables
        float radius;
        float diameter;
        float circumference;
        float surface_area;
        float volume;
        Scanner my_input = new Scanner(System.in);

        // Step 2: Prompt User and Get Input
        System.out.println("Enter the radius value: ");
        radius = my_input.nextFloat();

        // Step 3: Calculations
        diameter = 2 * radius;
        circumference = 2 * 3.14159f * radius;
        surface_area = 4 * 3.14159f * radius * radius;
        volume = (4/3) * 3.14159f * radius * radius * radius;

        // Step 4: Print Results
        System.out.println("The diameter is: " + diameter);
        System.out.println("The circumference is: " + circumference);
        System.out.println("The surface area is: " + surface_area);
        System.out.println("The volume is: " + volume);




     }
 }
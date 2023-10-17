/*
 * Problem Statement: To complete the task, you need to do the following steps after create a project, called CubeProject.
 * Define a java class named "Cube.java" with the given attributes: length, width, height, and volume.
 *  Create a constructor that initializes all the attributes except volume. Implement getters for all of the attributes. 
 * Write a function to calculate the volume of the cube and return the float value. Override the toString method to print the volume 
 * of the cube. Next, write a java class named "TesterCube.java" and initialize four cube objects. Prompt the user to input a 
 * volume value and then print the info about all the cubes whose volume os greater than the user provided value.
 * Author: William Hughes
 * Date: Oct 2, 2023
 */
package CubeProject;

// Import Scanner
import java.util.Scanner;

public class TesterCube {
    public static void main(String[] args){
        // Create 4 cube objects. All objects contain lenth, width, and height.
        Cube cube1 = new Cube(1,2,3);
        Cube cube2 = new Cube(5,6,7);
        Cube cube3 = new Cube(10,11,12);
        Cube cube4 = new Cube(15,16,17);
        Scanner input = new Scanner(System.in);

        // Declare Variable
        double volume;

        // Get input from user
        System.out.println("Please enter the value for volume: ");
        volume = input.nextDouble();
        // Print the info about the cubes. 
        if(cube1.getVolume() >= volume){
            System.out.println(cube1);
        }
        if(cube2.getVolume() >= volume){
            System.out.println(cube2);
        }
        if(cube3.getVolume() >= volume){
            System.out.println(cube3);
        }
        if(cube4.getVolume() >= volume){
            System.out.println(cube4);
        }

    }
}

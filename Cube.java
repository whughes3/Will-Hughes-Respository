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

public class Cube { 
    // Declare Variables
    double length, width, height, volume;
    // Create Constructor
    public Cube(double length, double width, double height) {
            this.length = length;
            this.width = width;
            this.height = height;
            this.volume = findVolume();
        }
    // Create Getters
        public double getLength() {
            return length;
        }
    
        public double getWidth() {
            return width;
        }
    
        public double getHeight() {
            return height;
        }
    
        public double getVolume() {
            return volume;
        }
    // Calculations
        private double findVolume() {
            return length * width * height;
        }
    // Use ToString to print
        @Override
        public String toString() {
            return "Cube [Length=" + length + ", Width=" + width + ", Height=" + height + ", Volume=" + volume + "]";
        }
    }
    

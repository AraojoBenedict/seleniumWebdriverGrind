package JavaCodes;
import java.util.Scanner; 

public class JavaDay1 {
	static int length = 15;
	static int width = 10;
	static int area = length * width;
	public static void main(String[] args) {
		// TODO Create a program to calculate area of rectangle & circle
		System.out.println(area);
		
		  // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

 
        double radius = input.nextDouble();
        input.close();

        // Calculate the area using the formula: Area = π * r^2
        double circleArea = Math.PI * Math.pow(radius, 2);

     
        System.out.println("The area of the circle is: " + circleArea);
	}

}

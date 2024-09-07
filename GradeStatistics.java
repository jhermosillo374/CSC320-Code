import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Array of 10 is created to store the grades
        float[] grades = new float[10];
        //Variables sum, max, and min are initialized 
        float sum = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;

        //Initializing the for loop to iterate 10 times 
        for (int i = 0; i < grades.length; i++) {
            //While loop ensures the user will only input a number from 1 to 100
            while (true) {
                System.out.print("Enter grade " + (i + 1) + " (1-100): ");
                float grade = scanner.nextFloat(); //Using scanner.next to input the next grade each time
                
                //Conditions to execute the sum, max, and min
                if (grade >= 1 && grade <= 100) {
                    grades[i] = grade;
                    sum += grade;
                    if (grade > max) {
                        max = grade;
                    }
                    if (grade < min) {
                        min = grade;
                    }
                    break; // Exit the while loop if the input is valid
                } else {
                    System.out.println("Invalid input. Please enter a grade between 1 and 100.");
                }
            }
        }
          //Calculating the average 
        float average = sum / grades.length;

        //Print out the results
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        
        //close the program  
        scanner.close();
    }
}
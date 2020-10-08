import java.util.Scanner;
/**
 * This program calculates the factorial of user's number
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input a integer
    System.out.println("Please enter an integer to calculate the factorial of");

    // Gets the number from the user
    int num = input.nextInt();

    // declears a variable to 1 because if its 0 it will constantly mutiply it by 0
    int multi = 1;

    // using the loop it will calculate the factorial of user's integer
    for(int i = 1; i <= num; i++){
      multi = i * multi;
    }
    // tells the user the answer
    System.out.println(num + "! = " + multi);
  }
}

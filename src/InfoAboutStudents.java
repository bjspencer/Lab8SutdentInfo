import java.util.Scanner;

/**
 * Task: Write a program that will recognize invalid inputs when the user
 * requests information about students in a class.
 * 
 * @author Brandon Spencer
 * @version 1.0
 */
public class InfoAboutStudents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Provide information about students in a class.
		// Parallel arrays.
		String[] names = { "Michelle", "Tiffany", "Camila", "Joseph" };
		String[] hometowns = { "Hong Kong", "Detroit", "Brazil", "Dearborn" };
		String[] favoriteFoods = { "sushi", "olives", "chocolate", "pasta" };
		int userNum = 0;
		String userInput = null;
		String knowMore = "y";
		String anotherStudent = "y";

		while (anotherStudent.equalsIgnoreCase("y")) {
			userNum = Validator.getInt(scan,
					"Welcome to our Java class! Select the number associated with the student "
							+ "you would like to know more about: \n(1)Michelle \n(2)Tiffany \n(3)Camila \n(4)Joseph \n", 1, 4);

			while (knowMore.equalsIgnoreCase("y")) {

				// Give proper responses according to user-submitted information.
				System.out.println("Student " + userNum + " is " + names[userNum - 1] + ".");
				System.out.println("What would you like to know about " + names[userNum - 1] + "?");
				userInput = Validator.getString(scan, "\"Hometown\" or \"Favorite food\"? ");
				switch (userInput) {
				case "Hometown":
					System.out.println(names[userNum - 1] + "'s hometown is " + hometowns[userNum - 1] + ".");
					break;
				case "Favorite food":
					System.out.println(names[userNum - 1] + "'s favorite food is " + favoriteFoods[userNum - 1] + ".");
					break;
				default:
					break;
				}
				// Ask is the user would like to know more about a particular student.
				knowMore = Validator.getString(scan,
						"Would you like to know more about " + names[userNum - 1] + "? (y/n)");
			}
			System.out.println();
			// Ask if the user would like to learn about another student.
			anotherStudent = Validator.getString(scan, "Would like to learn about another student? (y/n)");
			System.out.println();
		}
		System.out.println("Thank you, goodbye!");
	}

}

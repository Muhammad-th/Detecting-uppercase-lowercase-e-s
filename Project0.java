
import javax.swing.JOptionPane;

public class javaproject {
	
	public static void main(String[] args) {
		//variable for the input
		String userInput;
		int uppercase = 0;//E count
		int lowercase = 0;//e count
	//while loop to keep the program running	
	while(true) {	
		//asking for user's input
		// And the input will be stored here
		userInput = JOptionPane.showInputDialog(null, "Please enter a sentence, or input STOP to close the dialog box");
		//for loop to read each element of the input
		for(int i = 0; i < userInput.length(); i++ ) {
			//if statement to check for any uppercase e's
			if(userInput.charAt(i) == 'E') {
				uppercase++;	
			}
			//if statement to check for any lowercase e's
			if(userInput.charAt(i) == 'e') {
				lowercase++;
			}
			//terminates the program when the user enters "stop"
			if(userInput.equalsIgnoreCase("Stop")) {
				System.exit(0);
			}
		}
		//This will output the result	
		JOptionPane.showConfirmDialog(null, "Number of uppercase e's: " + uppercase);
		JOptionPane.showConfirmDialog(null, "Number of lowercase e's: " + lowercase);
		}
	
	}
	
}




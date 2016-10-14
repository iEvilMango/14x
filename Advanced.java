/*
Joseph Wunderlich
This section constitutes advanced material; do not use this on your
assignments; it's solely for material that we do not generally cover
that you might find interesting, as well as some odd java things
(that you probably shouldn't use, but that it might be useful to know)
*/

import java.util.*;

public class Advanced {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// for loops have three sections; initialize, test, update.
		// the only one that java mandates be used is the test, as
		// otherwise it just doesn't make sense. As such,
		// you __can__ make a for loop like this, but it is ridiculously
		// bad style to (it's effectively equivalent to a while loop,
		// and a while loop won't make those reading your code as sad.)
		for(; true ;) {
			// switch statement; basically, give in a value and it checks
			// until they match. If it doesn't match any, this will go to
			// default. Each case must be unique; i.e. you can't have two
			// case "first!!!11"'s. Can match multiple.
			System.out.print("Give a command (see source code for valid "
								+ " commands) ");
			switch (input.nextLine().trim().toLowerCase()) {
				case "print hello world":
					System.out.println("hello world!");
					// If you don't break at the end of a case, then it will
					// continue evaluating.
					// Per the style guide, in our assignments, you should
					// not use break statements, as that means you likely
					// have structured your code incorrectly.
					break;
				case "show ternary example":
					ternary();
               		break;
               	case "try / catch" : 
               		tryCatch();
				case "quit": 
					System.out.println("goodbye!");
					// ends the program. fairly easy 
					System.exit(1);
				default:
					System.out.println("That didn't match"); 
			}
		}
	}

	/*
	Shows example of how the ternary operator is used, printing example to
	console, and taking in user input to make it interactive
	*/
	public static void ternary() {
		Scanner console = new Scanner(System.in);
		System.out.println("This is the example of how the ternary operator "
							+ "works");
		System.out.print("Give a number for the example ");
		int firstNum = console.nextInt();
		System.out.println("First, we'll print out whether your number is"
							+ "greater than 5");
		System.out.println(firstNum > 5 ? "It is!": "It is not!");

		System.out.println("That was easy enough. The basic syntax"
							+ "for the ternary operator is");
		System.out.println("test ? result if true : result if false");
		System.out.println("The code for the previous test was ");
		System.out.println("firstNum > 5 ? \"It is!\": \"It is not!\"");
		System.out.println("Assuming there exists an int firstNum.");
		System.out.println("Now, give me two numbers, one at a time.");
		int secondNum = console.nextInt();
		int thirdNum = console.nextInt();
		System.out.println("Assuming you have stored those numbers as"
					+ "secondNum and thirdNum, evaluate");
		System.out.println("secondNum > thirdNum ? thirdNum > 5 ? 4 : thirdNum"
							+ " : secondNum > 6 ? secondNum : -5");
		System.out.println("[Type in your answer to continue]");
		int userAnswer = console.nextInt();
		int actualAnswer = secondNum > thirdNum ? thirdNum > 5 ? 4 : 
							thirdNum  : secondNum > 6 ? secondNum : -5;
		System.out.println("the answer is...");
		System.out.println(actualAnswer);
		System.out.println(userAnswer == actualAnswer ? "You're right!" : "Not quite :(");
	}

	/*
	Shows example of how the try / catch block is used, printing example to
	console, and taking in user input
	*/
	public static void tryCatch() {
		Scanner console = new Scanner(System.in);

	}
}
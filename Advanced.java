/*
Joseph Wunderlich
This section constitutes advanced material; do not use this on your
assignments; it's solely for material that we do not generally cover
that you might find interesting, as well as some odd java things
(that you probably shouldn't use, but might be useful to know
for your own purposes)
*/

import java.util.*;

public class Advanced {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// for loops have three sections; initialize, test, update.
		// the only one that java mandates be used is the test, as
		// otherwise it just doesn't make sense. As such,
		// you __can__ make a for loop like this, but it is ridiculously
		// bad style to do so (it's effectively equivalent to a while loop,
		// and a while loop won't make those reading your code as sad.)
		for(; true ;) {
			// switch statement; basically, give in a value and it checks
			// until they match. If it doesn't match any, this will go to
			// default. Each case must be unique; i.e. you can't have two
			// case "first!!!11"'s. Can match multiple.
			System.out.print("Give a command (see source code for valid "
								+ " commands, or GitHub README) ");
			switch (input.nextLine().trim().toLowerCase()) {
				case "print hello world":
					System.out.println("hello world!");
					// If you don't break at the end of a case, then it will
					// continue evaluating.
					// Per the style guide, in our assignments, you should
					// not use break statements, as that means you likely
					// have structured your code incorrectly.
					break;
				case "ternary":
					ternary();
               		break;
               	case "binary":
               		binary();
               		break;
               	case "regex":
               		regex();
               		break;
               	case "try/catch" : 
               		tryCatch();
               		break;
               	case "xor" :
               		xor();
               		break;
               	case "lambda expressions" :
               		lambda();
               		break;
				case "quit": 
					System.out.println("goodbye!");
					// ends the program. fairly easy 
					System.exit(1);
				default:
					System.out.println("That didn't match"); 
			}
			System.out.println();
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
		boolean correct = userAnswer == actualAnswer;
		printCorrect(correct);
	}

	/*
	Shows example of how the try / catch block is used, printing example to
	console, and taking in user input to make it interactive
	*/
	public static void tryCatch() {
		Scanner console = new Scanner(System.in);
		System.out.println("Try / catch blocks are used to handle exceptions"
							+ " without crashing the program.");
		System.out.println("The basic syntax is as follows:");
		System.out.println("\ntry {\n\t//stuff\n} catch(Exception "
							+ "e){\n\t//other stuff\n}");
		System.out.println("How this works, is somewhat like an if / else if");
		System.out.println("First, it tries to run the 'try' block");
		System.out.println("If that fails at any point, java will skip to");
		System.out.println("the appropriate catch branch.");
		System.out.println("It is better style to catch specific Exceptions, as in");
		System.out.println("...} catch(IllegalArgumentException illegal) {...}");
		System.out.println("versus \n...} catch (Exception e) {...}");

		System.out.println("[Give a *negative* number to continue]");
		int firstNum = console.nextInt();
		System.out.println("Now, let's try and figure out the output of a block of code.");
		System.out.println("try {\n\tif(firstNum < 0) {\n\t\tthrow "
							+ "new IllegalStateException();\n\t} else {");
		System.out.println("\t\tSystem.out.println(\"one!\");\n\t}\n} catch"
							+ "(IllegalArgumentException error) {");
		System.out.println("\tSystem.out.println(\"two!!\");\n} catch"
							+ "(IllegalStateException otherError) {");
		System.out.println("\tSystem.out.println(\"three!!!\");\n}");
		System.out.println("Given that the number you entered is stored as firstNum,");
		System.out.println("what is printed by the function? [enter the exact String.]");
		String output = "error";
		try {
			if(firstNum < 0) {
				throw new IllegalStateException();
			} else {
				output = "one!";
			}
		} catch (IllegalArgumentException error) {
			output = "two!!";
		} catch (IllegalStateException otherError) {
			output = "three!!!";
		}
		boolean correct = output.equals(console.next().toLowerCase().trim());
		System.out.println("correct answer was " + output);
		printCorrect(correct);
	}

	/*
	Shows example of how the try / catch block is used, printing example to
	console, and taking in user input to make it interactive
	*/
	public static void xor() {
		Scanner console = new Scanner(System.in);
		System.out.println("xor stands for exclusive or; as in, this "
							+ "or that, but not both");
		System.out.println("the xor operator in java is \"^\"");
		System.out.println("some examples:");
		System.out.println("true^false = " + (true^false));
		System.out.println("true^true = " + (true^true));
		System.out.println("false^false = " + (false^false));
		System.out.println();

		System.out.println("But this operator is not just defined for booleans;");
		System.out.println("you can xor int's too.");
		System.out.println("Examples: ");
		System.out.println("1^1 = " + (1^1));
		System.out.println("1^2 = " + (1^2));
		System.out.println("1^5 = " + (1^5));
		System.out.println("1^5000 = " + (1^5000));
		System.out.println("[Enter an integer to continue.]");
		int num = console.nextInt();

		System.out.println("These values may seem random at first; what java does");
		System.out.println("is check what things are the not the same in the binary");
		System.out.println("representation of the number. For example, 1^5 is effectively");
		System.out.println(" 001");
		System.out.println("^101");
		System.out.println("----");
		System.out.println(" 100");
		System.out.println(" -> 4 in base 10");
		System.out.println("As you can see, xor evaluates what spots are different");
		System.out.println("(where one is a 1 and the other is a 0)");
		System.out.println("and evaluates the number that is left.");
		System.out.println("[Enter a 5 digit integer to continue.]");
		int numTwo = console.nextInt();

		System.out.println("Assuming the last two numbers you gave over"
							+ " this example are stored as num and numTwo, respectively,");
		System.out.println("evaluate num ^ numTwo");
		System.out.println("hint: the binary represenations are as follows:");
		System.out.println(num + " is " + toBinary(num));
		System.out.println(numTwo + " is " + toBinary(numTwo));
		System.out.println("[enter your answer to continue]");
		int answer = num ^ numTwo;
		boolean correct = answer == console.nextInt();
		System.out.println("Correct answer is " + answer);
		printCorrect(correct);
	}

	/*
	Shows example of how the lambda expressions are used, printing example to
	console, and taking in user input to make it interactive.
	Also known as 'arrow functions' and 'anonymous functions'
	*Important* Lambda expressions are new to Java 8; previous versions of
	java will not like this. If that causes trouble with this file,
	just comment out the contents of this method and leave a stub.
	*/
	public static void lambda() {
		Scanner console = new Scanner(System.in);
		System.out.println("lambda expressions offer a simple syntax for");
		System.out.println("declaring 'single use' functions in an efficient way");
		System.out.println("The syntax for a lambda expression is");
		System.out.println("argument list -> body of expression ");
		System.out.println("An example lambda expression for adding"
							+ "two values would be");
		System.out.println("(int x, int y) -> x + y;");
		System.out.println("This takes in two parameters, x and y, and returns their sum");

		System.out.println();
		System.out.println("More interestingly, these can be stored using "
							+ "the Runnable interface, as so:");
		System.out.println("Runnable hello = () -> {System.out.print(\"hello!\"); } ;");
		System.out.println("The Runnable interface requires the method run(), that");
		System.out.println("'runs' the variable. In this case, what"
							+ " does hello.run(); print?");
		System.out.println("[type in the text that hello prints to continue]");
		boolean correct = "hello!".equals(console.next().trim().toLowerCase());
		Runnable hello = () -> { System.out.print("hello!"); } ;
		System.out.println("answer is...");
		hello.run();
		printCorrect(correct);

		System.out.println();
		System.out.println("This can have some interesting consequences.");
		System.out.println("Take, for example, the following method");
		System.out.println("public static void runDouble(Runnable r) {");
		System.out.println("\tr.run();\n\tr.run();");
		System.out.println("}");
		System.out.println("What would that print in this case?");
		System.out.println("[enter your answer to finish]");
		correct = "hello!hello!".equals(console.next().trim().toLowerCase());

		System.out.println("answer is...");
		runDouble(hello);
		printCorrect(correct);

	}

	/*
	runs a runnable function twice.
	*/
	private static void runDouble(Runnable r) {
		r.run();
		r.run();
	}

	/*
	Shows basic example of what binary is, printing example to
	console, and taking in user input to make it interactive
	*/
	public static void binary() {
		Scanner console = new Scanner(System.in);
		System.out.println("(Binary is covered in the textbook and"
							+ " momentarily in 142)");
		System.out.println("Computers store data as a series of binary values,");
		System.out.println("represented as 1's and 0's. This is similar to how");
		System.out.println("we recognize numbers already (in base 10), except");
		System.out.println("instead of 10 digits, it only uses 2.");
		waitForUser(console);

		System.out.println("To represent integers, we simply count increasing");
		System.out.println("powers of 2; for example, 1010 can be read as ");
		System.out.println("'one 2^3 plus zero 2^2 plus one 2^1 plus zero 2^0'");
		System.out.println("Much the same way that we can say 536 is just");
		System.out.println("'five 10^2 plus three 10^1 plus one 10^0'");
		System.out.println("So how can we convert numbers from base 10 to binary,");
		System.out.println("and vice - versa?");
		waitForUser(console);

		System.out.println("Starting off with base 10 to binary;");
		System.out.println("To me, the easiest way is to find the biggest power");
		System.out.println("of two that can 'fit inside' the number");
		System.out.println("So, looking at a number like 295, I count up the powers");
		System.out.println("1, 2, 4, 8, 16, 32, 64, 128, 256, 512, stop.");
		System.out.println("The last number can't fit in there, so we don't count it.");
		System.out.println("But after that, we can just go down the numbers,");
		System.out.println("adding 1 if we can subtract the number from the starting number");
		System.out.println("without going negative, and 0 if we cannot.");
		waitForUser(console);

		System.out.println("So, following this, we have");
		System.out.println("256 fits in, leaving 39 (result = 1)");
		System.out.println("128 does not fit in (result = 10)");
		System.out.println("64 does not fit in(result = 100)");
		System.out.println("32 fits in, leaving 7 (result = 1001)");
		System.out.println("16 does not fit in (result = 10010)");
		System.out.println("8 does not fit in(result = 100100)");
		System.out.println("4 fits in, leaving 3(result = 1001001)");
		System.out.println("2 fits in, leaving 1(result = 10010011");
		System.out.println("1 fits in, leaving 0(final result = 100100111)");
		System.out.println("[See toBinary(..) method for implementation of "
				+ "of this method]");
		waitForUser(console);

		System.out.println("Now, converting binary back to base 10");
		System.out.println("This is the same algorithm from the start,");
		System.out.println("where you can just add up the increasing powers");
		System.out.println("of two, reading from right to left.");
		System.out.println("In the case of 1101101, ");
		waitForUser(console);

		System.out.println("We see there is 1 2^0, so we add 1 (result = 1)");
		System.out.println("We see 0 2^1, so we do not add (result = 1)");
		System.out.println("We see 1 2^2, so we add 4 (result = 5)");
		System.out.println("We see 1 2^3, so we add 8 (result = 13)");
		System.out.println("We see 0 2^4, so we do not add (result = 13)");
		System.out.println("We see 1 2^5, so we add 32 (result = 45)");
		System.out.println("We see 1 2^6, so we add 64 (result = 109)");
		System.out.println("[See toBase10(..) method for implementation of"
							+ " this method.]");
	}


	public static void regex() {
		// stub stub
	}

	/*
	prints a request for a response, and eats the next response
	from the scanner, allowing the user to continue
	*/
	public static void waitForUser(Scanner input) {
		System.out.println("[enter any String to continue]");

		input.next();
		System.out.println();
	}

	/*
	Converts an integer in base 10 to an integer in binary. Not
	the best algorithm, but an easier to understand one. Returns
	the binary representation as a String.
	Only converts positive values to binary.
	*/
	public static String toBinary(int input) {
		int base = 1;
		while (base < input) {
			base *= 2;
		}
		base /= 2;
		String output = "";
		while(base > 0) {
			if (input - base >= 0) {
				output += "1";
				input -= base;
			} else {
				output += "0";
			}
			base /= 2;
		}
		return output;
	}

	/*
	Converts a String representation of a binary number to the base 10
	representation of that number. Only works for positive values.
	*/
	public static int toBase10(String input) {
		int output = 0;
		// in the binary tutorial, we go from right to left, as it's easier
		// than counting powers. In this case, it doesn't add much complexity
		// to go from left to right, so I kept it that way.
		for(int i = 0; i < input.length(); i++) {
			// when the string has size 1, it represents only the power of 0.
			int currentPower = input.length() - i - 1;
			output += input.charAt(i) == '1' ? Math.pow(2, currentPower) : 0;
		}
		return output;
	}

	public static void printCorrect(boolean correct) {
		System.out.println("You got it " + (correct ? "right!" : "wrong :(!"));
	}
}
package gemini.tests;
// Java Basics Practical Test

public class JavaBasicsTest {

    public static void main(String[] args) {
        System.out.println("--- Java Basics Practical Test ---");
        System.out.println("Complete the tasks below by filling in the missing code.");
        System.out.println("----------------------------------\n");

        // --- SECTION 1: Data Types and Operators ---
        System.out.println("--- SECTION 1: Data Types and Operators ---\n");

        // Task 1.1: Declare variables and perform arithmetic operations.
        // Declare an integer variable 'num1' and assign it the value 15.
        // Declare a double variable 'num2' and assign it the value 4.5.
        // Declare an integer variable 'resultInt'.
        // Declare a double variable 'resultDouble'.

        // YOUR CODE HERE (Task 1.1 - Declarations)
        int num1 = 15;
        double num2 = 4.5;
        int resultInt;
        double resultDouble;
        // END YOUR CODE HERE

        // Calculate 'num1' divided by 'num2' and store in 'resultDouble'.
        // Calculate 'num1' modulo 4 and store in 'resultInt'.

        // YOUR CODE HERE (Task 1.1 - Calculations)
        resultDouble = num1 / num2;
        resultInt = num1 % 4;
        // END YOUR CODE HERE

        System.out.println("Task 1.1 Results:");
        // NOTE: These print statements will cause a compilation error until you declare and initialize resultDouble and resultInt.
        // Once your code is complete, uncomment them.
        // System.out.println("  15 / 4.5 = " + resultDouble + " (Expected: ~3.33)");
        // System.out.println("  15 % 4 = " + resultInt + " (Expected: 3)\n");


        // Task 1.2: Demonstrate increment/decrement operators.
        // Start with an integer variable 'counter' initialized to 10.
        // Post-increment 'counter' and print its value.
        // Pre-decrement 'counter' and print its value.

        // YOUR CODE HERE (Task 1.2)
        int counter = 10;
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);
        // END YOUR CODE HERE


        // Task 1.3: Logical Operators
        // Determine if 'age' is between 18 and 65 (inclusive) AND 'hasLicense' is true.
        boolean isAdult = false;
        int age = 25;
        boolean hasLicense = true;

        // YOUR CODE HERE (Task 1.3)
        isAdult = age > 18 && age <= 65 && hasLicense;
        // END YOUR CODE HERE

        System.out.println("Task 1.3 Result:");
        System.out.println("  Is eligible driver (age 18-65 and has license)? " + isAdult + " (Expected: true)\n");


        // --- SECTION 2: If-Else Statements ---
        System.out.println("--- SECTION 2: If-Else Statements ---\n");

        // Task 2.1: Simple If-Else
        // Check if a given 'temperature' is below 0, between 0 and 25, or above 25.
        // Print "Freezing", "Normal", or "Hot" accordingly.
        int temperature = 18;

        // YOUR CODE HERE (Task 2.1)
        if (temperature < 0) {
            System.out.println("Freezing");
        } else if (0 < temperature && temperature <= 25) {
            System.out.println("Normal");
        } else {
            System.out.println("Hot");
        }
        // END YOUR CODE HERE
        System.out.println("  (Expected for temperature 18: Normal)\n");


        // Task 2.2: Nested If-Else
        // Determine the type of ticket based on 'age' and 'isStudent'.
        // If age is less than 12, it's a "Child Ticket".
        // If age is 65 or more, it's a "Senior Ticket".
        // Otherwise, if 'isStudent' is true, it's a "Student Ticket".
        // Otherwise, it's a "Standard Ticket".
        int customerAge = 30;
        boolean isStudent = true;
        String ticketType = ""; // Initialize to empty string to avoid compilation error

        // YOUR CODE HERE (Task 2.2)
        if (customerAge < 12) {
            ticketType = "Child ticket";
        } else if (customerAge >= 65) {
            ticketType = "Senior ticket";
        } else if (isStudent) {
            ticketType = "Student ticket";
        } else {
            ticketType = "Standard ticket";
        }
        // END YOUR CODE HERE

        System.out.println("Task 2.2 Result:");
        System.out.println("  Ticket type for age " + customerAge + ", student: " + isStudent + " -> " + ticketType + " (Expected: Student Ticket)\n");

        // --- SECTION 3: Switch-Case Statements ---
        System.out.println("--- SECTION 3: Switch-Case Statements ---\n");

        // Task 3.1: Basic Switch
        // Based on the 'dayOfWeek' (1 for Monday, 7 for Sunday), print the day's name.
        // If the number is not 1-7, print "Invalid Day".
        int dayOfWeek = 3; // Example: 3 for Wednesday
        String dayName = ""; // Initialize to empty string to avoid compilation error

        // YOUR CODE HERE (Task 3.1)
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thurday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid Day");
        }
        // END YOUR CODE HERE

        System.out.println("Task 3.1 Result:");
        System.out.println("  Day " + dayOfWeek + " is: " + dayName + " (Expected: Wednesday)\n");


        // Task 3.2: Switch with multiple cases (fall-through)
        // Categorize a 'grade' character ('A', 'B', 'C', 'D', 'F') into "Pass" or "Fail".
        // 'A', 'B', 'C', 'D' are "Pass". 'F' is "Fail". Default to "Invalid Grade".
        char grade = 'B';
        String result = ""; // Initialize to empty string to avoid compilation error

        // YOUR CODE HERE (Task 3.2)
        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Pass";
                break;
            case 'F':
                result = "Fail";
                break;
            default:
                result = "Invalid Grade";
                break;
        }
        // END YOUR CODE HERE

        System.out.println("Task 3.2 Result:");
        System.out.println("  Grade '" + grade + "' is: " + result + " (Expected: Pass)\n");


        // --- SECTION 4: String Manipulation ---
        System.out.println("--- SECTION 4: String Manipulation ---\n");

        // Task 4.1: Basic String operations
        // Declare a String 'message' with the value "Hello Java World".
        // Find the length of the string.
        // Convert the string to uppercase.
        // Check if the string contains "Java".
        String message = "Hello Java World";
        // YOUR CODE HERE (Task 4.1)
        // Declare messageLength, upperCaseMessage, containsJava here.

        // END YOUR CODE HERE

        System.out.println("Task 4.1 Results:");
        // NOTE: These print statements will cause a compilation error until you declare and initialize the variables.
        // Once your code is complete, uncomment them.
        // System.out.println("  Original message: \"" + message + "\"");
        // System.out.println("  Length: " + messageLength + " (Expected: 16)");
        // System.out.println("  Uppercase: \"" + upperCaseMessage + "\" (Expected: \"HELLO JAVA WORLD\")");
        // System.out.println("  Contains \"Java\"? " + containsJava + " (Expected: true)\n");


        // Task 4.2: Substring and Concatenation
        // Extract "Java" from the 'message' string.
        // Concatenate "Good " with "Morning" to form a new string.
        // YOUR CODE HERE (Task 4.2)
        // Declare subStringExtracted and concatenatedString here.

        // END YOUR CODE HERE

        System.out.println("Task 4.2 Results:");
        // NOTE: These print statements will cause a compilation error until you declare and initialize the variables.
        // Once your code is complete, uncomment them.
        // System.out.println("  Extracted substring: \"" + subStringExtracted + "\" (Expected: \"Java\")");
        // System.out.println("  Concatenated string: \"" + concatenatedString + "\" (Expected: \"Good Morning\")\n");


        // Task 4.3: String Comparison
        // Compare two strings, 'str1' and 'str2', for equality.
        // Compare 'str1' and 'str3' ignoring case.
        String str1 = "apple";
        String str2 = "apple";
        String str3 = "Apple";
        // YOUR CODE HERE (Task 4.3)
        // Declare areEqual and areEqualIgnoreCase here.

        // END YOUR CODE HERE

        System.out.println("Task 4.3 Results:");
        // NOTE: These print statements will cause a compilation error until you declare and initialize the variables.
        // Once your code is complete, uncomment them.
        // System.out.println("  \"apple\" equals \"apple\"? " + areEqual + " (Expected: true)");
        // System.out.println("  \"apple\" equals \"Apple\" (ignore case)? " + areEqualIgnoreCase + " (Expected: true)\n");

        System.out.println("--- Test Complete! ---");
        System.out.println("Review your output and compare it with the expected results.");
    }
}

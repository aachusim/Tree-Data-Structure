/*
Andrew Achusim
03/10/25
Purpose: Create a program that reads and organize information that is stored in hr.txt. For Main.java,
the program will run all the different classes here and print out the sorted hr.txt file and created files based on that sorted information.
Sources:
	Source 1: I learned how to use Scanner to read file @ https://www.w3schools.com/java/java_files_read.asp.
	Source 2: I learned how to trim the space in the text file @ https://www.w3schools.com/java/ref_string_trim.asp.
	Source 3: I learend how to covert string numbers into doubles @ https://www.geeksforgeeks.org/double-parsedouble-method-in-java-with-examples/.
	Source 4: I learned about FileNotFoundException @ https://www.geeksforgeeks.org/java-io-filenotfoundexception-in-java/.
	Source 5: I learend about Class Patterns to get the split method to work for "hr.txt" @ https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html.
	Source 6: I learend how to use FileWriter @ https://www.geeksforgeeks.org/filewriter-class-in-java/.
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?

A1: Car and Engine are related by Compositon.

Q2: Color and Red are related
by which, Inheritance or Composition?

A2: Color and Red are related by Inheritance.

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?

A3: Shirt and Clothing are related by Inheritance.

Q4: Furniture and Desk are related
by which, Inheritance or Composition?

A4: Furniture and Desk are related by Inheritance.

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?

A5: CellPhone and Battery are related by Composition.
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		// A Person test object with made up data.
		//Person person = new Person("Mario", 10.0, 10.0);
		// A line that proves the tests worked.
		//System.out.println("Test Entry: " + person);
		// A PersonSet test object
		//PersonSet personSet = new PersonSet();
		
		// A SortedTreeSet object.
		SortedTreeSet orderedSet = new SortedTreeSet();

		// A PersonImerialSet object
		PersonImperialSet imperialSet = new PersonImperialSet();
		
		// Don't overcomplicate the data
		// reading. After skipping the
		// first row, you can use the 
		// following to read a row of
		// character info, assuming your
		// Scanner is named "fileReader"
		
		try
		{	
			// A file object that holds the content of "hr.txt".
			File hr = new File("hr.txt");

			// A scanner object that houses the contents of "hr".
			Scanner fileReader = new Scanner(hr);

			// Skips the first line in "hr".
			if(fileReader.hasNextLine()){fileReader.nextLine();}

			// A while loop taht goes through the hr file and oraginizes them.
			while(fileReader.hasNextLine())
			{
				// A String variable that contains the next line of "hr.txt".
				String line = fileReader.nextLine();

				// Testing to see if the loop is on the next line.
				//System.out.println("Read line: " + line);

				// Splits the string up at each tab in the text file.
				String[] data = line.split("\\t+");

				// An if loop that runs when all the need info is in data.
				if(data.length == 3)
				{
					// A string variable that holds the name found in data.
					String name = data[0].trim();
					// A double variable that parses the string value in data into a double.
					double height = Double.parseDouble(data[1].trim());
					// A double variable that parase the string value in data into a double.
					double weight = Double.parseDouble(data[2].trim());

					// A new Person object that puts all the values of the previous variabes into the Person constructor.
					Person entry = new Person(name, height, weight);
					// A PersonSet object calling the add method to add the entry object into itself.
					//personSet.add(entry);
					// A PersonOrderedSet object calling the add method to add the entry into itself.
					orderedSet.add(entry);
					// A PersonImperiaalSet object calling the add method to add the entry into itself.
					imperialSet.add(entry);

					// Testing to see if each new entry was added to personSet.
					//System.out.println("Added: " + entry);
				}
			}
			// Closes the open scanner object.
			fileReader.close();
			
			// A new FileWriter object that creates an empty text file.
			FileWriter orderedWriter = new FileWriter("hr_ordered.txt");
			// A FileWriter object writing in a header line.
			orderedWriter.write("Name\tHeight (cm)\tWeight (kg)\n");
			// A FileWriter object writing in data from a PersonOrderedSet object.
			orderedWriter.write(orderedSet.toString());
			// Closes the open FileWriter object.
			orderedWriter.close();

			// A new FileWriter object that creates an empty text file.
			FileWriter imperialWriter = new FileWriter("hr_imperial.txt");
			// A FileWriter object writing in a header line.
			imperialWriter.write("Name\tHeight (in)\tWeight (lbs)\n");
			// A FileWriter object writing in data from a PersonImperialSet object.
			imperialWriter.write(imperialSet.toString());
			// Closes the open FileWriter object.
			imperialWriter.close();
		}
		// What is executed when an exception is found.
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("An error has occured.");
			System.exit(1);
		}

		// Prints out all the data in the PersonOrderedSet object.
		System.out.println("Ordered Data Set");
		System.out.println(orderedSet.toString());
		//Prints out all the data in the PersonImperialSet object.
		System.out.println("Imperial Data Set");
		System.out.println(imperialSet.toString());

	}
}

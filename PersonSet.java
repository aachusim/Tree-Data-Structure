/*
Andrew Achusim
03/10/25
Purpose: Create a program that reads and organize information that is stored in hr.txt. For PersonSet.java,
the classes createing in PersonList are implemented here and are called upon by Main.java.
Sources:
	Source 1: I learned about interface @ https://www.w3schools.com/java/java_interface.asp.
    Source 2: I reviewed how to override methods @ https://www.geeksforgeeks.org/overriding-in-java/.
    Source 3: I learend about the constains() method @ https://www.w3schools.com/java/ref_string_contains.asp.
*/
import java.util.ArrayList;

class PersonSet implements PersonList
{
    // A protected Person object array.
    protected ArrayList<Person> people;

    // constructor
    public PersonSet(){people = new ArrayList<>();}

    // An override on a void method in PersonList.
    @Override
    public void add(Person p){if(!people.contains(p)){people.add(p);}}// An if loop that checks if the people array contains the content of p.

    // An override on a Person object in PersonList.
    @Override
    public Person get(int index)
    {
        if(index >= 0 && index < people.size()){return people.get(index);}// An if loop that checks if the index is within the scope of the people array.
        return null;
    }

    // A toString method the prints out all the data in "hr.txt" when called.
    public String toString()
    {
        // A empty string variable.
        String results = "";

        // A for loop that gets all the data from the people array and puts them into a string.
        for(int i = 0; i < people.size(); i++)
        {
            // A Person object that contains whatever data exists in the index of the array relative to the point in the for loop.
            Person p = people.get(i);
            // Adds the data from the Person object to the blank string.
            results += p.toString() + "\n";
        }

        return results;
    }
}
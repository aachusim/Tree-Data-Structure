/*
Andrew Achusim
03/10/25
Purpose: Create a program that reads and organize information that is stored in hr.txt. For PersonList.java,
it acts as an interface for PersonSet.java.
Sources:
	Source 1: I learned about interface @ https://www.w3schools.com/java/java_interface.asp.
*/

interface PersonList
{
    // A void method that adds a person and their data to the list.
    public void add(Person p);
    // A Person object that gets data from a specified index value.
    Person get(int index);
}
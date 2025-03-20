/*
Andrew Achusim
03/10/25
Purpose: Create a program that reads and organize information that is stored in hr.txt. For PersonOrderedSet.java,
it overrides the add method inheritted from PersonSet.java to add Persons in alphabetical order be name.
Sources:
    Source 1: I learend what the extends keyword is and does @ https://www.w3schools.com/java/ref_keyword_extends.asp.
    Source 2: I learned how to sort ArrayList alphabeticaly @ https://www.w3schools.com/java/java_sort_list.asp.
    Source 3: I learend what and how to use the super keyword @ https://www.w3schools.com/java/ref_keyword_super.asp.
*/

import java.util.Collections;

class PersonOrderedSet extends PersonSet
{
    // An override on a void method in PersonSet.
    @Override
    public void add(Person p)
    {
        // Calls and runs the add method in PersonSet.
        super.add(p);
        // Sorts the names of the Person object alphabetically.
        sort(p);
    }

    // A private void method that sorts a given Person object alphabetically.
    private void sort(Person p){Collections.sort(people);}
}

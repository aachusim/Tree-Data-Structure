/*
Andrew Achusim
03/20/2025
Purpose: Purpose: To create a self-sorting, binary tree set that can be used in place of the PersonOrderedSet used in the Nintendo Human Resources assignment.
For SortedTreeSet.java, implement the ojects and methods expressed in SortedTreeSetInterface.java and add a toString method.
Sources:
    1.) I learned about balanced binary tree data structures @ https://www.digitalocean.com/community/tutorials/balanced-binary-tree-check.
    2.) I learned about comparing the values of strings @ https://www.w3schools.com/java/ref_string_compareto.asp.
*/
public class SortedTreeSet implements SortedTreeSetInterface
{
    // Private variables.
    private Person person;
    private SortedTreeSet left;
    private SortedTreeSet right;

    // constructor
    public SortedTreeSet()
    {
        this.left = null;
        this.right = null;
    }

    // constructor for Person object
    public SortedTreeSet(Person person)
    {
        this.person = person;
        this. left = null;
        this.right = null;
    }

    // An override of a Person object in SortedTreeSetInterface.
    @Override
    public Person getPerson(){return person;} // getter

    // An override of a boolean object in SortedTreeInterface.
    @Override
	public boolean hasLeft(){return left != null;}

    // An override of a public void method in SortedTreeInterface.
    @Override
	public void setLeft(SortedTreeSet left){this.left = left;} // setter

    // An override of a SortedTreeSet object in SortedTreeInterface.
    @Override
	public SortedTreeSet getLeft(){return left;} // getter

    // An override of a boolean object in SortedTreeInterface.
    @Override
	public boolean hasRight(){return right != null;}

    // An override of a public void method in SortedTreeInterface.
    @Override
	public void setRight(SortedTreeSet right){this.right = right;} // setter

    // An override of a SortedTreeSet object in SortedTreeInterface.
    @Override
	public SortedTreeSet getRight(){return right;} // getter

    // An override of a public void method in SortedTreeInterface.
    @Override
	public void add(Person p)
    {
        // An if loop that checks if the Person object is empty
        // If so, give it the value in p.
        if(person == null){person = p;}

        // A integer varibale that compares the string in one Person object to another Person object.
        // It returns a value less than 0 if one string value is less then the other.
        // It returns a value greater than 0 if one string value is greater than the other.
        int comparison = p.getName().compareTo(person.getName());

        // An if loop that checks if the int variable is less than zero.
        if(comparison < 0)
        {
            // An if loop that checks if the left node is empty.
            // If so, fill the left in with Person object.
            if (left == null){left = new SortedTreeSet(p);
            }else{left.add(p);}
        }
        // An eles if loop that checks if the int variable is greater than zero.
        else if(comparison > 0)
        {
            // An if loop that checks if the right node is empty.
            // If so, fill the right node in with Person object.
            if(right == null){right = new SortedTreeSet(p);
            }else{right.add(p);}
        }
        // If comparison == 0, it means the name is a duplicate, so do nothing.
    }

    // A public toString method.
    public String toString()
    {
        // A new String object.
        String result = "";

        // An if loop that checks if the left node has value.
        // If so, add the value in the left node to the String object.
        if(left != null){result += left.toString();}

        // Adds the string value in the Person object to the String object.
        result += person.toString() + "\n";

        // An if loop that checks if the right node has value.
        // If so, add the value in the right node to the String object.
        if(right != null){result += right.toString();}

        return result;
    }

}
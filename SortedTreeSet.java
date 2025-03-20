/*
Andrew Achusim
03/20/2025
Purpose: 
Sources:
    1.)
*/
public class SortedTreeSet implements SortedTreeSetInterface
{
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
        if(person == null)
        {
            person = p;

        }

        int comparison = p.getName().compareTo(person.getName());

        if(comparison < 0)
        {
            // Person's name is smaller, go to the left
            if (left == null)
            {
                left = new SortedTreeSet(p);
            } else
            {
                left.add(p);
            }
        } else if(comparison > 0)
        {
            // Person's name is larger, go to the right
            if(right == null)
            {
                right = new SortedTreeSet(p);
            } else
            {
                right.add(p);
            }
        }
        // If comparison == 0, it means the name is a duplicate, so do nothing
    }

    // String representation of the tree (in-order traversal)
    public String toString()
    {
        StringBuilder result = new StringBuilder();

        if(left != null)
        {
            result.append(left.toString());
        }

        result.append(person.toString()).append("\n");

        if(right != null)
        {
            result.append(right.toString());
        }

        return result.toString();
    }
}
/*
Andrew Achusim
03/20/2025
Purpose: To create a self-sorting, binary tree set that can be used in place of the PersonOrderedSet used in the Nintendo Human Resources assignment.
For SortedTreeSetInterface.java, create a separte public class that implements the provided ojects and methods.
Sources:
*/
public interface SortedTreeSetInterface //Binary Tree
{
	// A public Person object.
	public Person getPerson();

	// A boolean object that checks if the left node is empty.
	public boolean hasLeft();
	// A setter for the left node.
	public void setLeft(SortedTreeSet left);
	// A getter for the left node.
	public SortedTreeSet getLeft();

	// A boolean object that checks if the right node is empty.
	public boolean hasRight();
	// A setter for the right node.
	public void setRight(SortedTreeSet right);
	// A getter for the right node.
	public SortedTreeSet getRight();

	// A public void method that adds a Person obejct to the data structure.
	public void add(Person p);
	
}
# Tree-Data-Structure

Your task is to create a self-sorting, binary tree set that can be used in place of the PersonOrderedSet used in the Nintendo Human Resources assignment.

If implemented correctly, minimal changes to Main.java will be needed to your Human Resources code.

An interface is provided to guide your design of SortedTreeSet. Your SortedTreeSet.java class should implement the interface and also have a toString method. You can add more methods if you wish.

IMPORTANT: You do NOT need to implement the get method in your tree. You can remove any calls to get from Main.java. You do NOT need to implement anything equivalent to the PersonImperialSet and all code related to the PersonImperialSet can either be deleted from Main or left alone.

IMPORTANT 2: The data in the tree MUST remain sorted at all times and must never contain duplicate names. In other words, as the data is added to the tree, it must be automatically inserted in sorted order. You will not get full credit for sorting or removing duplicates after all the data has been inserted.

IMPORTANT 3: Turn in all of your human resources code including the adjusted Main.java along with SortedTreeSet.java.


Although the following is optional, you might consider adding the following methods and attributes:

A reference to a Tree node's parent and getParent method.

A method to check if the Tree is balanced...
https://www.digitalocean.com/community/tutorials/balanced-binary-tree-check
...and possibly another method to balance the tree if it is unbalanced!

If you implement a get method that gets values from the tree based on an index then the SortedTreeSet could implement the PersonList interface! Again, this is not mandatory.

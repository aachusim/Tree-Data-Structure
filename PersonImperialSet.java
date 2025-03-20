/*
Andrew Achusim
03/10/25
Purpose: Create a program that reads and organize information that is stored in hr.txt. For PersonImperialSet.java,
it overrides the add method inheritted from PersonSet.java to convert the height measurements from cm. to in. and the
weight measurements from kg. to lbs.
Sources:
    Source 1: I learend what the extends keyword is and does @ https://www.w3schools.com/java/ref_keyword_extends.asp.
    Source 2: I learend what and how to use the super keyword @ https://www.w3schools.com/java/ref_keyword_super.asp.
*/

class PersonImperialSet extends PersonSet
{
    // An override on a void method in PersonSet.
    @Override
    public void add(Person p)
    {
        // A double variable that contains the imperial value of a Person object's height.
        double imperialHeight = convertHeight(p.getHeight());
        // A double variable that contains the imperial value of a Person object's weight.
        double imperialWeight = convertWeight(p.getWeight());

        // A Person object that contains the name and respective height and weight in imperial units.
        Person imperialPerson = new Person(p.getName(), imperialHeight, imperialWeight);
        // Calls and runs the add method in PersonSet.
        super.add(imperialPerson);
    }

    // A private doouble method that converts centimeter to inches.
    private double convertHeight(double height){return height / 2.54;}
    // A private double method that converts kilograms to pounds.
    private double convertWeight(double weight){return weight / 2.20462;}
}

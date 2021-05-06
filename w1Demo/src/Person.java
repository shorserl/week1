/**
 * A person with a name and an age
 * @author Lindsey Shorser 2021
 */
public class Person {

    /** This person's name. */
    private String name;
    /** This person's age. */
    private int age;
    /** The number of Person objects that have been instantiated. */
    public static int numPerson;

    /** Creates a Person object with a given name and age.*/
    public Person(String name, int yearsOld){
        this.name = name;
        age = yearsOld;
        numPerson++; //increases the number of Person objects by one.
    }
}

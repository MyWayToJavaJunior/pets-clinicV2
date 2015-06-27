/**
 * Created by X1 on 27.06.2015.
 */
public class Person {
    private String nameOfPerson;
    private Pet petOfPerson;


    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public String getPetNameOfPerson() {
        return petOfPerson.getNameOfPet();
    }

    @Override
    public String toString() {
        return "Name of Person: " + getNameOfPerson() + ", name of Pet Person: " + getNameOfPerson();
    }
}

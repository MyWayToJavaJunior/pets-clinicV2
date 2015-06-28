/**
 * Created by X1 on 27.06.2015.
 */
public class Person {
    private String nameOfPerson;
    private Pet petOfPerson;

    public Person(String nameOfPerson, Pet petOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.petOfPerson = petOfPerson;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public String getPetNameOfPerson() {
        return petOfPerson.getNameOfPet();
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public void setPetNameOfPerson(String nameOfPet) {
        petOfPerson.setNameOfPet(nameOfPet);
    }

    @Override
    public String toString() {
        return "Name of Person: " + getNameOfPerson() + ", " + petOfPerson.toString();
    }
}

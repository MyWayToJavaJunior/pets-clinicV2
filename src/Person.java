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
        return this.nameOfPerson;
    }

    public String getPetNameOfPerson() {
        return this.petOfPerson.getNameOfPet();
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public Class<? extends Pet> getClassEnemyOfPet() {
        return this.petOfPerson.doAction();
    }

    public Class<? extends Pet> getClassOfPet() {
        return petOfPerson.getClass();
    }

    public void setPetNameOfPerson(String nameOfPet) {
        this.petOfPerson.setNameOfPet(nameOfPet);
    }

    @Override
    public String toString() {
        return "Name of Person: " + this.getNameOfPerson() + ", " + this.petOfPerson.toString();
    }
}

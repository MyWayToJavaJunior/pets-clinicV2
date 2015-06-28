import java.util.ArrayList;

/**
 * Created by X1 on 27.06.2015.
 */
public class Clinic {
    private final static int MAX_PERSONS_IN_CLINIC = 100;
    private ArrayList<Person> persons = new ArrayList<Person>(MAX_PERSONS_IN_CLINIC);


    public void addPerson(String nameOfPerson, String nameOfPet, int typeOfPet) {
        Pet pet;
        switch (typeOfPet) {
            case 1:     pet = new Cat(nameOfPet);
                        break;
            case 2:     pet = new Dog(nameOfPet);
                        break;
            case 3:     pet = new Bird(nameOfPet);
                        break;
            default:    pet = new Cat(nameOfPet);
        }
        Person person = new Person(nameOfPerson, pet);
        persons.add(person);
    }

    public void viewAllPersons() {
        if (!persons.isEmpty()) {
            for (Person person : persons) {
                System.out.println(person);
            }
        }
    }

    public String viewPersonByName(String nameOfPerson) {
        for (int i = 0; i < persons.size(); i++) {
            if (nameOfPerson.equals(persons.get(i).getNameOfPerson()))
                return persons.get(i).toString();
        }
        return null;
    }

    public String viewPersonByPetName(String nameOfPet) {
        for (int i = 0; i < persons.size(); i++) {
            if (nameOfPet.equals(persons.get(i).getPetNameOfPerson()))
                return persons.get(i).toString();
        }
        return null;
    }

    public void remPersonByName(String nameOfPerson) {
        persons.remove(findPersonIdByPersonName(nameOfPerson));
    }

    public void remPersonByPetName(String nameOfPet) {
        persons.remove(findPersonIdByPetName(nameOfPet));
    }

    public int findPersonIdByPersonName(String nameOfPerson) {
        for (int i = 0; i < persons.size(); i++) {
            if (nameOfPerson.equals(persons.get(i).getNameOfPerson()))
                return i;
        }
        return -1;
    }

    public int findPersonIdByPetName(String petNameOfPerson) {
        for (int i = 0; i < persons.size(); i++) {
            if (petNameOfPerson.equals(persons.get(i).getPetNameOfPerson()))
                return i;
        }
        return -1;
    }

    public void renPerson(String nameOfPerson, String newNameOfPerson) {
        Person person = persons.get(findPersonIdByPersonName(nameOfPerson));
        person.setNameOfPerson(newNameOfPerson);
    }

    public void renPet(String nameOfPet, String newNameOfPet) {
        Person person = persons.get(findPersonIdByPetName(nameOfPet));
        person.setPetNameOfPerson(newNameOfPet);
    }

    public boolean isPersonExistByName(String nameOfPerson) {
        for (int i = 0; i < persons.size(); i++) {
            if (nameOfPerson.equals(persons.get(i).getNameOfPerson()))
                return true;
        }
        return false;
    }

    public boolean isPetExistByName(String nameOfPet) {
        for (int i = 0; i < persons.size(); i++) {
            if (nameOfPet.equals(persons.get(i).getPetNameOfPerson()))
                return true;
        }
        return false;
    }

}

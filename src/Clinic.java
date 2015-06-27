import java.util.ArrayList;

/**
 * Created by X1 on 27.06.2015.
 */
public class Clinic {
    private final static int MAX_PERSONS_IN_CLINIC = 100;
    private ArrayList<Person> persons = new ArrayList<Person>(MAX_PERSONS_IN_CLINIC);


    public void addPerson(Person person) {
        persons.add(person);
    }

    public void viewAllPersons() {
        if (!persons.isEmpty()) {
            for (Person person : persons) {
                System.out.println(person);
            }
        }
    }

    public void remPersonByIndex(int indexOfRemPerson) {
        persons.remove(indexOfRemPerson);
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


}

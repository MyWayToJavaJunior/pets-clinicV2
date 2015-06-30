/**
 * Created by X1 on 27.06.2015.
 */
public class OutputInterface {
    public void outprint(String oprint) {
        System.out.println(oprint);
    }

    public void showFirstMenu() {
        outprint("Select the operation: 1 - ADD, 2 - View all Persons, 3 - Find by Person name," +
                " 4 - Find by Pet name, 5 - Rename Person, 6 - Rename Pet," +
                " 7 - Remove Person by name, 8 - Remove Person by Pet name, 9 - Do pet action, 0 - QUIT");
    }

    public void askForNameOfPerson() {
        outprint("Enter name of Person");
    }

    public void askForNewNameOfPerson() {
        outprint("Enter new name of Person");
    }

    public void askForPetName() {
        outprint("Enter name of Pet");
    }

    public void askForNewPetName() {
        outprint("Enter new name of Pet");
    }

    public void askForPetType() {
        outprint("Enter type of Pet: 1 - CAT, 2 - DOG, 3 - BIRD (default CAT)");
    }

    public void saidPersonNotFound() {
        outprint("Person not found");
    }

    public void saidPetNotFound() {
        outprint("Pet not found");
    }

    public void saidPersonAlreadyExist() {
        outprint("Person already exist");
    }

    public void saidNoPersonsInClinic() {
        outprint("No Persons in Clinic");
    }

    public void saidClinicFull() {
        outprint("Clinic is full, remove unnecessary Persons");
    }

    public void saidPetEatingOtherPets(String nameOfPet, String eatingClassOfPet) {
        outprint(nameOfPet + " eat some " + eatingClassOfPet + " OM!NOM!NOM!" );
    }
}

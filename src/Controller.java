/**
 * Created by X1 on 27.06.2015.
 */
public class Controller {
    private boolean exitFromProgram = false;
    private final Clinic clinic;
    private final InputInterface inputInterface;
    private final OutputInterface outputInterface;

    public static class Builder {
        private final Clinic clinic;
        private final InputInterface inputInterface;
        private final OutputInterface outputInterface;

        public Builder() {
            this.clinic = new Clinic();
            this.inputInterface = new InputInterface();
            this.outputInterface = new OutputInterface();
        }

        public Controller build() {
            return new Controller(this);
        }
    }

    private Controller(Builder builder) {
        clinic = builder.clinic;
        inputInterface = builder.inputInterface;
        outputInterface = builder.outputInterface;
    }

    public void action() {
        while (!exitFromProgram) {
            firstMenu();
        }

    }

    public void firstMenu() {
        outputInterface.showFirstMenu();
        int choicesFromFirstMenu = inputInterface.getInt();
        switch (choicesFromFirstMenu) {
            case 1:     addPerson();
                        break;
            case 2:     viewAllPersons();
                        break;
            case 3:     findByNameOfPersonAndView();
                        break;
            case 4:     findByNameOfPetAndView();
                        break;
            case 5:     renPerson();
                        break;
            case 6:     renPet();
                        break;
            case 7:     remByPersonName();
                        break;
            case 8:     remByPetName();
                        break;
            case 9:     petDoAction();
                        break;
            case 0:     exitFromProgram = true;
                        return;
            default:    break;
        }
    }

    private void addPerson() {
        if (clinic.isClinicFull()) {
            outputInterface.saidClinicFull();
        } else {
            String nameOfPerson = askForAndGetPersonName();
            if (clinic.isPersonExistByName(nameOfPerson)) {
                outputInterface.saidPersonAlreadyExist();
            } else {
                String nameOfPet = askForAndGetPetName();
                int typeOfPet = askForAndGetTypeOfPet();
                clinic.addPerson(nameOfPerson, nameOfPet, typeOfPet);
            }
        }
    }

    private void viewAllPersons() {
        if (clinic.isClinicEmpty()) {
            outputInterface.saidNoPersonsInClinic();
        }
        else {
            clinic.viewAllPersons();
        }
    }

    public void petDoAction() {
        if (clinic.isClinicEmpty()) {
            outputInterface.saidNoPersonsInClinic();
        } else {
            String nameOfPet = askForAndGetPetName();
            if (clinic.isPetExistByName(nameOfPet)) {
                clinic.remPersonsByClassOfPet(clinic.getClassEnemyOfPetByName(nameOfPet));
            } else {
                outputInterface.saidPetNotFound();
            }
        }
    }

    public void findByNameOfPersonAndView() {
        String nameOfPerson = askForAndGetPersonName();
        if (clinic.isPersonExistByName(nameOfPerson)) {
            outputInterface.outprint(clinic.viewPersonByName(nameOfPerson));
        } else
            outputInterface.saidPersonNotFound();
    }

    public void findByNameOfPetAndView() {
        String nameOfPet = askForAndGetPetName();
        if (clinic.isPetExistByName(nameOfPet)) {
            outputInterface.outprint(clinic.viewPersonByPetName(nameOfPet));
        } else
            outputInterface.saidPetNotFound();
    }


    public void renPerson() {
        String nameOfPerson = askForAndGetPersonName();
        if (clinic.isPersonExistByName(nameOfPerson)) {
            String newNameOfPerson = askForAndGetNewPersonName();
            if (clinic.isPersonExistByName(newNameOfPerson))
                outputInterface.saidPersonAlreadyExist();
            else
                clinic.renPerson(nameOfPerson, newNameOfPerson);
        } else outputInterface.saidPersonNotFound();
    }

    public void renPet() {
        String nameOfPet = askForAndGetPetName();
        if (clinic.isPetExistByName(nameOfPet)) {
            String newNameOfPet = askForAndGetNewPetName();
            clinic.renPet(nameOfPet, newNameOfPet);
        } else
            outputInterface.saidPetNotFound();
    }

    public void remByPersonName() {
        String nameOfPerson = askForAndGetPersonName();
        if (clinic.isPersonExistByName(nameOfPerson)) {
            clinic.remPersonByName(nameOfPerson);
        } else
            outputInterface.saidPersonNotFound();
    }

    public void remByPetName() {
        String nameOfPet = askForAndGetPetName();
        if (clinic.isPetExistByName(nameOfPet)) {
            clinic.remPersonByPetName(nameOfPet);
        } else
            outputInterface.saidPetNotFound();
    }

    public String askForAndGetPersonName() {
        outputInterface.askForNameOfPerson();
        return inputInterface.getStr();
    }

    public String askForAndGetPetName() {
        outputInterface.askForPetName();
        return inputInterface.getStr();
    }

    public String askForAndGetNewPersonName() {
        outputInterface.askForNewNameOfPerson();
        return inputInterface.getStr();
    }

    public String askForAndGetNewPetName() {
        outputInterface.askForNewPetName();
        return inputInterface.getStr();
    }

    public int askForAndGetTypeOfPet() {
        outputInterface.askForPetType();
        return inputInterface.getInt();
    }


}

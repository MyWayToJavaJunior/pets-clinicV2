/**
 * Created by X1 on 27.06.2015.
 */
public abstract class Pet {
    private final String typeOfPet;
    private final String ability;
    private String nameOfPet;

    public Pet(String nameOfPet, String ability) {
        this.nameOfPet = nameOfPet;
        this.ability = ability;
        this.typeOfPet = this.getClass().getName();
    }

    public String getNameOfPet() {
        return nameOfPet;
    }

    public String getAbility() {
        return ability;
    }

    public String getTypeOfPet() {
        return typeOfPet;
    }

    public void setNameOfPet(String nameOfPet) {
        this.nameOfPet = nameOfPet;
    }

    @Override
    public String toString() {
        return "Type of pet is: " + getTypeOfPet() + ", name: " + getNameOfPet() + ", ability: " + getAbility();
    }
}

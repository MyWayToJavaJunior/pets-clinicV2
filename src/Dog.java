/**
 * Created by X1 on 28.06.2015.
 */
public class Dog extends Pet {
    private static final String DOG_ABILITY = "BARK";
    private static final Class ENEMY_OF_DOGS = Cat.class;

    public Dog(String nameOfPet) {
        super(nameOfPet, DOG_ABILITY);
    }

    @Override
    public Class<? extends Pet> doAction() {
        return ENEMY_OF_DOGS;
    }
}

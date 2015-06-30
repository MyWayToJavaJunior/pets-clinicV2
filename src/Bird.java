/**
 * Created by X1 on 28.06.2015.
 */
public class Bird extends Pet{
    private static final String BIRD_ABILITY = "FLY";
    private static final Class ENEMY_OF_BIRDS = Dog.class;

    public Bird(String nameOfPet) {
        super(nameOfPet, BIRD_ABILITY);
    }

    @Override
    public Class<? extends Pet> doAction() {

        return ENEMY_OF_BIRDS;
    }
}

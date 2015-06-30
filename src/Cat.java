/**
 * Created by X1 on 28.06.2015.
 */
public class Cat extends Pet {
    private static final String CAT_ABILITY = "CLIMB UP TREES";
    private static final Class ENEMY_OF_CATS = Bird.class;

    public Cat(String nameOfPet) {
        super(nameOfPet, CAT_ABILITY);
    }

    @Override
    public Class<? extends Pet> doAction() {
        return ENEMY_OF_CATS;
    }
}

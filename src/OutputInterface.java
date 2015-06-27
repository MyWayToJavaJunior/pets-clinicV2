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
                " 7 - Remove Person by name, 8 - Remove Person by Pet name");
    }
}

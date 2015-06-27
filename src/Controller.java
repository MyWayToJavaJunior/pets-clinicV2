/**
 * Created by X1 on 27.06.2015.
 */
public class Controller {
    private static Clinic clinic;
    private static InputInterface inputInterface;
    private static OutputInterface outputInterface;

    public Controller() {
        this.clinic = new Clinic();
        this.inputInterface = new InputInterface();
        this.outputInterface = new OutputInterface();
    }

    public void doWorkWithClinic() {

    }

    public void FirstMenu() {
        outputInterface.showFirstMenu();
        int choicesFromFirstMenu = inputInterface.getInt();
        switch (choicesFromFirstMenu) {
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            case 8: break;
        }
    }
}

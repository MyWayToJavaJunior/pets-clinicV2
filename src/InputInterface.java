import java.util.Scanner;

/**
 * Created by X1 on 27.06.2015.
 */
public class InputInterface {
    private Scanner scanner = new Scanner(System.in);

    public int getInt() {
        return scanner.nextInt();
    }

    public String getStr() {
        return scanner.next();
    }
}

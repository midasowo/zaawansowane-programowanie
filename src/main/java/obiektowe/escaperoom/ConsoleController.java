package obiektowe.escaperoom;

import java.util.Scanner;

//klasa do interakcji z aplikacją - wyświetla komunikaty, pozwala wprowadzać decyzje gracza do programu
public class ConsoleController extends Controller {

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String readMessage(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

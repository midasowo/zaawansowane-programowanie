package obiektowe.escaperoom;

public class ConsoleApp {
    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("Jak masz na imie? ");
//        JOptionPane.showMessageDialog(null,"Hello " + name);
        ConsoleController consoleController = new ConsoleController();
        consoleController.startGame();
    }
}

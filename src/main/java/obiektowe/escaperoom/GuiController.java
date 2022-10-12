package obiektowe.escaperoom;

import javax.swing.*;

public class GuiController extends Controller {
    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null,message);
    }

    @Override
    public String readMessage(String question) {
        return JOptionPane.showInputDialog(question);
    }
}

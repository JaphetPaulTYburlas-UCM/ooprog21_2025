import javax.swing.JOptionPane;

public class NameComfermation {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "Please input your name");
            
            if (name == null) {
                System.exit(0);
            }
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want your name to be shown?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break;
            } else if (confirm == JOptionPane.NO_OPTION) {
                continue;
            } else {
                System.exit(0);
            }
        }
    }
}

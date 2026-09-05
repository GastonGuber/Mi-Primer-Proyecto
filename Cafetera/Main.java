import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUIMaquinaExpendedora ventana = new GUIMaquinaExpendedora();
                ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                ventana.pack();
                ventana.setSize(400, 590);
                ventana.setVisible(true);
            }
        });
    }
}
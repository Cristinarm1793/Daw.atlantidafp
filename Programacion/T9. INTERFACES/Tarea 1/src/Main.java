import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error, no de pudo aplicar el estilo visual.");;
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DatosEstudiantes().setVisible(true);
            }
        });
    }
}
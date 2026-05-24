import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error, no se pudo aplicar el estilo visual");;
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListaDeEstudiantes().setVisible(true);
            }
        });
    }
}
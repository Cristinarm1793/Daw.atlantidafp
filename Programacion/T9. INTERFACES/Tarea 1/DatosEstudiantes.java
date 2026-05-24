import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatosEstudiantes extends JFrame {

    private JTextField campoNombre;
    private JTextField campoEdad;
    private JTextField campoCurso;
    private JButton btnGuardar;

    public DatosEstudiantes() {
        setTitle("Registro de Estudiante");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JLabel lblTitulo = new JLabel("Formulario de Registro", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(lblTitulo, BorderLayout.NORTH);

        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        panelFormulario.add(new JLabel("Nombre:"));
        campoNombre = new JTextField();
        panelFormulario.add(campoNombre);

        panelFormulario.add(new JLabel("Edad:"));
        campoEdad = new JTextField();
        panelFormulario.add(campoEdad);

        panelFormulario.add(new JLabel("Curso:"));
        campoCurso = new JTextField();
        panelFormulario.add(campoCurso);

        add(panelFormulario, BorderLayout.CENTER);

        JPanel panelBoton = new JPanel();
        btnGuardar = new JButton("Guardar");
        panelBoton.add(btnGuardar);
        add(panelBoton, BorderLayout.SOUTH);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoNombre.getText().trim();
                String edad = campoEdad.getText().trim();
                String curso = campoCurso.getText().trim();

                String mensaje = "Datos del estudiante:\n"
                        + "Nombre: " + nombre + "\n"
                        + "Edad: " + edad + "\n"
                        + "Curso: " + curso;

                JOptionPane.showMessageDialog(
                        DatosEstudiantes.this,
                        mensaje,
                        "Guardado",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }
}
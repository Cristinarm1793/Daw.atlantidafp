import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class ListaDeEstudiantes extends JFrame {

    private ArrayList<Estudiante> listaEstudiantes;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    private JTextField campoNombre;
    private JTextField campoEdad;
    private JTextField campoCurso;
    private JButton btnAgregar;

    public ListaDeEstudiantes() {
        listaEstudiantes = new ArrayList<>();

        setTitle("Lista de Estudiantes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel panelFormulario = new JPanel(new GridLayout(4, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelFormulario.add(new JLabel("Nombre:"));
        campoNombre = new JTextField();
        panelFormulario.add(campoNombre);

        panelFormulario.add(new JLabel("Edad:"));
        campoEdad = new JTextField();
        panelFormulario.add(campoEdad);

        panelFormulario.add(new JLabel("Curso:"));
        campoCurso = new JTextField();
        panelFormulario.add(campoCurso);

        btnAgregar = new JButton("Agregar estudiante");

        panelFormulario.add(new JLabel());
        panelFormulario.add(btnAgregar);

        add(panelFormulario, BorderLayout.NORTH);

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Curso");

        tabla = new JTable(modeloTabla);

        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane, BorderLayout.CENTER);

        btnAgregar.addActionListener(e -> agregarEstudiante());
    }

    private void cargarEstudiantesIniciales() {
        listaEstudiantes.add(new Estudiante("Antonio", 27, "DAW"));
        listaEstudiantes.add(new Estudiante("Sergio", 25, "DAW"));
        listaEstudiantes.add(new Estudiante("Cristina", 30, "DAW"));

        for (Estudiante estudiante : listaEstudiantes) {
            modeloTabla.addRow(new Object[]{
                    estudiante.getNombre(),
                    estudiante.getEdad(),
                    estudiante.getCurso()
            });
        }
    }

    private void agregarEstudiante() {
        String nombre = campoNombre.getText().trim();
        int edad = Integer.parseInt(campoEdad.getText().trim());
        String curso = campoCurso.getText().trim();

        Estudiante estudiante = new Estudiante(nombre, edad, curso);
        listaEstudiantes.add(estudiante);

        modeloTabla.addRow(new Object[]{
                    estudiante.getNombre(),
                    estudiante.getEdad(),
                    estudiante.getCurso()
        });

        campoNombre.setText("");
        campoEdad.setText("");
        campoCurso.setText("");
    }
}
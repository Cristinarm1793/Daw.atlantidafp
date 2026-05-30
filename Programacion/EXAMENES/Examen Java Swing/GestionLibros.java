import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class GestionLibros extends JFrame {

    private ArrayList<Libros> listaLibros;

    public GestionLibros() {

        listaLibros = new ArrayList<>();

        setTitle("Libreria");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar barra = new JMenuBar();
        JMenu menu = new JMenu("Opciones");
        JMenuItem aniadir = new JMenuItem("Añadir libro");
        JMenuItem mostrar = new JMenuItem("Mostrar libros");
        menu.add(aniadir);
        menu.add(mostrar);
        barra.add(menu);
        setJMenuBar(barra);

        JLabel etiqueta = new JLabel("Gestión de libros", SwingConstants.CENTER);
        add(etiqueta);

        aniadir.addActionListener(e -> aniadirLibros());
        mostrar.addActionListener(e -> mostrarLibros());
    }

    private void aniadirLibros() {

        JFrame ventana = new JFrame("Añadir Libro");
        ventana.setSize(400, 300);
        ventana.setLocationRelativeTo(this);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextField textTitulo = new JTextField();
        JTextField textAutor = new JTextField();
        JTextField textAnioPublicacion = new JTextField();
        JButton botonGuardar = new JButton("Guardar");

        panel.add(new JLabel("Título:")); panel.add(textTitulo);
        panel.add(new JLabel("Autor:")); panel.add(textAutor);
        panel.add(new JLabel("Año:")); panel.add(textAnioPublicacion);
        panel.add(new JLabel()); panel.add(botonGuardar);

        ventana.add(panel);
        ventana.setVisible(true);

        botonGuardar.addActionListener(e -> {

            String titulo = textTitulo.getText().trim();
            String autor = textAutor.getText().trim();
            String anioTexto = textAnioPublicacion.getText().trim();

            if (titulo.isEmpty() || autor.isEmpty() || anioTexto.isEmpty()) {
                JOptionPane.showMessageDialog(ventana, "Error, campos vacíos");
                return;
            }

            try {
                int anio = Integer.parseInt(anioTexto);

                listaLibros.add(new Libros(titulo, autor, anio));

                JOptionPane.showMessageDialog(ventana, "Libro añadido");
                ventana.dispose();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Error, El año debe ser un número");
            }
        });
    }

    private void mostrarLibros() {

        JFrame ventana = new JFrame("Libros en mi libreria");
        ventana.setSize(400, 300);
        ventana.setLocationRelativeTo(this);

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Título");
        modeloTabla.addColumn("Autor");
        modeloTabla.addColumn("Año");

        for (Libros libro : listaLibros) {
            modeloTabla.addRow(new Object[]{
                    libro.getTitulo(),
                    libro.getAutor(),
                    libro.getAnio_publicacion()
            });
        }

        JTable tabla = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tabla);

        JButton botonEliminar = new JButton("Eliminar libro");

        ventana.add(scroll, BorderLayout.CENTER);
        ventana.add(botonEliminar, BorderLayout.SOUTH);
        ventana.setVisible(true);
    }
}
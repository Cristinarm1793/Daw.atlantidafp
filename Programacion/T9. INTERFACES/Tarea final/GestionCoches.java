import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class GestionCoches extends JFrame {
    private ArrayList<Coche> listaCoches;

    private JTextField campoMarca;
    private JTextField campoAnio;
    private JTextField campoColor;

    public GestionCoches() {
        listaCoches = new ArrayList<>();

        setTitle("Gestion de coches");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        crearMenu();

        JLabel titulo = new JLabel("Sistema de gestión de coches", SwingConstants.CENTER);
        titulo.setFont(new Font("ARIAL", Font.BOLD, 20));
        add(titulo, BorderLayout.CENTER);
    }

    private void crearMenu() {
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Opciones");
        JMenuItem agregarItem = new JMenuItem("Añadir coche");
        JMenuItem mostrarItem = new JMenuItem("Mostrar coches");
        agregarItem.addActionListener(e -> mostrarFormulario());
        mostrarItem.addActionListener(e -> mostrarTabla());
        menu.add(agregarItem);
        menu.add(mostrarItem);
        barraMenu.add(menu);
        setJMenuBar(barraMenu);
    }

    private void mostrarFormulario() {
        JFrame ventanaFormulario = new JFrame("Añadir Coche");
        ventanaFormulario.setSize(400, 250);
        ventanaFormulario.setLocationRelativeTo(this);

        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        panelFormulario.add(new JLabel("Marca:"));
        campoMarca = new JTextField();
        panelFormulario.add(campoMarca);

        panelFormulario.add(new JLabel("Año:"));
        campoAnio = new JTextField();
        panelFormulario.add(campoAnio);

        panelFormulario.add(new JLabel("Color:"));
        campoColor = new JTextField();
        panelFormulario.add(campoColor);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardarCoche(ventanaFormulario));

        JPanel panelBoton = new JPanel();
        panelBoton.add(btnGuardar);

        ventanaFormulario.add(panelFormulario, BorderLayout.CENTER);
        ventanaFormulario.add(panelBoton, BorderLayout.SOUTH);
        ventanaFormulario.setVisible(true);
    }

    private void guardarCoche(JFrame ventanaFormulario){
        String marca = campoMarca.getText().trim();
        String anioTexto = campoAnio.getText().trim();
        String color = campoColor.getText().trim();

        if (marca.isEmpty() || anioTexto.isEmpty() || color.isEmpty()){
            JOptionPane.showMessageDialog(ventanaFormulario, "No puede haber campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            try {
                int anio = Integer.parseInt(anioTexto);

                Coche coche = new Coche(marca, anio, color);
                listaCoches.add(coche);

                JOptionPane.showMessageDialog(ventanaFormulario, "Coche añadido correctamente", "Guardado", JOptionPane.INFORMATION_MESSAGE);
                ventanaFormulario.dispose();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(ventanaFormulario, "El año debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void mostrarTabla(){
        JFrame ventanaTabla = new JFrame("Lista de coches");
        ventanaTabla.setSize(500,300);
        ventanaTabla.setLocationRelativeTo(this);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Marca");
        modelo.addColumn("Año");
        modelo.addColumn("Color");

        for (Coche coche : listaCoches){
            modelo.addRow(new Object[]{
                    coche.getMarca(),
                    coche.getAnio(),
                    coche.getColor()
            });
        }

        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        ventanaTabla.add(scroll);
        ventanaTabla.setVisible(true);
    }
}

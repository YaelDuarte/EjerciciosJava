package metodosEjemplos;
import javax.swing.*;
import java.awt.event.*;


public class interfazGrafica extends JFrame {
	private JTextField campoA, campoB, campoRaiz, campoRedondeo;
    private JTextArea resultado;

    public interfazGrafica() {
        setTitle("Calculadora de Métodos");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel labelA = new JLabel("Número A:");
        labelA.setBounds(20, 20, 100, 20);
        add(labelA);

        campoA = new JTextField();
        campoA.setBounds(120, 20, 100, 20);
        add(campoA);

        JLabel labelB = new JLabel("Número B:");
        labelB.setBounds(20, 50, 100, 20);
        add(labelB);

        campoB = new JTextField();
        campoB.setBounds(120, 50, 100, 20);
        add(campoB);

        JLabel labelRaiz = new JLabel("Número para Raíz:");
        labelRaiz.setBounds(20, 80, 150, 20);
        add(labelRaiz);

        campoRaiz = new JTextField();
        campoRaiz.setBounds(160, 80, 100, 20);
        add(campoRaiz);

        JLabel labelRedondeo = new JLabel("Número a Redondear:");
        labelRedondeo.setBounds(20, 110, 150, 20);
        add(labelRedondeo);

        campoRedondeo = new JTextField();
        campoRedondeo.setBounds(160, 110, 100, 20);
        add(campoRedondeo);

        JButton botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(20, 150, 100, 30);
        add(botonCalcular);

        resultado = new JTextArea();
        resultado.setBounds(20, 200, 340, 130);
        resultado.setEditable(false);
        add(resultado);

        botonCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularResultados();
            }
        });

        setVisible(true);
    }

    private void calcularResultados() {
        try {
            int a = Integer.parseInt(campoA.getText());
            int b = Integer.parseInt(campoB.getText());
            double r = Double.parseDouble(campoRaiz.getText());
            double red = Double.parseDouble(campoRedondeo.getText());

            StringBuilder sb = new StringBuilder();
            sb.append("Suma: ").append(metodoUno.sumas(a, b)).append("\n");
            sb.append("Raíz (con ajuste): ").append(metodoUno.raiz(r)).append("\n");
            sb.append("Redondeo: ").append(metodoUno.redondeo(red)).append("\n");
            sb.append("Texto transformado: ").append(metodoUno.caracterMayusucla("Hola como te llamas, ana?")).append("\n");

            resultado.setText(sb.toString());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

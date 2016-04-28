import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;

public class Interfaz extends JFrame{
	public Interfaz() {
		hazInterfaz();
	}
	public void armaPanel() {
		JPanel principal=new JPanel();
		JTextField tamano,funcion,variables,
				generaciones;
		JComboBox tipo_variable,cruza,mutacion,seleccion,
				representacion;
		
		principal.setLayout(new GridLayout(0,2));
		principal.add(new JLabel("Tamaño Población"));
		principal.add(tamano = new JTextField());
		principal.add(new JLabel("Función Aplicación"));
		principal.add(funcion=new JTextField());
//		principal.add(new JLabel("Variables"));
//		principal.add(tipo_variable=new JComboBox());
		principal.add(new JLabel("Número de Generaciones"));
		principal.add(generaciones=new JTextField());
		principal.add(new JLabel("Cruza"));
		principal.add(cruza=new JComboBox());
		principal.add(new JLabel("Selección"));
		principal.add(seleccion=new JComboBox());
		principal.add(new JLabel("Representación"));
		principal.add(representacion=new JComboBox());
		this.add(principal);
	}
	public void hazInterfaz() {
		armaPanel();
		this.setTitle("Algoritmos Géneticos");
//		this.setSize(600,600);
		this.pack();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Interfaz();
	}
}

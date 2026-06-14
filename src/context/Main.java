package context;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// Atributos
		float n1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la Calificación 1:"));
        float n2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la Calificación 2:"));
        float n3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la Calificación 3:"));
        
        //Formula
        float prom=((n1+ n2+n3)/3);
        
        //Resultados
        JOptionPane.showMessageDialog(null, "Promedio: " + prom);
	}

}

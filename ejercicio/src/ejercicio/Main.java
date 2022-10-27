package ejercicio;

import javax.swing.JOptionPane;

class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato ricardo = new Gato("ricardo",8, "bigotudo");
		Perro joe = new Perro(7,"joe","marroncito");
		
		
		
		JOptionPane.showMessageDialog(null, ricardo);
		JOptionPane.showMessageDialog(null, joe);
		ricardo.hacerSonido();
		joe.hacerSonido();
	}

}

package ejercicio;

import javax.swing.JOptionPane;

class Gato extends Animal{

	private String nombre;
	private int edad;
	private String bigotes;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getBigotes() {
		return bigotes;
	}
	public void setBigotes(String bigotes) {
		this.bigotes = bigotes;
	}
	public Gato(String nombre, int edad, String bigotes) {
		super(edad, bigotes, bigotes);
		this.nombre = nombre;
		this.edad = edad;
		this.bigotes = bigotes;
	}
	
	
	@Override
	public String toString() {
		return "Gato [bigotes=" + bigotes + ", nombre=" + getNombre() + ", Edad=" + getEdad() + "]";
	}
	
	public void hacerSonido() {
		JOptionPane.showMessageDialog(null, getNombre() + " hace Miau");
	}
	
	public void moverse() {
		JOptionPane.showMessageDialog(null, "puedo caminar con las 4 patas");
	}
	
	
	
	
}

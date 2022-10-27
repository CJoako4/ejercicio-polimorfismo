package ejercicio;

import javax.swing.JOptionPane;

public class Serpiente extends Animal {

	private String veneno;
	private String color;
	public String getVeneno() {
		return veneno;
	}
	public void setVeneno(String veneno) {
		this.veneno = veneno;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Serpiente(int edad, String color, String nombre, String veneno, String color2) {
		super(edad, color, nombre);
		this.veneno = veneno;
		color = color;
	}
	@Override
	public String toString() {
		return "Serpiente [getVeneno()=" + getVeneno() + ", getColor()=" + getColor() + "]";
	}
	
		public void moverse() {
			JOptionPane.showMessageDialog(null, "puedo moverme raptando");
		}
	
	
}

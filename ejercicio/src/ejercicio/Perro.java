package ejercicio;

import javax.swing.JOptionPane;

class Perro extends Animal{

	private int edad;
	private String nombre;
	private String color;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Perro(int edad, String nombre, String color) {
		super(edad, color, color);
		this.edad = edad;
		this.nombre = nombre;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Perro [edad=" + edad + ", nombre=" + nombre + ", color=" + color + "]";
	}
	
	public void hacerSonido() {
		JOptionPane.showMessageDialog(null, getNombre() + " hace guau");
	}
	
	public void moverse() {
		JOptionPane.showMessageDialog(null, "puedo caminar con las 4 patas");
	}
	
}

package ejercicio;
 
public abstract class Animal {

	
	public String color;
	public int edad;
	public String nombre;
	
	public Animal(int edad, String color, String nombre) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
	}
	
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
	

	
	
	
	
	
	
}

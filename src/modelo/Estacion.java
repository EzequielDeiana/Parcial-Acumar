package modelo;

public class Estacion {

	private int id;
	private String nombre;
	private String direccion;
	private float latitud;
	private float longitud;
	private float altura;

	public Estacion(int id, String nombre, String direccion, float latitud, float longitud, float altura) {
		super();
		setId(id);
		setNombre(nombre);
		setDireccion(direccion);
		setLatitud(latitud);
		setLongitud(longitud);
		setAltura(altura); // En metros
	}

	// ----------Metodos

	
	// ----------Getters y Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Estacion [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", latitud=" + latitud
				+ ", longitud=" + longitud + ", altura=" + altura + "]";
	}

}

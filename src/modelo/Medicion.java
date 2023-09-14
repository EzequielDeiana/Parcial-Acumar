package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Medicion {

	private Estacion estacion;
	private LocalDate fecha;
	private LocalTime hora;
	private float temperatura;
	private float humedad;
	private float vientoVel;
	private String vientoDir;
	private float precipitacion;

	public Medicion(Estacion estacion, LocalDate fecha, LocalTime hora, float temperatura, float humedad,
			float vientoVel, String vientoDir, float precipitacion) {
		super();
		setEstacion(estacion);
		setFecha(fecha);
		setHora(hora);
		setTemperatura(temperatura);
		setHumedad(humedad);
		setVientoVel(vientoVel);
		setVientoDir(vientoDir);
		setPrecipitacion(precipitacion);
	}

	/// ------METODOS

	public float temperaturaCorregidaPorAltura() {
		
		return (float) (getTemperatura() + ((getEstacion().getAltura() * 6.5) / 1000));
		
		//System.out.println(temperaturaNueva + "Prueba");
		
		//return temperaturaNueva;
	}
	
	/// ------GETTERS Y SETTERS
	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
		this.temperatura = temperaturaCorregidaPorAltura();
	}

	public float getHumedad() {
		return humedad;
	}

	public void setHumedad(float humedad) {
		this.humedad = humedad;
	}

	public float getVientoVel() {
		return vientoVel;
	}

	public void setVientoVel(float vientoVel) {
		this.vientoVel = vientoVel;
	}

	public String getVientoDir() {
		return vientoDir;
	}

	public void setVientoDir(String vientoDir) {
		this.vientoDir = vientoDir;
	}

	public float getPrecipitacion() {
		return precipitacion;
	}

	public void setPrecipitacion(float precipitacion) {
		this.precipitacion = precipitacion;
	}

	@Override
	public String toString() {
		return "Medicion [estacion=" + estacion + ", fecha=" + fecha + ", hora=" + hora + ", temperatura=" + temperatura
				+ ", humedad=" + humedad + ", vientoVel=" + vientoVel + ", vientoDir=" + vientoDir + ", precipitacion="
				+ precipitacion + "]";
	}

}

package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Acumar {

	private List<Estacion> lstEstaciones;
	private List<Medicion> lstMediciones;

	public Acumar() {
		super();
		lstEstaciones = new ArrayList<Estacion>();
		lstMediciones = new ArrayList<Medicion>();
	}

	/// --------METODOS ESTACION

	public boolean agregarEstacion(String nombre, String direccion, float latitud, float longitud, float altura)
			throws Exception {

		if (traerEstacion(nombre) != null) {
			throw new Exception("Ya existe una estacion con el nombre");
		}

		return getLstEstaciones().add(new Estacion(setProxIdEstacion(), nombre, direccion, latitud, longitud, altura));
	}

	public Estacion traerEstacion(String nombre) {
		Estacion aux = null;
		int i = 0;
		boolean encontrado = false;

		while (encontrado == false && i < getLstEstaciones().size()) {
			if (getLstEstaciones().get(i).getNombre().equals(nombre)) {
				aux = getLstEstaciones().get(i);
			}
			i++;
		}
		return aux;
	}

	/// --------METODOS MEDICION

	public Medicion traerMedicion(Estacion estacion, LocalDate fecha, LocalTime hora) {
		Medicion aux = null;
		int i = 0;
		boolean encontrado = false;

		while (encontrado == false && i < getLstMediciones().size()) {
			if (getLstMediciones().get(i).getEstacion().equals(estacion)
					&& getLstMediciones().get(i).getFecha().equals(fecha)
					&& getLstMediciones().get(i).getHora().equals(hora)) {

				return aux = getLstMediciones().get(i);

			}
			i++;
		}
		return aux;
	}

	public boolean agregarMedicion(Estacion estacion, LocalDate fecha, LocalTime hora, float temperatura, float humedad,
			float vientoVel, String vientoDir, float precipitacion) {

		return getLstMediciones()
				.add(new Medicion(estacion, fecha, hora, temperatura, humedad, vientoVel, vientoDir, precipitacion));

	}

	public List<Medicion> traerMediciones(Estacion estacion) {
		List<Medicion> aux = new ArrayList<Medicion>();

		for (Medicion medicion : getLstMediciones()) {
			if (medicion.getEstacion().equals(estacion)) {
				aux.add(medicion);
			}
		}

		return aux;
	}

	/// -----METODOS DE OPERACIONES

	public float promedioTemperatura(Estacion estacion, LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta) {
		float promedio = 0;
		int acumulador = 0;
		for (int i = 0; i < traerMediciones(estacion).size(); i++) {
		/*	if (traerMediciones(estacion).get(i).getFecha().equals(fecha)
					&& traerMediciones(estacion).get(i).getHora().getHour() >= horaDesde.getHour()
					&& traerMediciones(estacion).get(i).getHora().getHour() <= horaHasta.getHour()) {
					*/
			if(traerMediciones(estacion).get(i).getFecha().equals(fecha) 
					&& traerMediciones(estacion).get(i).getHora().isAfter(horaDesde)
					&& traerMediciones(estacion).get(i).getHora().isBefore(horaHasta)) {
				promedio = promedio + traerMediciones(estacion).get(i).getTemperatura();
				acumulador++;
			}
		}

		promedio = promedio / acumulador;
		return promedio;
	}

	/// -----METODOS AUXILIARES

	private int setProxIdEstacion() {
		int id = 1;

		if (getLstEstaciones().isEmpty() == false) {
			id = getLstEstaciones().get(getLstEstaciones().size() - 1).getId() + 1;
		}

		return id;

	}

	/// ------GETTERS Y SETTERS

	public List<Estacion> getLstEstaciones() {
		return lstEstaciones;

	}

	public void setLstEstaciones(List<Estacion> lstEstaciones) {
		this.lstEstaciones = lstEstaciones;
	}

	public List<Medicion> getLstMediciones() {
		return lstMediciones;
	}

	public void setLstMediciones(List<Medicion> lstMediciones) {
		this.lstMediciones = lstMediciones;
	}

}

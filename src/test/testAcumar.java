package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Acumar;

public class testAcumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acumar prueba = new Acumar();
		System.out.println("1)");
		try {
			prueba.agregarEstacion("Lanus", "Carlos Casares 2000", -34.7f, -59.4f, 100f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prueba.agregarEstacion("Avellaneda", "Av. Manuel Belgrano 2800", -34.681667f, -58.349722f, 200f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2)");
		
		System.out.println(prueba.traerEstacion("Lanus"));
		
		System.out.println("3)");
		try {
			prueba.agregarEstacion("Lanus", "Carlos Casares 2000", -34.7f, -59.4f, 100f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("4)");
		prueba.agregarMedicion(prueba.traerEstacion("Lanus"), LocalDate.of(2022, 9, 1), LocalTime.of(13, 00, 00), 17.6f, 49.0f, 9.7f, "e", 0.0f);
		
		prueba.agregarMedicion(prueba.traerEstacion("Lanus"), LocalDate.of(2022, 9, 1), LocalTime.of(14, 00, 00), 18.4f, 45.0f, 6.2f, "se", 0.0f);
		
		prueba.agregarMedicion(prueba.traerEstacion("Lanus"), LocalDate.of(2022, 9, 1), LocalTime.of(16, 00, 00), 19.0f, 39.0f, 7.3f, "s", 0.0f);
		
		prueba.agregarMedicion(prueba.traerEstacion("Avellaneda"), LocalDate.of(2022, 9, 1), LocalTime.of(15, 00, 00), 18.8f, 42.0f, 6.8f, "s", 0.0f);
		
		System.out.println("5)");
		
		System.out.println(prueba.traerMediciones(prueba.traerEstacion("Avellaneda")));
		
		
		System.out.println("6)");
		
		System.out.println(prueba.promedioTemperatura(prueba.traerEstacion("Lanus"), LocalDate.of(2022, 9, 1), LocalTime.of(12, 00, 00), LocalTime.of(15, 30, 00)));
		
		System.out.println("8)");
		
		System.out.println(prueba.traerMedicion(prueba.traerEstacion("Lanus"), LocalDate.of(2022, 9, 1), LocalTime.of(16, 00, 00)));

	}
	

}

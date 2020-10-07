package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static List<Fabricante> fabricas =  new ArrayList();
	
	
	
	public Fabricante() {
		super();
	}
	
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int x=0;
		int Mayor=0;
		Fabricante fabricaMayorVentas = new Fabricante();

		
		for (Fabricante elemento: fabricas) {
			x=0;
			for (Fabricante elementoEnTurno: fabricas) {
				if (elemento==elementoEnTurno) {
					x++;	
				}
			}
			
			if (x>Mayor) {
				Mayor = x;
				fabricaMayorVentas = elemento;
				
			}
		}
		return fabricaMayorVentas;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static List<Fabricante> getFabricas(){
		return fabricas;
	}
	
	
	
}

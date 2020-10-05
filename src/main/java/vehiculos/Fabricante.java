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
		Fabricante fabricaMayorVentas = null;
		for (Vehiculo elemento: Vehiculo.vehiculos) {
			fabricas.add(elemento.getFabricante());
		}
		
		for (Fabricante elemento: fabricas) {
			for (Fabricante elementoEnTurno: fabricas) {
				if (elemento.getNombre()==elementoEnTurno.getNombre()) {
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

	
	
	
}

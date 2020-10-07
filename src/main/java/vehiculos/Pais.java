package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	
	private static List<Pais> paises =  new ArrayList();
	
	
	public Pais() {
		super();

	}
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	
	public static Pais paisMasVendedor() {
		int x=0;
		int Mayor=0;
		Pais paisMayorVentas = null;
		
		for (Pais elemento: paises) {
			x = 0;
			for (Pais elementoEnTurno: paises) {
				if (elemento == elementoEnTurno) {
					x++;	
				}
			}
			if (x>Mayor) {
				Mayor = x;
				paisMayorVentas = elemento;
			}
		}
		return paisMayorVentas;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
    public static List<Pais> getPaises() {
        return paises;
    }
	
	

}

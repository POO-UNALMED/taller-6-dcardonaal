package vehiculos; 
import java.util.*;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private double peso;
	private String traccion;
	private Fabricante fabricante;
	private static List<Vehiculo> vehiculos =  new ArrayList();
	private static List<Pais> paises =  new ArrayList();;
	
	public Vehiculo() {
		vehiculos.add(this);
		
	}
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, double peso,
			String traccion, Fabricante fabricante) {
		super();
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		vehiculos.add(this);
	}
	
	
	public Pais paisMasVendedor() {
		int x=0;
		int Mayor=0;
		Pais paisMayorVentas = null;
		for (Vehiculo elemento: vehiculos) {
			paises.add(elemento.getFabricante().getPais());
		}
		
		for (Pais elemento: paises) {
			for (Pais elementoEnTurno: paises) {
				if (elemento.getNombre()==elementoEnTurno.getNombre()) {
					x++;	
				}
				if (x>Mayor) {
					Mayor = x;
					paisMayorVentas = elemento;
					
				}
				
			}
		}
		return paisMayorVentas;
	}
	
	
	public static int getCantidadVehiculos() {
		return vehiculos.size();
		
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantidadVehiculos() + "\n" + "Camionetas: " + Camioneta.getCantidadVehiculos() + "\n" + "Camiones: " + Camion.getCantidadVehiculos();
	}
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	
	

}

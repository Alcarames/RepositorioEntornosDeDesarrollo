import Edificios.Edificio;
import Productos.Productos;
import Vehiculos.Vehiculo;

public class Empresa {
	
	//Atributos
	protected Vehiculo vehiculo1;
	protected Vehiculo vehiculo2;
	
	protected Edificio fabrica;
	protected Edificio almacen;
	protected Edificio oficina;
	
	protected Productos puerta;
	protected Productos silla;
	
	//Constructores
	
	public Empresa()
	{
		this.vehiculo1=null;
		this.vehiculo2=null;
		this.fabrica=null;
		this.almacen=null;
		this.oficina=null;
		this.puerta=null;
		this.silla=null;
	}
	
	
	//Getters y Setters
	
	public Vehiculo getVehiculo1()
	{
		return vehiculo1;
	}
	public void setVehiculo1(Vehiculo vehiculo1)
	{
		this.vehiculo1=vehiculo1;
	}
	public Vehiculo getVehiculo2()
	{
		return vehiculo2;
	}
	public void setVehiculo2(Vehiculo vehiculo2)
	{
		this.vehiculo2=vehiculo2;
	}
	public Edificio getFabrica()
	{
		return fabrica;
	}
	public void setFabrica(Edificio fabrica)
	{
		this.fabrica=fabrica;
	}
	public Edificio getAlmacen()
	{
		return almacen;
	}
	public void setAlmacen(Edificio almacen)
	{
		this.almacen=almacen;
	}
	public Edificio getOficina()
	{
		return oficina;
	}
	public void setOficina(Edificio oficina)
	{
		this.oficina=oficina;
	}
	public Productos getPuerta()
	{
		return puerta;
	}
	public void setPuerta(Productos puerta)
	{
		this.puerta=puerta;
	}
	public Productos getSilla()
	{
		return silla;
	}
	public void setSilla(Productos silla)
	{
		this.silla=silla;
	}
	//Métodos propios
	
	public void mostrarInfo()
	{
		System.out.println("***********Empresa***********" + "\n" + "Vehículo 1: " + this.vehiculo1 + "\n" + "Vehículo 2: " + this.vehiculo2 + "\n" + "Fábrica: " + this.fabrica + "\n" + "Almacén: " + this.almacen + "\n" + "Oficina: " + this.oficina + "\n" + "Puertas: " + this.puerta + "\n" + "Sillas: " + this.silla + "\n");
	}
	
}

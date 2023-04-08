package Vehiculos;

public abstract class Vehiculo {
	
	//Atributos
	
	protected String marca;
	protected float precio;
	protected float peso;
	protected String color;
	protected float longitud;
	
	//Constructores
	
	public Vehiculo()
	{
		this.marca="";
		this.precio=0.0f;
		this.peso=0.0f;
		this.color="";
		this.longitud=0.0f;
	}
	
	//Getters y Setters
	
	public String getMarca()
	{
		return marca;
	}
	public void setMarca(String marca)
	{
		this.marca=marca;
	}
	public float getPrecio()
	{
		return precio;
	}
	public void setPrecio(float precio)
	{
		this.precio=precio;
	}
	public float getPeso()
	{
		return peso;
	}
	public void setPeso(float peso)
	{
		this.peso=peso;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public float getLongitud()
	{
		return longitud;
	}
	public void setLongitud(float longitud)
	{
		this.longitud=longitud;
	}
	
	//Métodos propios
	
	public abstract String mostrarInfo();
}

package Edificios;

public abstract class Edificio {
	
	//Atributos
	
	protected float anchura;
	protected float altura;
	protected float profundidad;
	protected String tipo;
	protected String funcionalidad;
	
	//Constructor
	
	public Edificio()
	{
		this.anchura=0.0f;
		this.altura=0.0f;
		this.profundidad=0.0f;
		this.tipo="";
		this.funcionalidad="";
	}
	
	//Getters y Setters
	
	public float getAnchura()
	{
		return anchura;
	}
	public void setAnchura(float anchura)
	{
		this.anchura=anchura;
	}
	public float getAltura()
	{
		return altura;
	}
	public void setAltura(float altura)
	{
		this.altura=altura;
	}
	public float getProfundidad()
	{
		return profundidad;
	}
	public void setProfundidad(float profundidad)
	{
		this.profundidad=profundidad;
	}
	public String getTipo()
	{
		return tipo;
	}
	public void setTipo(String tipo)
	{
		this.tipo=tipo;
	}
	public String getFuncionalidad()
	{
		return funcionalidad;
	}
	public void setFuncionalidad(String funcionalidad)
	{
		this.funcionalidad=funcionalidad;
	}
	//Métodos propios
	
	public abstract String mostrarInfo();
	
	public abstract float costePintura(float precioPorMetro);
	
	public abstract String funcionalidadEdificio();
	
}

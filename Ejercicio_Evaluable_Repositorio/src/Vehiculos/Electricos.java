package Vehiculos;

public class Electricos extends Vehiculo{
	
	//Atributos
	protected String potencia;
	//Constructores
		
		public Electricos()
		{
			this.marca="";
			this.precio=0.0f;
			this.peso=0.0f;
			this.color="";
			this.longitud=0.0f;
			this.potencia="";
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
		public String getPotencia()
		{
			return potencia;
		}
		public void setPotencia(String potencia)
		{
			this.potencia=potencia;
		}
		
	@Override
	public String mostrarInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("- Marca: " + this.marca + "\n" + "- Precio: " + this.precio + "\n" + "- Peso: " + this.peso + "\n" + "- Color: " + this.color + "\n" + "- Longitud: " + this.longitud + "\n" + "- Potencia: " + this.potencia + "\n");

		
		return "";
	}

}

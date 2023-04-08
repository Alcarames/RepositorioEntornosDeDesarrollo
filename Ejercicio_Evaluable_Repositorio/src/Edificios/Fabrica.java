package Edificios;

public class Fabrica extends Edificio{
	
	
	//Métodos propios
	
	@Override
	public String mostrarInfo() {
		// TODO Auto-generated method stub
		System.out.println("- Anchura: " + this.anchura + "\n" + "- Altura: " + this.altura + "\n" + "- Profundidad: " + this.profundidad + "\n" + "- Tipo: " + this.tipo + "\n" + "Funcionalidad: " + this.funcionalidad);
		return "";
	}

	@Override
	public float costePintura(float precioPorMetro) 
	{
		// TODO Auto-generated method stub
		float coste=0.0f;
		
		if(precioPorMetro>0)
		{
		coste=precioPorMetro * this.altura * this.anchura * this.profundidad;
		}
		else
		{
			return -1.0f;
		}
		return coste;
	}
	
	public float costePintura(String lado, float precioPorMetro) 
	{
		// TODO Auto-generated method stub
		float coste=0.0f;
		
		if(lado=="ladoAnchura")
		{
		coste=precioPorMetro * this.altura * this.profundidad;
		}
		else if (lado=="ladoProfundidad")
		{
			coste=precioPorMetro * this.altura * this.anchura;
		}
		else if(precioPorMetro<0)
		{
			return -1.0f;
		}
		return coste;
	}

	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return this.funcionalidad;
	}
	
}

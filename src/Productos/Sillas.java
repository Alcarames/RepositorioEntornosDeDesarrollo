package Productos;

public class Sillas extends Productos{

	@Override
	public String mostrarInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("- Id: " + this.id + "\n" + "- Nombre: " + this.nombre + "\n" + "- Tipo: " + this.tipo + "\n" + "- Anchura: " + this.anchura + "\n" + "- Profundidad: " + this.profundidad + "\n" + "- Altura: " + this.altura + "\n");

		return "";
	}

}

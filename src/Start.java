import Edificios.Almacen;
import Edificios.Fabrica;
import Edificios.Oficina;
import Productos.Puertas;
import Productos.Sillas;
import Vehiculos.Electricos;
import Vehiculos.Gasoil;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenido a la página de tu empresa");
		
		//Creación de la empresa
		
		Empresa empresa1 = new Empresa();
		
		//Creación de los vehículos
		
		Electricos electrico1 = new Electricos();
		Gasoil gasoil1 = new Gasoil();
		
		//Asignación de valores a vehículos
		
		electrico1.setMarca("Seat Altea");
		electrico1.setPrecio(20000.0f);
		electrico1.setPeso(3000.0f);
		electrico1.setColor("Rojo");
		electrico1.setLongitud(3.0f);
		electrico1.setPotencia("4000 Kw");
		
		gasoil1.setMarca("Renault Kadjar");
		gasoil1.setPrecio(28000.0f);
		gasoil1.setPeso(4000.0f);
		gasoil1.setColor("Azul");
		gasoil1.setLongitud(3.5f);
		
		//Asignación de vehículos a la empresa
		
		empresa1.setVehiculo1(electrico1);
		empresa1.setVehiculo2(gasoil1);
		
		//Creación de los edificios
		
		Fabrica fabrica1 = new Fabrica();
		Oficina oficina1 = new Oficina();
		Almacen almacen1 = new Almacen();
		
		//Asignación de valores a edificios
		
		fabrica1.setAnchura(0);
		fabrica1.setAltura(0);
		fabrica1.setProfundidad(0);
		fabrica1.setFuncionalidad(null);
		fabrica1.setTipo(null);
		
		oficina1.setAnchura(0);
		oficina1.setAltura(0);
		oficina1.setProfundidad(0);
		oficina1.setFuncionalidad(null);
		oficina1.setTipo(null);
		
		almacen1.setAnchura(0);
		almacen1.setAltura(0);
		almacen1.setProfundidad(0);
		almacen1.setFuncionalidad(null);
		almacen1.setTipo(null);
		
		//Asignación de edificios a la empresa
		
		empresa1.setFabrica(fabrica1);
		empresa1.setOficina(oficina1);
		empresa1.setAlmacen(almacen1);
		
		//Creación de los productos
		
		Sillas silla1 = new Sillas();
		Sillas silla2 = new Sillas();
		Puertas puerta1 = new Puertas();
		Puertas puerta2 = new Puertas();
		
		//Asignación de valores a los productos
		
		silla1.setId(1);
		silla1.setNombre("Silla N20");
		silla1.setTipo("Silla");
		silla1.setAnchura(1.0f);
		silla1.setAltura(0.5f);
		silla1.setProfundidad(0.5f);
		
		silla2.setId(2);
		silla2.setNombre("Silla M100");
		silla2.setTipo("Silla");
		silla2.setAnchura(1.5f);
		silla2.setAltura(0.5f);
		silla2.setProfundidad(1.5f);
		
		puerta1.setId(3);
		puerta1.setNombre("Puerta P9");
		puerta1.setTipo("Puerta");
		puerta1.setAnchura(1.5f);
		puerta1.setAltura(2.25f);
		puerta1.setProfundidad(0.25f);
		
		puerta2.setId(4);
		puerta2.setNombre("Puerta F50");
		puerta2.setTipo("Puerta");
		puerta2.setAnchura(1.25f);
		puerta2.setAltura(1.25f);
		puerta2.setProfundidad(0.25f);
		
		//Asignación de productos a la empresa
		
		empresa1.setSilla(silla1);
		empresa1.setSilla(silla2);
		empresa1.setPuerta(puerta1);
		empresa1.setPuerta(puerta2);
		
		empresa1.mostrarInfo();
	}

}

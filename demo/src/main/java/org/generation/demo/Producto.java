package org.generation.demo;

//POJO - Plain Old Java Object -> Entidad
public class Producto {
	private String nombre;
	private String descripcion;
	private String URL_imagen;
	private double precio;
	private int id;
	private static int total = 0;
	
	public Producto(String nombre, String descripcion, String uRL_imagen, double precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_imagen = uRL_imagen;
		this.precio = precio;
		Producto.total++;
		this.id = Producto.total;
	}//constructor
	
	public Producto() {
		Producto.total++;
		id=Producto.total;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen=" + URL_imagen
				+ ", precio=" + precio + ", id=" + id + "]";
	}//toString()

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public String getDescripcion() {
		return descripcion;
	}//getDescripcion

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescricion

	public String getURL_imagen() {
		return URL_imagen;
	}//getURL_imagen

	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}//setURL_imagen

	public double getPrecio() {
		return precio;
	}//getPrecio

	public void setPrecio(double precio) {
		this.precio = precio;
	}//setPrecio

	public int getId() {
		return id;
	}//getId
	
	
	//  1. constructor con datos y constructor default
	//  2. Getter y Setter
	//  3. toString() ->nombre, descripcion,URL_imagen, precio - id->get
	
	
	
	
}//class Producto

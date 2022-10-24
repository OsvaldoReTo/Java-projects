package org.generation.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class ProductoService {
	public final ArrayList<Producto> lista = new ArrayList<Producto>();
	@Autowired
	public ProductoService() {
		lista.add(new Producto("Cuaderno Profesional Norma 580814 / Cuadro chico / 100 hojas ",
				"Cuaderno profesional / Cubiertas est�ndar / Espiral doble ","producto_1.gif", 57));
		lista.add(new Producto("Cuaderno Profesional Norma Unicampus Lines / Cuadro grande / 160 hojas",
				" Cuaderno profesional / Cubiertas resistentes / Doble espiral met�lica / Para uso universitario o profesional",
				"producto_3.jpg", 299.00));
		lista.add(new Producto("Cuaderno Profesional Norma Color 360 / Cuadro grande / 100 hojas",
				"Cuaderno profesional de uso escolar / Encuadernado cosido Duralink / Lomo reforzado / Dise�o de color 360� / Cubiertas de pasta gruesa (plastificado Duracover) / Stickers Norma Color / Insertos did�cticos / M�rgenes rojos",
				"producto_4.jpg", 83.00));
		lista.add(new Producto("MARCADOR AZOR MAGISTRAL + BORRADOR (NEGRO, 1 PZA.) ",
				" Marcador para pizarr�n blanco a base de alcohol / Alta intensidad / Punta de cincel de 6mm / Barril de pl�stico / Tapa de seguridad antiasfixia / Hasta 350 metros / No t�xico / Borrador para pizarr�n",
				"producto_5.jpg", 54.00));
		lista.add(new Producto(" MARCADORES + BORRADOR RED TOP (COLORES, 3 PZS.) ",
				"2 Marcadores para Pizarr�n Blanco Red Top / Barril de pl�stico / Tapa de seguridad / Punta de bala / No t�xicos / 1 Borrador para pizarr�n Red Top",
				"producto_6.jpg", 70.00));
		lista.add(new Producto("Cuaderno Profesional Scribe Cl�sico / Raya / 100 hojas ",
				" Pasta semir�gida / Espiral met�lico / Recubrimiento continuo resistente / Gramaje de papel 56 gr. / Margen rojo en escuadra / Cubierta traslucida",
				"producto_7.jpg", 74.00));		
	}//constructor
	
	public ArrayList<Producto> getProductos(){
		return lista;
	}//getProductos
	
	public Producto getProducto(Long id){
		Producto tmpProd = null;
		for (Producto producto : lista) {
			if (producto.getId()==id) {
				tmpProd=producto;
				break;
			}//if
		}//forEach	
		return tmpProd;
	}//getProductos
	
	public Producto deleteProducto(Long id){
		Producto tmpProd = null;
		for (Producto producto : lista) {
			if (producto.getId()==id) {
				tmpProd=lista.remove(lista.indexOf(producto));
				break;
			}//if
		}//forEach	
		return tmpProd;
	}//getProductos

	public Producto addProducto(Producto producto) {
		lista.add(producto);
		return producto;
	}//addProducto

	public Producto updateProducto(Long id, String nombre, String descripcion, String uRL_imagen, Double precio) {
		Producto tmpProd = null;
		for (Producto producto : lista) {
			if (producto.getId()==id) {
				if(nombre!=null) producto.setNombre(nombre);
				if(descripcion!=null) producto.setDescripcion(descripcion);
				if (uRL_imagen!=null) producto.setURL_imagen(uRL_imagen);
				if (precio!=null) producto.setPrecio(precio.doubleValue());
				break;
			}//if
		}//forEach
		return tmpProd;
	}
	
}//ProductoService

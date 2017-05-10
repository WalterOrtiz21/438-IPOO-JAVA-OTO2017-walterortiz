package com.walteortiz.ipoo.repuestos.datos.cliente;

import java.util.Date;

public class Producto {
	private Long id;
	private String nombre;
	private String descricion;
	private Byte imagen;
	private Double precio;
	
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescricion() {
		return descricion;
	}
	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}
	public Byte getImagen() {
		return imagen;
	}
	public void setImagen(Byte imagen) {
		this.imagen = imagen;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	//Constructor
	public Producto(Long id, String nombre, String descricion, Byte imagen, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descricion = descricion;
		this.imagen = imagen;
		this.precio = precio;
	}
	
//Constructor2
	public Producto(){
		
	}
	
}

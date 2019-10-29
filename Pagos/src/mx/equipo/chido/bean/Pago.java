package mx.equipo.chido.bean;

import javax.annotation.ManagedBean;

public class registroPagos {
	private String nombre;
	private Integer codigo;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
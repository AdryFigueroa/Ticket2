package Ticket;

import java.time.LocalDateTime;

public class Ticket {
	
 private int numeroTicket;
 private LocalDateTime fechaHora = LocalDateTime.now(); //llamado externo
 private Cliente cliente;
 private Producto producto;
 private Ejecutivo ejecutivoAtencion;
 private Ejecutivo ejecutivoDerivado; //nombre
 private String problema;
 private String solucion; 
 private String estado;
 
 public Ticket() {
}
 
 public Ticket(int numeroTicket,LocalDateTime fechaHora,Cliente cliente,Producto producto,Ejecutivo ejecutivoAtencion,Ejecutivo ejecutivoDerivado,String problema,String solucion,String estado) {
	 this.numeroTicket = numeroTicket;
	 this.fechaHora = fechaHora;
	 this.cliente = cliente;
	 this.producto = producto;
	 this.ejecutivoAtencion = ejecutivoAtencion;
	 this.ejecutivoDerivado = ejecutivoDerivado;
	 this.problema = problema;
	 this.solucion = solucion;
	 this.estado = estado;
 	}
 
 public int getNumeroTicket() {
return numeroTicket;
 }
public void numeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

public LocalDateTime getFechaHora() {
	return fechaHora;
}

public void setFechaHora(LocalDateTime fechaHora) {
	this.fechaHora = fechaHora;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public Producto getProducto() {
	return producto;
}

public void setProducto(Producto producto) {
	this.producto = producto;
}

public Ejecutivo getEjecutivoAtencion() {
	return ejecutivoAtencion;
}

public void setEjecutivoAtencion(Ejecutivo ejecutivoAtencion) {
	this.ejecutivoAtencion = ejecutivoAtencion;
}

public Ejecutivo getEjecutivoDerivado() {
	return ejecutivoDerivado;
}

public void setEjecutivoDerivado(Ejecutivo ejecutivoDerivado) {
	this.ejecutivoDerivado = ejecutivoDerivado;
}

public String getProblema() {
	return problema;
}

public void setProblema(String problema) {
	this.problema = problema;
}

public String getSolucion() {
	return solucion;
}

public void setSolucion(String solucion) {
	this.solucion = solucion;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}
 
 
 }

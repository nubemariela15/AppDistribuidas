package ec.edu.ups.entidades;

import java.util.Date;

public class InventarioEN {
	
	private int codigo;
	private Date fecha;
	private String descripcion;
	private int cantidadCompra;
	private double precionCompra;
	private double precioTotalCompra;
	private int cantidadVenta;
	private double precioVenta;
	private double precioTotalVenta;
	private int cantidadExistencia;
	private double precioCantidadExistencia;
	private double precioTotalExistencia;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidadCompra() {
		return cantidadCompra;
	}
	public void setCantidadCompra(int cantidadCompra) {
		this.cantidadCompra = cantidadCompra;
	}
	public double getPrecionCompra() {
		return precionCompra;
	}
	public void setPrecionCompra(double precionCompra) {
		this.precionCompra = precionCompra;
	}
	public double getPrecioTotalCompra() {
		return precioTotalCompra;
	}
	public void setPrecioTotalCompra(double precioTotalCompra) {
		this.precioTotalCompra = precioTotalCompra;
	}
	public int getCantidadVenta() {
		return cantidadVenta;
	}
	public void setCantidadVenta(int cantidadVenta) {
		this.cantidadVenta = cantidadVenta;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public double getPrecioTotalVenta() {
		return precioTotalVenta;
	}
	public void setPrecioTotalVenta(double precioTotalVenta) {
		this.precioTotalVenta = precioTotalVenta;
	}
	public int getCantidadExistencia() {
		return cantidadExistencia;
	}
	public void setCantidadExistencia(int cantidadExistencia) {
		this.cantidadExistencia = cantidadExistencia;
	}
	public double getPrecioCantidadExistencia() {
		return precioCantidadExistencia;
	}
	public void setPrecioCantidadExistencia(double precioCantidadExistencia) {
		this.precioCantidadExistencia = precioCantidadExistencia;
	}
	public double getPrecioTotalExistencia() {
		return precioTotalExistencia;
	}
	public void setPrecioTotalExistencia(double precioTotalExistencia) {
		this.precioTotalExistencia = precioTotalExistencia;
	}
	

	
	
}

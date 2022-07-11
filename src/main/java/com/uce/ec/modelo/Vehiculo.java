package com.uce.ec.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
	
	@Id
	@Column(name = "vehi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_id_vehi")
	@SequenceGenerator(name = "sec_id_vehi", sequenceName = "sec_id_vehi", allocationSize = 1)
	private Integer id;
	@Column(name = "vehi_marca")
	private String marca;
	@Column(name = "vehi_modelo")
	private String modelo;
	@Column(name = "vehi_placa")
	private String placa;
	@Column(name = "vehi_tipo")
	private String tipo;
	@Column(name = "vehi_precio")
	private BigDecimal precio;
	
	@OneToOne
	@JoinColumn(name = "vehi_id_matricula")
	private Matricula matricula;
	
	
	//set y get
	
	
	
	public String getMarca() {
		return marca;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", tipo=" + tipo + ", precio="
				+ precio + "]";
	}
	
	
	
}

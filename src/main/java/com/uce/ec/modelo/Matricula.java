package com.uce.ec.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@Column(name = "matr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_id_matr")
	@SequenceGenerator(name = "sec_id_matr", sequenceName = "sec_id_matr", allocationSize = 1)
	private Integer id;
	@Column(name = "matr_fecha_matricula")
	private LocalDateTime fechaMatricula;
	@Column(name = "matr_valor_matricula")
	private BigDecimal valorMatricula;
	
	
	@ManyToOne
	@JoinColumn(name = "prop_id")
	private Propietario propietario;
	
	
	@OneToOne(mappedBy = "matricula",cascade=CascadeType.ALL)
	private Vehiculo vehiculo;
	
	//set y get
	
	
	
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula + ", propietario="
				+ propietario + ", vehiculo=" + vehiculo + "]";
	}
	
	
	
}

package com.uce.ec.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.Matricula;
import com.uce.ec.modelo.Propietario;
import com.uce.ec.modelo.Vehiculo;

@Service
public class GestorMatriculaService implements IGestorMatricula{

	
	@Autowired
	@Qualifier("liviano")
	private IVehiculoService vehiculoServiceL;
	@Autowired
	@Qualifier("pesado")
	private IVehiculoService vehiculoServiceP;
	@Autowired
	@Qualifier("general")
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;
	@Autowired
	private IMatriculaService matriculaService;
	
	
	@Override
	public void crearMatricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.vehiculoService.buscarVehiculo(placa);
		Propietario propie = this.propietarioService.buscarPropietarioCedula(cedula);
		
		String tipo = vehiculo.getTipo();
		BigDecimal valorMatricula=null;
		BigDecimal precio = vehiculo.getPrecio();
		
		if(tipo.equals("L")) {
			valorMatricula = this.vehiculoServiceL.calcularValor(precio);
		}else if(tipo.equals("P")) {
			valorMatricula = this.vehiculoServiceP.calcularValor(precio);
		}
		
		Double aux = valorMatricula.doubleValue();
		if(aux>2000) {
			valorMatricula = valorMatricula.divide(new BigDecimal(1.07).setScale(2,RoundingMode.UP));
		}
		
		
		Matricula m=new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		m.setValorMatricula(valorMatricula);
		m.setPropietario(propie);
		m.setVehiculo(vehiculo);
		
		this.matriculaService.MatriculaVehiculo(m);
	}

}

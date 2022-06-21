package com.uce.ec.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.Vehiculo;

@Service
@Qualifier("liviano")
public class VehiculoServiceLiviano implements IVehiculoService{

	@Override
	public void crearVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarVehiculo(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularValor(BigDecimal precio) {
		// TODO Auto-generated method stub
		
		BigDecimal valorMatricula = precio.multiply(new BigDecimal(0.14).setScale(2,RoundingMode.UP));
		
		return valorMatricula;
	}

}

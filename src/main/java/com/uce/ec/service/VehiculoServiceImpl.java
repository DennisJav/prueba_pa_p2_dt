package com.uce.ec.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.Vehiculo;
import com.uce.ec.repository.IVehiculosRepo;

@Service
@Qualifier("general")
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculosRepo vehiculosRepo;
	
	@Override
	public void crearVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculosRepo.crearVehiculo(vehiculo);
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculosRepo.buscarVehiculo(placa);
	}

	@Override
	public void eliminarVehiculo(String placa) {
		// TODO Auto-generated method stub
		this.vehiculosRepo.eliminarVehiculo(placa);
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculosRepo.actualizarVehiculo(vehiculo);
	}

	@Override
	public BigDecimal calcularValor(BigDecimal precio) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

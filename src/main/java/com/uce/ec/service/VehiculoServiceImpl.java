package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.Vehiculo;
import com.uce.ec.repository.IVehiculosRepo;

@Service
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
	
	

}

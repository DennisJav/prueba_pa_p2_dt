package com.uce.ec.repository;

import com.uce.ec.modelo.Vehiculo;

import com.uce.ec.modelo.Vehiculo;

public interface IVehiculosRepo {

	void crearVehiculo(Vehiculo vehiculo);
	Vehiculo buscarVehiculo(String placa);
	void eliminarVehiculo(String placa);
	void actualizarVehiculo(Vehiculo vehiculo);
	
}

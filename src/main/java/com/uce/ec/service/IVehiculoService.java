package com.uce.ec.service;

import java.math.BigDecimal;

import com.uce.ec.modelo.Vehiculo;

public interface IVehiculoService {

	void crearVehiculo(Vehiculo vehiculo);
	Vehiculo buscarVehiculo(String placa);
	void eliminarVehiculo(String placa);
	void actualizarVehiculo(Vehiculo vehiculo);
	BigDecimal calcularValor(BigDecimal precio);
}

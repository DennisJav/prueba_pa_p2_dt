package com.uce.ec.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Vehiculo;

@Repository
public class VehiculosRepoImpl implements IVehiculosRepo{

	@Override
	public void crearVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Vehiculo creado: "+vehiculo);
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		Vehiculo v=new Vehiculo();
		v.setMarca("Renault");
		v.setModelo("Logan");
		v.setPlaca(placa);
		v.setPrecio(new BigDecimal(125));
		v.setTipo("L");
		
		return v;
	}

	@Override
	public void eliminarVehiculo(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Vehiculo de placa eliminado: "+placa);
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Vehiculo actualizado: "+vehiculo);
	}

	
	
}

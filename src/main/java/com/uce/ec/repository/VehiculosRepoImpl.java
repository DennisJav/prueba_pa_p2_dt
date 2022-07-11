package com.uce.ec.repository;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Vehiculo;

@Repository
@Transactional
public class VehiculosRepoImpl implements IVehiculosRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crearVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select v from Vehiculo v where v.placa = :valoruno",
				Vehiculo.class);
		jpqlQuery.setParameter("valoruno", placa);
		return (Vehiculo) jpqlQuery.getSingleResult();

	}

	@Override
	public void eliminarVehiculo(String placa) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarVehiculo(placa));
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vehiculo);
	}

}

package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Propietario;

@Repository
@Transactional
public class PropietariosRepoImpl implements IPropietariosRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearPropietario(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub	
		this.entityManager.remove(this.buscarPropietarioCedula(cedula));		
	}

	@Override
	public Propietario buscarPropietarioCedula(String cedula) {
	
		Query jpqlQuery = this.entityManager.createQuery("select p from Propietario p where p.cedula = :valoruno",
				Propietario.class);
		jpqlQuery.setParameter("valoruno", cedula);
		return (Propietario) jpqlQuery.getSingleResult();
		
	}

}

package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Matricula;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void MatriculaVehiculo(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}
	

}

package com.uce.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Matricula;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepo{

	@Override
	public void MatriculaVehiculo(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Matricula Realizada"+matricula);
	}
	

}

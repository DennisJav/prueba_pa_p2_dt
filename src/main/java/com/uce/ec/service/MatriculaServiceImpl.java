package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.Matricula;
import com.uce.ec.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepo matriculaRepo;

	
	@Override
	public void MatriculaVehiculo(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.MatriculaVehiculo(matricula);
	}
	

}

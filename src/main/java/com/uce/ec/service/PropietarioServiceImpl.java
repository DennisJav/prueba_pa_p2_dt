package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.Propietario;
import com.uce.ec.repository.IPropietariosRepo;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietariosRepo propietariosRepo;
	
	@Override
	public void crearPropietario(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietariosRepo.crearPropietario(propietario);
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		this.propietariosRepo.eliminarPropietario(cedula);
	}

	@Override
	public Propietario buscarPropietarioCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.propietariosRepo.buscarPropietarioCedula(cedula);
	}


	

}

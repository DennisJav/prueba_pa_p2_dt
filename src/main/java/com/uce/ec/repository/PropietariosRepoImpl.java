package com.uce.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Propietario;

@Repository
public class PropietariosRepoImpl implements IPropietariosRepo{

	@Override
	public void crearPropietario(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Propietario Creado: "+propietario);
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Propietario de cedula eliminado: "+cedula);
	}

	@Override
	public Propietario buscarPropietarioCedula(String cedula) {
		// TODO Auto-generated method stub
		Propietario p=new Propietario();
		p.setNombre("JAVIER");
		p.setApellido("TAPIA");
		p.setCedula(cedula);
		//System.out.println("Propietario encontrado: "+p);
		return p;
	}

}

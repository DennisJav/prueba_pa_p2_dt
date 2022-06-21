package com.uce.ec.repository;

import com.uce.ec.modelo.Propietario;

public interface IPropietariosRepo {
	
	void crearPropietario(Propietario propietario);
	void eliminarPropietario(String cedula);
	Propietario buscarPropietarioCedula(String cedula);
}

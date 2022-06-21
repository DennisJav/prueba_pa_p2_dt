package com.uce.ec.service;

import com.uce.ec.modelo.Propietario;

public interface IPropietarioService {
	void crearPropietario(Propietario propietario);
	void eliminarPropietario(String cedula);
	Propietario buscarPropietarioCedula(String cedula);
}

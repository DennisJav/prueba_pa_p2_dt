package com.uce.ec;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.ec.modelo.Propietario;
import com.uce.ec.modelo.Vehiculo;
import com.uce.ec.service.IGestorMatricula;
import com.uce.ec.service.IMatriculaService;
import com.uce.ec.service.IPropietarioService;
import com.uce.ec.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2EcApplication implements CommandLineRunner{

	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	@Qualifier("general")
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
	@Autowired
	private IGestorMatricula gestorMatricula;
	

	@Autowired
	@Qualifier("liviano")
	private IVehiculoService vehiculoServiceL;
	@Autowired
	@Qualifier("pesado")
	private IVehiculoService vehiculoServiceP;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Prueba unidad 1");
		System.out.println("SISTEMA DE MATRICULA");
		System.out.println("------------------------");
		
		System.out.println("Punto 1");
		Propietario p=new Propietario();
		p.setApellido("TAPIA");
		p.setNombre("Dennis");
		p.setCedula("123456");
		this.propietarioService.crearPropietario(p);
		
		System.out.println("Punto 2");
		
		Vehiculo v=new Vehiculo();
		v.setMarca("Renault");
		v.setModelo("Logan");
		v.setPlaca("POC123");
		v.setPrecio(new BigDecimal(6500));
		v.setTipo("L");
		this.vehiculoService.crearVehiculo(v);
		
		System.out.println("Punto 3");
		v.setModelo("Chevrolet");
		this.vehiculoService.actualizarVehiculo(v);
		
		
		System.out.println("Punto 4");
		this.gestorMatricula.crearMatricula("123456", "POC123");
		
		
	}

}

package com.uce.ec;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

	private static final Logger LOG = LogManager.getLogger( PruebaPaP2EcApplication.class);
	
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
		LOG.info("Correccion 1");
		LOG.info("SISTEMA DE MATRICULA");
		LOG.info("------------------------");
		
		LOG.info("Punto 1");
		Propietario p=new Propietario();
		p.setApellido("TAPIA");
		p.setNombre("JAVIER");
		p.setCedula("1234565");
		this.propietarioService.crearPropietario(p);
		
		LOG.info("Punto 2");
		
		Vehiculo v=new Vehiculo();
		v.setMarca("Renault");
		v.setModelo("Logan");
		v.setPlaca("POC12345");
		v.setPrecio(new BigDecimal(6500));
		v.setTipo("L");
		this.vehiculoService.crearVehiculo(v);
		
		LOG.info("Punto 3");
		v.setMarca("Chevrolet");
		this.vehiculoService.actualizarVehiculo(v);
		
		
		LOG.info("Punto 4");
		this.gestorMatricula.crearMatricula("1234565", "POC12345");
		
		
	}

}

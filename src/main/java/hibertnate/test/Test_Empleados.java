package hibertnate.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hibertnate.modelo.Empleado;

public class Test_Empleados {

	private static EntityManager manager;
	
	private static EntityManagerFactory emf;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("persistencia");
		manager = emf.createEntityManager();
		
		List<Empleado> empleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		System.out.println("En ésta base de datos hay: "+ empleados.size() + " empleados");
	}
}

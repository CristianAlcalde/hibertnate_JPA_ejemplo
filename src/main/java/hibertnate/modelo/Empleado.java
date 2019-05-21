package hibertnate.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "COD_EMPLEADO")
	private long codigo;
	
	@Column(name = "APELLIDOS")
	private String apellidos;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "FECHA_NACIMINETO")
	private Date fecha_nacimientos;
	
	public Empleado() {
		
	}

	public Empleado(long codigo, String apellidos, String nombre, Date fecha_nacimientos) {
		
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.fecha_nacimientos = fecha_nacimientos;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_nacimientos() {
		return fecha_nacimientos;
	}

	public void setFecha_nacimientos(Date fecha_nacimientos) {
		this.fecha_nacimientos = fecha_nacimientos;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", apellidos=" + apellidos + ", nombre=" + nombre + ", fecha_nacimientos="
				+ fecha_nacimientos + "]";
	}
	
}

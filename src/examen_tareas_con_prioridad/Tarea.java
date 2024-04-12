package examen_tareas_con_prioridad;

import java.util.Objects;

public class Tarea implements Comparable<Tarea> {
	private int id;
	private String descripcion;
	private String observacion;
	private int prioridad;

	public Tarea(int id, String descripcion, int prioridad) {
		this.id = id;
		this.descripcion = descripcion;
		this.observacion = ""; // Inicialmente vacío
		this.prioridad = prioridad;
	}

	// Getters y Setters necesarios
	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getPrioridad() {
		return prioridad;
	}

	@Override
	public int compareTo(Tarea otra) {
		return Integer.compare(this.prioridad, otra.prioridad); // Orden natural por prioridad
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Descripción: " + descripcion + ", Observación: " + observacion + ", Prioridad: "
				+ prioridad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarea other = (Tarea) obj;
		return id == other.id;
	}
	
	
}

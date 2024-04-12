package examen_version2;

import java.util.Objects;

public class Tarea implements Comparable<Tarea> {
	private int id;
	private String desccipcion;
	private String obs;
	private int prioridad;

	public Tarea(int id, String desccipcion, int prioridad) {
		super();
		this.id = id;
		this.desccipcion = desccipcion;
		this.prioridad = prioridad;
		obs = "";
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return desccipcion;
	}

	public void setDescripcion(String desc) {
		desccipcion = desc;
	}

	public int getPrioridad() {
		// TODO Auto-generated method stub
		return prioridad;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", desccipcion=" + desccipcion + ", obs=" + obs + ", prioridad=" + prioridad + "]";
	}

	@Override
	public int compareTo(Tarea o) {

		return o.getPrioridad() - prioridad;
		//return prioridad - o.getPrioridad();
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

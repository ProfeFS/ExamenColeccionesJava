package examen_version2;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class GestorTareas {

	Queue<Tarea> tareasConPrioridad;
	Map<Integer, Tarea> tareasCompletadas;

	public GestorTareas() {
		tareasConPrioridad = new PriorityQueue<>();
		tareasCompletadas = new HashMap<>();
	}
	
	public void agregarTarea(Tarea t) {
		if (tareasConPrioridad.contains(t) || tareasCompletadas.containsKey(t.getId())) {
			System.out.println("ya existe la tarea con id: " + t.getId());
			return;
		}
		tareasConPrioridad.offer(t);
		System.out.println("Se ha agregado la tarea Id: " + t.getId());
	}

	public void agregarTarea1(Tarea t) {
		if (tareasConPrioridad.contains(t)) {
			System.out.println("ya existe la tarea con id: " + t.getId() + " Se actualizará la tarea en la cola");
			tareasConPrioridad.remove(t);
		}
		tareasConPrioridad.offer(t);
		System.out.println("Se ha agregado la tarea Id: " + t.getId());
	}

	public void mostrarTareaConPrioridad() {
		if (tareasConPrioridad.isEmpty()) {
			System.out.println("No hay tareas en la cola");
			return;
		}

		System.out.println(tareasConPrioridad.peek());
	}

	public void mostrarTodasLasTareas() {
		tareasConPrioridad.forEach(System.out::println);
	}

	public void completarTarea() {
		if (tareasConPrioridad.isEmpty()) {
			System.out.println("No hay tareas en la cola");
			return;
		}

		Tarea t = tareasConPrioridad.poll();
		t.setObs("Ejecutadas acciones para: " + t.getDescription());
		tareasCompletadas.put(t.getId(), t);
		System.out.println("Se ha completado la tarea con éxito");
	}

	public void mostrarDetalleTareaCompletada(Integer id) {
		Tarea t = tareasCompletadas.get(id);
		if (t == null) {
			System.out.println("la tarea con id no existe en la lista de completadas");
			return;
		}

		System.out.println(t);
	}

}

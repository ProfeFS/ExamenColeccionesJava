package examen_tareas_con_prioridad;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class GestorTareas {
	private PriorityQueue<Tarea> tareasPendientes = new PriorityQueue<>();
	private Map<Integer, Tarea> tareasCompletadas = new HashMap<>();

	public void añadirTarea(Tarea nuevaTarea) {
		if (tareasCompletadas.containsKey(nuevaTarea.getId()) || tareasPendientes.contains(nuevaTarea)) {
			System.out.println("Error: Ya existe una tarea con el ID " + nuevaTarea.getId());
			return;
		}
		tareasPendientes.offer(nuevaTarea);
		System.out.println("Tarea añadida: " + nuevaTarea);
	}
	
	 public void mostrarTareaConMayorPrioridad() {
	        if (tareasPendientes.isEmpty()) {
	            System.out.println("No hay tareas pendientes.");
	            return;
	        }
	        Tarea tarea = tareasPendientes.peek();
	        System.out.println("Tarea con mayor prioridad: " + tarea);
	    }

	public void completarTarea(String obs) {
		Tarea tarea = tareasPendientes.poll();
		if (tarea == null) {
			System.out.println("No hay tareas pendientes.");
			return;
		}

		String observacion = obs;
		tarea.setObservacion(observacion);
		tareasCompletadas.put(tarea.getId(), tarea);
		System.out.println("Tarea completada y guardada: " + tarea);
	}


	public void mostrarDetallesDeTareaCompletada(int id) {
		Tarea tarea = tareasCompletadas.get(id);
		if (tarea == null) {
			System.out.println("No existe una tarea completada con el ID: " + id);
			return;
		}
		System.out.println("Detalles de la tarea completada: " + tarea);
	}
}

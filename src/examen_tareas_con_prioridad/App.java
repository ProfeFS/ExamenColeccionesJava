package examen_tareas_con_prioridad;

public class App {

	public static void main(String[] args) {
		GestorTareas admin = new GestorTareas();
        admin.añadirTarea(new Tarea(1, "Diseñar UI", 5));
        admin.añadirTarea(new Tarea(2, "Implementar backend", 2));
        admin.añadirTarea(new Tarea(3, "Revisar bugs", 1));
        
        admin.añadirTarea(new Tarea(1, "Diseñar UI", 5));
       
        admin.mostrarTareaConMayorPrioridad();
        
        admin.completarTarea("realizadas acciones");        
        
        admin.mostrarDetallesDeTareaCompletada(3);

	}

}

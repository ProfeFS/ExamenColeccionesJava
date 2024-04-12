package examen_version2;

public class App {

	public static void main(String[] args) {
		GestorTareas admin = new GestorTareas();
		admin.agregarTarea(new Tarea(1, "Diseñar UI", 5));
		admin.agregarTarea(new Tarea(2, "Implementar backend", 2));
		admin.agregarTarea(new Tarea(3, "Revisar bugs", 1));
		System.out.println("\r");
		
		admin.agregarTarea(new Tarea(1, "nuevaDiseñar UI", 5));		

		admin.mostrarTareaConPrioridad();
		System.out.println("\r");

		admin.completarTarea();
		System.out.println("\r");

		admin.mostrarDetalleTareaCompletada(1);

	}

}

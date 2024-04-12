package examen_navegador;

import java.util.ArrayDeque;
import java.util.Deque;

public class Navegador {

	Deque<String> historial;
	Deque<String> pilaAdelante;

	public Navegador() {
		historial = new ArrayDeque<>();
		pilaAdelante = new ArrayDeque<>();
	}

	public void visitarUrl(String url) {

		if (!historial.isEmpty()) {
			pilaAdelante.clear(); // Limpia la pila adelante cada vez que se visita una nueva página
		}

		historial.push(url);
		mostrarContenidoUrl(url);
	}

	private void mostrarContenidoUrl(String url) {
		System.out.println("estás navegando en la página: " + url);

	}

	// Regresa a la página anterior y actualiza el estado del historial.
	public String volver() {
		if (historial.isEmpty()) {
			return "No es posible volver atrás";
		}

		String urlActual = historial.poll();
		pilaAdelante.push(urlActual);
		mostrarContenidoUrl(historial.peek());
		return historial.peek();

//		if (historial.size() <= 1) {
//			return "No se puede volver atrás, estás en la primera página visitada.";
//		}

	}

	// : Avanza a la página siguiente si previamente se ha vuelto atrás.
	public String avanzar() {
		if (pilaAdelante.isEmpty()) {
			return "No se puede avanzar, no hay historial adelante.";
		}
		String url = pilaAdelante.pop();
		historial.push(url);
		return url;
	}

	// : Muestra el historial de navegación.
	void mostrarHistorial() {
		System.out.println("Historial de Navegación:");
		historial.descendingIterator().forEachRemaining(System.out::println);
	}

}

/*
 * public void visitar(String url) { if (!historial.isEmpty()) {
 * adelante.clear(); // Limpia la pila adelante cada vez que se visita una nueva
 * página } historial.push(url); }
 * 
 * public String volver() { if (historial.size() <= 1) { return
 * "No se puede volver atrás, estás en la primera página visitada."; } String
 * actualUrl = historial.pop(); adelante.push(actualUrl); return
 * historial.peek(); }
 * 
 * public String avanzar() { if (adelante.isEmpty()) { return
 * "No se puede avanzar, no hay historial adelante."; } String url =
 * adelante.pop(); historial.push(url); return url; }
 * 
 * public void mostrarHistorial() {
 * System.out.println("Historial de Navegación:");
 * historial.descendingIterator().forEachRemaining(System.out::println); }
 */

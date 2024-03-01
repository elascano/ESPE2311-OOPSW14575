
package ec.espe.edu.controller;

import ec.espe.edu.model.Park;

/**
 *
 * @author mateo
 */
public class ParkController {
    
    // Método para calcular el precio en base a las horas
    public float calcularPrecio(Park parque) {
        // Suponiendo que el costo por hora es de 0.50 (50 centavos)
        float costoPorHora = 0.50f;
        
        // Calcular el precio total
        float precio = parque.getHoras() * costoPorHora;

        // Actualizar el precio en el objeto Park
        parque.setPrice(precio);

        return precio;
    }
}

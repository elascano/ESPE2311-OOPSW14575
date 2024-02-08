
package ec.edu.espe.controller;

import ec.edu.espe.model.A;
import ec.edu.espe.model.B;
import ec.edu.espe.model.C;
import ec.edu.espe.model.D;
import ec.edu.espe.model.E;
import ec.edu.espe.model.F;
import ec.edu.espe.model.G;
import ec.edu.espe.model.J;
import ec.edu.espe.view.ViewClass;
import javax.swing.text.View;

public class ControllerClass {
    private A aInstance;
    private B bInstance;
    private C cInstance;
    private D dInstance;
    private E eInstance;
    private F fInstance;
    private G gInstance;
    private J jInstance;
    private ViewClass viewClass;

    public ControllerClass(A aInstance, B bInstance, C cInstance, D dInstance, E eInstance, F fInstance, G gInstance,J jInstance, View view) {
        this.aInstance = aInstance;
        this.bInstance = bInstance;
        this.cInstance = cInstance;
        this.dInstance = dInstance;
        this.eInstance = eInstance;
        this.fInstance = fInstance;
        this.gInstance = gInstance;
        this.jInstance = jInstance;
        this.viewClass = viewClass;
    }

    public void executeLogic() {
        // Ejemplo: Mostrar información sobre las instancias
        System.out.println("Lógica del controlador ejecutada con instancias de las clases A, B, C, D, E, F, G, H, J");
    }
}
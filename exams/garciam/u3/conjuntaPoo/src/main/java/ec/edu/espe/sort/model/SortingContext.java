
package ec.edu.espe.sort.model;

import ec.edu.espe.sort.controller.AppController;

/**
 *
 * @author mateo
 */
public class SortingContext {
    public void setSortingStrategy(){
        AppController appController = new AppController();
        appController.getBestOptionToSort();
    }
}

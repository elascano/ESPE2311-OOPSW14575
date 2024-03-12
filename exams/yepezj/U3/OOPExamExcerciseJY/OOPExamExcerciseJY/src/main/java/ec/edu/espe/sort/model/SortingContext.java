
package ec.edu.espe.sort.model;

import ec.edu.espe.sort.controller.AppController;

/**
 *
 * @author Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class SortingContext {
    public void setSortingStrategy(){
        AppController appController = new AppController();
        appController.getBestOptionToSort();
    }
}

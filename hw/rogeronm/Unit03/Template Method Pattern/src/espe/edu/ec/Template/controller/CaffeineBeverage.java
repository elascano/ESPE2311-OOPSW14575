package espe.edu.ec.Template.controller;

/**
 *
 * @author EDWARICHSNAKE
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(wantsCondiment()){
            addCondiments();
        }
    }
    
    void boilWater(){
        System.out.println("Boling water");
    }
    
    public abstract void brew();
    
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    
    public abstract void addCondiments();
    
    boolean wantsCondiment(){
        return true;
    }
}

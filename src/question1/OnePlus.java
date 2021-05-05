/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class OnePlus extends Mobiles{
    
    private String modelName;

    public OnePlus(String modelName, String brand, double cost) {
        super(brand, cost);
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return "OnePlus{" + "modelName=" + modelName + '}';
    }
    
    @Override
    public double finalBilling() {
        return super.getCost()*99.0;
    }
    
}

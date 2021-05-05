/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class Brand {
    private String name;
    private String qualityLevel;
    private int cost;

    public Brand(String name, String qualityLevel, int cost) {
        this.name = name;
        this.qualityLevel = qualityLevel;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public int getCost() {
        return cost;
    }
    
    @Override
    public String toString() {
        return "Brand to string method{" + "name=" + name + ", qualityLevel=" + qualityLevel + ", cost=" + cost + '}';
    }
    
}

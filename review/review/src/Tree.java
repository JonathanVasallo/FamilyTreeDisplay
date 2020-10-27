
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class Tree {
    private ArrayList<String> grandparentArray = new ArrayList();
    private ArrayList<String> parentArray = new ArrayList();
    private ArrayList<String> childArray = new ArrayList();
    
    public Tree(ArrayList<String> parentArray,ArrayList<String> childArray) {
        this.parentArray = parentArray;
        this.childArray = childArray;
        
    }

    public ArrayList<String> getGrandparentArray() {
        return grandparentArray;
    }

    public void setGrandparentArray(ArrayList<String> grandparentArray) {
        this.grandparentArray = grandparentArray;
    }

    public ArrayList<String> getParentArray() {
        return parentArray;
    }

    public void setParentArray(ArrayList<String> parentArray) {
        this.parentArray = parentArray;
    }

    public ArrayList<String> getChildArray() {
        return childArray;
    }

    public void setChildArray(ArrayList<String> childArray) {
        this.childArray = childArray;
    }
    
    
    
    
    
    
    
}

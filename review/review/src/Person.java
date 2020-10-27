/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class Person {
 // every person has a name, DOB
private String name;
private String dob;
private String marriedTo;
private String Children;
private String parents;
 public Person(String name, String dob ,String marriedTo,String Children,String Parents){
 this.name = name;
 this.dob = dob;
 this.marriedTo = marriedTo;
 this.Children = Children;
 this.parents = Parents;
 }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getMarriedTo() {
        return marriedTo;
    }

    public void setMarriedTo(String marriedTo) {
        this.marriedTo = marriedTo;
    }

    public String getChildren() {
        return Children;
    }

    public void setChildren(String Children) {
        
        
        this.Children = this.Children + Children;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents += " "+parents;
    }
    
    
    
    
    

    @Override
    public String toString() {
        return "Person{" + "name= " + name + ", dob= " + dob + " married To:"+ marriedTo + "child: "+ Children+" parents: "+parents;
    }
    
    

    
 
}

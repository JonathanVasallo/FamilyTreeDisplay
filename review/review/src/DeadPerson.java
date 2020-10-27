/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class DeadPerson extends Person{
    private String dod; // date of death 
    
   public DeadPerson(String name, String dob, String marriedTo, String Children,String Parents, String dod) {
       super(name,dob,marriedTo,Children,Parents);
   this.dod = dod;   
   } 
   public String getIsDead() {
        return "Dead";
    }
   
}

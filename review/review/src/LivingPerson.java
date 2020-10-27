/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class LivingPerson extends Person{
   private String cityLive;
   private String stateLive;
   
   public LivingPerson(String name, String dob,String marriedTo, String Children,String Parents, String cityLive, String stateLive){
     super(name,dob,marriedTo,Children,Parents);
     this.cityLive = cityLive; 
     this.stateLive =stateLive;
   }

    public String getIsAlive() {
        return "Alive";
    }
   
}

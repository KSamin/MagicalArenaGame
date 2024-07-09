package org.swiggyAssignment;

public class Player {
    private  int health;
    private int strength;
    private int attack;
    public Player(int health, int strength, int attack){
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }
    //Getting the Entity Value
    public int getHealth(){
        return health;
    }
    public int getStrength(){
        return strength;
    }
    public int getAttack(){
        return attack;
    }

   //setting the Entity value


   public void setHealth(int health) {
       this.health = health;
   }

   public void setStrength(int strength) {
       this.strength = strength;
   }

   public void setAttack(int attack) {
       this.attack = attack;
   }

    
}

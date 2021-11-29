package jp.ac.uryukyu.ie.e215747;


public class WarriorTest {
    String name;
    int hitPoint;
    int attack;
    boolean dead;


   void attackTest() {
       int defaultHeroHp = 100;
       Warrior demoHero = new Warrior("戦士", defaultHeroHp, 10);
       Enemy slime = new Enemy("スライムNEO", 45, 100);
       for (int i = 0; i<3; i++){
           demoHero.attackWithWeaponSkill(slime); 
       slime.attack(demoHero); 
       }
   }
}

    



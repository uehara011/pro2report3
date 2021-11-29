import jp.ac.uryukyu.ie.e215747.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("戦士", 10, 6);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while( warrior.getDead() == false && enemy.getDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeaponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }    
}
    
   
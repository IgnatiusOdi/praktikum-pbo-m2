package m2;

import java.util.*;

public class Bot {
    private Random rand = new Random();

    private int index;
    private Hero hero;

    private int temphp;
    private int tempmana;
    private int tempatt;
    private int tempdef;
    private int tempupatt;
    private int tempupdef;

    public Bot(){
        index = rand.nextInt(4)+1;
        hero = new Hero(index);
    }

    public void checkPlayerlevel(int level){
        if (level >= 1 && level <= 5) {
            hero.setHpmin(hero.getHpmin()+5);
            hero.setHpmax(hero.getHpmin()+5);


            tempupatt = 0;
            hero.setAttmin(hero.getAttmin()+ tempupatt);
            hero.setAttmax(hero.getAttmax()+ tempupatt);

            hero.setMana(hero.getMana()+10);
            tempmana = hero.getMana();

            tempupdef = rand.nextInt(3)+1;
            hero.setDef(hero.getDef()+ tempupdef);
        } else if (level >= 6 && level <=10) {
            hero.setHpmin(hero.getHpmin()+10);
            hero.setHpmax(hero.getHpmin()+10);


            tempupatt = 5;
            hero.setAttmin(hero.getAttmin()+ tempupatt);
            hero.setAttmax(hero.getAttmax()+ tempupatt);

            hero.setMana(hero.getMana()+15);
            tempmana = hero.getMana();

            tempupdef = rand.nextInt(3)+4;
            hero.setDef(hero.getDef()+ tempupdef);
        } else if (level >=11 && level <=15) {
            hero.setHpmin(hero.getHpmin()+15);
            hero.setHpmax(hero.getHpmin()+15);


            tempupatt = 10;
            hero.setAttmin(hero.getAttmin()+ tempupatt);
            hero.setAttmax(hero.getAttmax()+ tempupatt);

            hero.setMana(hero.getMana()+20);
            tempmana = hero.getMana();

            tempupdef = rand.nextInt(2)+6;
            hero.setDef(hero.getDef()+ tempupdef);
        } else {
            hero.setHpmin(hero.getHpmin()+20);
            hero.setHpmax(hero.getHpmin()+20);


            tempupatt = 15;
            hero.setAttmin(hero.getAttmin()+ tempupatt);
            hero.setAttmax(hero.getAttmax()+ tempupatt);

            hero.setMana(hero.getMana()+25);
            tempmana = hero.getMana();

            tempupdef = rand.nextInt(3)+8;
            hero.setDef(hero.getDef()+ tempupdef);
        }
    }

    public void displayStatus(){
        System.out.print(
                "Bot's Class: "+hero.getNama()+"\n"+
                "Bot's HP: "+temphp+"\n"+
                "Bot's Mana: "+hero.getMana()+"\n"+
                "Bot's ATK: "+hero.getAttmin()+"-"+hero.getAttmax()+" (+"+ tempupatt +")\n"+
                "Bot's DEF: "+hero.getDef()+"% (+"+ tempupdef +")\n"
        );
    }

    public int gacha(){
        return rand.nextInt(10)+1;
    }

    public void randomHp(){
        temphp = hero.randomHp();
    }

    public void setTemphp(int temphp){
        this.temphp = temphp;
    }

    public int getTemphp(){
        return temphp;
    }

    public int randomAtt(){
        tempatt = hero.randomAtt();
        return tempatt;
    }

    public int getRandomattack(){
        return tempatt;
    }

    public int getDef(){
        return hero.getDef();
    }

    public String getSkill(){
        return hero.getSkill();
    }

    public void skillExpired(){
        if (hero.getNama().equals("Warrior")){
            System.out.println("Attack Buff Expired");
        } else if (hero.getNama().equals("Death Knight")) {
            hero.setDef(hero.getDef()-tempdef);
            System.out.println("Defend Buff Expired");
        }
    }

    public boolean checkMana(){
        return tempmana >= hero.getManacost();
    }

    public void castWarrior(){
        tempmana = tempmana - hero.getManacost();
        System.out.println("ATK Bot bertambah sebesar 20 persen!");
    }

    public void castWarlock(){
        tempmana = tempmana - hero.getManacost();
    }

    public void castPaladin(){
        tempmana = tempmana - hero.getManacost();
    }

    public void castDeathKnight(){
        tempmana = tempmana - hero.getManacost();
        tempdef = rand.nextInt(5)+1;
        hero.setDef(hero.getDef()+tempdef);
        System.out.println("DEF Bot bertambah sebesar "+tempdef+" persen!");
    }

    public String getNamahero(){
        return hero.getNama();
    }
}

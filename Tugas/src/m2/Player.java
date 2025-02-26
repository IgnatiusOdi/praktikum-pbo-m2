package m2;

import java.util.*;

public class Player {
    private Random rand = new Random();
    private Hero hero;

    private String nama;
    private int level;
    private int exp;
    private int up;

    private int temphp;
    private int tempmana;
    private int tempatt;
    private int tempdef;

    private int tempupatt;
    private int tempupdef;

    public Player(String playername, int index){
        nama = playername;
        hero = new Hero(index);
        level = 1;
        exp = 0;
        up = 0;
        tempupatt = 0;
        tempupdef = 0;
    }

    public String getNamahero(){
        return hero.getNama();
    }

    public void mainMenu(){
        System.out.print(
                "Welcome to Warcraft "+nama+"!\n"+
                "Class Name: "+hero.getNama()+"\n"+
                "Level: "+level+"\n"+
                "Exp: "+exp+"/100\n"+
                "1. Fight with Bot\n"+
                "2. Upgrade Status\n"+
                "3. Change Class\n"+
                "4. Cheat this Game!\n"+
                "5. Exit\n"+
                ">> "
        );
    }

    public void displayStatus(){
        System.out.print(
                nama+"'s Class: "+hero.getNama()+"\n"+
                nama+"'s HP: "+temphp+"\n"+
                nama+"'s Mana: "+hero.getMana()+"\n"+
                nama+"'s ATK: "+hero.getAttmin()+"-"+hero.getAttmax()+" (+"+tempupatt+")\n"+
                nama+"'s DEF: "+hero.getDef()+"% (+"+tempupdef+")\n"
        );
    }

    public void randomHp(){
        temphp = hero.randomHp();
    }

    public void refillMana(){
        tempmana = hero.getMana();
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

    public int getRandomatt(){
        return tempatt;
    }

    public int getDef(){
        return hero.getDef();
    }

    public String getSkill(){
        return hero.getSkill();
    }

    public boolean checkMana(){
        return tempmana >= hero.getManacost();
    }

    public void castWarrior(){
        tempmana = tempmana - hero.getManacost();
        System.out.println("ATK "+nama+" bertambah sebesar 20 persen!");
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
        System.out.println("DEF "+nama+" bertambah sebesar "+tempdef+" persen!");
    }

    public void skillExpired(){
        if (hero.getNama().equals("Warrior")){
            System.out.println("Attack Buff Expired");
        } else if (hero.getNama().equals("Death Knight")) {
            hero.setDef(hero.getDef()-tempdef);
            System.out.println("Defend Buff Expired");
        }
    }

    public void increaseExp(){
        int tempexp = rand.nextInt(6)+10;
        exp = exp + tempexp;
        System.out.println(nama+" menang dan mendapatkan exp sebanyak "+tempexp);
        if (exp >= 100){
            level++;
            tempexp = exp - 100;
            exp = tempexp;
            up++;
        }
    }

    public void upgradeStatus(){
        System.out.print(
                nama+"'s Level: "+level+"\n"+
                nama+"'s HP: "+hero.getHpmin()+"-"+hero.getHpmax()+"\n"+
                nama+"'s Mana: "+hero.getMana()+"\n"+
                nama+"'s ATT: "+hero.getAttmin()+"-"+hero.getAttmax()+" (+"+tempupatt+")\n"+
                nama+"'s DEF: "+hero.getDef()+"% (+"+tempupdef+")\n"+
                "Current Upgrade Point: "+up+"\n"+
               "1. Upgrade ATK\n"+
               "2. Upgrade DEF\n"+
               ">> "
        );
    }

    public void upgradeATK(){
        if (up > 0) {
            tempupatt += 1;
            hero.setAttmin(hero.getAttmin()+1);
            hero.setAttmax(hero.getAttmax()+1);
            up -= 1;
        } else {
            System.out.println("Upgrade Point tidak cukup!");
        }
    }

    public void upgradeDEF(){
        if (up > 0) {
            tempupdef += 1;
            hero.setDef(hero.getDef()+1);
            up -= 1;
        } else {
            System.out.println("Upgrade Point tidak cukup!");
        }
    }

    public void changeClass(int index){
        hero = new Hero(index);
        up = level - 1;
        tempupatt = 0;
        tempupdef = 0;
    }

    public void cheatGame(){
        this.up += 1;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getUp() {
        return up;
    }

    public void setUp(int up) {
        this.up = up;
    }
}

package m2;

import java.util.*;

public class Hero {
    private Random rand = new Random();

    private String nama;
    private int hpmin;
    private int hpmax;
    private int attmin;
    private int attmax;
    private int mana;
    private int manacost;
    private int def;
    private String skill;

    public Hero(int index){
        if (index == 1) {
            nama = "Warrior";
            hpmin = 100;
            hpmax = 115;
            attmin = 30;
            attmax = 35;
            mana = 50;
            def = 20;
            skill = "Attack Buff";
            manacost = 5;
        } else if (index == 2) {
            nama = "Warlock";
            hpmin = 90;
            hpmax = 105;
            attmin = 25;
            attmax = 35;
            mana = 75;
            def = 15;
            skill = "Lifesteal";
            manacost = 15;
        } else if (index == 3) {
            nama = "Paladin";
            hpmin = 75;
            hpmax = 85;
            attmin = 15;
            attmax = 20;
            mana = 75;
            def = 15;
            skill = "Heal";
            manacost = 10;
        } else if (index == 4) {
            nama = "Death Knight";
            hpmin = 125;
            hpmax = 150;
            attmin = 25;
            attmax = 30;
            mana = 45;
            def = 40;
            skill = "Defend Buff";
            manacost = 5;
        }
    }

    public int randomHp() {
        int hp = rand.nextInt((hpmax-hpmin)+1)+hpmin;
        return hp;
    }

    public int randomAtt(){
        int attack = rand.nextInt((attmax-attmin)+1)+attmin;
        return attack;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHpmin() {
        return hpmin;
    }

    public void setHpmin(int hpmin) {
        this.hpmin = hpmin;
    }

    public int getHpmax() {
        return hpmax;
    }

    public void setHpmax(int hpmax) {
        this.hpmax = hpmax;
    }

    public int getAttmin() {
        return attmin;
    }

    public void setAttmin(int attmin) {
        this.attmin = attmin;
    }

    public int getAttmax() {
        return attmax;
    }

    public void setAttmax(int attmax) {
        this.attmax = attmax;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getManacost() {
        return manacost;
    }

    public void setManacost(int manacost) {
        this.manacost = manacost;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

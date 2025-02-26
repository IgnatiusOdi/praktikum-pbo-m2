package m2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);

        ArrayList<String> heroname = new ArrayList<>();
        heroname.add("Warrior (Attacker)");
        heroname.add("Warlock (Attacker)");
        heroname.add("Paladin (Healer)");
        heroname.add("Death Knight (Tank)");

        System.out.print("Input Player name: ");
        String playername = scan.nextLine();

        int input;
        do{
            System.out.println("Welcome to Warcraft "+playername+"!");
            System.out.println("PICK YOUR CLASS");
            for (int i = 0; i < heroname.size(); i++) {
                System.out.println((i+1)+". "+heroname.get(i));
            }
            System.out.print(">> ");
            input = scanint.nextInt(); //1 2 3 4
        }while(input<1 || input>4);
        input--; //0 1 2 3
        int index = 0;
        if (heroname.get(input).equals("Warrior (Attacker)")) {
            index = 1;
        } else if (heroname.get(input).equals("Warlock (Attacker)")) {
            index = 2;
        } else if (heroname.get(input).equals("Paladin (Healer)")) {
            index = 3;
        } else if (heroname.get(input).equals("Death Knight (Tank)")) {
            index = 4;
        }
        heroname.remove(input);
        Player player = new Player(playername, index);

        int menu;
        do{
            player.mainMenu();
            menu = scanint.nextInt();
            if (menu == 1) {

                Bot bot = new Bot();
                bot.checkPlayerlevel(player.getLevel());
                player.randomHp();
                player.refillMana();
                bot.randomHp();
                boolean win = true;
                boolean end = false;
                boolean turnbot = false;
                int ctrskillplayer = 0;
                int ctrskillbot = 0;

                do{
                    if (ctrskillplayer > 0){
                        ctrskillplayer--;
                    }
                    if (ctrskillbot > 0){
                        ctrskillbot--;
                    }

                    if (ctrskillplayer == 0){
                        player.skillExpired();
                    }
                    if (ctrskillbot == 0){
                        bot.skillExpired();
                    }
                    System.out.print(
                            "FIGHT WITH BOT\n"+
                                    "--------------\n"+
                                    "++++++++++++++\n"
                    );
                    player.displayStatus();
                    System.out.print("==============\n");
                    bot.displayStatus();
                    System.out.print("--------------\n");
                    System.out.print(
                            "Menu: \n"+
                                    "1. Attack\n"+
                                    "2. Skill\n"+
                                    "3. Run Away\n"
                    );
                    do{
                        System.out.print(">> ");
                        input = scanint.nextInt();
                        if (input == 1) {
                            int tempattack = player.randomAtt();
                            if (ctrskillplayer > 0 && player.getNamahero().equals("Warrior")){
                                tempattack = (int) (tempattack + 0.2*tempattack);
                            }
                            bot.setTemphp(bot.getTemphp()-(tempattack-(tempattack*(bot.getDef()/100))));
                            turnbot = true;
                            System.out.println(player.getNama()+" memilih Attack");
                            System.out.println("HP Bot berkurang sebanyak "+tempattack+"!");
                        } else if (input == 2) {
                            if (player.checkMana()){
                                System.out.println(player.getNama()+" memilih Skill \""+player.getSkill()+"\"!");
                                if (player.getNamahero().equals("Warrior")){
                                    ctrskillplayer = 3;
                                    player.castWarrior();
                                } else if (player.getNamahero().equals("Warlock")){
                                    int tempattack = player.randomAtt();
                                    int lifesteal = (int) (0.3*tempattack);
                                    bot.setTemphp(bot.getTemphp()-(tempattack-(tempattack*(bot.getDef()/100))));
                                    player.setTemphp(player.getTemphp()+lifesteal);
                                    System.out.println("HP Bot berkurang sebanyak "+tempattack+"!");
                                    System.out.println(player.getNama()+" mendapatkan lifesteal sebesar "+lifesteal);
                                    player.castWarlock();
                                } else if (player.getNamahero().equals("Paladin")){
                                    int tempattack = player.randomAtt();
                                    int heal = (int) (0.5*tempattack);
                                    System.out.println(player.getNama()+" mendapatkan heal sebesar "+heal);
                                    player.castPaladin();
                                } else if (player.getNamahero().equals("Death Knight")){
                                    ctrskillplayer = 3;
                                    player.castDeathKnight();
                                }
                                turnbot = true;
                            } else {
                                System.out.println("Mana tidak cukup");
                            }
                        } else if (input == 3){
                            win = false;
                            end = true;
                            System.out.println(player.getNama()+" memilih Run Away");
                        }
                    }while(input < 1 || input > 3);

                    if (bot.getTemphp() <= 0){
                        turnbot = false;
                        win = true;
                        break;
                    }

                    while (turnbot) {
                        bot.gacha();
                        if (bot.gacha() >= 1 && bot.gacha() <= 5){
                            int tempattack = bot.randomAtt();
                            if (ctrskillbot > 0 && bot.getNamahero().equals("Warrior")){
                                tempattack = (int) (tempattack + 0.2*tempattack);
                            }
                            player.setTemphp(player.getTemphp()-(bot.randomAtt()-(bot.getRandomattack()*(player.getDef()/100))));
                            System.out.println("Bot memilih Attack");
                            System.out.println("HP "+player.getNama()+" berkurang sebanyak "+tempattack+"!");
                            turnbot = false;
                        } else {
                            if (bot.checkMana()){
                                System.out.println("Bot memilih Skill \""+bot.getSkill()+"\"!");
                                if (bot.getNamahero().equals("Warrior")){
                                    ctrskillbot = 3;
                                    bot.castWarrior();
                                } else if (bot.getNamahero().equals("Warlock")){
                                    int tempattack = bot.randomAtt();
                                    int lifesteal = (int) (0.3*tempattack);
                                    player.setTemphp(player.getTemphp()-(tempattack-(tempattack*(player.getDef()/100))));
                                    bot.setTemphp(bot.getTemphp()+lifesteal);
                                    System.out.println("HP "+player.getNama()+" berkurang sebanyak "+tempattack+"!");
                                    System.out.println("Bot mendapatkan lifesteal sebesar "+lifesteal);
                                    bot.castWarlock();
                                } else if (bot.getNamahero().equals("Paladin")){
                                    int tempattack = bot.randomAtt();
                                    int heal = (int) (0.5*tempattack);
                                    System.out.println("Bot mendapatkan heal sebesar "+heal);
                                    bot.castPaladin();
                                } else if (bot.getNamahero().equals("Death Knight")){
                                    ctrskillbot = 3;
                                    bot.castDeathKnight();
                                }
                                turnbot = false;
                            }
                        }
                    }

                    if (player.getTemphp() <= 0){
                        end = true;
                        win = false;
                        break;
                    }

                }while(!end);

                if (win) {
                    player.increaseExp();
                } else {
                    int tempexp = (int) (0.15*player.getExp());
                    player.setExp(player.getExp()-tempexp);
                    if (player.getExp()<0){
                        player.setExp(0);
                    }
                    System.out.println(player.getNama()+" kalah dan exp berkurang sebanyak "+tempexp);
                }

            } else if (menu == 2) {

                player.upgradeStatus();
                input = scanint.nextInt();
                if (input == 1){
                    player.upgradeATK();
                } else if (input == 2){
                    player.upgradeDEF();
                }

            } else if (menu == 3) {

                do{
                    System.out.println("CHANGE YOUR CLASS");
                    for (int i = 0; i < heroname.size(); i++) {
                        System.out.println((i+1)+". "+heroname.get(i));
                    }
                    System.out.print(
                            "4. Cancel\n"+
                            ">> "
                    );
                    input = scanint.nextInt(); //1 2 3
                    if (input >= 1 && input <= 3){
                        input--; //0 1 2
                        index = 0;
                        if (heroname.get(input).equals("Warrior (Attacker)")) {
                            index = 1;
                        } else if (heroname.get(input).equals("Warlock (Attacker)")) {
                            index = 2;
                        } else if (heroname.get(input).equals("Paladin (Healer)")) {
                            index = 3;
                        } else if (heroname.get(input).equals("Death Knight (Tank)")) {
                            index = 4;
                        }
                        String temp = player.getNamahero();
                        heroname.remove(input);
                        player.changeClass(index);
                        if (temp.equals("Warrior") || temp.equals("Warlock")) {
                            temp += " (Attacker)";
                        } else if (temp.equals("Paladin")) {
                            temp += " (Healer)";
                        } else if (temp.equals("Death Knight")) {
                            temp += " (Tank)";
                        }
                        heroname.add(temp);
                    }
                }while(input!=4);

            } else if (menu == 4) {

                player.cheatGame();

            }
        }while(menu != 5);
    }
}

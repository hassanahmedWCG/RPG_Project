import   javax.swing.*;
import   java.awt.*;
import   java.io.*;
import   java.util.Iterator;
import   java.util.Objects;
import   java.util.Scanner;
import   java.util.concurrent.ThreadLocalRandom;
import   java.util.ArrayList;

final class Rand{
    static int randomize(int max) {
        return ThreadLocalRandom.current().nextInt(0, max);
    }
}
class func {
    static boolean zearch(String j, String[] guh) {
        for (int n = 0; n < guh.length; n++) {
            if (Objects.equals(j, guh[n])) {
                return true;
            }
        }
        return false;
    }
}
class Attributes implements Serializable {
    static class Hp implements Serializable{
        double currentHp;
        double maxHp;
        public Hp(){
            this.maxHp = 5.6;
            this.currentHp = 0;
        }
        public void display(){
            System.out.print(maxHp);
        }
    }

    static class Atk implements Serializable{
        double currentAtk;
        double maxAtk;
        public Atk(){
            this.maxAtk = 5.6;
            this.currentAtk = 0;
        }
        public void display(){
            System.out.print(maxAtk);
        }
    }
    static class CritRate implements Serializable{
        double critRate;
        public CritRate(){
            this.critRate = 3.7;
        }
        public void display(){
            System.out.print(critRate);
        }
    }

    static class CritDmg implements Serializable{
        double critDmg;
        public CritDmg(){
            this.critDmg = 4.2;
        }
        public void display(){
            System.out.print(critDmg);
        }
    }

    static class Spd implements Serializable{
        double maxSpd;
        double currentSpd;
        public Spd(){
            this.maxSpd = 3;
            this.currentSpd = 0;
        }
        public void display(){
            System.out.print(maxSpd);
        }
    }

    static class Def implements Serializable{
        double currentDef;
        double maxDef;
        public Def(){
            this.maxDef = 5.6;
            this.currentDef = 0;
        }
        public void display(){
            System.out.print(maxDef);
        }
    }

    static class Energy implements Serializable{
        int maxEnergy;
        int currentEnergy;
        double energyRegen;
        public Energy(){
            this.energyRegen = 6.4;
            this.currentEnergy = 0;
            this.maxEnergy = 0;
        }
        public void display(){
            System.out.print(energyRegen);
        }
    }

    static class Stat<T> implements Serializable{
        T stat;
        String name;
        public void display(){
        }
        public Stat(String name, T smth){
            this.name = name;
            this.stat = smth;
        }
    }

    public static Stat MakeStat(Stat<?> p,String[] ick,int u) {
        int n = Rand.randomize(1000);
        if (n<143){
            if (func.zearch("SWFT",ick )){
                p=MakeStat(p, ick, u);
            }else {
                Attributes.Spd spD = new Spd();
                ick[u] = "SWFT";
                p = new Stat<>("SWFT", spD) {
                    @Override
                    public void display() {
                        stat.display();
                    }
                };
            }
            return p;

        } else if (n>=143 && n<286) {
            if (func.zearch("Energy Regen",ick )) {
                p = MakeStat(p, ick, u);
            }else {
                Attributes.Energy NRG = new Energy();
                ick[u] = "Energy Regen";
                p = new Stat<Energy>("Energy Regen", NRG) {
                    @Override
                    public void display() {
                        stat.display();
                    }
                };
            }
            return p;

        }else if (n>=286 && n<429){
            if (func.zearch("DEF %",ick )) {
                p = MakeStat(p, ick, u);
            }else {
                Attributes.Def deef = new Def();
                ick[u] = "DEF %";
                p = new Stat<Def>("DEF %", deef) {
                    @Override
                    public void display() {
                        stat.display();
                    }
                };
            }
            return p;

        }else if (n>=429 && n<572){
            if (func.zearch("ATK%",ick )) {
                p = MakeStat(p, ick, u);
            }else {
                Attributes.Atk atek = new Atk();
                ick[u] = "ATK%";
                p = new Stat<Atk>("ATK %", atek) {
                    @Override
                    public void display() {
                        stat.display();
                    }
                };
            }
            return p;


        }else if (n>=572 && n<715){
            if (func.zearch("CRIT DMG",ick )) {
                p = MakeStat(p, ick, u);
            }else {
                Attributes.CritDmg critd = new CritDmg();
                ick[u] = "CRIT DMG";
                p = new Stat<CritDmg>("CRIT DMG", critd) {
                    @Override
                    public void display() {
                        stat.display();
                    }
                };
            }
            return p;
        }else if (n>=715 && n<858){
            if (func.zearch("HP %",ick )) {
                p = MakeStat(p, ick, u);
            }else {
                Attributes.Hp echpee = new Hp();
                ick[u] = "HP %";
                p = new Stat<Hp>("HP %", echpee) {
                    @Override
                    public void display() {
                        stat.display();
                    }
                };
            }
            return p;

        }else if (n>=858 && n<1000){
            if (func.zearch("CRIT Rate",ick )) {
                p = MakeStat(p, ick, u);
            }else {
                Attributes.CritRate citra = new CritRate();
                ick[u] = "CRIT Rate";
                p = new Stat<CritRate>("CRIT Rate", citra) {
                    @Override
                    public void display() {
                        stat.display();
                    }
                };
            }
            return p;
        }
        return null;
    }
}




class Character implements Serializable {
    String name;
    Attributes attr;
    Equipment equipment;
    ArrayList<? super Object> equipEnventory;
    class Equipment implements Serializable {
        int level;
        int xp;
        int max;
        int maxlevel;
        Character attached;
        public Equipment(){
            Helm helm;
            Breastplate breastplate;
            Greaves greaves;
        }
        public void display(){
        }
        class Helm extends Equipment{
            public Helm(){
                Attributes.Hp echpee = new Attributes.Hp();
                this.MStat = new Attributes.Stat("HP",echpee);
                MStat.stat.maxHp = 1000;
                String[] ick = {"","",""};
                this.Stat1=Attributes.MakeStat(Stat1,ick,0);
                this.Stat2=Attributes.MakeStat(Stat2,ick,1);
                this.Stat3=Attributes.MakeStat(Stat3,ick,2);
                attached = null;
            }
            Attributes.Stat<Attributes.Hp> MStat;
            Attributes.Stat<?> Stat1;
            Attributes.Stat<?> Stat2;
            Attributes.Stat<?> Stat3;

            @Override
            public void display() {

                System.out.println("\u001B[1m"+MStat.name+":\t"+MStat.stat.maxHp+"\u001B[0m");
                System.out.print(Stat1.name+":\t");Stat1.display();
                System.out.print("\n"+Stat2.name+":\t ");Stat2.display();
                System.out.print("\n"+Stat3.name+":\t ");Stat3.display();
            }
        }
        class Breastplate extends Equipment{
            public Breastplate(){
                Attributes.Atk atek = new Attributes.Atk();
                this.MStat = new Attributes.Stat("ATK", atek);
                MStat.stat.maxAtk = 72;
                String[] ick = {"","",""};
                this.Stat1=Attributes.MakeStat(Stat1,ick,0);
                this.Stat2=Attributes.MakeStat(Stat2,ick,1);
                this.Stat3=Attributes.MakeStat(Stat3,ick,2);
                attached = null;
            }
            Attributes.Stat<Attributes.Atk> MStat;
            Attributes.Stat<?> Stat1;
            Attributes.Stat<?> Stat2;
            Attributes.Stat<?> Stat3;
            @Override
            public void display() {
                System.out.println("\u001B[1m"+MStat.name+":\t"+MStat.stat.maxAtk+"\u001B[0m");
                System.out.print(Stat1.name+":\t");Stat1.display();
                System.out.print("\n"+Stat2.name+":\t ");Stat2.display();
                System.out.print("\n"+Stat3.name+":\t ");Stat3.display();
            }
        }
        class Greaves extends Equipment{
            public Greaves(){
                Attributes.Spd biped = new Attributes.Spd();
                this.MStat = new Attributes.Stat<>("SWFT", biped);
                MStat.stat.maxSpd = 10;
                String[] ick = {"","",""};
                this.Stat1=Attributes.MakeStat(Stat1,ick,0);
                this.Stat2=Attributes.MakeStat(Stat2,ick,1);
                this.Stat3=Attributes.MakeStat(Stat3,ick,2);
                attached = null;
            }
            Attributes.Stat<Attributes.Spd> MStat;
            Attributes.Stat<?> Stat1;
            Attributes.Stat<?> Stat2;
            Attributes.Stat<?> Stat3;
            @Override
            public void display() {

                System.out.println("\u001B[1m"+MStat.name+":\t"+MStat.stat.maxSpd+"\u001B[0m");
                System.out.print(Stat1.name+":\t");Stat1.display();
                System.out.print("\n"+Stat2.name+":\t");Stat2.display();
                System.out.print("\n"+Stat3.name+":\t");Stat3.display();
            }
        }
        public void generateEquip(){
            int n =Rand.randomize(3);
            switch (n){
                case 0:
                    Greaves greaves = new Greaves();
                    equipEnventory.add(greaves);
                    greaves.display();
                    break;
                case 1:
                    Breastplate breastplate = new Breastplate();
                    equipEnventory.add(breastplate);
                    breastplate.display();
                    break;
                case 2:
                    Helm helm = new Helm();
                    equipEnventory.add(helm);
                    helm.display();
                    break;
            }
        }
    }
    public Character(String name){
        this.name = name;
        attr = new Attributes();
        equipment = new Equipment();
        equipEnventory = new ArrayList<>();
    }
}

class Account implements Serializable{
    ArrayList<Character> Charaz;
    String username;
    String pvvord;
    Character active;
    public Account(String username, String pw){
        this.username = username;
        this.pvvord = pw;
        Charaz = new ArrayList<>();
    }
    public void createchara(){
        Scanner bb = new Scanner(System.in);
        System.out.println("\nName your adventurer: ");
        String name = bb.nextLine();
        Character chara = new Character(name);
        Charaz.add(chara);
    }
    public void switchCharacter() {
        Scanner bb = new Scanner(System.in);
        System.out.println("\nPick adventurer # to play as: ");
        int n = 1;
        Iterator<Character> it = Charaz.iterator();
        while (it.hasNext()) {
            Character bit = it.next();
            System.out.printf("\n#%d: %s ", n, bit.name);
            n++;
        }
        System.out.println("\n");
        do {
            int choice = bb.nextInt();
            String dump = bb.nextLine();
            if (Charaz.get(choice-1)==null){
                System.out.println("\nPlease enter a valid character #");
                System.out.println("Please enter character # again: ");
            }else{
                active = Charaz.get(choice-1);
                break;
            }
        }while(true);
    }

}
class Game implements Serializable{
    ArrayList<Account> accountarr;
    Account current;
    public void createAccount() {
        Scanner bb = new Scanner(System.in);
        System.out.println("\nEnter new username: ");
        String user = bb.nextLine();
        String pv;
        do {
            System.out.println("\nEnter new password: ");
            pv = bb.nextLine();
            if (pv.length() < 8) {
                System.out.println("Password cannot be smaller than 8 characters.");
            } else {
                System.out.println("\nConfirm your password: ");
                String chimichanga = bb.nextLine();
                if (!Objects.equals(chimichanga, pv)) {
                    System.out.println("\nEntered passwords are different, please try again.");
                } else {
                    break;
                }
            }
        } while (true);
        Account acc = new Account(user, pv);
        accountarr.add(acc);
    }
    public Account login(){
        Scanner bb = new Scanner(System.in);
        System.out.println("\nEnter your username: ");
        String user = bb.nextLine();
        System.out.println("\nEnter your password: ");
        String pv = bb.nextLine();
        Iterator<Account> it = accountarr.iterator();
        Account current;
        while(it.hasNext()){
            current = it.next();
            if(Objects.equals(current.username, user)){
                if(Objects.equals(current.pvvord, pv)){
                    System.out.println("\nLogin successful!\n");
                    return current;
                }else{
                    System.out.println("\nIncorrect Password!\n");
                    return null;
                }
            }
        }
        System.out.println("\nAccount does not exist!\n ");
        return null;
    }
    public void logout(){
        current=null;
    }
    public Game(){
        accountarr = new ArrayList<>();
    }

}

interface WindowConfigurer {
    void configure(JFrame window);
}

class DefaultWindowConfigurer implements WindowConfigurer {

    private Font font; // Default font

    public void configure(JFrame window) {
        window.setFont(font);
    }

    public void setFont(Font font) {
        this.font = font;
    }
}

class EntryPoint {
    public static void coo(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                zh something = new zh();
                WindowConfigurer windowConfigurer = new
                        DefaultWindowConfigurer();
                windowConfigurer.configure(something);
                something.setVisible(true);
            }
        });
    }
}

class zh extends JFrame {
    public void Something() {
        setTitle("My window program, using Swings");
        setSize(400, 200);
        setVisible( true );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}




public class Main {
    static void leave(Game defl) throws IOException {
        ObjectOutputStream out;
        FileOutputStream f;
        try {
            f = new FileOutputStream("TheGame.ongldywomp");
            out = new ObjectOutputStream(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        out.writeObject(defl);
        out.close();
        f.close();
        System.exit(0);
    }

    public static void main(String[] args) throws IOException {
       /*SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               zh something = new zh();
               WindowConfigurer windowConfigurer = new DefaultWindowConfigurer();
               windowConfigurer.configure(something);
               something.setVisible(true);
           }
       });
        */
        Game defl;
        try {
            File Game1 = new File("TheGame.ongldywomp");
            if (Game1.createNewFile()) {
                defl = new Game();
            } else {
                FileInputStream fi = new FileInputStream(Game1);
                ObjectInputStream oi = new ObjectInputStream(fi);
                defl = (Game) oi.readObject();
                oi.close();
                fi.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred.");
            throw new RuntimeException(e);
        }
        Scanner bb = new Scanner(System.in);
        String dump;
        do{
            do {
                System.out.println("\n\n1:\tLogin?\n2:\tRegister?\n3:\tExit Game?");
                int choice = bb.nextInt();
                dump = bb.nextLine();
                switch (choice) {
                    case 1:
                        defl.current = defl.login();
                        break;
                    case 2:
                        defl.createAccount();
                        break;
                    case 3:
                        leave(defl);
                        break;
                }
            } while (defl.current == null);
            if (defl.current.Charaz.size()<1) {
                System.out.println("\nMake your first character!");
                defl.current.createchara();
            }
            if (defl.current.active == null) {
                defl.current.switchCharacter();
            }
            System.out.printf("\nWelcome, %s!\n",defl.current.username);
            do{
                System.out.printf("Your current character is %s\n",defl.current.active.name);
                System.out.println("\n1:\tCreate New Character!\n2:\tSwitch Active Character!\n3:\tGenerate Armour!\n4:\tLogout!\n0:\tExit Game!");
                int choice = bb.nextInt();
                switch (choice) {
                    case 1:
                        defl.current.createchara();
                        break;
                    case 2:
                        defl.current.switchCharacter();
                        break;
                    case 3:
                        defl.current.active.equipment.generateEquip();
                        break;
                    case 4:
                        defl.logout();
                        break;
                    case 0:
                        defl.logout();
                        leave(defl);
                        break;
                }
            }while(defl.current!=null);
        }while(true);
    }
}

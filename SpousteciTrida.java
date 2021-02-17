package cz.czechitas.tenis;

import java.util.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Quiz MyQuiz = new Quiz();
        System.out.println("Vítej, příteli. Jaké je tvé jméno?");
        Scanner keyboardReaction = new Scanner(System.in);
        String nameOfFriend = keyboardReaction.next();
        System.out.println(nameOfFriend + " , to je hezké jméno. Ráda tě poznávám." +
                "Prověříme tvoje znalosti Pána prstenů. Tvým cílem je odpověďět " +
                "správně alespoň na 3 otázky z 5. ");

        // Q1
        System.out.println("Nyní máš:" + MyQuiz.pointSUM + "bodů");
        System.out.println("Zadej na numerické klávesnici počet prstenů Moci, " +
                "které obdrželi vládci lidí od Saurona.");

        int rings = keyboardReaction.nextInt();
        if (rings == 9) {
            System.out.println("Výborně. Asi budeš profík.");
            MyQuiz.addAPoint();

        } else {
            System.out.println("Tak to je za nula bodů. Pokud to chceš pokračovat v kvízu, stiskni číslo 1. " +
                    "Pokud ne, vypni program a uvidíme se jindy.");
            int answer = keyboardReaction.nextInt();
            if (answer == 1) {
                System.out.println("Výborně. Pokračujme.");
                MyQuiz.addAPoint();

            } else {
                System.out.println("To nebyla jednička. Fakt to vypni. Já to za tebe dělat nebudu! " +
                        "Budu se dál ptát!");
            }
        }
        //Q2
        System.out.println("Nyní máš:" + MyQuiz.pointSUM + "bodů");
        System.out.println("Jak se jmenuje pavoučice Odula v originále?");
        String spiderName = keyboardReaction.next();
        List<String> stringList = Arrays.asList("Shelob", "shelob", "šelob", "selob", "shelob",
                "Šelob", "Selob");

        if (stringList.contains(spiderName)) {
            System.out.println("Velmi dobře milý příteli.");
            MyQuiz.addAPoint();
        } else {
            System.out.println("Nikoliv. Jedeme dál!");
        }

        // Q3
        System.out.println("Nyní máš:" + MyQuiz.pointSUM + "bodů");

        System.out.println("Jak se jmenoval hobit, kterého Glum zabil pro prsten?");
        System.out.println("A -  Sméagol");
        System.out.println("B - Déagol");
        System.out.println("C - Bilbo");
        System.out.println("Odpověz, zda A, B nebo C. Nezapomeň na velké písmeno, jinak ti to neuznám.");
        String glumFriend = keyboardReaction.next();
        if (glumFriend == "B") {
            System.out.println("Tancavë! Přičítám ti bod.");
            MyQuiz.addAPoint();
        } else {
            System.out.println("Bod ti utekl. Pokračujeme dál.");
        }

        //Q4
        System.out.println("Nyní máš:" + MyQuiz.pointSUM + "bodů");

        System.out.println("Kolik Oscarů získal film PÁN PRSTENŮ - DVĚ VĚŽE?");
        int oscar = keyboardReaction.nextInt();
        if (oscar == 2) {
            System.out.println("Ano. Máš bod!");
            MyQuiz.addAPoint();

        } else {
            System.out.println("Bohužel ne.");

        }
        // Q5
        System.out.println("Nyní máš:" + MyQuiz.pointSUM + "bodů");

        System.out.println("Poslední otázka. Co znamená v elfštině NILDO?");
        String elvenName = keyboardReaction.next();
        List<String> stringList2 = Arrays.asList("kamarad", "kamarád", "pritel", "přítel",
                "prítel", "přitel", "druh", "Kamarad", "Kamarád", "Pritel", "Přítel", "Prítel", "Přitel", "Druh");

        if (stringList2.contains(elvenName)) {
            System.out.println("Nályë curu quingaro.Pozoruhodná znalost!");
            MyQuiz.addAPoint();
        } else {
            System.out.println("Odpověď není správná.");
        }

        if (MyQuiz.playerWIN()) {
            System.out.println("Prošel jsi testem! Skvělý výsledek. Pochlub se kamarádům :-)");
        } else {
            System.out.println("To na výhrnu nestačí. Ale je skvělé, žes to zkusil!");
        }

    }

}





package javamaster.generics.interfacesgenerics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer banks = new FootballPlayer("Gordon");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        //brokenTeam.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<BaseballPlayer> baseballTeam2 = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(new BaseballPlayer("Pat2"));

        System.out.println(baseballTeam.compareTo(baseballTeam2));

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        adelaideCrows.addPlayer(joe);
        melbourne.addPlayer(banks);

        System.out.println(adelaideCrows.numPlayers());

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        //        adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        ArrayList<Team> teams;
        //Collections.sort(teams);

        League<Team<FootballPlayer>> footballteam = new League<>();
        footballteam.add(fremantle);

        Team<BaseballPlayer> basball = new Team<>("baseball Crows");
        // footballteam.add(basball); no se puede

        Team raw = new Team("xx");
        raw.addPlayer(beckham);
        raw.addPlayer(pat);

        League liga = new League();
        liga.add(raw);

        //aqui puedo agregar todos los teams de diferentes modalidades
        League<Team<FootballPlayer>> rawliga = new League();
        // rawliga.add(basball);
        rawliga.add(fremantle);

        System.out.println("aqui estoy");
    }
}

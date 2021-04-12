package javamaster.generics;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        adelaideCrows.matchResult(fremantle, 2, 1);
     //   adelaideCrows.matchResult(baseballTeam, 1, 1); Error becuase matchResult (Team<T> recibio primero
        //   Team<FootbalPlayer>


    }
}

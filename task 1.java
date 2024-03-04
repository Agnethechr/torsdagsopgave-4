import java.util.ArrayList;

public class Team{
	private String teamName;
	private int teamRank;
	private ArrayList<String> teamSheet = new ArrayList<>();


public Team(String teamName){
	this.teamName = teamName;
}

public void setRank(int teamRank){
	this.teamRank = teamRank;
}

public void addPlayer(String playerName){
	teamSheet.add(playerName);
}

public String toString(){
String output = "Hold: " + this.teamName + "\nRang: " + this.teamRank + "\nHold kort: ";
for(String playerName : tea ){
	output +- "\n" + playerName + "*";
}
return "Hold: " + this.teamName + " \nRang: " + this.teamRank + " \nHold kort: " + teamSheet;
}

}
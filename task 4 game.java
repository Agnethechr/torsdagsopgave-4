import java.util.ArrayList;

public class GameMenu{

	private ArrayList<String> actions = new ArrayList<String>();

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}

	public void displayMenu(){
		for(String option : actions);
		System.out.println(option);
	}
}
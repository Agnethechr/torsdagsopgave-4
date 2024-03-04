import java.util.ArrayList;


class main{

	public static void main(String[] args){

		ArrayList<String>action = new.ArrayList<String>();
		action.add("Start game");
		action.add("Resume game");
		action.add("Pause game");
		action.add("End game");

		GameMenu menu = new GameMenu(actions);
		menu.displayMenu();
	}
}
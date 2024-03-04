public class TaskOne{
	public static void main(String[] args){


		Team hold1 = new team("Eternal Fire");
		Team hold2 = new team("SAW");
		Team hold3 = new team("MIBR");
		Team hold4 = new team("ATK");
		Team hold5 = new team("Baccara");
		Team hold6 = new team("Boggs");

		hold1.setRank(1);
		hold2.setRank(2);
		hold3.setRank(1);
		hold4.setRank(3);
		hold5.setRank(4);
		hold6.setRank(3);

		System.out.println(hold1);
		System.out.println(hold2);
		System.out.println(hold3);
		System.out.println(hold4);
		System.out.println(hold5);
		System.out.println(hold6);
	}
}
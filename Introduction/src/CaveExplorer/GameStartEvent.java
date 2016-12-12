package CaveExplorer;

public class GameStartEvent implements Event {
	
	
	public static final String[] SEQ_1 = {"spikey har kid comes up", "kek"};
	public static final String[] SEQ_2 = {"AHHHHHHHHHHHH", "eh"};
	
	
	public GameStartEvent(){
		
	}


	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
//	public void play() {
//		// TODO Auto-generated method stub
//		readSequence(SEQ_1);
//		CaveExplorer.print("will u help us?");
//		while(CaveExplorer.in.nextLine().indexOf("yes") < 0){
//			CaveExplorer.print("pls say yes");
//		}
//		readSequence(SEQ_2);
//		CaveExplorer.inventory.setHasMap(true);
//	}
//
//	public static void readSequence(String[] seq) {
//		// TODO Auto-generated method stub
//		for(String s : seq){
//			CaveExplorer.print(s);
//			CaveExplorer.print("press enter");
//			CaveExplorer.in.nextLine();
//		}
//	}

}

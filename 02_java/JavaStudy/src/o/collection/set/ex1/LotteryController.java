package o.collection.set.ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery I) {
		
		return lottery.add(I);
	}
	
	public boolean deleteObject(Lottery I) {
		boolean isre = lottery.remove(I);
		if(isre && win != null) {
			win.remove(I);
		}
		return isre;
	}
	
	public HashSet WinObject() {
		
		if(lottery.size() <4) {
			return null;
		}
		
		List<Lottery> list = new ArrayList<>();
		list.addAll(lottery);
		
		while(win.size()<4) { //사이즈가 4명 이하면 계속진행
			int rand =(int)(Math.random() *list.size());
			win.add(list.get(rand));
			
		}
		return win;
	}
	
	public TreeSet sortedWinObject() {
		return null;
	}
	
	public boolean searchWinner(Lottery I) {
		return false;
	}

}

package o.collection.list.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MusicController {
	private List list = new ArrayList();
	
	
	public int addList(Music music) {
		int num = 0;
		if(list.add(music)) {
			num =1;
		}
		return num;
	}

	public int addAtZero(Music music) {
		return 0;
	}
	
	public List printAll() {
		return list;
	}
	
	public Music serchMusic(String title) {
		return null;
	}
	
	public Music removeMusic(String title) {
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		return null;
	}
	
	public int ascTitle() {
		//Collections.sort : 컬렉션에서 정렬 기능을 제공하느 메세드
		//정렬하고싶은 컬렉션객체와 정렬기준을 정한객체(Comparator구현한 객체)를 전달하면 절렬기준에 맞춰 정렬을 수행해준다.
		//list.sort(Comparator.comparing(Music::getTitle));
		return 1;
	}
	
	public int descSinger() {
		//list.sort(Comparator.comparing(Music::getSinger).reversed());
		return 0;
	}
	
}

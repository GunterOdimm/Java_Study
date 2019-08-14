package Stduy.java.program;

import java.util.ArrayList;
import java.util.List;
import Stduy.java.model.people;

public class main02 {
	public static void main(String[] args) {
		
		List<people> plist = new ArrayList<people>();
		
		for (int i = 0; i < 10; i++) {
			people p = new people("회원"+i, "010-8576-620" +i);
			plist.add(p);
			
		}
		
		for (int i = 0; i < plist.size(); i++) {
			people item = plist.get(i);
			System.out.println(item.toString());
			
		}
	}

}

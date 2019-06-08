package interview;

import java.util.ArrayList;

public class CommenElementMultiList {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>() {{add("A"); add("B");add("C");add("D");add("E");add("F");add("G");}};
		ArrayList<String> list2 = new ArrayList<String>() {{add("D"); add("C");add("C");add("D");add("A");add("F");add("G");}};
		ArrayList<String> list3 = new ArrayList<String>() {{add("A"); add("B");add("C");add("E");add("E");add("F");add("G");}};
		ArrayList<String> list4 = new ArrayList<String>() {{add("A"); add("B");add("C");add("D");add("E");add("F");add("G");}};
		ArrayList<String> list5 = new ArrayList<String>() {{add("A"); add("K");add("C");add("D");add("E");add("F");add("G");}};
		
		ArrayList<String> comElementList = new ArrayList<String>();
		
		/*for(int i=0;i<7;i++){			
			String element=list1.get(i);
			if(list2.contains(element)&&list3.contains(element)&&list4.contains(element)&&list5.contains(element)){
				
				comElementList.add(element);
				}
			
			}*/
		
		//System.out.println("The common eleemnts in the all the list are --"+comElementList);
		
		comElementList.addAll(list1);
		comElementList.retainAll(list2);
		comElementList.retainAll(list3);
		comElementList.retainAll(list4);
		comElementList.retainAll(list5);
		System.out.println("The common eleemnts in the all the list are --"+comElementList);
			
			       
		

	}

}
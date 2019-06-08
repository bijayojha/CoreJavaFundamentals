package datastructure.algo;

public class BubbleSort {
	int tempVal;
	int dsLength=DataStructure.dataStructure.length;
	void performBubbleSortOnDs(){
		
		for (int lastIndex = dsLength-1; lastIndex >1; lastIndex--) {
			for(int startIndex=0;startIndex<lastIndex;startIndex++){
				int valAtstartIndex	=DataStructure.dataStructure[startIndex];
				int valAtNextIndex=DataStructure.dataStructure[startIndex+1];
			if(valAtstartIndex>valAtNextIndex){
				
				swapTheValues(startIndex,startIndex+1);
			   }
			}
		}
		
		System.out.println("Below is the DS after Bubble Sort");
		for(int i=0;i<dsLength;i++)
			System.out.print(DataStructure.dataStructure[i]+"  ");

	}

	void swapTheValues(int valAtLeft,int valAtRight){
		tempVal=	DataStructure.dataStructure[valAtRight];
		DataStructure.dataStructure[valAtRight]=DataStructure.dataStructure[valAtLeft];
		DataStructure.dataStructure[valAtLeft]=tempVal;
	}
	
	


}
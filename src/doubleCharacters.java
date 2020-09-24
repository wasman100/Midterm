import acm.program.*;

public class doubleCharacters extends ConsoleProgram  {
	public void run() {
		
		String birdIsTheWord = readLine("please enter a double worded letter.");
		removeDoubledLetters(birdIsTheWord);
	}

	private void removeDoubledLetters(String birdIsTheWord) {
		// TODO Auto-generated method stub
		char temp;
		char temp2;
		String Holder = "";
		for(int i =0; i< birdIsTheWord.length(); i++) {
			temp = birdIsTheWord.charAt(i);
			for(int d = 1; d<birdIsTheWord.length(); d++) {
				temp2 = birdIsTheWord.charAt(d);
				if((d-1) == i) {
					if(temp == temp2) {
						birdIsTheWord =birdIsTheWord.substring(0,d) + birdIsTheWord.substring(d+1);
						
					}
				}
			}
		}
		println(birdIsTheWord);
	}

}

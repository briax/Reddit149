import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("two drums and a cymbal fall off a cliff");
		array.add("all those who believe in psychokinesis raise my hand");
		array.add("did you hear about the excellent farmer who was outstanding in his field");
		
		for(String sentence : array){
			Disemvoweler dis = new Disemvoweler(sentence);
			dis.Disemvowel();
			dis.prettyPrint();
		}
	}
}


public class Disemvoweler {
	
	private String input;
	private String vowelString = "";
	private String consonantString = "";
	private Integer spaces = 0;
	private char[] temp = null;
	
	public Disemvoweler(String text){
		input = text;
	}
	
	public void Disemvowel(){			
		temp = input.toCharArray();
		for(char c : temp){
			if(c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u' | c =='y'){
				vowelString += c;
			}else if(c == ' '){
				spaces ++;
			}else{
				consonantString += c;
			}
		}
	}
	
	public void prettyPrint(){
		System.out.println("You entered: ");
		
		for(int i = 0; i < temp.length; i++){
			System.out.print(temp[i]);
		}
		
		System.out.println("\n------------------------------------------------------");
		System.out.println("Consonants: " + consonantString + "\nVowels: " + vowelString +  "\nSpaces: " + spaces + "\n");
	}
	
}

package programs;

public class ReverseLettersInEachWord {
	
	/* utility function for reversing each word */
	private StringBuilder reverse(String str)
	{
		StringBuilder revstr = new StringBuilder("");
		int strlen = str.length();
		for(int i=strlen-1; i>=0; i--)
		{
			revstr = revstr.append(str.charAt(i));
		}
		return revstr;
	}
	
	public void revEachWord(String sentence)
	{
		String[] strarray = sentence.split(" ");
		String newsentence = "";
		for(int i=0; i<strarray.length; i++)
		{
			newsentence = newsentence + reverse(strarray[i]).toString() + " ";
		}
		System.out.print(newsentence);
	}
	public static void main(String[] args) {
		ReverseLettersInEachWord obj = new ReverseLettersInEachWord();
		String sentence = "this platform is for people to collaborate and develop";
		System.out.println("Original sentence:- " + sentence);
		System.out.print("Modified sentence:- ");
		obj.revEachWord(sentence);

	}

}

import java.util.*;

class Main {

	static final String[] charList =
        new String[]{" ","","abc","def","ghi","jkl",
            "mno","pqrs","tuv","wxyz"};


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int totalNumber = sc.nextInt();
		sc.nextLine();
        
        for (int i = 1; i <= totalNumber; i++) {
            String text = sc.nextLine();
			String output = 
				String.format("Case #%d: %s", i, stringConverter(text)); 
            System.out.println(output);
        }
	

	}

	
	static int characterPositionFinder(String str) {
		int a = -1;
		for (int i = 0; i < charList.length; i++) {
			if (charList[i].contains(str)) {
				a = i;
				break;
			}
		}

		return a;

	}


	static String arrayPositionFinder(String str) {
		int pos = characterPositionFinder(str);
		String[] stringArray = charList[pos].split("");

		int index = 0;
		String output = "";

		for (String s : stringArray) {
			index++;
			if (s.equals(str)) {
				break;
			}
		}

		for (int k = 0; k < index; k++) {
			output = output + String.valueOf(pos);
		}

		return output;

	}


	static String stringConverter(String str) {
		String[] stringArray = str.split("");
		int firstLetterNumber = -1;
		String outputString = "";

		for (String s : stringArray) {
			if (characterPositionFinder(s) 
				== firstLetterNumber) {
				
				outputString = outputString + " ";
			}

			firstLetterNumber = characterPositionFinder(s);

			outputString = outputString 
				+ arrayPositionFinder(s);
		}

			return outputString;

	}

}










	

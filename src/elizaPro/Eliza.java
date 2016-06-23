package elizaPro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Random;

public class Eliza {
	public static Set<String> hedgeSet = new HashSet<String>();
	public static Set<String> qualifierSet = new HashSet<String>();
	public static Map<String, String> replacementMap = new HashMap<String, String>();
	public static Random rand = new Random();

	// String
	public Eliza() {
		hedgeSet.add("Please tell me more");
		hedgeSet.add("Many of my patients tell me the same thing");
		hedgeSet.add("It is getting late, maybe we had better quit");
		qualifierSet.add("Why do you say that");
		qualifierSet.add("You seem to think that");
		qualifierSet.add("So, you are concerned that");
		replacementMap.put("i", "you");
		replacementMap.put("me", "you");
		replacementMap.put("my", "your");
		replacementMap.put("am", "are");
	}

	public String respond(String s) {
		String[] words = s.split(" ");
		String response = "";
		
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("i")) {
				words[i] = replacementMap.get("i");
			} else if (words[i].equals("me")) {
				words[i] = replacementMap.get("me");
			} else if (words[i].equals("my")) {
				words[i] = replacementMap.get("my");
			} else if (words[i].equals("am")) {
				words[i] = replacementMap.get("am");
			} else {
				words[i] = words[i];
			}
		}
		//response=(String[]) qualifierSet.toArray();
		for (int i = 0; i < words.length; i++){
			response+= words[i]+" ";
		}

		return response;
	}
	public static Object getHedge(){
	int index = rand.nextInt(hedgeSet.size());
	Iterator<String> iter = hedgeSet.iterator();
	for (int i = 0; i < index; i++) {
	    iter.next();
	}
	return iter.next();
	}
	public static Object getQualifier(){
		int index = rand.nextInt(qualifierSet.size());
		Iterator<String> iter = qualifierSet.iterator();
		for (int i = 0; i < index; i++) {
		    iter.next();
		}
		return iter.next();
		}
}

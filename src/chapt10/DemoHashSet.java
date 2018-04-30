package chapt10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class DemoHashSet {
	public static void main(String[] args) {
		HashSet<String> words = new HashSet<>();
		long callTime = System.nanoTime();
		try {
			BufferedReader in = new BufferedReader(new FileReader("demo.txt"));
			String line = "";
			while((line = in.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, " (){}[]<>#*!?.,:;-\'\"/");
				while (tokenizer.hasMoreTokens()) {
					String word = tokenizer.nextToken();
					words.add(word.toLowerCase());
				}
			}
		}catch (IOException e) {
			System.err.println(e);
		}
		Iterator<String> it = words.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		long totalTime = System.nanoTime() - callTime;
		System.out.println("Different words: " + words.size() + ", " + totalTime + " nanoSecond");
	}

}

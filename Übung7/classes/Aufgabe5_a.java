package classes;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;

public final class Aufgabe5_a {
    private Aufgabe5_a() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Files.newBufferedReader(Paths.get(args[0]));
        var lines = new LinkedList<String>();

        long start = System.nanoTime();

        readLines(input, lines);
        removeEmptyLines(lines);
        removeShortLines(lines); // alle kürzer als MIN_LENGTH
        int n = totalLineLengths(lines);

        long stop = System.nanoTime();

        System.out.printf("Aufgabe 5a): result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

    // TODO: Klassenmethoden readLines, removeEmptyLines, removeShortLines, totalLineLengths
	public static void readLines(BufferedReader input, LinkedList<String> lines) throws IOException {
        String line;
        while ((line = input.readLine()) != null) {
            line = line.trim();
            lines.add(line);	
        }
	}

	public static void removeEmptyLines(LinkedList<String> lines) {
		for (String line : lines) {
            if (line.equals(""))
                lines.remove(line);
        }
	}
    
	public static void removeShortLines(LinkedList<String> lines) {
        if (lines.getFirst().length() < MIN_LENGTH)
            lines.remove(lines.getFirst());
        for (String line : lines) {
            if (line.length() < MIN_LENGTH)
                lines.remove(line); 
        }
	}
    
	public static int totalLineLengths(LinkedList<String> lines) {
        int counter = 0;
        for (String line : lines) {
            counter += line.length();
        }
        return counter;
	}
}
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.stream.Collectors;

public final class Aufgabe5_b {
	private Aufgabe5_b() {	}

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

		System.out.printf("Aufgabe 5b): result = %d (%d microsec)%n", n, (stop - start) / 1000);
	}

	// TODO: Klassenmethoden readLines, removeEmptyLines, removeShortLines, totalLineLengths
	public static void readLines(BufferedReader input, LinkedList<String> lines) throws IOException {
		lines.addAll(input.lines().map(x -> x.trim()).collect(Collectors.toList()));
	}

	public static void removeEmptyLines(LinkedList<String> lines) {
		lines.stream().filter(x -> x.equals(""));
	}

	public static void removeShortLines(LinkedList<String> lines) {
		lines.removeIf(x -> x.length() < MIN_LENGTH);
	}

	public static int totalLineLengths(LinkedList<String> lines) {
		return lines.stream().mapToInt(x -> x.length()).sum();
	}
}
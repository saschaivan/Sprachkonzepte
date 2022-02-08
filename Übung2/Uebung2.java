
// Uebung2.java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Uebung2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("java Uebung2 <input>");
            System.exit(1);
        }

        // Für den Text: "[a-z ]*";

        // Für die Flags, optional, es können aber mehrere Flags hintereinander
        // vorkommen:
        // "[-#+ 0,(]*";

        // Für den ArgumentIndex, optional, kann aber mehrmals
        // vorkommen"([1-9][0-9]*\\$)*";

        // Die Width, optional (einmal, oder garnicht): "(\\d*)?";

        // Die Precision, optional (einmal, oder garnicht): "(\\.\\d*)?";

        // Die verschiedenen Tokens für die Conversion:
        // "[bBhHsScCdoxXeEfgGaAtT%n]";

        Pattern pattern = Pattern
                .compile("(%([1-9][0-9]*\\$)*[-#+ 0,(]*(\\d*)?(\\.\\d*)?[bBhHsScCdoxXeEfgGaAtT%n])|([a-z ]*)");
        Matcher matcher = pattern.matcher(args[0]);

        while (matcher.find() && !matcher.group().equals("")) {
            if (matcher.group().startsWith("%"))
                System.out.printf("FORMAT(%s)", matcher.group());
            else
                System.out.printf("TEXT(%s)", matcher.group());
        }
    }
}
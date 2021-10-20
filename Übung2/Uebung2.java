// RegexTest.java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Uebung2 {
    public static void main(String[] args){
        if (args.length != 1) {
            System.err.println("java RegexTest <input>");
            System.exit(1);
        }

        String regex = "(%[^dnocefisuxtXTSEgHhbBaA%]*[dnocefisuxtXTSEgHhbBaA%])|([a-z ]*)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(args[0]);

        while (matcher.find() && !matcher.group().equals("")) {
            if (matcher.group().startsWith("%"))
                System.out.printf("FORMAT(%s)", matcher.group());
            else
                System.out.printf("TEXT(%s)", matcher.group());
        }
    }
}
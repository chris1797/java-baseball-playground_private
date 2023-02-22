package StringCalculator;

import java.util.List;

public class StringParsing {

    public String[] seperateToArray(String value) {
        return value.split(" ");
    }

    public int parsingToInt(String value) {
        return Integer.parseInt(value);
    }

}

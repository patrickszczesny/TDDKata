import java.util.ArrayList;
import java.util.List;

class StringCalculator {
    static int Add(String numberInString) {
        if (numberInString.isEmpty()) {
            return 0;
        }

        if (numberInString.startsWith("//")){
        String delimiter = String.valueOf(numberInString.charAt(2));
        return StringCalculator.Add(numberInString.substring(4).replace(delimiter,","));
        }

        String[] stringNumbersInForOfListOfStrings = numberInString.split(",");
        List<String[]> listOfStringTables = new ArrayList<>();
        for (String stringNumbersInForOfListOfString : stringNumbersInForOfListOfStrings) {
            listOfStringTables.add(stringNumbersInForOfListOfString.split("\n"));
        }
        if (stringNumbersInForOfListOfStrings.length > 1 || listOfStringTables.get(0).length > 1) {

            int sum = 0;
            for (String[] listOfStringTable : listOfStringTables) {
                for (String aListOfStringTable : listOfStringTable) {
                    sum += Integer.parseInt(aListOfStringTable);
                }
            }
            return sum;
        }
        return Integer.parseInt(numberInString);
    }
}

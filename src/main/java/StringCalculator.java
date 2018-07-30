import java.util.ArrayList;
import java.util.List;

class StringCalculator {

    public static int Add(String numbersInString) {
        if (numbersInString.isEmpty()) {
            return 0;
        }
        String[] numbersInStringInTable = numbersInString.split(",");
        List<String[]> table4NumbersTable = new ArrayList<>();

        for (int i = 0; i < numbersInStringInTable.length; i++) {
            table4NumbersTable.add(numbersInStringInTable[i].split("\n"));
        }

        if (numbersInStringInTable.length > 1 || table4NumbersTable.get(0).length > 1) {

            int result = 0;

            for (int i = 0; i < numbersInStringInTable.length; i++) {
                for (int j = 0; j < table4NumbersTable.get(i).length; j++) {
                    result += Integer.parseInt(table4NumbersTable.get(i)[j]);
                }
            }
            return result;
        }
        return Integer.parseInt(numbersInString);
    }
}

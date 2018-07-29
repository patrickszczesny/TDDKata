import java.util.ArrayList;
import java.util.List;

class StringCalculator {

    static int Add(String numbersInString) {
        if (numbersInString.isEmpty()) {
            return 0;
        }
        String[] stringTable = numbersInString.split(",");
        List<String[]> stringFinalList = new ArrayList<>();
        if (stringTable.length > 1) {
            for (int i = 0; i < stringTable.length; i++) {
                stringFinalList.add(stringTable[i].split("\n"));
            }
            int result = 0;
            for (int i = 0; i < stringFinalList.size(); i++) {
                for (int j = 0; j < stringFinalList.get(i).length; j++) {
                    result += Integer.parseInt(stringFinalList.get(i)[j]);
                }
            }
            return result;
        }
        return Integer.parseInt(numbersInString);
    }
}

import java.util.ArrayList;
import java.util.List;

class StringCalculator {
     static int Add(String numberInString) {
         if (numberInString.isEmpty()){
             return 0;
         }

        String[] stringNumbersInForOfListOfStrings= numberInString.split(",");

        List<String[]> listOfStringTables = new ArrayList<>();
         for (int i = 0; i <stringNumbersInForOfListOfStrings.length ; i++) {
             listOfStringTables.add(stringNumbersInForOfListOfStrings[i].split("\n"));
         }


        if( stringNumbersInForOfListOfStrings.length>1||listOfStringTables.get(0).length>1){

            int sum=0;
             for (int i = 0; i <listOfStringTables.size() ; i++) {
                 for (int j = 0; j <listOfStringTables.get(i).length ; j++) {
                     sum += Integer.parseInt(listOfStringTables.get(i)[j]);
                 }
             }
            return sum;
        }
        return Integer.parseInt(numberInString);
    }
}

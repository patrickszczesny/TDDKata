import java.util.ArrayList;
import java.util.List;

class StringCalculator {
     static int Add(String numberInString) {
         if (numberInString.isEmpty()){
             return 0;
         }

        String[] stringNumbersInForOfListOfStrings= numberInString.split(",");

        if( stringNumbersInForOfListOfStrings.length>1){
            int sum=0;
            for (String stringNumbersInForOfListOfString : stringNumbersInForOfListOfStrings) {
                sum += Integer.parseInt(stringNumbersInForOfListOfString);
            }
            return sum;
        }
        return Integer.parseInt(numberInString);
    }
}

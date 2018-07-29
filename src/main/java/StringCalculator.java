class StringCalculator {

    static int Add(String numbersInString) {
        if( numbersInString.isEmpty()){
           return 0;
        }
        String[] stringTable=numbersInString.split(",");
        if (stringTable.length>1) {
            int result=0;

            for (int i = 0; i < stringTable.length; i++) {
               result+= Integer.parseInt(stringTable[i]);
            }
            return result;
        }
        return Integer.parseInt(numbersInString);
    }
}

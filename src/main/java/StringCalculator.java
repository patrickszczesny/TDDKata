class StringCalculator {

    static int Add(String numbersInString) {
        if( numbersInString.isEmpty()){
           return 0;
        }
        String[] stringTable=numbersInString.split(",");

        return Integer.parseInt(stringTable[0])+Integer.parseInt(stringTable[1]);

    }
}

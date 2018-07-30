class StringCalculator {

    public static int Add(String numbersInString) {
        if (numbersInString.isEmpty()){
            return 0;
        }
        String[] numbersInStringInTable = numbersInString.split(",");
        if(numbersInStringInTable.length>1){
            return Integer.parseInt(numbersInStringInTable[0])+ Integer.parseInt(numbersInStringInTable[1]);
        }
        return Integer.parseInt(numbersInString);
    }
}

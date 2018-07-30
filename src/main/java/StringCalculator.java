class StringCalculator {

    public static int Add(String numbersInString) {
        if (numbersInString.isEmpty()){
            return 0;
        }
        String[] numbersInStringInTable = numbersInString.split(",");
        if(numbersInStringInTable.length>1){
            int result=0;
            for (int i = 0; i < numbersInStringInTable.length; i++) {
                result+=Integer.parseInt(numbersInStringInTable[i]);
            }
            return result;
        }
        return Integer.parseInt(numbersInString);
    }
}

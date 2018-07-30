class StringCalculator {

    public static int Add(String numbersInString) {
        if (numbersInString.isEmpty()){
            return 0;
        }
        return Integer.parseInt(numbersInString);
    }
}

public enum RomanNumerals {

    M('M', 1000),
    D('D', 500),
    C('C', 100),
    L('L', 50),
    X('X', 10),
    V('V', 5),
    I('I', 1);

    private final int arabicValue;
    private final char romanValue;

    RomanNumerals(char romanValue, int arabicValue){
        this.romanValue = romanValue;
        this.arabicValue = arabicValue;
    }

    public int getArabicValue() {
        return arabicValue;
    }

    public char getRomanValue() {
        return romanValue;
    }

}

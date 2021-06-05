import java.util.Arrays;

public class RomanToArabicConverter {


    private int arabicNumerals;
    private char[] userRomanNumerals;

    public RomanToArabicConverter(String romanNumerals){
        this.userRomanNumerals = romanNumerals.toCharArray();
        makeConversion(userRomanNumerals);
    }


    public void makeConversion(char[] romanNumerals){

        RomanNumerals currentRomanNumeral;
        RomanNumerals nextRomanNumeral;
        int index = 0;
        while(index < userRomanNumerals.length){
            if(userRomanNumerals.length - index == 1) {
                currentRomanNumeral = RomanNumerals.valueOf("" + userRomanNumerals[index]);
                arabicNumerals = arabicNumerals + currentRomanNumeral.getArabicValue();
            }
            else{
                currentRomanNumeral = RomanNumerals.valueOf("" + userRomanNumerals[index]);
                nextRomanNumeral = RomanNumerals.valueOf("" + userRomanNumerals[index + 1]);
                if(currentRomanNumeral.getArabicValue() < nextRomanNumeral.getArabicValue()){
                    arabicNumerals = arabicNumerals + (nextRomanNumeral.getArabicValue() - currentRomanNumeral.getArabicValue());
                }
                else{
                    arabicNumerals = arabicNumerals + currentRomanNumeral.getArabicValue() + nextRomanNumeral.getArabicValue();
                }
            }
            index = index + 2;
        }
    }

    public int getArabicNumerals() {
        return arabicNumerals;
    }


    public char[] getUserRomanNumerals() {
        return userRomanNumerals;
    }
}

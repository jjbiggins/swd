import java.util.Arrays;

public class ArabicToRomanConverter {

    private String numberInRomanNumerals;
    private String arabicNumeralsString;

    public ArabicToRomanConverter(int arabicNumerals){
        numberInRomanNumerals = "";
        convertArabicToRomanThousands(arabicNumerals);
    }

    private void convertArabicToRomanThousands(int arabicNumerals){
        numberInRomanNumerals = "";

        int numberMultiplier = arabicNumerals / 1000;
        for(int i = 0; i < numberMultiplier; i++){
            numberInRomanNumerals = numberInRomanNumerals + 'M';
            arabicNumerals = arabicNumerals - 1000;
        }
        convertArabicToRomanHundreds(arabicNumerals);
    }

    private void convertArabicToRomanHundreds(int arabicNumerals) {

        if (arabicNumerals < 400) {
            int numberMultiplier = arabicNumerals / 100;
            for (int i = 0; i < numberMultiplier; i++) {
                numberInRomanNumerals = numberInRomanNumerals + "C";
                arabicNumerals = arabicNumerals - 100;
            }
        }
        else if((arabicNumerals / 100) == 4){
            numberInRomanNumerals = numberInRomanNumerals + "CD";
            arabicNumerals = arabicNumerals - 400;
        }
        else if(arabicNumerals > 499 && arabicNumerals < 900){
            numberInRomanNumerals = numberInRomanNumerals + "D";
            arabicNumerals = arabicNumerals - 500;
            int numberMultiplier = arabicNumerals / 100;
            for(int i = 0; i < numberMultiplier; i++){
                System.out.print(arabicNumerals);
                numberInRomanNumerals = numberInRomanNumerals + "C";
                arabicNumerals = arabicNumerals - 100;
            }
        }
        else if((arabicNumerals / 100) == 9){
            numberInRomanNumerals = numberInRomanNumerals + "CM";
            arabicNumerals = arabicNumerals - 900;
        }
        convertArabicToRomanTens(arabicNumerals);
    }


    private void convertArabicToRomanTens(int arabicNumerals) {
        if (arabicNumerals < 40) {
            int numberMultiplier = arabicNumerals / 10;
            for (int i = 0; i < numberMultiplier; i++) {
                numberInRomanNumerals = numberInRomanNumerals + "X";
                arabicNumerals = arabicNumerals - 10;
            }
        }
        else if(arabicNumerals / 10 == 4){
            numberInRomanNumerals = numberInRomanNumerals + "XL";
            arabicNumerals = arabicNumerals - 40;
        }
        else if(arabicNumerals > 49 && arabicNumerals < 90){
            numberInRomanNumerals = numberInRomanNumerals + "L";
            arabicNumerals = arabicNumerals - 50;
            int numberMultiplier = arabicNumerals / 10;
            for(int i = 0; i < numberMultiplier; i++){
                numberInRomanNumerals = numberInRomanNumerals + "X";
                arabicNumerals = arabicNumerals - 10;
            }
        }
        else if(arabicNumerals / 10 == 9){
            numberInRomanNumerals = numberInRomanNumerals + "XC";
            arabicNumerals = arabicNumerals - 90;
        }
        if(arabicNumerals != 0){
            convertArabicToRomanOnes(arabicNumerals);
        }
    }


    private void convertArabicToRomanOnes(int arabicNumerals) {

        if (arabicNumerals < 4) {
            for (int i = 0; i < arabicNumerals; i++) {
                numberInRomanNumerals = numberInRomanNumerals + "I";
            }
        }
        else if(arabicNumerals == 4){
            numberInRomanNumerals = numberInRomanNumerals + "IV";
        }
        else if(arabicNumerals < 9){
            numberInRomanNumerals = numberInRomanNumerals + "V";
            arabicNumerals = arabicNumerals - 5;
            for(int i = 0; i < arabicNumerals; i++){
                numberInRomanNumerals = numberInRomanNumerals + "I";
            }
        }
        else if(arabicNumerals == 9){
            numberInRomanNumerals = numberInRomanNumerals + "IX";
        }
    }


    public String getNumberInRomanNumerals() {
        return numberInRomanNumerals;
    }
}

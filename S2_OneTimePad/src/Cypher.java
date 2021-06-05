
public class Cypher {

    final static char alphabet[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L','M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private char[] charMessage;
    private int key;

    public Cypher(String message, int key){
        charMessage = message.toCharArray();
        this.key = key;
    }

    public void encrypt(char[] charMessage, int key){

        for(int index = 0; index < charMessage.length; index++){
            int letterIndex = letterToIndex(charMessage[index]);
            charMessage[index] = indexToLetter(letterIndex + key);
        }
        this.charMessage = charMessage;
    }

    public void decrypt(char[] charMessage, int key){

        for(int index = 0; index < charMessage.length; index++){
            int letterIndex = letterToIndex(charMessage[index]);
            charMessage[index] = indexToLetter(letterIndex - key);
        }
        this.charMessage = charMessage;
    }



    public int letterToIndex(char letter){
        for(int i = 0; i < 26; i++){
            if(alphabet[i] == letter){
                return i;
            }
        }
        return -1;
    }

    public char indexToLetter(int index){
        if(index >= alphabet.length){
            int multiplier = index / alphabet.length;
            int adjustedIndex = index - (alphabet.length * multiplier);
            return alphabet[adjustedIndex];
        }
        else if(index <= 0){
            int adjustedIndex = alphabet.length + index;
            return alphabet[adjustedIndex];
        }
        else{
            return alphabet[index];
        }
    }

    public char[] getCharMessage() {
        return charMessage;
    }
}


















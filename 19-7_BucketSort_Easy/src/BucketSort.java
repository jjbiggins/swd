

public class BucketSort {

    private int[][] array2D;
    private int[] array1D;

    public BucketSort(int[] array1D){
        array2D = new int[10][array1D.length];
        this.array1D = array1D;
    }

    public int[] sort() {

        int rowNumber = 0;
        int[] sortedArray = array1D;
        int maxDigitPlace = 0;


        for(int value : array1D){

            String valueString = Integer.toString(value);

            if(valueString.length() > maxDigitPlace){
                maxDigitPlace = valueString.length();
            }
        }


        for(int digitPlace = 0; digitPlace < maxDigitPlace; digitPlace++) {

            int columnNumber = 0;

            for (int index1D = 0; index1D < sortedArray.length; index1D++) {

                if (digitPlace == 0) {
                    rowNumber = sortedArray[index1D] % 10;
                }
                else {
                    rowNumber = sortedArray[index1D] / (int) Math.pow(10, digitPlace);
                    rowNumber = rowNumber % 10;
                }
                while(array2D[rowNumber][columnNumber] != 0){
                    columnNumber++;
                }
                array2D[rowNumber][columnNumber] = array1D[index1D];
            }

            int sortedRowNumber = 0;
            for(int row = 0; row < 10; row++){
                for(int column = 0; column < sortedArray.length; column++){
                    if(array2D[row][column] != 0){
                        sortedArray[sortedRowNumber] = array2D[row][column];
                        sortedRowNumber++;
                        array2D[row][column] = 0;
                    }
                }
            }



        }

        return sortedArray;
    }
}

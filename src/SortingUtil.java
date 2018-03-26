/**
 * Created by Linus&Elias on 2018-03-12.
 */


    /**
     * Created by Linus&Elias on 2018-03-12.
     */
    public class SortingUtil {
        public static int[] selSort(int[] numbers) {

            int i,j;
            int compareVal;
            for (j = 0; j < numbers.length-1; j++)
            {
                compareVal = j;
                for (i = j+1; i < numbers.length; i++)
                {
                    if (numbers[i] < numbers[compareVal])
                    {
                        compareVal = i;
                    }
                }
                if (compareVal != j) {
                    int temp,temp1;
                    temp = numbers[j];
                    temp1 = numbers[compareVal];
                    numbers[j] = temp1;
                    numbers[compareVal] = temp;
                }
            }
            return numbers;
        }

        private int[] exchangeSort(int[] inputArray) {
            for (int n = 0; n < inputArray.length - 1; n++) {
                for (int m = n + 1; m < inputArray.length; m++)
                {
                    if (inputArray[n] > inputArray[m])
                    {
                        int temp = inputArray[n];
                        inputArray[n] = inputArray[m];
                        inputArray[m] = temp;
                    }
                }
            }
            return inputArray;
        }
        public static double[] selSort(double[] input) {

            int i,j;
            int compareVal;
            for (j = 0; j < input.length-1; j++)
            {
                compareVal = j;
                for (i = j+1; i < input.length; i++)
                {
                    if (input[i] < input[compareVal])
                    {
                        compareVal = i;
                    }
                }
                if (compareVal != j) {
                    double temp,temp1;
                    temp = input[j];
                    temp1 = input[compareVal];
                    input[j] = temp1;
                    input[compareVal] = temp;
                }
            }
            return input;
        }

        public static String[] selSortStringLength(String[] words) {

            int i,j,compareVal;
            for (j = 0; j < words.length-1; j++)
            {
                compareVal = j;
                for (i = j+1; i < words.length; i++)
                {
                    if (words[i].length() < words[compareVal].length())
                    {
                        compareVal = i;
                    }
                }
                if (compareVal != j) {
                    String temp,temp1;
                    temp = words[j];
                    temp1 = words[compareVal];
                    words[j] = temp1;
                    words[compareVal] = temp;
                }
            }
            return words;
        }

        public static String[] selSortStringAlpha(String[] words) {

            int i,j,compareVal;
            for (j = 0; j < words.length-1; j++)
            {
                compareVal = j;
                for (i = j+1; i < words.length; i++)
                {
                    if ((int)words[i].toLowerCase().charAt(0) < (int)words[compareVal].toLowerCase().charAt(0))
                    {
                        compareVal = i;
                    }
                    else if((int)words[i].toLowerCase().charAt(0) == (int)words[compareVal].toLowerCase().charAt(0)) {

                        for (int ch = 0; ch < 2;ch++) {
                            if( (int)words[i].toLowerCase().charAt(ch) < (int)words[compareVal].toLowerCase().charAt(ch)); {
                                compareVal=i;
                                break;
                            }
                        }
                    }
                }
                if (compareVal != j) {
                    String temp,temp1;
                    temp = words[j];
                    temp1 = words[compareVal];
                    words[j] = temp1;
                    words[compareVal] = temp;
                }
            }
            return words;
        }
    }
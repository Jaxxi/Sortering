/**
 * Created by Linus&Elias on 2018-03-12.
 */
public class Sort {
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

    public static void selSortStringLength(String[] words) {

    }

    public static void selSortStringAlpha(String[] words) {

    }
}
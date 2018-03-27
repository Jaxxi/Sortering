public class MainSort {
    public static void main(String[] args) {
         //SortingUtil.selSort()
        String[] testArray = {"AAÖ","AAC","AAB","11","12","13","!","?","Å","Ä","Ö"};
        //String[] sortedArray = SortingUtil.selSortStringLength(testArray);
        String[] sortedArray = SortingUtil.selSortStringAlpha(testArray);
        for(int i =0; i < testArray.length; i++) {
            System.out.println(sortedArray[i]);
        }


    }
}


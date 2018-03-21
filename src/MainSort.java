public class MainSort {
    public static void main(String[] args) {
         //SortingUtil.selSort()
        String[] testArray = {"hejsan","testarsss","alphaasdasdasd","hej"};
        String[] sortedArray = SortingUtil.selSortStringLength(testArray);
        for(int i =0; i < testArray.length; i++) {
            System.out.println(sortedArray[i]);
        }


    }
}


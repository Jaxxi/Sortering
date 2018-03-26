public class MainSort {
    public static void main(String[] args) {
         //SortingUtil.selSort()
        String[] testArray = {"hajsan","22","testarsss","1","alphaasdasdasd","hej","å","ä","AC","hb","Aa","SDF","Y","AB","C","b","c","1","!","ö","321"};
        //String[] sortedArray = SortingUtil.selSortStringLength(testArray);
        String[] sortedArray = SortingUtil.selSortStringAlpha(testArray);
        for(int i =0; i < testArray.length; i++) {
            System.out.println(sortedArray[i]);
        }


    }
}


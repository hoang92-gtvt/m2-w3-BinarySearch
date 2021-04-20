package BinarySearch;

public class BinarySearch {
    int[] array ;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    public int binarySearch(int value){
        int indexLow =0;
        int indexHight = array.length-1;
        while(indexLow <= indexHight){
            int indexMid= (indexLow+ indexHight)/2;

            if (array[indexMid]< value){
                indexLow=++indexMid;
            }else if(array[indexMid]> value){
                indexHight = --indexMid;
            }else {
                return indexMid;
            }
        }
        return -1;
    }
    public int search2(int low, int height, int value){
       if(height>low) {
           int mid = (low + height) / 2;
           boolean a = array[mid] == value;
           if (a) return mid;
           else if (array[mid] > value) return search2(low, mid - 1, value);
           else return search2(mid + 1, height, value);
       }
       else
        return -1;
    }
}

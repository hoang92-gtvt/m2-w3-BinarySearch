package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5,10,40,60};
        BinarySearch binarySearch = new BinarySearch(arr1);
//thử với phương thưc 1;
//        int k = binarySearch.binarySearch(40);
//        if(k>=0) System.out.println("Phần tử tìm thấy tại vị trí " + k);
//        else System.out.println("Không tìm thấy phần tử trong mảng");
//Thử với phương thức 2

        int index = binarySearch.search2(0,arr1.length-1, 40);
        if(index>=0) System.out.println("Phần tử tìm thấy tại vị trí " + index);
        else System.out.println("Không tìm thấy phần tử trong mảng");
    }
}

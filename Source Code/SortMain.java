public class SortMain {

    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        MergeSortTest mSort = new MergeSortTest();
        System.out.println("data awal");
        mSort.printArray(data);
        System.out.println("Setelah diurutkan");
        mSort.mergeSort(data);
        mSort.merge(data, 0, 3, 7);
        mSort.sort(data, 0, 7);
        mSort.printArray(data);
    }
}
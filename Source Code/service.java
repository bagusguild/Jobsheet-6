public class service {

    int array[] = {12,17,2,1,70,50,90,17,2,90};

    void tampil(){
        for(int i=0;i<array.length;i++)
        System.out.print(array[i]+" ");
    }

    void bubbleSort(){
        int tmp;
        for(int i=0;i<array.length-1;i++){
            for(int j=1;j<array.length-i;j++){
                if(array[j]<array[j-1]){
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
    }
    
    int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right)/2;
            if(cari==array[mid]){
                return(mid);
            }else if(array[mid]>cari){
                return FindBinarySearch(cari, left, mid -1);
            }else{
                return FindBinarySearch(cari, mid +1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(int x, int pos){
        if(pos != -1){
            System.out.println("data : "+x+" ditemukan pada indeks "+pos);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
}
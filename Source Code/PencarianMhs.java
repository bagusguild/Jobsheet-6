public class PencarianMhs {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil(){
        for (Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("--------------------------------");
        }
    }
    
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++){
            if (listMhs[j].nim==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int rigth){
        int mid;
        if(rigth >= left){
            mid = (left + rigth)/2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }else if(listMhs[mid].nim < cari){ //Dibagian yang ini, yang pertama lebih besar menjadi lebih kecil
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari, mid+1, rigth);
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos){
        if (pos!= -1){
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan ");
        }
    } 

    public void TampilData(int x, int pos){
        if (pos!= -1){
            System.out.println("NIM\t : " + x );
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    void bubbleSort(){
        int tmp, tmp2;
        String tmpS;
        double tmpD;
        for(int i=0;i<listMhs.length-1;i++){
            for(int j=1;j<listMhs.length-i;j++){
                if(listMhs[j].nim<listMhs[j-1].nim){
                    tmp = listMhs[j].nim;
                    listMhs[j].nim = listMhs[j-1].nim;
                    listMhs[j-1].nim = tmp;
                    tmp2 = listMhs[j].umur;
                    listMhs[j].umur = listMhs[j-1].umur;
                    listMhs[j-1].umur = tmp2;
                    tmpS = listMhs[j].nama;
                    listMhs[j].nama = listMhs[j-1].nama;
                    listMhs[j-1].nama = tmpS;
                    tmpD = listMhs[j].ipk;
                    listMhs[j].ipk = listMhs[j-1].ipk;
                    listMhs[j-1].ipk = tmpD;
                }
            }
        }
    }
}

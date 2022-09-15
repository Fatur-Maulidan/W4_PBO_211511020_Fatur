package kasus1.pkg4;
public class Inventori {
    Barang[] barangs;
    
    void initBarang(){
        barangs = new Barang[2];
        barangs[0] = new Barang("001","Baju");
        barangs[0].setStok(10);
        barangs[1] = new Barang("002","Celana");
        barangs[1].setStok(20);    
    }
    
    void showBarang(){
        System.out.println(barangs[0].nama_barang + "("+ barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "("+ barangs[1].getStok() + ")");
    }
    
    void pengadaanBarang(){
        initBarang();
//        barangs[0].setStok(barangs[0].getStok() + 20);
//        barangs[0].setStok(barangs[0].getStok() - 20);
        barangs[0].setStok(barangs[0].getStok() * 20);
//        barangs[0].tambahBarang(12);
        showBarang();
    }
}

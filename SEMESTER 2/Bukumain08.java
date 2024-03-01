public class Bukumain08 {
public static void main(String[] args) {
bukuu08 bk1 = new bukuu08();
bk1.judul = "Today Ends Tomorrow Comes";
bk1.pengarang = "Denanda Pratiwi";
bk1.halaman = 198;
bk1.stok = 13;
bk1.harga=71000;

bk1.tampilinformasi();
bk1.terjual(5);
bk1.gantiHarga(60000);
bk1.tampilinformasi();



bukuu08 bukumajid = new bukuu08("Erwan Majid", "Majid Erwan", 160, 29, 59000);
bukumajid.terjual(11);
bukumajid.tampilinformasi();
System.out.println("harga yang terjual = " +bukumajid.hitungHargaTotal(bukumajid.stok));
System.out.println("diskon = " +bukumajid.hitungDiskon(bukumajid.stok));
System.out.println("bayar = " +bukumajid.hitungHargaBayar(bukumajid.stok));




}
}

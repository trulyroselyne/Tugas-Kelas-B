import java.util.Scanner;
class Nomor12
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //jumlah sepatu yang ada di toko
    int h[] = new int[n]; //ukuran sepatu yang ada di toko
    String warna[] = new String[n]; //warna sepatu yang ada di toko
    boolean cari = false;
    for(int i = 0; i < n; i++)
    {
      h[i] = sc.nextInt(); //ukuran sepatu pada indeks ke i
      warna[i] = sc.next(); //warna sepatu pada indeks ke i
    }
    int x = sc.nextInt(); //ukuran sepatu Winda
    String colourx = sc.next(); //warna sepatu yang dicari
    for(int i = 0; i < n; i++)
    {
      if(h[i] == x && warna[i].equalsIgnoreCase(colourx))
      {
        cari = true;
        System.out.println("sepatu berwarna " + warna[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
      }
      cari = false;
    }
  }
}
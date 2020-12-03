NAMA : Muhammad Nafis
NIM  : 1908107010078

1. Deskripsi Program
   - Class Penumpang
      Class ini mewakili penumpang bus, kemudian satu objek penumpang mewakili satu penumpang dan setiap penumpang mempunyai atribut berupa nama, umur maupun status hamil.
      Method Penumpang() merupakan method constructor akan memberikan nilai awal kepada atribut.
      Method getNama(), getUmur(), dan getHamil() merupakan method accessor akan mengembalikan nilai yang diminta.

   - Class Bus
      Class ini mewakili bus dan memiliki atribut objek dari class penumpang, penumpang biasa akan masuk kedalam atribut penumpangBiasa (minimal 0, maksimal 4) dan penumpang prioritas akan masuk kedalam atribut penumpangPrioritas (minimal 0, maksimal 2).
      Method getPenumpang() merupakan method accessor yang akan mengembalikan list penumpang yang diminta.
      Method getJumlahPenumpang() merupakan method accessor yang akan mengembalikan jumlah penumpang yang diminta.
      Method NaikPenumpang() berguna untuk menambahkan penumpang kedalam bus jika ada kursi yang kosong.
      Method turunkanPenumpang(nama) berguna untuk menerima parameter nama penumpang.
      Method toString() untuk mencetak daftar nama dari penumpang yang ada di bus.

   - Class Main
      Pada method main dideklarasikan sebuah objek bus. Pada method ini kita akan mensimulasikan proses naik turunnya penumpang dari bus.

2. Instalasi Program
    Cari directory file yang telah dibuat pada cmd atau terminal dan compile program dengan cara
    *//Compile
	$javac Bus.java
	$javac Penumpang.java
	$javac Main.java

3. Cara menjalankan Program
    java Main
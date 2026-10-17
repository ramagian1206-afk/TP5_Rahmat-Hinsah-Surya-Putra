
# Character Manager Sprint #2

## Deskripsi
Character Manager adalah program Java untuk mengelola
data karakter game. Program ini menerapkan konsep OOP,
encapsulation, equals(), static, dan object reference.

## Fitur Program
1. Menambahkan karakter baru.
2. Menolak nama karakter duplikat.
3. Mencari karakter berdasarkan nama.
4. Menghapus karakter.
5. Menghitung jumlah karakter.
6. Menghitung rata-rata level.
7. Mencari karakter berdasarkan tipe.
8. Mencari karakter dengan attack tertinggi.
9. Mengembalikan salinan daftar karakter.

## Fitur Analitik Tambahan
Method findStrongest() mencari karakter dengan attack
tertinggi. Fitur ini mempermudah pengguna mengetahui
karakter dengan serangan paling tinggi tanpa mengakses
ArrayList internal secara langsung.

## Encapsulation
Field pada Character menggunakan private.
CharacterManager menyediakan method untuk mengelola
data karakter secara terstruktur.

## Object Reference
Jika dua variabel objek merujuk pada objek yang sama,
perubahan melalui salah satu variabel akan terlihat
melalui variabel lainnya.

## Salinan ArrayList
Method getAllCharacters() mengembalikan daftar baru.
Perubahan struktur daftar salinan tidak mengubah
struktur daftar internal CharacterManager.

Salinan ini merupakan shallow copy. Objek Character
di dalam kedua daftar masih bisa berbagi reference.

## Cara Menjalankan
1. Buka folder project di Visual Studio Code.
2. Buka Main.java.
3. Klik Run pada method main().
4. Periksa hasil pengujian di terminal.

## Kesimpulan
Project ini mempraktikkan pengelolaan objek Java,
ArrayList, encapsulation, equals(), static, dan
object reference.

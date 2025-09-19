# Post-Test-3

# 👟 Sistem Manajemen Koleksi Sepatu Digital 

| Nama                      | NIM           | Kelas             |
|---------------------------|---------------|-------------------|
| Tsabitah Kawiswara        | 2409116099    | Sistem Informasi C |

## 📄Deskripsi Program
Sistem manajemen koleksi sepatu digital adalah sebuah program yang dirancang untuk membantu mengatur dan menyimpan data sepatu secara lebih terstruktur. Dengan menerapkan prinsip Pemrograman Berorientasi Objek (OOP), sistem ini mampu menyajikan pengelolaan data yang efisien, rapi, dan mudah dipahami. Setiap detail sepatu, mulai dari jenis, warna, hingga ukuran, dapat dicatat dan diakses dengan lebih praktis tanpa harus bergantung pada ingatan atau catatan manual. Dengan demikian, koleksi sepatu menjadi lebih tertata, terorganisir, serta meminimalisir risiko kesalahan dalam pencatatan data.

Program ini dibuat dengan konsep:

* **Constructor** → digunakan untuk membuat dan menginisialisasi objek sepatu.
* **Access modifier** (private & public)→ menjaga agar data tetap aman dan hanya bisa diakses lewat method tertentu.
* **Validasi input**→ memastikan data yang dimasukkan benar (misalnya ukuran sepatu harus berupa angka).
* **Fitur Search**→ memudahkan pengguna menemukan data koleksi dengan cepat.

Fitur utama yang tersedia:

1. **Tambah Koleksi**: pengguna bisa menambahkan sepatu baru dengan detail                               lengkap (nama, merk, warna, ukuran).
2. **Lihat Koleksi**: menampilkan seluruh sepatu yang sudah tersimpan di dalam                          daftar.
3. **Ubah Koleksi**: memungkinkan pengguna memperbarui data sepatu tertentu.
4. **Hapus Koleksi**: menghapus data sepatu dari daftar jika sudah tidak                                diperlukan.
5. **Cari Koleksi**: mencari sepatu berdasarkan kata kunci, misalnya nama, merk,                       atau warna
6. **Keluar Program**: menutup aplikasi dengan aman setelah pengguna selesai                             melakukan pengelolaan data

# Struktur Packages 

<img width="317" height="144" alt="image" src="https://github.com/user-attachments/assets/8f3518c8-0e6a-4acf-b813-a26cc30791dd" />


Program ini disusun menggunakan konsep Model-View-Controller (MVC):

* **model**: Bagian ini berisi class Sepatu yang berfungsi sebagai cetakan atau blueprint untuk membuat objek sepatu. Di dalamnya terdapat atribut penting seperti nama, merk, warna, dan ukuran. Class ini juga memiliki constructor untuk menginisialisasi data saat objek sepatu dibuat, serta getter dan setter yang digunakan untuk mengambil dan mengubah nilai atribut dengan cara yang lebih terkontrol. Dengan adanya model, setiap data sepatu bisa disimpan dalam bentuk objek yang rapi dan terstruktur.

* **service**: Bagian ini berisi logika utama atau proses bisnis dari program. Di sinilah semua fitur CRUD (Create, Read, Update, Delete) dijalankan, misalnya menambah sepatu baru, menampilkan daftar sepatu, memperbarui data sepatu, atau menghapus sepatu dari koleksi. Selain CRUD, bagian service juga menangani fitur tambahan, seperti validasi input (agar data yang dimasukkan tidak kosong atau salah format) dan pencarian sepatu berdasarkan kata kunci (nama, merk, atau warna).

* **main (com.mycompany.mavenproject3)**: Bagian ini berisi class Main yang berfungsi sebagai pintu masuk program. Di sinilah menu ditampilkan kepada pengguna, lalu setiap pilihan menu akan diarahkan ke bagian service untuk diproses. Dengan kata lain, main bertugas menghubungkan interaksi pengguna dengan logika program yang ada di service. Jadi, saat pengguna memilih opsi tertentu, main akan memanggil metode yang sesuai dari service agar program bisa berjalan sesuai perintah.


# Cara Menggunakan Program

<details>
<summary><h3>Menu Utama Koleksi Sepatu</h3></summary>

<img width="279" height="137" alt="image" src="https://github.com/user-attachments/assets/d9f2a255-12e2-42da-9027-a7b3829df105" />


Begitu program dijalankan, pengguna langsung disajikan menu utama yang berisi daftar pilihan. Cukup masukkan nomor menu sesuai yang diinginkan, lalu program akan menjalankan perintah tersebut. Setelah selesai, menu utama akan muncul lagi sehingga pengguna bisa melanjutkan ke pilihan lain.

Program hanya akan berhenti jika pengguna memilih opsi Keluar.

## 1. Tambah Koleksi

<img width="406" height="230" alt="image" src="https://github.com/user-attachments/assets/31bd9caa-2ad1-4b19-b872-c95355bc1522" />


Di menu ini, pengguna diminta mengisi detail sepatu: nama, merk, warna, dan ukuran. Data yang valid akan langsung tersimpan, lalu program memberi konfirmasi "Sepatu berhasil ditambahkan!". Data yang dimasukkan akan otomatis tersimpan dalam koleksi.

## 2. Lihat Koleksi

<img width="541" height="216" alt="image" src="https://github.com/user-attachments/assets/d8b649c2-92ae-47b7-89e2-6fd23ceb8f51" />


Menu ini akan menampilkan semua sepatu yang sudah ada dalam koleksi,informasi akan ditampilkan dalam bentuk list agar pengguna bisa melihat data dengan jelas. Kalau belum ada data, sistem akan memberi tahu bahwa koleksi masih kosong seperti dibawah ini:

<img width="370" height="155" alt="image" src="https://github.com/user-attachments/assets/62fbf15e-28f6-4abf-b7f5-dd70a1999a7d" />


## 3. Ubah Koleksi

<img width="527" height="310" alt="image" src="https://github.com/user-attachments/assets/e15e421d-d5e5-452d-957d-524d49ad2b9b" />

Jika terdapat kesalahan data atau ada perubahan, pengguna dapat memperbarui informasi sepatu yang sudah tersimpan. Pengguna memilih nomor sepatu yang ingin diubah, lalu memasukkan data baru untuk mengganti yang lama. Validasi tetap berlaku, jadi hanya nomor yang tersedia saja yang bisa diubah. Jika memasukkan nomor yang tidak tersedia tampilannya akan seperti berikut:

<img width="471" height="96" alt="image" src="https://github.com/user-attachments/assets/465373a5-55f3-4d8c-93b0-5d6a8360ccaa" />


## 4. Hapus Koleksi

<img width="466" height="247" alt="image" src="https://github.com/user-attachments/assets/b79aac8a-386d-44fe-bd73-1b149777e1e5" />


Menu ini memungkinkan pengguna menghapus sepatu tertentu dari daftar.Sistem akan menampilkan daftar sepatu, lalu meminta konfirmasi data mana yang ingin dihapus. Sama seperti update, hanya nomor valid yang bisa dipilih. Jika memasukkan nomor yang tidak valid, tampilannya akan seperti berikut:

<img width="529" height="92" alt="image" src="https://github.com/user-attachments/assets/e8dea69c-c4d7-4e7b-be35-05a57aae6fe7" />


## 5. Cari Koleksi

<img width="442" height="179" alt="image" src="https://github.com/user-attachments/assets/198d6677-c858-4b9a-9498-7dcbf0447efb" />


Fitur pencarian berfungsi untuk memudahkan pengguna menemukan data sepatu tertentu ketika koleksi sudah cukup banyak. Pengguna hanya perlu memasukkan kata kunci berupa nama, merk, atau warna, kemudian sistem akan menampilkan daftar sepatu yang sesuai dengan kata kunci tersebut. 
Apabila kata kuncinya tidak ada yang sesuai, maka tampilannya akan seperti ini:

<img width="393" height="183" alt="image" src="https://github.com/user-attachments/assets/6744d2d0-e3af-406e-aef6-a11f97735f3c" />


## 6. Keluar Program

<img width="432" height="252" alt="image" src="https://github.com/user-attachments/assets/7a19b0dc-da22-47a0-95f8-3c01f8effb3d" />


Jika pengguna ingin keluar dari program, cukup memilih opsi 0 (Keluar) pada menu utama. Setelah dipilih, sistem akan menampilkan pesan “Terima kasih, program selesai.” sebagai tanda bahwa program sudah dihentikan. Bagian bawah layar juga menampilkan informasi dari Java, yaitu status BUILD SUCCESS yang berarti program berhasil dijalankan tanpa error, serta waktu total eksekusi program hingga selesai.


# Validasi Input

Pada program ini terdapat validasi input yang berfungsi untuk mencegah terjadinya output yang salah akibat data yang dimasukkan pengguna tidak sesuai format. Misalnya, untuk input merek, warna, dan nama sepatu, data yang dimasukkan harus berupa huruf. Sebaliknya, untuk input ukuran sepatu atau saat memilih menu program, data yang dimasukkan harus berupa angka. Jika pengguna memberikan input yang tidak sesuai, maka program akan menampilkan peringatan agar pengguna memasukkan data dengan format yang benar.

**1. Berikut adalah contoh ketika pengguna memasukkan data angka pada input nama sepatu (yang seharusnya huruf). Program akan menampilkan peringatan bahwa format input tidak sesuai.**

<img width="377" height="171" alt="image" src="https://github.com/user-attachments/assets/1a1b77fa-a68c-4512-8d96-60cfd1f18551" />


**2. Berikut adalah contoh ketika pengguna memasukkan data angka pada input merek sepatu. Program akan menolak input tersebut dan meminta pengguna memasukkan data dengan format huruf.**

<img width="369" height="35" alt="image" src="https://github.com/user-attachments/assets/48533167-a8c9-4f75-9e01-0eb8404c677e" />


**3. Berikut adalah contoh validasi input ketika pengguna memasukkan data yang salah pada input warna sepatu. Program akan menampilkan peringatan agar pengguna menginputkan huruf.**

<img width="364" height="39" alt="image" src="https://github.com/user-attachments/assets/f539311e-0c64-4849-8a04-947f3a39fa49" />


**4. Berikut adalah contoh validasi input pada ukuran sepatu. Jika pengguna memasukkan huruf (bukan angka), maka program akan menampilkan peringatan dan meminta pengguna untuk menginputkan angka.**
   
<img width="260" height="37" alt="image" src="https://github.com/user-attachments/assets/550c6662-1031-4ffe-bd68-75ff2a22eecd" />


**5. Berikut adalah contoh validasi input pada menu pilihan. Jika pengguna memasukkan angka yang tidak ada dalam daftar opsi, maka program akan menampilkan peringatan bahwa pilihan tidak valid.**

<img width="338" height="155" alt="image" src="https://github.com/user-attachments/assets/afd8e101-ff36-4f05-8197-9a31312b288b" />

# 🚀 Cara Menggunakan Program  

<details>
<summary><h3>📌 Menu Utama Koleksi Sepatu</h3></summary>

Berikut tampilan menu utama:  

![Menu Utama](link_gambar.png)

</details>

---

<details>
<summary><h3>1️⃣ Tambah Koleksi</h3></summary>

Pada menu ini pengguna dapat menambahkan sepatu baru dengan detail lengkap.  

![Tambah Koleksi](link_gambar.png)

</details>

---

<details>
<summary><h3>2️⃣ Lihat Koleksi</h3></summary>

Menampilkan seluruh data sepatu yang sudah disimpan.  

- Jika ada data:  
  ![Lihat Koleksi](link_gambar.png)  

- Jika koleksi kosong:  
  ![Koleksi Kosong](link_gambar.png)  

</details>

---

<details>
<summary><h3>3️⃣ Ubah Koleksi</h3></summary>

Pengguna dapat memperbarui data sepatu berdasarkan nomor urut.  

- Jika berhasil:  
  ![Ubah Koleksi Berhasil](link_gambar.png)  

- Jika input salah:  
  ![Ubah Koleksi Salah](link_gambar.png)  

</details>

---

<details>
<summary><h3>4️⃣ Hapus Koleksi</h3></summary>

Menghapus data sepatu tertentu.  

- Jika berhasil:  
  ![Hapus Koleksi Berhasil](link_gambar.png)  

- Jika input salah:  
  ![Hapus Koleksi Salah](link_gambar.png)  

</details>

---

<details>
<summary><h3>5️⃣ Cari Koleksi</h3></summary>

Fitur pencarian berdasarkan nama, merk, atau warna.  

- Jika ditemukan:  
  ![Cari Koleksi Berhasil](link_gambar.png)  

- Jika tidak ditemukan:  
  ![Cari Koleksi Gagal](link_gambar.png)  

</details>

---

<details>
<summary><h3>6️⃣ Keluar Program</h3></summary>

Menutup aplikasi dengan aman.  

![Keluar Program](link_gambar.png)

</details>


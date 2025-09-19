# Post-Test-3

| Nama                      | NIM           | Kelas             |
|---------------------------|---------------|-------------------|
| Tsabitah Kawiswara        | 2409116099    | Sistem Informasi C |
---
# 👟 Sistem Manajemen Koleksi Sepatu Digital 
---

## 📑 Daftar Isi 

<details>
<summary><h3>📄 Deskripsi Program</h3></summary>

<img width="297" height="170" alt="image" src="https://github.com/user-attachments/assets/3b49bae4-22d8-4077-bfec-12c1a406866b" />

Sistem manajemen koleksi sepatu digital adalah sebuah program yang dirancang untuk membantu mengatur dan menyimpan data sepatu secara lebih terstruktur. Dengan menerapkan prinsip Pemrograman Berorientasi Objek (OOP), sistem ini mampu menyajikan pengelolaan data yang efisien, rapi, dan mudah dipahami. Setiap detail sepatu, mulai dari jenis, warna, hingga ukuran, dapat dicatat dan diakses dengan lebih praktis tanpa harus bergantung pada ingatan atau catatan manual. Dengan demikian, koleksi sepatu menjadi lebih tertata, terorganisir, serta meminimalisir risiko kesalahan dalam pencatatan data.


</details>

---

<details>
<summary><h3>🗂 Struktur Packages (MVC)</h3></summary>

<img width="317" height="144" alt="image" src="https://github.com/user-attachments/assets/8f3518c8-0e6a-4acf-b813-a26cc30791dd" />



Program ini disusun menggunakan konsep Model-View-Controller (MVC):

## 1. model:
Berisi class–class yang mewakili data atau objek nyata (dalam hal ini produk sepatu).

* **Produk Java** → menjadi superclass (class induk) yang menyimpan atribut umum dari semua produk, misalnya id, nama, merk, dan harga.

* **Sepatu Java** → menjadi subclass dari Produk, yang mewarisi atribut dasar dari Produk lalu bisa menambahkan atribut khusus, misalnya ukuran atau warna.

* **Sandal Java** → juga merupakan subclass dari Produk, dengan atribut tambahan yang berbeda dari Sepatu.

## 2. Service:

1. Berisi class SepatuService.java yang menjalankan logika utama program.

2. Di sinilah proses CRUD (Create, Read, Update, Delete) dilakukan untuk data sepatu.

3. Selain itu, service juga mengatur validasi input (contoh: ukuran harus angka, nama tidak boleh kosong) dan pencarian koleksi sepatu.

## 3. main (com.mycompany.mavenproject2):

1. Berisi class Mavenproject2.java yang menjadi entry point program.

   Fungsinya:

   Menampilkan menu utama ke pengguna.

   Meneruskan pilihan pengguna ke SepatuService agar diproses.

2. Dengan kata lain, package ini menjadi penghubung antara user (input/output) dengan logika bisnis yang ada di service.

</details>

---

<details>
<summary><h3>⚙️ Konsep OOP yang Digunakan</h3></summary>

**Penjelasan Konsep OOP dalam Program**

## 1. Encapsulation → Getter & Setter

Encapsulation artinya menyembunyikan detail internal sebuah class, lalu menyediakan cara resmi untuk mengakses atau mengubah data.
Caranya dengan private pada atribut, lalu dibuat getter dan setter.

🟢 Contoh di kode:

<img width="557" height="251" alt="image" src="https://github.com/user-attachments/assets/76f1a89f-cf42-4b57-bdb1-c85025eddae6" />


Atribut ukuran di class Sepatu tidak bisa diakses langsung dari luar (sepatu.ukuran → error).

Tapi dengan getUkuran() → kita bisa ambil nilainya, misalnya untuk ditampilkan di menu.

Dengan setUkuran() → kita bisa mengubah nilainya, misalnya saat user melakukan update sepatu.




</details>

---


<details>
<summary><h3>🌟 Fitur Utama</h3></summary>

Menampilkan seluruh data sepatu yang sudah disimpan.  

- Jika ada data:  
  ![Lihat Koleksi](link_gambar.png)  

- Jika koleksi kosong:  
  ![Koleksi Kosong](link_gambar.png)  

</details>

---

<details>
<summary><h3>🚀 Cara Menggunakan Program </h3></summary>

Berikut tampilan menu utama:  

![Menu Utama](link_gambar.png)


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

</details>

---

<details>
<summary><h3>✅ Validasi Input (MVC)</h3></summary>

Pada menu ini pengguna dapat menambahkan sepatu baru dengan detail lengkap.  

![Tambah Koleksi](link_gambar.png)

</details>

---

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

* **Produk Java** → menjadi superclass (class induk) yang menyimpan atribut umum dari semua produk, misalnya id, nama, merk.

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

**🟢 Contoh di kode:**

<img width="557" height="251" alt="image" src="https://github.com/user-attachments/assets/76f1a89f-cf42-4b57-bdb1-c85025eddae6" />


1. Atribut ukuran di class Sepatu tidak bisa diakses langsung dari luar (sepatu.ukuran → error).

2. Tapi dengan getUkuran() → kita bisa ambil nilainya, misalnya untuk ditampilkan di menu.

3. Dengan setUkuran() → kita bisa mengubah nilainya, misalnya saat user melakukan update sepatu.



**🔗 Hubungannya dengan output:**

Saat user menambahkan sepatu dan program menampilkan detailnya, data ukuran yang muncul berasal dari getter:

<img width="490" height="58" alt="image" src="https://github.com/user-attachments/assets/2175565d-8e64-483a-bea6-96cbf2062ed8" />


## 2. Inheritance → Pewarisan

Inheritance memungkinkan kita membuat class turunan dari class induk, sehingga class turunan mewarisi atribut dan method umum.

**🟢 Contoh di kode:**


2. Sepatu dan Sandal adalah class turunan. Mereka otomatis punya atribut nama, merk, warna, tanpa harus ditulis ulang.

3. Lalu mereka bisa menambahkan atribut khusus → Sepatu punya ukuran, Sandal punya jenis.

**🔗 Hubungannya dengan output:**

Karena inheritance, kamu bisa menyimpan semua objek dalam 1 ArrayList<Produk>:
FOTO
Hasilnya, meskipun daftar berisi campuran sepatu dan sandal, semuanya tetap bisa ditampilkan dalam 1 list:

FOTO

Hasilnya, meskipun daftar berisi campuran sepatu dan sandal, semuanya tetap bisa ditampilkan dalam 1 list:
<img width="485" height="64" alt="image" src="https://github.com/user-attachments/assets/4ee10192-4d86-4958-8d25-ef6d3a809bd7" />

## 3. Override Method


</details>

---


<details>
<summary><h3>🌟 Fitur Utama</h3></summary>

1. **Tambah Koleksi**: pengguna bisa menambahkan sepatu baru dengan detail                               lengkap (nama, merk, warna, ukuran).
2. **Lihat Koleksi**: menampilkan seluruh sepatu yang sudah tersimpan di dalam                          daftar.
3. **Ubah Koleksi**: memungkinkan pengguna memperbarui data sepatu tertentu.
4. **Hapus Koleksi**: menghapus data sepatu dari daftar jika sudah tidak                                diperlukan.
5. **Cari Koleksi**: mencari sepatu berdasarkan kata kunci, misalnya nama, merk,                       atau warna
6. **Keluar Program**: menutup aplikasi dengan aman setelah pengguna selesai                             melakukan pengelolaan data

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
</details>

---

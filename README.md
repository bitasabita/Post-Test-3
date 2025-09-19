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

<img width="443" height="180" alt="image" src="https://github.com/user-attachments/assets/3bea90b2-c63d-41c8-ad9a-1610244b1a95" />


Program ini disusun menggunakan konsep Model-View-Controller (MVC):

## 1. model:
Berisi class–class yang mewakili data atau objek nyata (dalam hal ini produk sepatu).

* **Produk Java** → menjadi superclass (class induk) yang menyimpan atribut umum dari semua produk yaitu nama, merk, warna

* **Sepatu Java** → menjadi subclass dari Produk, yang mewarisi atribut dasar dari Produk lalu bisa menambahkan atribut khusus, yaitu ukuran atau warna.

* **Sandal Java** → juga merupakan subclass dari Produk, dengan atribut tambahan yang berbeda dari Sepatu yaitu jenis sandal.

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

1. Produk adalah class induk yang menyimpan atribut umum → nama, merk, warna.
   
   <img width="200" height="82" alt="image" src="https://github.com/user-attachments/assets/74d88cb1-b7d1-4769-a8f1-d7ca89931179" />


2. Sepatu dan Sandal adalah class turunan. Mereka otomatis punya atribut nama, merk, warna, tanpa harus ditulis ulang.
   
   <img width="300" height="53" alt="image" src="https://github.com/user-attachments/assets/7e5700d6-b279-4d96-b8be-524eb38ae355" />

   
   <img width="307" height="50" alt="image" src="https://github.com/user-attachments/assets/c461bc53-342a-4698-9665-df3aadc71d4e" />

   
3. Lalu mereka bisa menambahkan atribut khusus → Sepatu punya ukuran, Sandal punya jenis.

Class Sepatu:

   <img width="579" height="271" alt="image" src="https://github.com/user-attachments/assets/2594e92d-2f52-4cba-91ae-b6df041bc43a" />


Class Sandal:

   <img width="569" height="265" alt="image" src="https://github.com/user-attachments/assets/c441ffdc-82a9-4345-8100-2d9b59d6bb3b" />


**🔗 Hubungannya dengan output:**

Karena inheritance, kita bisa menyimpan semua objek dalam 1 ArrayList<Produk>;
Hasilnya, meskipun daftar berisi campuran sepatu dan sandal, semuanya tetap bisa ditampilkan dalam 1 list seperti dibawah ini:

Hasilnya, meskipun daftar berisi campuran sepatu dan sandal, semuanya tetap bisa ditampilkan dalam 1 list:
<img width="485" height="64" alt="image" src="https://github.com/user-attachments/assets/4ee10192-4d86-4958-8d25-ef6d3a809bd7" />

## 3. Override Method
ketika class turunan bisa memiliki perilaku berbeda meskipun method-nya sama dengan class induk. Dalam program ini, class Produk sebagai induk memiliki method abstrak getDeskripsi(), lalu di-override oleh Sepatu dan Sandal. Walaupun nama method-nya sama, hasil yang dikembalikan berbeda sesuai jenis produk. 

**🟢 Contoh di kode:**

**Class Produk (superclass)**

<img width="601" height="83" alt="image" src="https://github.com/user-attachments/assets/5ad8e196-5bad-439a-8b66-c45645108efa" />


**Class Sepatu (subclass)**

<img width="516" height="113" alt="image" src="https://github.com/user-attachments/assets/cf882403-cb45-44c9-85ca-3fb01cb9361e" />


**Class Sandal (subclass)**

<img width="508" height="114" alt="image" src="https://github.com/user-attachments/assets/8d02bb32-f387-45d8-a2c9-0a8137a7ad52" />


Ketika program menyimpan objek Sepatu dan Sandal dalam satu list bertipe Produk, lalu memanggil getDeskripsi(), Java otomatis menampilkan hasil sesuai dengan objek sebenarnya. Method yang sama bisa menghasilkan output berbeda.

</details>

---


<details>
<summary><h3>🌟 Fitur Utama</h3></summary>

<img width="298" height="133" alt="image" src="https://github.com/user-attachments/assets/fb3cd9f2-d005-4579-a806-9bd5311dce6e" />


1. **Tambah Sepatu**: Pengguna bisa menambahkan sepatu baru dengan detail                               lengkap (nama, merk, warna, ukuran).
2. **Tambah Sandal**: Pengguna bisa menambahkan sandal baru dengan detail seperti (nama, merk, warna, dan jenis sandal)
   
3. **Tampilkan Semua Produk**: Untuk menampilkan seluruh produk yang pernah di tambahkan ke dalam koleksi baik sepatu maupun sandal
4.  **Tampilkan Semua Produk**: Untuk mengubah data sepatu atau sandal seperti ingin mengubah ukuran, warna, nama, merk ketika merasa data yang dimasukkan sebelumnya salah atau memang ingin melakukan perubahan pada data.
5. **Hapus Produk**: Menghapus data sepatu atau sandal  dari daftar jika sudah tidak diperlukan.
6. **Cari Produk**: Mencari sepatu ataupun sandal berdasarkan kata kunci, misalnya nama, merk, atau warna
0. **Keluar**: Menutup aplikasi dengan aman setelah pengguna selesai                             melakukan pengelolaan data

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

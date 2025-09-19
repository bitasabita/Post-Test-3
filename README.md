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

3. Selain itu, service juga mengatur validasi input (contoh: ukuran harus angka, nama tidak boleh kosong) dan pencarian koleksi sepatu atau sandal.

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


2. Sepatu dan Sandal adalah class turunan. Mereka otomatis punya atribut nama, merk, warna, tanpa harus ditulis ulang dan tinggal ditambahkan atribut yang dibutuhkan oleh sepatu atau pun sandal, sublass ditandai dengan "extends (nama superclass)" seperti contoh dibawah ini:
   
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

<img width="510" height="111" alt="image" src="https://github.com/user-attachments/assets/15520355-842f-42d3-9278-21fb519dbde8" />


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
4.  **Perbarui Produk**: Untuk mengubah data sepatu atau sandal seperti ingin mengubah ukuran, warna, nama, merk ketika merasa data yang dimasukkan sebelumnya salah atau memang ingin melakukan perubahan pada data.
5. **Hapus Produk**: Menghapus data sepatu atau sandal  dari daftar jika sudah tidak diperlukan.
6. **Cari Produk**: Mencari sepatu ataupun sandal berdasarkan kata kunci, misalnya nama, merk, atau warna
0. **Keluar**: Menutup aplikasi dengan aman setelah pengguna selesai                             melakukan pengelolaan data

</details>

---

<details>
<summary><h3>🚀 Cara Menggunakan Program </h3></summary>

Berikut tampilan menu utama:  

<img width="298" height="133" alt="image" src="https://github.com/user-attachments/assets/fb3cd9f2-d005-4579-a806-9bd5311dce6e" />


<details>
<summary><h3>1️⃣ Tambah Sepatu</h3></summary>

Di menu ini, pengguna diminta mengisi detail sepatu: nama, merk, warna, dan ukuran. Data yang valid akan langsung tersimpan, lalu program memberi konfirmasi "Sepatu berhasil ditambahkan!". Data yang dimasukkan akan otomatis tersimpan dalam koleksi.  


<img width="295" height="253" alt="image" src="https://github.com/user-attachments/assets/9e00e1eb-a073-40f2-8cea-45ac3b0548e5" />


</details>

---

<details>
<summary><h3>1️⃣ Tambah Sandal</h3></summary>

Di menu ini, pengguna diminta mengisi detail sepatu: nama, merk, warna, dan jenis sandal. Data yang valid akan langsung tersimpan, lalu program memberi konfirmasi "Sandal berhasil ditambahkan!". Data yang dimasukkan akan otomatis tersimpan dalam koleksi.  


<img width="326" height="247" alt="image" src="https://github.com/user-attachments/assets/f2b5aca6-885e-4e0b-8f50-bf69c4d798e8" />


</details>

---

<details>
<summary><h3>3️⃣ Tampilkan Semua Produk</h3></summary>

Menu ini akan menampilkan semua sepatu dan sandal yang sudah ada dalam koleksi,informasi akan ditampilkan dalam bentuk list agar pengguna bisa melihat data dengan jelas. Kalau belum ada data, sistem akan memberi tahu bahwa koleksi masih kosong seperti dibawah ini: 

<img width="671" height="138" alt="image" src="https://github.com/user-attachments/assets/901d93e7-ed3a-4917-a4dc-c891b299e9eb" />


</details>

---

<details>
<summary><h3>4️⃣ Perbarui Produk</h3></summary>

Jika terdapat kesalahan data atau ada perubahan, pengguna dapat memperbarui informasi sepatu atau sandal yang sudah tersimpan. Pengguna memilih nomor sepatu atau sandal yang ingin diubah, lalu memasukkan data baru untuk mengganti yang lama. 

Sebelum produk nomor 3 di perbarui:

<img width="399" height="202" alt="image" src="https://github.com/user-attachments/assets/416c9b69-cd8a-414f-9d2c-9c17c76bf5dc" />

Tampilan list koleksi setelah di perbarui:

<img width="433" height="100" alt="image" src="https://github.com/user-attachments/assets/b52e4ae4-23e8-4e95-8dae-9b1c9efbe501" />


</details>

---

<details>
<summary><h3>5️⃣ Hapus Produk</h3></summary>

Menu ini memungkinkan pengguna menghapus sepatu tertentu dari daftar.Sistem akan menampilkan daftar sepatu dan sandal , lalu meminta konfirmasi data mana yang ingin dihapus. Sama seperti update, hanya nomor valid yang bisa dipilih. 

Sebelum menghapus produk nomor 1:


<img width="357" height="133" alt="image" src="https://github.com/user-attachments/assets/803dda1c-ed8e-4123-84a6-6a77ed8046a5" />


Tampilan list koleksi ketika salah satu produk sudah di hapus:


<img width="385" height="96" alt="image" src="https://github.com/user-attachments/assets/10bdd1a9-c7e7-451f-adde-feff6280d06d" />



</details>

---

<details>
<summary><h3>5️⃣ Cari Produk </h3></summary>

Fitur pencarian berfungsi untuk memudahkan pengguna menemukan data sepatu dan sandal tertentu ketika koleksi sudah cukup banyak. Pengguna hanya perlu memasukkan kata kunci berupa nama, merk, atau warna, kemudian sistem akan menampilkan daftar sepatu atau sandal yang sesuai dengan kata kunci tersebut. 

Ketika kata kunci sesuai atau ada pada list koleksi:


<img width="379" height="95" alt="image" src="https://github.com/user-attachments/assets/b8ac72cc-30f3-47bd-9f7f-82e853985f3e" />


Ketika kata kunci tidak ada pada list koleksi:


<img width="405" height="95" alt="image" src="https://github.com/user-attachments/assets/8e082e30-ae70-4002-b77e-f3576a6f1334" />


</details>

---

<details>
<summary><h3>6️⃣ Keluar Program</h3></summary>

Jika pengguna ingin keluar dari program, cukup memilih opsi 0 (Keluar) pada menu utama. Setelah dipilih, sistem akan menampilkan pesan “Terima kasih, program selesai.” sebagai tanda bahwa program sudah dihentikan. Bagian bawah layar juga menampilkan informasi dari Java, yaitu status BUILD SUCCESS yang berarti program berhasil dijalankan tanpa error, serta waktu total eksekusi program hingga selesai.


<img width="410" height="152" alt="image" src="https://github.com/user-attachments/assets/9a5dec09-afec-4a51-9d6a-a71e91d6aac4" />


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

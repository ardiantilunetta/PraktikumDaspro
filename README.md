Percobaan 1
1. Tidak melibatkan operator relasional karena dalam IF yang diperiksa adalah nilai boolean (true/false), sedangkan operator relasional digunakan ketika ada perbandingan data berupa nilai angka/kata/karakter
2. Ketika mengisikan nilai false, tidak ada ouput yang keluar, langsung mengakhiri program

Percobaan 2
1. Fungsi dari sintaks break adalah untuk menghentikan perintah dari kondisi/case tersebut
2. Default akan dijalankan ketika kondisi tidak sesuai dengan pilihan case yang ada, sehingga menjalankan perintah kondisi terakhir

Percobaan 3
1. Jika menjawab No, user diminta untuk menginputkan jumlah log bimbingan pembimbing 1 dan pembimbing 2, kemudian akan mencetak pesan "Gagal! Mahasiswa masih memiliki tanggungan kompen". sesuai dengan alur, program akan menjalankan perintah inputan terlebih dahulu kemudian memilih kondisi, karena yang dimasukkan adalah "No" tidak memenuhi syarat kondisi, sehingga program menjalankan perintah kondisi terakhir/else
2. if (bimbinganP1 >= 8 && bimbinganP2 >= 4){} -> apabila bimbingan pembimbing 1 sudah sebanyak 8 kali atau lebih dan bimbing pembimbing 2 sudah sebanyakan 4 kali atau lebih, maka akan menjalankan perintah kondisi tersebut jika kedua syarat telah terpenuhi
3. alur pemeriksaan dimulai dengan cek apakah mahasiswa sudah bebas kompen. jika belum maka dinyatakan gagal karena masih memiliki tanggungan. Jika sudah, dilanjutkan dengan pengecekan jumlah log bimbingan. Apabila bimbingan pembimbing 1 minimal 8 kali dan pembimbing 2 minimal 4 kali, mahasiswa dinyatakan lolos dan boleh mendaftar ujian skripsi. Jika keduanya kurang, maka gagal dengan alasan keduanya belum memenuhi syarat. Jika hanya pembimbing 1 yang kurang dari 8 kali, gagal dengan alasan pembimbing 1 belum mencapai 8 kali. Jika hanya pembimbing 2 yang kurang dari 4 kali, gagal dengan alasan pembimbing 2 belum mencapai 4 kali. Hasil akhir ditampilkan sesuai kondisi yang terjadi
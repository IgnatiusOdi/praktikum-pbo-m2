# praktikum-pbo-m2

## Praktikum PBO M2

### Materi

Buatlah program online shop sederhana dengan tampilan awal sebagai berikut:

```
Login Tukupedia
Username :
Password :
```

Program akan meminta username dan password. Apabila user mengisi “admin” pada username dan password, maka tampilkan menu admin Tukupedia. Apabila user mengisi username dan password yang terdaftar maka akan masuk ke Menu User Tukupedia. Jangan lupa beri pengecekan apabila username tidak terdaftar atau password salah.

Contoh username tidak terdaftar :

```
Login Tukupedia
Username :chen
Password :password
Username tidak terdaftar!
```

Contoh password salah :

```
Login Tukupedia
Username :jasong
Password :password
Password yang dimasukkan salah!
```

Menu Admin

```
Tukupedia
Hi Admin!
1.	Tambah Pembeli
2.	Tambah Penjual
3.	Tampilkan Semua User
4.	Exit
>>
```

Tambah Pembeli\
Saat menu ini dipilih program akan meminta user untuk mengisi username, password, nama, alamat. Berilah pengecekan apabila username sudah pernah dipakai sebelumnya (Username pembeli dan penjual). Jangan lupa untuk memberi pesan “Berhasil tambah pembeli” apabila memenuhi syarat. Apabila sudah berhasil menambahkan user, maka akan Kembali ke menu admin Tukupedia. Tampilan pada saat tambah pembeli adalah sebagai berikut:

```
Admin Tukupedia
Username : chen
Password : bruh
Nama : Christian Trisno Sen Long Chen
Alamat : Malibu Point 10880
Berhasil tambah pembeli!
```

Tambah Penjual\
Saat menu ini dipilih program akan meminta user untuk mengisi username, password, nama toko, nama penjual, alamat. Berilah pengecekan apabila username sudah pernah dipakai sebelumnya (Username pembeli dan penjual). Jangan lupa untuk memberi pesan “Berhasil tambah penjual” apabila memenuhi syarat. Apabila sudah berhasil menambahkan user, maka akan Kembali ke menu admin Tukupedia. Tampilan pada saat tambah pembeli adalah sebagai berikut:

```
Admin Tukupedia
Username : jasong
Password : pboitugaksusahkok
Nama Penjual : Jason Gerald S.
Nama Toko : Toko Mantan Surabaya
Alamat : Jalan jalan yuk No. 1
Berhasil tambah penjual!
```

Tampilkan Semua User\
Saat menu ini dipilih, tampilkan semua user (Pembeli dan Penjual) seperti contoh dibawah ini.
Format list adalah sebagai berikut Nama User – Username – Tipe User

```
Admin Tukupedia
-List User-
1. Christian Chen - chen - Pembeli
2. Jason Gerald S. - jasong - Penjual
```

Menu Pembeli\
Pada menu ini saat username dan password sudah terdaftar sebagai pembeli maka akan masuk ke menu Pembeli. Setiap kali suatu pembeli di daftarkan, saldo awal user adalah 100000. Tampilan menu pembeli adalah sebagai berikut.

```
Pembeli Tukupedia
Selamat datang Christian Trisno Sen Long Chen,
Saldo Anda: 100000
1.  Beli Barang
2.  Exit
>>
```

Beli Barang

```
Pembeli Tukupedia
List Barang Tukupedia
1.  Sabun Hotel - 2000
2.  Sabun Rumah - 1000
3.  Shampoo Hotel - 10000
4.  Shampoo Rumah - 5000
>> 2
Berhasil beli Sabun Rumah
Saldo Sekarang : 99000
```

Tampilkan list barang yang sedang dijual oleh Penjual Tukupedia. Pembeli diminta untuk menginputkan angka dalam list tersebut. Apabila barang tersebut dipilih, maka beri pengecekan apakah pembeli memiliki saldo yang cukup. Berilah pesan error apabila saldo tidak mencukupi. Apabila saldo cukup maka kurangilah saldo pembeli dan barang akan hilang dari list dan saldo penjual barang akan bertambah sesuai dengan harga barang.

Exit\
Apabila memilih menu ini maka kembalikan user ke menu login tukupedia.

Menu Penjual\
Pada menu ini saat username dan password sudah terdaftar sebagai penjual maka akan masuk ke menu Penjual. Setiap kali suatu pembeli di daftarkan, saldo awal user adalah 0. Tampilan menu pembeli adalah sebagai berikut.

```
Penjual Tukupedia
Selamat datang Jason Gerald S.,
Nama Toko : Toko Mantan Surabaya
Saldo Anda: 0
1.  Jual Barang
2.  Exit
>>
```

Jual barang\

```
Penjual Tukupedia
Masukkan nama barang : Sabun Rumah
Masukkan harga barang : 1000
Sabun Rumah berhasil ditambahkan!
```

Penjual diminta untuk menginputkan nama barang dan harga. Setelah penjual telah post barang, barang yang dijual akan masuk ke dalam list barang.

Exit\
Apabila memilih menu ini maka kembalikan user ke menu login tukupedia.

### Tugas

Buatlah game Warcraft Sederhana 😊

Pada awal permainan, Player diminta untuk menginputkan nama

Tampilan:

```
Input Player name: Chen
Welcome to Warcraft Chen!
PICK YOUR CLASS
1.	Warrior (Attacker)
2.	Warlock (Attacker)
3.	Paladin (Healer)
4.	Death Knight (Tank)
>>
```

Setelah menginputkan nama, player akan memilih dari 3 hero dengan class yang sudah disediakan. Masing-masing class memiliki skill yang berbeda-beda.

| Nama Class   | HP      | Attack | Mana | Defend | Skill       |
| ------------ | ------- | ------ | ---- | ------ | ----------- |
| Warrior      | 100-115 | 30-35  | 50   | 20%    | Attack Buff |
| Paladin      | 75-85   | 15-20  | 75   | 15%    | Heal        |
| Death Knight | 125-150 | 25-30  | 45   | 40%    | Defend Buff |
| Warlock      | 90-105  | 25-35  | 75   | 15%    | Lifesteal   |

Notes:

1. Sistem kerja suatu hero attack yaitu, jika hero Warrior attack hero Death Knight maka Jumlah HP berkurang = ATK warrior – (ATK warrior \* Defend Death Knight)
2. HP milik hero akan dirandom pada awal permainan game sesuai dengan table diatas
3. Range ATK milik hero sesuai dengan table diatas.

Setelah player sudah memilih class, maka tampilkan menu sebagai berikut

```
Welcome to Warcraft Chen!
Class Name: Warrior
Level : 1
Exp:0/100
1.	Fight with Bot
2.	Upgrade Status
3.	Change Class
4.	Cheat this Game!
5.	Exit
>>
```

Fight with BOT\
Apabila player memilih menu ini, maka player akan melawan hero milik BOT. Class hero milik BOT akan di random dan status dari bot akan dirandom sesuai class masing-masing kemudian status bot akan ditambahkan sebesar ketentuan di tabel dibawah ini.

| Level Player | HP     | Attack  | Mana     | Defend      |
| ------------ | ------ | ------- | -------- | ----------- |
| 1-5          | +5 HP  | +0 ATK  | +10 Mana | +1%-3% DEF  |
| 6-10         | +10 HP | +5 ATK  | +15 Mana | +4%-6% DEF  |
| 11-15        | +15 HP | +10 ATK | +20 Mana | +6%-7% DEF  |
| >15          | +20 HP | +15 ATK | +25 Mana | +8%+10% DEF |

Tampilan awal game

```
FIGHT WITH BOT
--------------
+++++++++++++++
Chen's Class: Warrior
Chen's HP: 50
Chen's Mana: 100
Chen's ATK: 30-35 (+0)
Chen's DEF: 20% (+0)
=================
Bot's Class: Death Knight
Bot's HP: 100
Bot's Mana: 45
Bot's ATK: 30-35 (+0)
Bot's DEF: 40% (+0)
---------------
Menu:
1.	Attack
2.	Skill
3.	Run Away
>>
```

Player pasti akan memulai turn awal dan dilanjutkan oleh bot apabila player sudah melakukan action(Attack/Skill). Player dapat memilih antara attack, skill, dan run away. Apabila player memilih attack, maka player akan menyerang bot sesuai dengan seperti notes yang sudah tertulis diatas (Jika hero Warrior attack hero Death Knight maka Jumlah HP berkurang = ATK warrior – (ATK warrior \* Defend Death Knight).

Cara kerja attack player & bot adalah random ATK (sesuai table) + Tambahan ATK (dari upgrade). Contoh jika class warrior, random (ATK + tambahan ATK) + 20% (ATK + tambahan ATK).

Jika player memilih skill, skill hero player akan aktif sesuai dengan class yang dimiliki hero. Setiap kali skill terpakai maka kurangi mana player sesuai dengan tabel. Effect skill dapat dilihat di tabel dibawah.

| Skill Name  | Effect                                                                 | Class        | Mana Cost |
| ----------- | ---------------------------------------------------------------------- | ------------ | --------- |
| Attack Buff | Menambah ATK hero sebanyak 20% dari ATK selama 2 turn kedepan          | Warrior      | 5         |
| Heal        | Heal hero berdasarkan 50% dari ATK hero                                | Paladin      | 10        |
| Defend      | Buff Menambah persen dari DEF hero sebanyak 1-5% selama 2 turn kedepan | Death Knight | 5         |
| Lifesteal   | ATK hero musuh sekaligus heal sebesar 30% dari ATK                     | Warlock      | 15        |

Setelah player memilih suatu action, berilah keterangan action player seperti contoh dibawah.

```
FIGHT WITH BOT
--------------
+++++++++++++++
Chen's Class: Warrior
Chen's HP: 50
Chen's Mana: 100
Chen's ATK: 30-35 (+0)
Chen's DEF: 20% (+0)
=================
Bot's Class: Death Knight
Bot's HP: 100
Bot's Mana: 45
Bot's ATK: 30-35 (+0)
Bot's DEF: 40% (+0)
---------------
Menu:
1.	Attack
2.	Skill
3.	Run Away
>> 1
Chen memilih Attack
HP Bot berkurang sebanyak 18!
Bot memilih Skill “Defend Buff”!
DEF bot bertambah sebesar 5 persen!
```

Setelah turn player, randomlah action (Attack/Skill) bot pastikan apabila bot melakukan action skill maka cek mana bot apakah cukup atau tidak. Permainan akan berakhir apabila player memilih untuk “Run Away” atau terdapat salah satu hero yang mati.

Jika player berhasil membunuh bot maka tambahkan exp sebesar (10-15) exp kemudian berilah pesan berapa banyak exp yang didapatkan oleh player. Saat exp player melebihi 100 maka user akan naik level dan mendapatkan 1 upgrade point. Kemudian kembalikan exp player menjadi 0/100, apabila terdapat sisa exp maka tambahkan ke dalam exp player. Jika player memilih untuk run away atau terbunuh oleh bot maka kurangilah exp sebesar 15% dari exp player sekarang. Berilah pesan juga untuk pengurangan exp player.

Upgrade Status\
Player dapat menambahkan status apabila terdapat upgrade point. Upgrade point di dapatkan apabila user naik level. Tampilkan menu upgrade status seperti dibawah ini.

```
UPGRADE STATUS
--------------
Chen's Level: 2
Chen's HP: 50
Chen's Mana: 100
Chen's ATK: 30-35 (+0)
Chen's DEF: 20% (+0)
Current Upgrade Point: 1
1.	Upgrade ATK
2.	Upgrade DEF
>>
```

Apabila player memilih untuk upgrade ATK maka ATK player akan bertambah menjadi (+1). Sama juga dengan upgrade DEF, DEF player akan bertambah 1 persen (+1). Berilah pengecekan dan pesan bila player memilih upgrade apabila tidak memiliki upgrade point karena setiap upgrade memerlukan 1 upgrade point.

Change Class\
Player dapat mengganti class apabila player memilih pilihan dari 1-3. Pilihan warrior pada change class tidak akan di tampilkan karena player sedang menggunakan class warrior. Apabila player mengganti class mereka, maka reset semua status player menjadi default (seperti di tabel) dan resetlah upgrade point sesuai dengan level player. Tampilan change class adalah sebagai berikut.

```
CHANGE YOUR CLASS
1.	Warlock (Attacker)
2.	Paladin (Healer)
3.	Death Knight (Tank)
4.	Cancel
>>
```

Cheat this Game!\
Saat player memilih menu ini maka tambahkan upgrade point secara gratis kepada player.

Exit\
Apabila user memilih menu ini maka kembalikan ke main menu awal.

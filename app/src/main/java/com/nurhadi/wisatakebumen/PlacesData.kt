package com.nurhadi.wisatakebumen

import java.util.*


object PlacesData {
    private val placeNames = arrayOf(
        arrayOf(
            "Benteng Van Der Wijck",
            "Benteng Van Der Wijck adalah benteng pertahanan Hindia Belanda yang dibangun pada abad ke 18." +
                    "Benteng ini terletak di kota Gombong, sekitar 20 km sebelah barat dari Ibukota kabupaten Kebumen, Jawa Tengah, " +
                    "7 km Barat Kota Karanganyar, atau 100 km dari Yogyakarta.\n" +
                    "\n" +
                    "Nama benteng ini diambil dari Van Der Wijck, yang kemungkinan nama komandan pada saat itu." +
                    "Nama benteng ini terpampang pada pintu sebelah kanan.\n" +
                    "\n" +
                    "Benteng ini kadang dihubungkan dengan nama Frans David Cochius (1787-1876), " +
                    "seorang Jenderal yang bertugas di daerah barat Bagelen yang namanya juga diabadikan menjadi nama Benteng Generaal Cochius. " +
                    "Benteng ini merupakan benteng persegi delapan satu-satunya di Indonesia.",
            "${R.drawable.benteng_vanderwijk}",
            "Gombong - Kebumen",
            "-7.599406, 109.517585"
        ),
        arrayOf(
            "Curug Wringin",
            "Air Terjun Wringin adalah air terjun dengan ketinggian sekira 20 meter yang terletak di lereng selatan " +
                    "Perbukitan Indrakila pada ketinggian 200 meter diatas permukaan air laut (mdpl). " +
                    "Air Terjun Wringin mempunyai daya tarik tersendiri, karena lingkungan masih betul-betul sangat alami di tengah hutan. " +
                    "Terlebih belum banyak orang yang mengunjungi air terjun. Udara di sekitarnya sejuk dan sepanjang jalan menuju ke sana " +
                    "terdapat area perkebunan yang asri. Banyak dijumpai lahan sawah warga yang sangat cantik. " +
                    "Air Terjun Wringin mengucur bebas dari ketinggian tebing dan kemudian jatuh membentuk kolam besar. " +
                    "Kolam yang oleh warga setempat menyebutnya Kedung itu kedalamnnya mencapai 7 meter dengan air yang tenang berwarna biru " +
                    "kehijauan. Tetapi kolam tersebut tidak diperbolehkan untuk berenang. " +
                    "Air Terjun Wringin merupakan bagian dari sungai Curugurang yang berasal dari Perbukitan Indrakila. " +
                    "Sungai ini akan bersatu dengan Sungai Tekung, salah satu anak Sungai Kedungbeners",
            "${R.drawable.curug_wringin}",
            "Karang Sambung - Kebumen",
            "-7.6000938,109.7364876"
        ),

        arrayOf(
            "Pantai Gebyuran",
            "Ingin merasakan bagaimana rasanya memiliki pantai pribadi? " +
                    "Kalau begitu, Pantai Gebyuran adalah pilihan yang tepat buatmu. Luas Pantai Gebyuran memang tidak seberapa, " +
                    "tapi lokasinya yang tersembunyi menjadikan pantai ini layaknya private beach, hehehe.\n" +
                    "Di sekitar pantai ini banyak terdapat tebing-tebing kapur yang menjulang yang pastinya akan membuatmu " +
                    "berdecak kagum dan kemudian bilang wow tanpa harus disuruh. Di tebing-tebing tersebut juga ada semacam goa kecil.",
            "${R.drawable.pantai_gebyuran}",
            "Ayah - Kebumen",
            "-7.7736251,109.4313058"
        ),

        arrayOf(
            "Bukit Pentulu Indah",
            "Bukit Pentulu Indah ini sangat terkenal dengan sunrisenya. Jadi teman-teman yang ingin menikmati sunrise, " +
                    "bisa datang subuh. Bahkan banyak yang sengaja camping atau bermalam di Bukit Pentulu Indah, hanya sekedar ingin " +
                    "menyaksikan terbitnya sang surya.\n" +
                    "Apalagi di Bukit Pentulu Indah ini fasilitasnya sudah lengkap. Dari WC sampai Gazebo yang cukup besar sudah ada." +
                    " Mau pasang tenda juga bisa. Nah, pemandangan dari atas Bukit Pentulu Indah sangat menakjubkan.\n" +
                    "Waktu saya ke sana, memang saya kurang beruntung, karena langit mendung. Hanya saya tetap menemukan keindahan lain. " +
                    "Kabut yang masih turun dengan paduan pemandangan, membuat suasana semakin eksotis",
            "${R.drawable.pentulu_indah}",
            "Karang Sambung - Kebumen",
            "-7.536021,109.6778421"
        ),

        arrayOf(
            "Pantai Laguna",
            "Pantai Lembupurwo tak jauh berbeda dengan pantai selatan lainnya di Kabupaten Kebumen yang memiliki pasir hitam. " +
                    "Namun ada hal yang unik di pantai yang berada di perbatasan Kabupaten Kebumen dengan Kabupaten Purworejo ini. " +
                    "Pantai ini memiliki sebuah Laguna, yakni telaga payau di dekat pantai yang dipisahkan oleh hutan cemara udang." +
                    " Laguna yang juga merupakan muara Sungai Wawar ini ditumbuhi pohon bakau dan pohon cemara yang rimbun serta hijau. " +
                    "Selain itu, Pantai Lembupurwo juga memiliki fenomena unik lainnya, yakni berupa Gumuk Pasir yang masih aktif dan sangat " +
                    "luas. Gumuk Pasir di pantai ini memiliki ketinggian yang jauh berbeda dengan pantai lainnya di Kebumen.\n" +
                    "\n" +
                    "Jika bisa dikelola dengan baik, gumuk pasir ini bisa dimanfaatkan sebagai wisata selancar pasir atau sandboarding. " +
                    "Dari atas gumuk pasir ini pula disediakan wahana flying fox dengan menyeberangi laguna menuju hutan cemara udang dan pantai. " +
                    "Pengunjung juga bisa menyeberang melalui jembatan bambu, sembari melihat tanaman mangrove yang subur di sepanjang laguna. " +
                    "Sedangkan hutan cemara udang di sepanjang pantai ini memberikan keteduhan bagi pengunjung setelah berpanas-panasan " +
                    "di bibir pantai. Warung-warung makanan pun ada di bawah pohon cemara, sehingga suasana sejuk dan dingin akan menemani " +
                    "waktu istirahat pengunjung",
            "${R.drawable.pantai_laguna}",
            "Mirit - Kebumen",
            "-7.8241744,109.7973203"
        ),

        arrayOf(
            "Arung Jeram Padegolan",
            "Bagi yang suka dengan kegiatan arung jeram pasti menyukai destinasi wisata yang satu ini. Arung Jeram Padegolan ini merupakan kegiatan yang menantang dan " +
                    "juga mengundang bahaya. Sehingga wisata ini cocok bagi mereka yang ingin merasakan pengalaman berbeda dan pemberani. Sungai Padegolan menjadi favorit para " +
                    "wisatawan karena rutenya yang beervariasi. Ada yang benar-benar menantang ada juga yang landai biasa.\n" +
                    "\n" +
                    "Jika ingin mencobanya bisa datang dengan rombongan untuk menikmati suasana yang sejuk. Arung Jeram Padegolan ini berada di Desa Sedang Dalem yang " +
                    "menjadi titik mulanya. Jarak yang ditemupuh hanya sekitar 7 km saja dan mencapai waduknya juga bisa degan perjalanan 2 jam dari Wonosobo atau Magelang.",
            "${R.drawable.aungjeram_pedegolan}",
            "Padureso & Prembun - Kebumen",
            "-7.6098165,109.7789534"
        ),
        arrayOf(
            "Pantai Lampon",
            "Pantai Lampon terletak di Desa Pasir, Kecamatan Ayah.\n" +
                    "\n" +
                    "Akses menuju ke Pantai Lampon juga masih terbilang sulit, sob. Kurang-lebih sama lah kayak dua pantai sebelumnya. " +
                    "Meski untuk menuju ke sini kamu harus mendaki gunung, lewati lembah, sungai mengalir indah ke samudera, " +
                    "namun semua perjuanganmu itu tak akan sia-sia, sob.\n" +
                    "Begitu kamu sampai di Pantai Lampon dan duduk di bawah pohon rindang sambil minum es kelapa yang segar, " +
                    "diterpa dengan sepoi angin dan menghirup wangi amis khas lautan, kamu akan langsung merasa perjalanan menuju ke sini nggak ada apa-apanya",
            "${R.drawable.pantai_lampon}",
            "Pasir - Kebumen",
            "-7.7699174,109.4339521"
        ),
        arrayOf(
            "Pantai Menganti",
            "Kalau berbicara soal pantai di Kebumen, rasa-rasanya kita harus memasukkan pantai Menganti di dalam daftarnya. " +
                    "Serius, pantai ini keren abis! Nggak cuma pantainya saja yang eksotis, tapi juga jalan menuju ke pantai ini, " +
                    "beuh, tiada duanya, sob. Nggak percaya? Makanya cobain~\n" +
                    "Lokasinya di Desa Karangduwur, Kecamatan Ayah, Kebumen. Di kecamatan Ayah saja, ada beberapa pantai yang sudah dibuka " +
                    "menjadi tempat wisata. Pantai di sini memang terkenal dengan pasir putih dan panorama perbukitan kapur atau " +
                    "tebing karst-nya yang menakjubkan.\n" +
                    "Di lokasi pantai menganti, kamu juga bisa berjalan-jalan ke Tebing Bidadari, Menara Mercusuar, " +
                    "ataupun Tanjung Karangbata.",
            "${R.drawable.pantai_menganti}",
            "Ayah - Kebumen",
            "-7.770341,109.4105348"
        ),

        arrayOf(
            "Wisata Alam Jembangan",
            "Apa yang ada di tempat wisata ini? Wisata alam Jembangan merupakan wisata terpadu yang memiliki 3 site utama dan bisa dinikmati oleh pengunjung. " +
                    "Pertama adalah telaga hijau yang bersisian dengan hutan dan masih begitu alami. Ada waduk pejengkolan dan jembatan gantung. Pengunjung bisa berkeliling " +
                    "dengan perahu air agar bisa menikmati keindahan telaga Jembangan dan memanjakan para wisatawan untuk menggunakan fasilitas seperti jembagnan Fasty Zoo dan lainnya.\n" +
                    "\n" +
                    "Wisata Alam Jembangan ini berada di sebelah timur laut kota Kebumen yang berjarak kurang lebih 20 km dari kota Kebumen. Ada berbagai satwa juga " +
                    "yang bisa menjadi wisata edukasi untuk anak-anak.",
            "${R.drawable.wisata_jembangan}",
            "Kutowinangun - Kebumen",
            "-7.6545755,109.7705308"
        ),
        arrayOf(
            "Goa Barat",
            "Gua ini merupakan salah satu primadona baru daya tarik wisata di Kebumen. Gua yang terletak di Dusun Palamarta Desa Jatijajar Kecamatan Ayah " +
                    "Kabupaten Kebumen menyimpan sejuta potensi yang layak untuk dikunjungi.\n" +
                    "Gua Barat dibuka untuk Pengunjung pada tahun 2012 sebagai alternatif wisata minat khusus di Kebumen. " +
                    "Untuk menuju ke lokasi Pengunjung dapat menggunakan kendaraan pribadi. Jaraknya sekitar 35 Km dari Alun-Alun Kota Kebumen. " +
                    "Menuju ke Gua Barat, mata akan dimanjakan pemandangan hamparan persawahan dan gugusan pegunungan karst di kiri dan kanan jalan.\n" +
                    "Kendaraan Pengunjung dapat diparkir di area parkir Gua Barat, sedangkan bus hanya dapat diparkir di area parkir Gua Jatijajar. " +
                    "Kemudian Pengunjung dapat melanjutkan perjalanan ke lokasi Sekretariat Pengelola Gua Barat dengan menggunakan " +
                    "mobil bak terbuka dengan jarak tempuh lebih kurang 1 Km. Setibanya di Sekretariat, Pengunjung akan diberi pengarahan singkat " +
                    "oleh Pemandu tentang keamanan susur gua, dan hal-hal yang tidak boleh dilakukan di dalam gua. " +
                    "Seperti menyentuh stalaktit atau stalagmit, karena dapat mengganggu proses sedimentasi.",
            "${R.drawable.goa_barat}",
            "Jatijajar - Kebumen",
            "-7.6654997,109.4359556"
        ),
        arrayOf(
            "pantai Sawangan",
            "Berbeda dengan destinasi-destinasi wisata pantai di Kebumen sebelumnya, Pantai Sawangan yang berada di Desa Karangduwur ini justru " +
                    "paling terkenal untuk dinikmati dari kejauhan, tepatnya dari atas puncak Bukit Sawangan.\n" +
                    "Dari atas bukit ini, Kita bisa memandangi indahnya pantai dari ketinggian dan panorama bentang Samudera Hindia " +
                    "yang mengagumkan! Ditambah dekorasi yang membuat tempat ini semakin instragramable, obyek wisata di Kebumen ini " +
                    "pas untuk Kita yang ingin berburu foto-foto liburan keren",
            "${R.drawable.pantai_sawangan}",
            "Karang Duwur - Kebumen",
            "-7.7575814,109.3949786"
        ),

        arrayOf(
            "Waduk Sempor",
            "Waduk sempor merupakan bendungan pada daerah Sungai Jatinegara atau disebut juga Sungai Sempor dan Sungai Cicingguling " +
                    "yang mengalir dari utara ke selatan di Pegunungan Serayu Selatan dan bermuara di Samudra Hindia. " +
                    "Waduk Sempor terletak 8 km disebelah utara kota Gombong. Waduk sempor berada di ketinggian kurang lebih 30 meter " +
                    "di atas permukaan air laut. " +
                    "Meskipun berada pada wilayah yang dekat dengan pantai, udara di Waduk Sempor tergolong sejuk karena berada pada lokasi " +
                    "perbukitan yang masih alami. " +
                    "Perbukitan di sekeliling Waduk Sempor diisi dengan ribuan pohon pinus. " +
                    "Pemandangan di Waduk Sempor didominasi oleh air di waduk dan pohon-pohon pinus di bukit. " +
                    "Waduk ini juga dapat digunakan sebagai tempat menikmati matahari terbit (sunrise). " +
                    "Pemandangan bebatuan dan suara gemericik air dapat dinikmati di sungai pada sekitaran waduk. " +
                    "Waduk Sempor telah dilengkapi dengan fasilitas untuk bersepeda dan berlar-lari santai untuk para wisatawan. " +
                    "Selain sebagai tempat wisata Waduk Sempor juga cocok digunakan sebagai tempat seminar, rapat kerja ataupun kegiatan " +
                    "sejenis lainnya karena suasana tempat yang tenang",
            "${R.drawable.waduk_sempor}",
            "Sempor - Kebumen",
            "-7.5660463,109.4897068"
        )
    )
        val listData: ArrayList<Place>
        get() {
            val list = ArrayList<Place>()
            for (position in placeNames) {
                val place = Place()
                place.name = position[0]
                place.detail = position[1]
                place.photo = position[2].toInt()
                place.location = position[3]
                place.geo = position[4]
                list.add(place)
            }
            return list
        }
}
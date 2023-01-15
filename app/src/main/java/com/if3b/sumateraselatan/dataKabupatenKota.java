package com.if3b.sumateraselatan;

import java.util.ArrayList;

public class dataKabupatenKota {
    public static String[][] data = new String[][]{
            {"Kabupaten Banyuasin", "Pangkalan Balai",  "Banyuasin adalah kabupaten di Provinsi Sumatra Selatan. Indonesia. Kabupaten ini merupakan pemekaran dari Kabupaten Musi Banyuasin yang terbentuk berdasarkan UU No. 6 Tahun 2002.", "https://aqjnews.com/wp-content/uploads/2022/05/1571046390047-banyuasin.jpg","-"},

            {"Kabupaten Empat Lawang", "Tebing Tinggi", "Empat Lawang adalah sebuah wilayah kabupaten di Provinsi Sumatra Selatan. Indonesia. Ibu kotanya adalah Tebing Tinggi. Kabupaten Empat Lawang diresmikan pada 20 April 2007.", "https://1.bp.blogspot.com/-FF7RPJxaZvw/T8ccsCOLsDI/AAAAAAAAQ1I/fiuLunqB7Z8/s1600/Kabupaten+Empat+Lawang.jpg","-"},

            {"Kabupaten Lahat", "Lahat", "Lahat adalah kabupaten di Provinsi Sumatra Selatan. Indonesia. Ibu kotanya adalah Kecamatan Lahat.", "https://2.bp.blogspot.com/-OY5mOHgFPBo/T8Q6Tl91DPI/AAAAAAAAQq4/1R1HE__B4kM/s1600/Kabupaten+Lahat+12.jpg","-"},

            {"Kabupaten Muara Enim", "Muara enim", "Muara Enim adalah sebuah kecamatan yang juga merupakan ibu kota dari Kabupaten Muara Enim. di Sumatra Selatan. Indonesia. Muara Enim berbatasan dengan Kabupaten Lahat.", "https://3.bp.blogspot.com/-pqkn0HRUrzA/T8gtvVGKjFI/AAAAAAAAQ2U/Gv0KcWnpYMc/s1600/kabupaten+muara+enim+3.jpg","-"},

            {"Kabupaten Musi Banyuasin", "Sekayu", "Musi Banyuasin adalah kabupaten di Provinsi Sumatra Selatan. Indonesia dan beribu kota di Sekayu.", "https://lh3.googleusercontent.com/-2uCpjE7SpTI/VXtHXimICuI/AAAAAAAAa5o/Y9CjLY4AP5g/s980/kantor-bupati-muba-6.jpg","-"},

            {"Kabupaten Musi Rawas", "Muara Beliti", "Musi Rawas adalah kabupaten di Provinsi Sumatra Selatan. Indonesia. Kabupaten ini beribu kota di Muara Beliti. sebelumnya beribu kota di Kota Lubuklinggau sebelum akhirnya mekar menjadi kota tersendiri pada 2005.", "https://lh3.googleusercontent.com/-qLdMxUirkOU/VXp52HbiMQI/AAAAAAAAa24/SSL9-1AWNjU/s900/kantor-bupati-musi-rawas-2.jpg","-"},

            {"Kabupaten Musi Rawas Utara", "Rupit", "Musi Rawas Utara adalah kabupaten di Sumatra Selatan. Indonesia. Kabupaten ini merupakan pemekaran dari Kabupaten Musi Rawas.Ibu kota kabupaten ini berada di Rupit dan berpenduduk 195.000 jiwa.", "https://cdn-2.tstatic.net/sumsel/foto/bank/images/kantor-bupati-musirawas-utara-muratara.jpg","-"},

            {"Kabupaten Ogan Ilir", "Indralaya", "Ogan Ilir adalah salah satu kabupaten di Provinsi Sumatra Selatan. Ogan Ilir berada di jalur lintas timur Sumatra dan pusat pemerintahannya terletak sekitar 35 km dari Kota Palembang. Kabupaten ini merupakan pemekaran dari Kabupaten Ogan Komering Ilir.", "https://1.bp.blogspot.com/-KYjekEYszLI/T8gzmTXDTGI/AAAAAAAAQ40/prFejak1lVg/s1600/Kabupaten+Ogan+Ilir+1.JPG","-"},

            {"Kabupaten Ogan Komering Ilir", "Kayu Agung", "Ogan Komering Ilir adalah sebuah wilayah kabupaten di Sumatra Selatan yang memiliki luas 19.023 km dan berpenduduk sekitar 731.721 jiwa. Ibu kotanya adalah Kecamatan Kayu Agung.", "https://cdn-2.tstatic.net/sumsel/foto/bank/images/kantor-bupati-ogan-komering-ilir.jpg","-"},

            {"Kabupaten Ogan Komering Ulu", "Baturaja", "Ogan Komering Ulu atau sering disingkat OKU adalah sebuah kabupaten yang berada di provinsi Sumatra Selatan Indonesia. Ibu kotanya adalah Baturaja. Kabupaten ini terkenal dengan wilayah dengan jumlah penduduk terbanyak Suku Ogan di Provinsi Sumatera Selatan.", "https://i0.wp.com/destinasipariwisata.com/wp-content/uploads/2019/04/Ogan-Komering-Ulu-Icon-e1560347166890.jpg?fit=916%2C645&ssl=1","-"},

            {"Kabupaten Ogan Komering Ulu Selatan", "Muaradua", "Ogan Komering Ulu Selatan adalah salah satu kabupaten yang berada di Provinsi Sumatra Selatan Indonesia. ibu kota kabupaten ini terletak di Kecamatan Muaradua. Kabupaten Ogan Komering Ulu Selatan merupakan hasil pemekaran dari wilayah Kabupaten Ogan Komering Ulu yang diresmikan dengan UU No.37 Tahun 2003 tanggal 18 Desember 2003.", "https://1.bp.blogspot.com/_rPqS8s4wUt8/TMpfmwuW7qI/AAAAAAAAACE/efGCN250eRg/s1600/25237989.jpg","-"},

            {"Kabupaten Ogan Komering Ulu Timur", "Martapura", "Ogan Komering Ulu Timur atau lebih dikenal dengan singkatan OKU Timur adalah salah satu kabupaten di Provinsi Sumatra Selatan. Ibu kotanya adalah Kecamatan Martapura. Ogan Komering Ulu Timur terbentuk sebagai pemekaran Kabupaten Ogan Komering Ulu.", "https://1.bp.blogspot.com/-sSBizXOlqYU/T8Q8Picl-wI/AAAAAAAAQsc/ugdWTOf5s38/s1600/Kabupaten+Ogan+Komering+Ulu+Timur+11.jpg","-"},

            {"Kabupaten Penukal Abab Lematang Ilir", "Talang Ubi", "Penukal Abab Lematang Ilir adalah salah satu kabupaten di provinsi Sumatra Selatan. Indonesia. Ibu kotanya adalah Talang Ubi.", "https://kabarpali.com/po-content/uploads/kantor_bupati_pali.jpg","-"},

            {"Kota Lubuk Linggau", "Lubuk Linggau", "Lubuk Linggau atau kota Silampari adalah kota di Sumatra Selatan. Indonesia. Kota ini memiliki luas 419.80 km dan dulunya kota ini merupakan bagian dari Kabupaten Musi Rawas yang dimekarkan pada tahun 2001.", "https://2.bp.blogspot.com/-Dd7a_dXZuuI/Tz221hXSRCI/AAAAAAAAQc0/2ldatLaJ_G0/s1600/kota+lubuk+linggau+2.jpg","-"},

            {"Kota Pagar Alam", "Pagar Alam", "Pagar Alam adalah salah satu kota di Provinsi Sumatra Selatan yang dibentuk berdasarkan Undang–Undang Nomor 8 Tahun 2001. sebelumnya kota Pagar Alam termasuk kota administratif dalam lingkungan Kabupaten Lahat.", "https://www.andalastourism.com/wp-content/uploads/2020/03/Tugu-Pagar-Alam-Kota-Bunga.jpg","-"},

            {"Kota Palembang", "Palembang", "Palembang adalah ibu kota provinsi Sumatra Selatan Indonesia. Kota dengan luas wilayah 400,61 kmini dihuni oleh lebih dari 1.6 juta penduduk pada tahun 2021.Kota Palembang juga kota terpadat dan terbesar kedua di Sumatra setelah Kota Medan.", "https://2.bp.blogspot.com/-X1zHahbuYO4/XslC9vpkpvI/AAAAAAAAAJI/Ugnb4dVBfUYhDuv4afgrWo6Zk848BuDoQCK4BGAYYCw/s1600/kota-palembang.jpg","-"},

            {"Kota Prabumulih", "Prabumulih", "Prabumulih adalah salah satu kota yang terletak di Provinsi Sumatra Selatan Indonesia. dengan luas daerah sebesar 434.46 km.","https://4.bp.blogspot.com/-uO6TO4InIPw/T0CYoSCcY_I/AAAAAAAAQkU/RGLkQ8xUhqk/s1600/Kota+Prabumulih+2.jpg","-"},


    };

    public static ArrayList<ModelData> ambilDataKabupaten(){
        ArrayList<ModelData> dataKabupatenKota = new ArrayList<>();

        for(String[] varData : data){
            ModelData modelData = new ModelData();

            modelData.setNamakabupaten(varData[0]); //Array Nama Kabupaten
            modelData.setNamakota(varData[2]); //Arrray Deskripsi
            modelData.setFoto(varData[3]);//Array Url Foto

            dataKabupatenKota.add(modelData);

        }
        return dataKabupatenKota;
    }

}


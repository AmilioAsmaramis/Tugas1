package resepmakanan.resepmakanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Resep> dataResep;
    private RecyclerView listResep;
    private ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep = (RecyclerView) findViewById(R.id.list_resep);

        adapter = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData() {
        dataResep = new ArrayList<>();

        dataResep.add(new Resep("Sega Goreng", "Sega Goreng maknyos",
                "<b>Bahan Dasar :</b><br>" +
                        "Blue Band  1 sdm <br>" +
                        "Telur 2 butir <br>" +
                        "Daun bawang, Potong 1 batang<br>" +
                        "Wortel, Potong dadu. Rebus sebentar 50 gr<br>" +
                        "Royco ayam 1 sdm” <br>" +
                        "Bawang merah, Iris tipis 5 butir” <br>" +
                        "Bawang putih, Cincang halus 3 siung <br>" +
                        "Kecap manis Bango 1/2 sdm” <br>" +
                        "lada 1/4 sdt<br>" +
                        "Gula 1/2 sdt<br>" +
                        "Kecap manis Bango 1/2 sdm <br>" +
                        "<br>" +

                         "<b>Langkah Pembuatan :</b><br>" +
                        "1 Panaskan Blue Band, tumis bawang putih dan bawang merah hingga harum dan matang.” <br>" +
                        "2 Masukkan sosis, masak sebentar. Tambahkan telur, masak hingga matang lalu tambahkan daun bawang.<br>" +
                        "3 Masukkan nasi putih, Royco, garam, lada, gula, dan kecap Bango. Masak hingga semua bumbu tercampur rata dengan nasi. Angkat dan sajikan dengan telur mata sapi.<br>"

                , "segagoreng"));

        dataResep.add(new Resep("sotoceker", "Cekernya bikin melek",
                "<b>Bahan Dasar :</b><br>" +
                        "1 kg ceker ayam, siangi kulitnya dan rebus sebentar<br>" +
                        "1 buah batang serai.<br>" +
                        "1 ruas jari lengkuas<br>" +
                        "1 ruas jari jahe<br>" +
                        "4 lembar daun jeruk<br>" +
                        "300 gram tauge<br>" +
                        "300 mie soun<br>" +
                        "2 lembar daun salam<br>" +
                        "2 batang daun bawang<br>" +
                        "garam secukupnya<br>" +
                        "<br>" +
                        "<b>Langkah Pembuatan :</b><br>" +
                        "1.Setelah ceker direbus sebentar, siapkan panci dan masukan air untuk merebus kembali ceker ayam tersebut.<br>" +
                        "2.Masukan daun salam, lengkuas, dan serai. Tunggu hingga air mendidih.<br>" +
                        "3.Sembari menunggu mendidih, anda bisa menyiapkan untuk menghaluskan beberapa bahan bumbu halus. Ada baiknya cara menghaluskannya dengan cara manual atau dengan teknik uleg agar aroma dari bumbu tersebut bisa keluar.<br>" +
                        "4.Siapkan wajan dan tumis bumbu halus hingga tercium aroma harus. Tambahkan duan jeruk dan jahe dan tunggu sampai semua bumbu meresap sempurna., Setelah semua bahan bumbu halus matang, masukan bahan tersebut ke dalam air rebusan ceker dan aduk sampai merata<br>" +
                        "5.Tunggu hingga matang dan siap dinikmati <br>"


                , "soto"));


    }
}

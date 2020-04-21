package com.example.recyclerview_danang;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMahasiswa = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> infoMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMahasiswa, namaMahasiswa, infoMahasiswa, kelasMahasiswa, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namaMahasiswa.add("Vino Sebastian");
        fotoMahasiswa.add("https://cdn.idntimes.com/content-images/post/20180130/2-70376ce884e0181935b39b9cf28291be_600x400.jpg");
        infoMahasiswa.add("Vino Giovanni Bastian yang lebih dikenal dengan Vino G. Bastian adalah seorang aktor berkebangsaan Indonesia." +
                " Vino adalah putra bungsu dari Bastian Tito, penulis cerita silat yang terkenal lewat seri Wiro Sableng. ");
        kelasMahasiswa.add("38");

        namaMahasiswa.add("Ryan S");
        fotoMahasiswa.add("data:image/jpeg;base64,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");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("25");

        namaMahasiswa.add("Michael Schofield");
        fotoMahasiswa.add("https://www.writeups.org/wp-content/uploads/Michael-Scofield-Prison-Break-Wentworth-Miller.jpg");
        infoMahasiswa.add("Michael J. Scofield adalah tokoh protagonis dalam serial televisi Prison Break yang diperankan " +
                "oleh Wentworth Miller. Tokoh ini pertama kali muncul dalam The Pilot sebagai seorang laki-laki yang merampok bank supaya " +
                "ia bisa masuk ke penjara di mana kakaknya, Lincoln Burrows (Dominic Purcell), sedang ditahan untuk menjalani hukuman mati." +
                " Premis cerita Prison Break berkisah seputar kakak-beradik ini dan bagaimana Michael berusaha untuk membuktikan bahwa Lincoln tidak bersalah. " +
                "Sebagai tokoh utama, Michael selalu muncul di setiap episode. Meski Lincoln dan Michael " +
                "adalah tokoh protagonis dalam serial ini, Michael lebih banyak ditampilkan daripada Lincoln, terutama pada tahun pertama dan ketiga.");
        kelasMahasiswa.add("35");

        namaMahasiswa.add("Luciana Zogbi");
        fotoMahasiswa.add("https://i1.sndcdn.com/artworks-000138560818-lsymsi-t500x500.jpg");
        infoMahasiswa.add("Dia adalah Luciana Zogbi. Wanita yang lahir di Sao Paulo, Brazil 27 Oktober 1994 ini adalah " +
                "gadis keturunan Lebanon-Brazil. Suaranya yang khas " +
                "menjadikan Zogbi sangat mudah untuk dikenali. Kegemarannya mengcover lagu-lagu " +
                "dari musisi kelas dunia, membuat namanya semakin dikenal di dunia maya.");
        kelasMahasiswa.add("24");


        prosesRecyclerViewAdapter();

    }
}

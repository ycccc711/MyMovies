package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ListView lvmovie;
    ArrayList<Movie> alMovie;
    MovieAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvmovie = findViewById(R.id.lvMovie);

        //arrayList
        alMovie = new ArrayList<>();

        //objects
        Movie mv1 = new Movie("The Avengers","2012","pg13","Action | Sci-Fi","15/11/2014","Golden Village - Bishan","Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army",1);
        Movie mv2 = new Movie("Planes","2013","pg","Animation | Comedy","15/5/2015","Cathay - AMK Hub","A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race",2);

        //add objects to arrayList
        alMovie.add(mv1);
        alMovie.add(mv2);

        //custom adapter
        caMovie = new MovieAdapter(MainActivity.this,R.layout.row,alMovie);

        //connect to listview
        lvmovie.setAdapter(caMovie);

        //on item click listener
        lvmovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, List_Movie.class);
                intent.putExtra("title", alMovie.get(position).getTitle());
                intent.putExtra("year", alMovie.get(position).getYear());
                intent.putExtra("rated", alMovie.get(position).getRated());
                intent.putExtra("genre", alMovie.get(position).getGenre());
                intent.putExtra("theatre", alMovie.get(position).getIn_theatre());
                intent.putExtra("description", alMovie.get(position).getDescription());
                //intent.putExtra("rating",alMovie.get(position).getRatings());
                startActivity(intent);
            }
        });
    }
}

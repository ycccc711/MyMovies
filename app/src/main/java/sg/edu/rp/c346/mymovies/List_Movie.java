package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class List_Movie extends AppCompatActivity {

    ImageView ivMovie;
    TextView title, year_genre,description,watch_on,theatre;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_movie);

        ivMovie = findViewById(R.id.imageViewMovie);
        title = findViewById(R.id.tvTitle);
        year_genre = findViewById(R.id.year_genre);
        description = findViewById(R.id.tvDescri);
        watch_on = findViewById(R.id.tvWatchOn);
        theatre = findViewById(R.id.tvThreatre);
        ratingBar = findViewById(R.id.ratingBar);

        //get intent
        Intent intent = getIntent();
        String titleMovie = intent.getStringExtra("title");
        String Year = intent.getStringExtra("year");
        String Genre = intent.getStringExtra("genre");
        String Rated = intent.getStringExtra("rated");
        String Description = intent.getStringExtra("description");
        String Watched_on = intent.getStringExtra("watch_on");
        String In_theatre = intent.getStringExtra("theatre");
        int ratings = intent.getIntExtra("ratings", -1);


        //rated
        if(Rated.equalsIgnoreCase("g") ){
            ivMovie.setImageResource(R.drawable.rating_g);
        }
        else if(Rated.equalsIgnoreCase("pg")){
            ivMovie.setImageResource(R.drawable.rating_pg);
        }
        else if(Rated.equalsIgnoreCase("pg13")){
            ivMovie.setImageResource(R.drawable.rating_pg13);
        }
        else if(Rated.equalsIgnoreCase("nc16")){
            ivMovie.setImageResource(R.drawable.rating_nc16);
        }
        else if(Rated.equalsIgnoreCase("m18")){
            ivMovie.setImageResource(R.drawable.rating_m18);
        }
        else{
            ivMovie.setImageResource(R.drawable.rating_r21);
        }

        //set text view
        title.setText(titleMovie);
        year_genre.setText(Year + " - " + Genre);
        description.setText(Description);
        watch_on.setText("Watch on: " +Watched_on);
        theatre.setText("In Theatre: "+In_theatre);
        ratingBar.setRating(ratings);
    }
}

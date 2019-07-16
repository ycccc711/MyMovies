package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Movie> movieList;

    public MovieAdapter(Context context, int resource,ArrayList<Movie> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvYear_genre = rowView.findViewById(R.id.tvYear);

        //to display image View
        ImageView ivMovie = rowView.findViewById(R.id.imageMovie);



        // Obtain the Android Version information based on the position
        Movie movieClass = movieList.get(position);

        // Set values to the TextView to display the corresponding information
        tvTitle.setText(movieClass.getTitle());
        tvYear_genre.setText(movieClass.getYear() + " - " + movieClass.getGenre());

        if(movieClass.getRated() == "g"){
            ivMovie.setImageResource(R.drawable.rating_g);
        }
        else if(movieClass.getRated() == "pg"){
            ivMovie.setImageResource(R.drawable.rating_pg);
        }
        else if(movieClass.getRated() == "pg13"){
            ivMovie.setImageResource(R.drawable.rating_pg13);
        }
        else if(movieClass.getRated() == "nc16"){
            ivMovie.setImageResource(R.drawable.rating_nc16);
        }
        else if(movieClass.getRated() == "m18"){
            ivMovie.setImageResource(R.drawable.rating_m18);
        }
        else{
            ivMovie.setImageResource(R.drawable.rating_r21);
        }
        return rowView;
    }
}

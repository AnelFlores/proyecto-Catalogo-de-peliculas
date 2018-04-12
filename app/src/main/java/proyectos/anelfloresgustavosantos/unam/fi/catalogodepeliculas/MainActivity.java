package proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.List;

import proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas.model.Album;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;
    private Album album;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar();

        initCollapsingToolbar();
    }
}

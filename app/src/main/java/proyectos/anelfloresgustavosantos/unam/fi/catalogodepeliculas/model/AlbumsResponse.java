package proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AlbumsResponse {
    @SerializedName("Album")
    @Expose
    private List<Album> albums;

    public List<Album>getAlbums(){   // el nombre de el json
        return albums;
    }
    public void setAlbums(List<Album>albums){
        this.albums =albums;
    }
}

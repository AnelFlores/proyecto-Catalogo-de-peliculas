package proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas.api;

import proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas.model.AlbumsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/albums/music.json")       // aqui ya va lo chido del link
    Call<AlbumsResponse> getAlbums();// aqui le cambiariamos por Movies o depende el json y tambien el AlbumsResponse
}

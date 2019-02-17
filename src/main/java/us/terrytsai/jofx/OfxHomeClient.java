package us.terrytsai.jofx;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import us.terrytsai.jofx.ofx.Institution;
import us.terrytsai.jofx.ofx.Institutionlist;

import java.util.List;

public interface OfxHomeClient {

    @GET("?all=true")
    Call<Institutionlist> all();

    @GET("?dump=true")
    Call<List<Institution>> dump();

    @GET
    Call<Institution> lookup(@Query("lookup") Integer id);

    @GET
    Call<Institutionlist> search(@Query("search") String term);
}

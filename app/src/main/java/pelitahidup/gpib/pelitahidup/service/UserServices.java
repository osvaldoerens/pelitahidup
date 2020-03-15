package pelitahidup.gpib.pelitahidup.service;


import pelitahidup.gpib.pelitahidup.model.User;
import pelitahidup.gpib.pelitahidup.model.UserList;
import pelitahidup.gpib.pelitahidup.model.Value;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserServices {

    //endpoint buat ambil atau retrieve(ambil data dari database) user kan cuma getUser($id)
    @POST("user/getUser")
    //berlaku untuk ambil satu data user
    Call<User> ambilDataUser();

    @POST("dataaktif/datapelkat/")
    //berlaku untuk ambil semua data user
    Call<UserList> ambilAllUser();

    //service untuk add ke database

    @POST("registrasi/registrasiLogin/")
    Call<User> tambahUser(@Body User user);

    @POST("registrasi/dataLogin/")
    Call<User> userLogin(@Body User user);

    @FormUrlEncoded
    @POST("user/update")
    Call<Value> ubahUser(  @Field("id_user") Integer id_user,
                           @Field("username") String username,
                           @Field("password") String password,
                           @Field("email") String email,
                           @Field("nomor_telepon") String nomor_telepon);

    @FormUrlEncoded
    @POST("user/delete")
    Call<Value> hapusUser(@Field("id_user") Integer id_user,
                           @Field("username") String username,
                           @Field("password") String password,
                           @Field("email") String email,
                           @Field("nomor_telepon") String nomor_telepon);

 }

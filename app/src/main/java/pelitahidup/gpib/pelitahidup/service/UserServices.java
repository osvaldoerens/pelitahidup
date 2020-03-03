package pelitahidup.gpib.pelitahidup.service;


import pelitahidup.gpib.pelitahidup.model.User;
import pelitahidup.gpib.pelitahidup.model.UserList;
import pelitahidup.gpib.pelitahidup.model.Value;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserServices {
    //endpoint buat ambil atau retrieve(ambil data dari database) user kan cuma getUser($id)
    @POST("user/getUser")
    //berlaku untuk ambil satu data user
    Call<User> ambilDataUser();

    @POST("user/getUser")
    //berlaku untuk ambil semua data user
    Call<UserList> ambilAllUser();

    //service untuk add ke database
    @FormUrlEncoded
    @POST("user/add")
    Call<Value> tambahUser(@Field("username") String username,
                           @Field("password") String password,
                           @Field("email") String email,
                           @Field("nomor_telepon") String nomor_telepon);

    @FormUrlEncoded
    @POST("user/update")
    Call<Value> ubahUser(@Field("username") String username,
                           @Field("password") String password,
                           @Field("email") String email,
                           @Field("nomor_telepon") String nomor_telepon);

    @FormUrlEncoded
    @POST("user/delete")
    Call<Value> hapusUser(@Field("username") String username,
                           @Field("password") String password,
                           @Field("email") String email,
                           @Field("nomor_telepon") String nomor_telepon);

 }

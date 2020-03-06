package pelitahidup.gpib.pelitahidup.model;

import android.support.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id_user")
    @Nullable
    @Expose
    private Integer id_user;

    @SerializedName("username")
    @Nullable
    @Expose
    private String username;

    @SerializedName("password")
    @Nullable
    @Expose
    private String password;

    @SerializedName("email")
    @Nullable
    @Expose
    private String email;

    @SerializedName("nomor_telepon")
    @Nullable
    @Expose
    private String nomor_telepon;


    @Nullable
    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(@Nullable Integer id_user) {
        this.id_user = id_user;
    }

    @Nullable
    public String getUsername() {
        return username;
    }

    public void setUsername(@Nullable String username) {
        this.username = username;
    }

    @Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(@Nullable String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public User(Integer id_user, String username, String email, String nomor_telepon){
        this.id_user = id_user;
        this.username = username;
        this.email = email;
        this.nomor_telepon = nomor_telepon;
    }

}

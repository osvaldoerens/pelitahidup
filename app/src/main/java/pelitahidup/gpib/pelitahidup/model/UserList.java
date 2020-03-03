package pelitahidup.gpib.pelitahidup.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserList {

    @SerializedName("user")
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}

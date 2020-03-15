package pelitahidup.gpib.pelitahidup.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pelitahidup.gpib.pelitahidup.R;
import pelitahidup.gpib.pelitahidup.model.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
    List<User> userList;

    public UserAdapter(List<User> userList){
        this.userList = userList;
        System.out.println("User List : "+userList.size());

    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
        private TextView txtUsername, txtEmail, txtNomorTelepon;

        public UserViewHolder(View itemView){
            super(itemView);
            txtUsername     = (TextView) itemView.findViewById(R.id.username);
            txtEmail     = (TextView) itemView.findViewById(R.id.email);
            txtNomorTelepon     = (TextView) itemView.findViewById(R.id.nomor_telepon);
        }
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_jemaat,parent, false);
        return new UserAdapter.UserViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final UserAdapter.UserViewHolder userViewHolder,final int i) {
        userViewHolder.txtUsername.setText(userList.get(i).getUsername());
        userViewHolder.txtEmail.setText(userList.get(i).getEmail());
        userViewHolder.txtNomorTelepon.setText(userList.get(i).getNomor_telepon());

    }

    @Override
    public int getItemCount() {
        return (userList != null) ? userList.size() : 0;
    }
}

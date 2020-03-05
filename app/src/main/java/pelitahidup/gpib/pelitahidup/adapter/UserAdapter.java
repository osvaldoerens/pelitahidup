package pelitahidup.gpib.pelitahidup.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import pelitahidup.gpib.pelitahidup.R;
import pelitahidup.gpib.pelitahidup.model.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    private ArrayList<User> dataList;

    public UserAdapter(ArrayList<User> dataList){
        this.dataList = dataList;

    }

    public class UserViewHolder extends RecyclerView.ViewHolder{

        private TextView txtIdUser, txtUsername, txtEmail, txtNomorTelepon;

        public UserViewHolder(View itemView){
            super(itemView);
            txtIdUser       = (TextView) itemView.findViewById(R.id.id_user);
            txtUsername     = (TextView) itemView.findViewById(R.id.username);
            txtEmail     = (TextView) itemView.findViewById(R.id.email);
            txtNomorTelepon     = (TextView) itemView.findViewById(R.id.nomor_telepon);
        }
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserViewHolder userViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}

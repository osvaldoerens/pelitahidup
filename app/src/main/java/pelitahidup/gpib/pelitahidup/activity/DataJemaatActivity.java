package pelitahidup.gpib.pelitahidup.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import pelitahidup.gpib.pelitahidup.R;
import pelitahidup.gpib.pelitahidup.adapter.UserAdapter;
import pelitahidup.gpib.pelitahidup.model.User;
import pelitahidup.gpib.pelitahidup.model.UserList;
import pelitahidup.gpib.pelitahidup.presenter.Presenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataJemaatActivity extends AppCompatActivity {

    private Presenter presenter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private UserAdapter userAdapter;
    private List<User> mUserList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_jemaat);

    }

    private void initList(){
        presenter = new Presenter();

        final Call<UserList> result = presenter.userService().ambilAllUser();
        result.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {
                System.out.println("Repsonse : "+ response.body().toString());

                if(response.body() != null || response.body().getUserList().isEmpty()){
                    mUserList = response.body().getUserList();

                    recyclerView = findViewById(R.id.recycler_view);
                    userAdapter = new UserAdapter(mUserList);
                    layoutManager = new LinearLayoutManager(DataJemaatActivity.this);
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(userAdapter);
                    userAdapter.notifyDataSetChanged();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Data Kosong", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                    Toast.makeText(getApplicationContext(), "Gagal Retrive Data",Toast.LENGTH_LONG).show();
                    System.out.println("Gagal : "+t.getMessage());
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();
        initList();
    }

}

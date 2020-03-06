package pelitahidup.gpib.pelitahidup.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ScrollView;

import java.util.ArrayList;

import pelitahidup.gpib.pelitahidup.R;
import pelitahidup.gpib.pelitahidup.adapter.UserAdapter;
import pelitahidup.gpib.pelitahidup.model.User;

public class DataJemaatActivity extends AppCompatActivity {

    Button btnCreate;
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private ArrayList<User> userArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_jemaat);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        userAdapter = new UserAdapter(userArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DataJemaatActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(userAdapter);
    }

    void addData() {
        userArrayList = new ArrayList<>();
        userArrayList.add(new User(1,"Osvaldo Erens", "osvaldoerens@rocketmail.com", "085213221587"));
        userArrayList.add(new User(2,"Adi Yulanto", "adi@gmail.com", "085213221587"));
        userArrayList.add(new User(3,"Abu Khoerul", "abu@yahoo.com", "085213221587"));
        userArrayList.add(new User(4,"Haikal Sumbawa", "haikal@mitracomm.com", "085213221587"));
        userArrayList.add(new User(5,"Hamim Suyuti", "hamim@gmail.com", "085213221587"));

    }
}

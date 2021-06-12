package com.example.sugar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class AddActivity extends AppCompatActivity {
    EditText name;
    EditText surname;
    EditText phone;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        phone = findViewById(R.id.phone);
        save = findViewById(R.id.save);

        save.setOnClickListener(v -> {
            User user = new User();
            user.setName(name.getText().toString());
            user.setPhone(phone.getText().toString());
            user.setSurname(surname.getText().toString());
            user.save();
            Toast.makeText(AddActivity.this, "Saved!" + user.getName(), Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
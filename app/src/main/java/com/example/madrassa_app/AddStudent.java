package com.example.madrassa_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class AddStudent extends AppCompatActivity {

    EditText name1, class1, age;
    Button btnSave;

    DbHelper db;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        name1 = findViewById(R.id.sname);
        class1 = findViewById(R.id.sclass);
        age = findViewById(R.id.sage);
        btnSave = findViewById(R.id.addstudent);

        db = new DbHelper(this);
       // listView = findViewById(R.id.list_view);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = name1.getText().toString();
                String clas = class1.getText().toString();
                String age1 = age.getText().toString();

                if (name.isEmpty() || clas.isEmpty() || age1.isEmpty()) {
                    //Toast.makeText(MainActivity.this, "Please enter valid data", Toast.LENGTH_SHORT).show();
                    //return;
                }
                Student student = new Student(name, clas, age1);
                db.insertStudent(student);
            }
        });
    }
}
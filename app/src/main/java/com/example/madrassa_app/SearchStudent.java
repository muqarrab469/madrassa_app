package com.example.madrassa_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class SearchStudent extends AppCompatActivity {

    EditText id;
    Button search;

    DbHelper DB;
    MyAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_student);
        id=findViewById(R.id.search);
        search=findViewById(R.id.searchstudent);

        DB =  new DbHelper(this);
        List<Student> students = DB.selectAllStudents();
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sid = Integer.parseInt(id.getText().toString());

            //    if (sid.isEmpty(){
              //      Toast.makeText(SearchStudent.this, "Please enter valid data", Toast.LENGTH_SHORT).show();
                //    return;
                //}
                recyclerView = findViewById(R.id.newlist);
                adapter = new MyAdapter((List<Student>) students.get(sid));
                recyclerView.setAdapter(adapter);
            }
        });


    }
}
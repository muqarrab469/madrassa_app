package com.example.madrassa_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.List;

public class ListStudent extends AppCompatActivity {
    DbHelper DB;
    MyAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_student);
        DB =  new DbHelper(this);
        List<Student> students = DB.selectAllStudents();

        recyclerView = findViewById(R.id.list);
        adapter = new MyAdapter(students);
        recyclerView.setAdapter(adapter);
    }
}
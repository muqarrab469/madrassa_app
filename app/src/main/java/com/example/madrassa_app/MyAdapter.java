package com.example.madrassa_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<Student> students;

    public MyAdapter(List<Student> students) {
        this.students = students;
    }


    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        holder.name.setText(String.valueOf(students.get(position).getName()));
        holder.class1.setText(String.valueOf(students.get(position).getClass1()));
        holder.age.setText(String.valueOf(students.get(position).getAge()));

    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView class1;
        private TextView age;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textname);
            class1 = itemView.findViewById(R.id.textClass);
            age = itemView.findViewById(R.id.textage);
        }

        public void bind(Student student) {
            name.setText(student.getName());
            class1.setText(student.getName());
            age.setText(student.getName());
        }
    }
}


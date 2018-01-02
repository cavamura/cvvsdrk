package com.example.cavamura.cvvsdrk;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class ActivityStudent extends AppCompatActivity {
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        Student st = new Student(getBaseContext());
        st.setC(getBaseContext());
        final Cursor cursorStudent = st.getStudents();

        String[] nomeCamposStudent = new String[] {"_id","canac","nome"};
        int[] idViewsStudent = new int[] {R.id.rowstudentid, R.id.rowstudentcanac,   R.id.rowstudentnome};

        SimpleCursorAdapter adaptadorstudent = new SimpleCursorAdapter(getBaseContext(),
                R.layout.rowstudent,
                cursorStudent,
                nomeCamposStudent,
                idViewsStudent);

        lista = (ListView)findViewById(R.id.listviewstudent);
        lista.setAdapter(adaptadorstudent);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int code;
                cursorStudent.moveToPosition(position);
                System.out.println("valor pego tela:" + position);
                code = cursorStudent.getInt(cursorStudent.getColumnIndexOrThrow("_id"));
                System.out.println("valor cursor:" + code);
                //Intent intent = new Intent(MainActivity.this, ActivityInsert.class);
                //intent.putExtra("code", code);
                //intent.putExtra("operation",2); //1=incluir, 2=alterar,deletar
                //startActivity(intent);
                EditText txtcanac = (EditText) findViewById(R.id.txtstudentcanac);
                EditText txtnome = (EditText) findViewById(R.id.txtstudentnome);
                txtcanac.setText(cursorStudent.getString(cursorStudent.getColumnIndexOrThrow("canac")));
                txtnome.setText(cursorStudent.getString(cursorStudent.getColumnIndexOrThrow("nome")));
            }
        });

        Button btncadastrarstudent = (Button)findViewById(R.id.btnstudentcadastrar);
        btncadastrarstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student st = new Student(getBaseContext());
                EditText txtcanac = (EditText) findViewById(R.id.txtstudentcanac);
                EditText txtnome = (EditText) findViewById(R.id.txtstudentnome);
                String canac = txtcanac.getText().toString();
                String nome = txtnome.getText().toString();
                st.setCanac(canac);
                st.setNome(nome);
                if(st.inserir()){
                    Toast.makeText(getApplicationContext(), "Student registred", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "An error ocorrued", Toast.LENGTH_LONG).show();
                }
                finish();
                startActivity(getIntent());
                //Intent intent = new Intent(ActivityInsert.this, MainActivity.class);
                //startActivity(intent);
                //finish();
            }
        });
        Button btnbuscarstudent = (Button)findViewById(R.id.btnstudentbuscar);
        btnbuscarstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtcanac = (EditText) findViewById(R.id.txtstudentcanac);
                EditText txtnome = (EditText) findViewById(R.id.txtstudentnome);
                //EditText txtid = (EditText) findViewById(R.id.txtstudentid);
                String canac = txtcanac.getText().toString();
                Student st = new Student(getBaseContext());
                if(st.getStudent(canac) != null){
                    txtnome.setText(st.getNome());
                    //txtid.setText(st.get_id());
                    Toast.makeText(getApplicationContext(), "Student registred", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "An error ocorrued", Toast.LENGTH_LONG).show();
                }
                //Intent intent = new Intent(ActivityInsert.this, MainActivity.class);
                //startActivity(intent);
                //finish();
            }
        });

        Button btnremoverstudent = (Button)findViewById(R.id.btnstudentremover);
        btnremoverstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtcanac = (EditText) findViewById(R.id.txtstudentcanac);
                //EditText txtid = (EditText) findViewById(R.id.txtstudentid);
                //int id = Integer.valueOf(txtid.getText().toString());
                String canac = txtcanac.getText().toString();
                Student st = new Student(getBaseContext());
                if(st.remover(canac)){
                    Toast.makeText(getApplicationContext(), "Student deleted", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "An error ocorrued", Toast.LENGTH_LONG).show();
                }
                finish();
                startActivity(getIntent());
                //Intent intent = new Intent(ActivityInsert.this, MainActivity.class);
                //startActivity(intent);
                //finish();
            }
        });

    }
}

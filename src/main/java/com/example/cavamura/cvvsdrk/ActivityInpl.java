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

public class ActivityInpl extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inpl);

        Inpl in = new Inpl(getBaseContext());
        in.setC(getBaseContext());
        final Cursor cursorInpl = in.getInpls();

        String[] nomeCamposInpl = new String[] {"_id","canac","nome"};
        int[] idViewsInpl = new int[] {R.id.rowinplid, R.id.rowinplcanac,   R.id.rowinplnome};

        SimpleCursorAdapter adaptadorinpl = new SimpleCursorAdapter(getBaseContext(),
                R.layout.rowinpl,
                cursorInpl,
                nomeCamposInpl,
                idViewsInpl);

        lista = (ListView)findViewById(R.id.listviewinpl);
        lista.setAdapter(adaptadorinpl);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int code;
                cursorInpl.moveToPosition(position);
                System.out.println("valor pego tela:" + position);
                code = cursorInpl.getInt(cursorInpl.getColumnIndexOrThrow("_id"));
                System.out.println("valor cursor:" + code);
                //Intent intent = new Intent(MainActivity.this, ActivityInsert.class);
                //intent.putExtra("code", code);
                //intent.putExtra("operation",2); //1=incluir, 2=alterar,deletar
                //startActivity(intent);
                EditText txtcanac = (EditText) findViewById(R.id.txtinplcanac);
                EditText txtnome = (EditText) findViewById(R.id.txtinplnome);
                txtcanac.setText(cursorInpl.getString(cursorInpl.getColumnIndexOrThrow("canac")));
                txtnome.setText(cursorInpl.getString(cursorInpl.getColumnIndexOrThrow("nome")));
            }
        });

        Button btncadastrarinpl = (Button)findViewById(R.id.btninplcadastrar);
        btncadastrarinpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Inpl in = new Inpl(getBaseContext());
                EditText txtcanac = (EditText) findViewById(R.id.txtinplcanac);
                EditText txtnome = (EditText) findViewById(R.id.txtinplnome);
                String canac = txtcanac.getText().toString();
                String nome = txtnome.getText().toString();
                in.setCanac(canac);
                in.setNome(nome);
                if(in.inserir()){
                    Toast.makeText(getApplicationContext(), "Inpl registred", Toast.LENGTH_LONG).show();
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

        Button btnbuscarinpl = (Button)findViewById(R.id.btninplbuscar);
        btnbuscarinpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtcanac = (EditText) findViewById(R.id.txtinplcanac);
                EditText txtnome = (EditText) findViewById(R.id.txtinplnome);
                //EditText txtid = (EditText) findViewById(R.id.txtinplid);
                String canac = txtcanac.getText().toString();
                Inpl in = new Inpl(getBaseContext());
                if(in.getInpl(canac) != null){
                    txtnome.setText(in.getNome());
                    //txtid.setText(String.valueOf(in.get_id()));
                    Toast.makeText(getApplicationContext(), "Inpl registred", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "An error ocorrued", Toast.LENGTH_LONG).show();
                }
                //Intent intent = new Intent(ActivityInsert.this, MainActivity.class);
                //startActivity(intent);
                //finish();
            }
        });

        Button btnremoverinpl = (Button)findViewById(R.id.btninplremover);
        btnremoverinpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtcanac = (EditText) findViewById(R.id.txtinplcanac);
                //EditText txtid = (EditText) findViewById(R.id.txtinplid);
                //int id = Integer.valueOf(txtid.getText().toString());
                String canac = txtcanac.getText().toString();
                Inpl in = new Inpl(getBaseContext());
                if(in.remover(canac)){
                    Toast.makeText(getApplicationContext(), "Inpl deleted", Toast.LENGTH_LONG).show();
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

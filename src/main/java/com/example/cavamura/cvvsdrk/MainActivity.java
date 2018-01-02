package com.example.cavamura.cvvsdrk;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.database.Cursor;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lista;
    private Intent intent;
    private Database banco;
    private SimpleCursorAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        banco = new Database(getBaseContext());
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ActivityInsert.class);
                intent.putExtra("operation",1); //1=incluir, 2=alterar, 3=deletar
                startActivity(intent);
                //finish();
            }
        });
        */

        Sheet s = new Sheet();
        s.setC(getBaseContext());

        final Cursor cursor = s.carregaDados();
        String[] nomeCampos = new String[] {Database.ID,Database.FLIGHTDATE,Database.STUDENT,Database.FLIGHTNUMBER, Database.LEVEL};
        int[] idViews = new int[] {R.id.rowidFlight,   R.id.rowflightDate, R.id.rowstudent, R.id.rowflightNumber, R.id.rowflightLevel};

        adaptador = new SimpleCursorAdapter(this,
                                                                R.layout.row,
                                                                cursor,
                                                                nomeCampos,
                                                                idViews);


        lista = (ListView)findViewById(R.id.listViewmain);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int code;
                cursor.moveToPosition(position);
                System.out.println("valor pego tela:" + position);
                code = cursor.getInt(cursor.getColumnIndexOrThrow(banco.ID));
                System.out.println("valor cursor:" + code);
                Intent intent = new Intent(MainActivity.this, ActivityInsert.class);
                intent.putExtra("code", code);
                intent.putExtra("operation",2); //1=incluir, 2=alterar,deletar
                //startActivity(intent);
                startActivityForResult(intent, 1);

             }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.mnuit1) {
            intent = new Intent(MainActivity.this, ActivityStudent.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.mnuit2) {
            intent = new Intent(MainActivity.this, ActivityInsert.class);
            intent.putExtra("operation",1); //1=incluir, 2=alterar, 3=deletar
            startActivity(intent);
            return true;
        }

        if (id == R.id.mnuit3) {
            intent = new Intent(MainActivity.this, ActivityInpl.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.mnuit3) {
            intent = new Intent(MainActivity.this, ActivityInpl.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.mnuit4) {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage(R.string.aboutmsg).setTitle(R.string.abouttit);
            AlertDialog dialog = builder.create();
            dialog.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //ESSE MÉTODO NAO ESTA SENDO UTILIZADO - SEM IMPACTO - FOI UMA DAS TENTATIVAS PARA DAR REFRESH NA ACTIVITY PRINCIPAL
        lista = (ListView)findViewById(R.id.listViewmain);
        adaptador.notifyDataSetChanged();
        //if (resultCode == MainActivity.this.RESULT_OK && requestCode == 1) {
            //String resposta = data.getStringExtra("resposta");
            //Toast.makeText(MainActivity.this,"Mensagem Recebida da SegundaActivity:\n" + resposta, Toast.LENGTH_LONG).show();
        //}
    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        finish();
        startActivity(getIntent());
    }



}

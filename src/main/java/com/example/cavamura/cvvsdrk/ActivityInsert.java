package com.example.cavamura.cvvsdrk;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityInsert extends AppCompatActivity {

    private Student student;
    private Inpl inpl;
    private Spinner spinner;
    private Intent i;


    private String strspinnerStudent;

    private String strtxtDate;

    private String strspinnerFlightNumber ;
    private String strspinnerLevel;
    private String strtxtTakeoff;

    private String strtxtLanding;

    private String strtxttime;
    private String strspinnerGlider;
    private String strspinnerInpl;
    private String strspinnerhabilityvalue01;
    private String strspinnerhabilityvalue02;
    private String strspinnerhabilityvalue03;
    private String strspinnerhabilityvalue04;
    private String strspinnerhabilityvalue05;
    private String strspinnerhabilityvalue06;
    private String strspinnerhabilityvalue07;
    private String strspinnerhabilityvalue08;
    private String strspinnerhabilityvalue09;
    private String strspinnerhabilityvalue10;
    private String strspinnerhabilityvalue11;
    private String strspinnerhabilityvalue12;
    private String strspinnerhabilityvalue13;
    private String strspinnerhabilityvalue14;
    private String strspinnerhabilityvalue15;
    private String strspinnerhabilityvalue16;
    private String strspinnerhabilityvalue17;
    private String strspinnerhabilityvalue18;
    private String strspinnerhabilityvalue19;
    private String strspinnerhabilityvalue20;
    private String strspinnerhabilityvalue21;
    private String strspinnerhabilityvalue22;
    private String strspinnerhabilityvalue23;
    private String strspinnerhabilityvalue24;
    private String strspinnerhabilityvalue25;
    private String strspinnerhabilityvalue26;
    private String strspinnerhabilityvalue27;
    private String strspinnerhabilityvalue28;
    private String strspinnerhabilityvalue29;
    private String strspinnerhabilityvalue30;
    private String strspinnerhabilityvalue31;
    private String strspinnerhabilityvalue32;
    private String strspinnerhabilityvalue33;
    private String strspinnerhabilityvalue34;
    private String strspinnerhabilityvalue35;
    private String strtxtc1;
    private String strtxtc2;
    private String strtxtc3;
    private String strtxtc4;
    private String strtxtc5;
    private String strtxtc6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Database banco = new Database(getBaseContext());
        i = getIntent();
        int operacao = i.getIntExtra("operation",0);
        final int codigo= i.getIntExtra("code",0);
        student = new Student(getBaseContext());
        inpl = new Inpl(getBaseContext());

        setContentView(R.layout.activity_insert);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, student.getTurmas());
        ArrayAdapter adapterInpls = new ArrayAdapter(this, android.R.layout.simple_spinner_item, inpl.getTurmas());


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterInpls.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapterFlightNumber = ArrayAdapter.createFromResource(this, R.array.spinnerFlightNumber, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapterLevel = ArrayAdapter.createFromResource(this, R.array.spinnerLevel, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapterGlider = ArrayAdapter.createFromResource(this, R.array.spinnerGlider, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapterInpl = ArrayAdapter.createFromResource(this, R.array.spinnerInpl, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapterHabilityValue = ArrayAdapter.createFromResource(this, R.array.spinnerhabilityvalue, android.R.layout.simple_spinner_item);

        Spinner spinnerStudent = (Spinner) findViewById(R.id.spinnerStudent);

        //EditText txtDate = (EditText) findViewById(R.id.txtDate);
        final DatePicker datDate = (DatePicker) findViewById(R.id.spinnerDate);




        Spinner spinnerFlightNumber = (Spinner) findViewById(R.id.spinnerFlightNumber);
        Spinner spinnerLevel = (Spinner) findViewById(R.id.spinnerLevel);


        //EditText txtTakeoff = (EditText) findViewById(R.id.txtTakeoff);

        final TimePicker tmptakeoff = (TimePicker) findViewById(R.id.tmpTakeoff);
        tmptakeoff.setIs24HourView(true);

        //EditText txtLanding = (EditText) findViewById(R.id.txtLanding);

        final TimePicker tmplanding = (TimePicker) findViewById(R.id.tmpLanding);
        tmplanding.setIs24HourView(true);



        EditText txttime = (EditText) findViewById(R.id.txttime);
        txttime.setEnabled(false);

        Spinner spinnerGlider = (Spinner) findViewById(R.id.spinnerGlider);
        Spinner spinnerInpl = (Spinner) findViewById(R.id.spinnerInpl);
        Spinner spinnerhabilityvalue01 = (Spinner) findViewById(R.id.spinnerhabilityvalue01);
        Spinner spinnerhabilityvalue02 = (Spinner) findViewById(R.id.spinnerhabilityvalue02);
        Spinner spinnerhabilityvalue03 = (Spinner) findViewById(R.id.spinnerhabilityvalue03);
        Spinner spinnerhabilityvalue04 = (Spinner) findViewById(R.id.spinnerhabilityvalue04);
        Spinner spinnerhabilityvalue05 = (Spinner) findViewById(R.id.spinnerhabilityvalue05);
        Spinner spinnerhabilityvalue06 = (Spinner) findViewById(R.id.spinnerhabilityvalue06);
        Spinner spinnerhabilityvalue07 = (Spinner) findViewById(R.id.spinnerhabilityvalue07);
        Spinner spinnerhabilityvalue08 = (Spinner) findViewById(R.id.spinnerhabilityvalue08);
        Spinner spinnerhabilityvalue09 = (Spinner) findViewById(R.id.spinnerhabilityvalue09);
        Spinner spinnerhabilityvalue10 = (Spinner) findViewById(R.id.spinnerhabilityvalue10);
        Spinner spinnerhabilityvalue11 = (Spinner) findViewById(R.id.spinnerhabilityvalue11);
        Spinner spinnerhabilityvalue12 = (Spinner) findViewById(R.id.spinnerhabilityvalue12);
        Spinner spinnerhabilityvalue13 = (Spinner) findViewById(R.id.spinnerhabilityvalue13);
        Spinner spinnerhabilityvalue14 = (Spinner) findViewById(R.id.spinnerhabilityvalue14);
        Spinner spinnerhabilityvalue15 = (Spinner) findViewById(R.id.spinnerhabilityvalue15);
        Spinner spinnerhabilityvalue16 = (Spinner) findViewById(R.id.spinnerhabilityvalue16);
        Spinner spinnerhabilityvalue17 = (Spinner) findViewById(R.id.spinnerhabilityvalue17);
        Spinner spinnerhabilityvalue18 = (Spinner) findViewById(R.id.spinnerhabilityvalue18);
        Spinner spinnerhabilityvalue19 = (Spinner) findViewById(R.id.spinnerhabilityvalue19);
        Spinner spinnerhabilityvalue20 = (Spinner) findViewById(R.id.spinnerhabilityvalue20);
        Spinner spinnerhabilityvalue21 = (Spinner) findViewById(R.id.spinnerhabilityvalue21);
        Spinner spinnerhabilityvalue22 = (Spinner) findViewById(R.id.spinnerhabilityvalue22);
        Spinner spinnerhabilityvalue23 = (Spinner) findViewById(R.id.spinnerhabilityvalue23);
        Spinner spinnerhabilityvalue24 = (Spinner) findViewById(R.id.spinnerhabilityvalue24);
        Spinner spinnerhabilityvalue25 = (Spinner) findViewById(R.id.spinnerhabilityvalue25);
        Spinner spinnerhabilityvalue26 = (Spinner) findViewById(R.id.spinnerhabilityvalue26);
        Spinner spinnerhabilityvalue27 = (Spinner) findViewById(R.id.spinnerhabilityvalue27);
        Spinner spinnerhabilityvalue28 = (Spinner) findViewById(R.id.spinnerhabilityvalue28);
        Spinner spinnerhabilityvalue29 = (Spinner) findViewById(R.id.spinnerhabilityvalue29);
        Spinner spinnerhabilityvalue30 = (Spinner) findViewById(R.id.spinnerhabilityvalue30);
        Spinner spinnerhabilityvalue31 = (Spinner) findViewById(R.id.spinnerhabilityvalue31);
        Spinner spinnerhabilityvalue32 = (Spinner) findViewById(R.id.spinnerhabilityvalue32);
        Spinner spinnerhabilityvalue33 = (Spinner) findViewById(R.id.spinnerhabilityvalue33);
        Spinner spinnerhabilityvalue34 = (Spinner) findViewById(R.id.spinnerhabilityvalue34);
        Spinner spinnerhabilityvalue35 = (Spinner) findViewById(R.id.spinnerhabilityvalue35);
        EditText txtc1 = (EditText) findViewById(R.id.txtc1);
        EditText txtc2 = (EditText) findViewById(R.id.txtc2);
        EditText txtc3 = (EditText) findViewById(R.id.txtc3);
        EditText txtc4 = (EditText) findViewById(R.id.txtc4);
        EditText txtc5 = (EditText) findViewById(R.id.txtc5);
        EditText txtc6 = (EditText) findViewById(R.id.txtc6);
        TextView lblid = (TextView) findViewById(R.id.lblTxtid);


        TextView lblhab01 = (TextView) findViewById(R.id.lblh01);
        TextView lblhab02 = (TextView) findViewById(R.id.lblh02);
        TextView lblhab03 = (TextView) findViewById(R.id.lblh03);
        TextView lblhab04 = (TextView) findViewById(R.id.lblh04);
        TextView lblhab05 = (TextView) findViewById(R.id.lblh05);
        TextView lblhab06 = (TextView) findViewById(R.id.lblh06);
        TextView lblhab07 = (TextView) findViewById(R.id.lblh07);
        lblhab01.setBackgroundColor(Color.parseColor("#00FF7F"));
        lblhab02.setBackgroundColor(Color.parseColor("#00FF7F"));
        lblhab03.setBackgroundColor(Color.parseColor("#00FF7F"));
        lblhab04.setBackgroundColor(Color.parseColor("#00FF7F"));
        lblhab05.setBackgroundColor(Color.parseColor("#00FF7F"));
        lblhab06.setBackgroundColor(Color.parseColor("#00FF7F"));
        lblhab07.setBackgroundColor(Color.parseColor("#00FF7F"));

        //EditText txtmsgimport = (EditText) findViewById(R.id.txtmsgimport);

        spinnerStudent.setAdapter(adapter);
        spinnerFlightNumber.setAdapter(adapterFlightNumber);
        spinnerLevel.setAdapter(adapterLevel);
        spinnerGlider.setAdapter(adapterGlider);
        spinnerInpl.setAdapter(adapterInpls);
        spinnerhabilityvalue01.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue02.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue03.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue04.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue05.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue06.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue07.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue08.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue09.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue10.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue11.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue12.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue13.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue14.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue15.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue16.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue17.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue18.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue19.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue20.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue21.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue22.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue23.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue24.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue25.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue26.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue27.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue28.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue29.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue30.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue31.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue32.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue33.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue34.setAdapter(adapterHabilityValue);
        spinnerhabilityvalue35.setAdapter(adapterHabilityValue);
        spinnerStudent.setEnabled(true);
        //final String canacaluno;
        Cursor cursor;
        if (operacao == 2){
            Sheet s = new Sheet();
            s.setC(getBaseContext());
            cursor = s.getSheet(codigo);
            //canacaluno = cursor.getString(cursor.getColumnIndexOrThrow("student"));
            lblid.setText(lblid.getText() + String.valueOf(codigo));
            this.setSpinner(adapter, cursor, banco, spinnerStudent,banco.STUDENT);
            spinnerStudent.setEnabled(false);
            this.setSpinner(adapterFlightNumber, cursor, banco, spinnerFlightNumber,banco.FLIGHTNUMBER);

            int dia = trataData(cursor.getString(cursor.getColumnIndexOrThrow(banco.FLIGHTDATE)),1);
            int mes = trataData(cursor.getString(cursor.getColumnIndexOrThrow(banco.FLIGHTDATE)),2);
            int ano = trataData(cursor.getString(cursor.getColumnIndexOrThrow(banco.FLIGHTDATE)),3);
            datDate.updateDate(ano, mes, dia);

            //txtDate.setText(cursor.getString(cursor.getColumnIndexOrThrow(banco.FLIGHTDATE)));

            this.setSpinner(adapterLevel, cursor, banco, spinnerLevel,banco.LEVEL);
            //txtTakeoff.setText(cursor.getString(cursor.getColumnIndexOrThrow(banco.TAKEOFF)));

            tmptakeoff.setCurrentHour(trataHoras(cursor.getString(cursor.getColumnIndexOrThrow(banco.TAKEOFF)),1));
            tmptakeoff.setCurrentMinute(trataHoras(cursor.getString(cursor.getColumnIndexOrThrow(banco.TAKEOFF)),2));

            tmplanding.setCurrentHour(trataHoras(cursor.getString(cursor.getColumnIndexOrThrow(banco.TAKEOFF)),1));
            tmplanding.setCurrentMinute(trataHoras(cursor.getString(cursor.getColumnIndexOrThrow(banco.LANDING)),2));


            //txtLanding.setText(cursor.getString(cursor.getColumnIndexOrThrow(banco.LANDING)));
            txttime.setText(cursor.getString(cursor.getColumnIndexOrThrow(banco.TIME)));
            this.setSpinner(adapterGlider, cursor, banco, spinnerGlider, banco.GLIDER);
            this.setSpinner(adapterInpl, cursor, banco, spinnerInpl, banco.INPL);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue01, banco.H11);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue02, banco.H12);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue03, banco.H13);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue04, banco.H14);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue05, banco.H15);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue06, banco.H16);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue07, banco.H17);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue08, banco.H21);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue09, banco.H22);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue10, banco.H23);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue11, banco.H24);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue12, banco.H31);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue13, banco.H32);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue14, banco.H33);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue15, banco.H34);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue16, banco.H35);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue17, banco.H36);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue18, banco.H37);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue19, banco.H41);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue20, banco.H42);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue21, banco.H43);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue22, banco.H44);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue23, banco.H51);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue24, banco.H52);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue25, banco.H53);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue26, banco.H54);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue27, banco.H61);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue28, banco.H62);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue29, banco.H63);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue30, banco.H64);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue31, banco.H71);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue32, banco.H72);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue33, banco.H81);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue34, banco.H82);
            this.setSpinner(adapterHabilityValue, cursor, banco, spinnerhabilityvalue35, banco.H83);
            txtc1.setText(cursor.getString(cursor.getColumnIndexOrThrow(banco.COMMENTF1)));
            txtc2.setText(cursor.getString(cursor.getColumnIndexOrThrow(banco.COMMENTF2)));
            txtc3.setText(cursor.getString(cursor.getColumnIndexOrThrow(banco.COMMENTF3)));
            txtc4.setText(cursor.getString(cursor.getColumnIndexOrThrow(banco.COMMENTF4)));
            txtc5.setText(cursor.getString(cursor.getColumnIndexOrThrow(banco.COMMENTF5)));
            txtc6.setText(cursor.getString(cursor.getColumnIndexOrThrow(banco.COMMENTF6)));
            //txtmsgimport.setText(cursor.getString(cursor.getColumnIndexOrThrow("import")));

        }

        Button botaocadastrar = (Button)findViewById(R.id.btncadastrar);
        botaocadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToVar();
                Sheet s = new Sheet();
                s.setC(getBaseContext());
                s.setStudent(strspinnerStudent);
                s.setFlightdate(strtxtDate);
                s.setLevel(strspinnerFlightNumber);
                s.setFlightnumber(strspinnerLevel);
                s.setTakeoff(strtxtTakeoff);
                s.setLanding(strtxtLanding);
                s.setTime(strtxttime);
                s.setGlider(strspinnerGlider);
                s.setInpl(strspinnerInpl);
                s.setH11(strspinnerhabilityvalue01);
                s.setH12(strspinnerhabilityvalue02);
                s.setH13(strspinnerhabilityvalue03);
                s.setH14(strspinnerhabilityvalue04);
                s.setH15(strspinnerhabilityvalue05);
                s.setH16(strspinnerhabilityvalue06);
                s.setH17(strspinnerhabilityvalue07);
                s.setH21(strspinnerhabilityvalue08);
                s.setH22(strspinnerhabilityvalue09);
                s.setH23(strspinnerhabilityvalue10);
                s.setH24(strspinnerhabilityvalue11);
                s.setH31(strspinnerhabilityvalue12);
                s.setH32(strspinnerhabilityvalue13);
                s.setH33(strspinnerhabilityvalue14);
                s.setH34(strspinnerhabilityvalue15);
                s.setH35(strspinnerhabilityvalue16);
                s.setH36(strspinnerhabilityvalue17);
                s.setH37(strspinnerhabilityvalue18);
                s.setH41(strspinnerhabilityvalue19);
                s.setH42(strspinnerhabilityvalue20);
                s.setH43(strspinnerhabilityvalue21);
                s.setH44(strspinnerhabilityvalue22);
                s.setH51(strspinnerhabilityvalue23);
                s.setH52(strspinnerhabilityvalue24);
                s.setH53(strspinnerhabilityvalue25);
                s.setH54(strspinnerhabilityvalue26);
                s.setH61(strspinnerhabilityvalue27);
                s.setH62(strspinnerhabilityvalue28);
                s.setH63(strspinnerhabilityvalue29);
                s.setH64(strspinnerhabilityvalue30);
                s.setH71(strspinnerhabilityvalue31);
                s.setH72(strspinnerhabilityvalue32);
                s.setH81(strspinnerhabilityvalue33);
                s.setH82(strspinnerhabilityvalue34);
                s.setH83(strspinnerhabilityvalue35);
                s.setCommentf1(strtxtc1);
                s.setCommentf2(strtxtc2);
                s.setCommentf3(strtxtc3);
                s.setCommentf4(strtxtc4);
                s.setCommentf5(strtxtc5);
                s.setCommentf6(strtxtc6);
                if(s.inserir()){
                    Toast.makeText(getApplicationContext(), "Flight registred", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "An error ocorrued", Toast.LENGTH_LONG).show();
                }
                //Intent intent = new Intent(ActivityInsert.this, MainActivity.class);
                //startActivity(intent);
                finish();
            }
        });

        Button botaoatualizar = (Button)findViewById(R.id.btnatualizar);
        botaoatualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToVar();
                Sheet s = new Sheet();
                s.setC(getBaseContext());
                s.setStudent(strspinnerStudent); //NAO ALTERA O ALUNO: PARA MUDAR O ALUNO EXCLUIR FICHA
                //s.setStudent(canacaluno); //NAO ALTERA O ALUNO: PARA MUDAR O ALUNO EXCLUIR FICHA
                s.setFlightdate(strtxtDate);
                s.setLevel(strspinnerLevel);
                s.setFlightnumber(strspinnerFlightNumber);
                s.setTakeoff(strtxtTakeoff);
                s.setLanding(strtxtLanding);
                s.setTime(strtxttime);
                s.setGlider(strspinnerGlider);
                s.setInpl(strspinnerInpl);
                s.setH11(strspinnerhabilityvalue01);
                s.setH12(strspinnerhabilityvalue02);
                s.setH13(strspinnerhabilityvalue03);
                s.setH14(strspinnerhabilityvalue04);
                s.setH15(strspinnerhabilityvalue05);
                s.setH16(strspinnerhabilityvalue06);
                s.setH17(strspinnerhabilityvalue07);
                s.setH21(strspinnerhabilityvalue08);
                s.setH22(strspinnerhabilityvalue09);
                s.setH23(strspinnerhabilityvalue10);
                s.setH24(strspinnerhabilityvalue11);
                s.setH31(strspinnerhabilityvalue12);
                s.setH32(strspinnerhabilityvalue13);
                s.setH33(strspinnerhabilityvalue14);
                s.setH34(strspinnerhabilityvalue15);
                s.setH35(strspinnerhabilityvalue16);
                s.setH36(strspinnerhabilityvalue17);
                s.setH37(strspinnerhabilityvalue18);
                s.setH41(strspinnerhabilityvalue19);
                s.setH42(strspinnerhabilityvalue20);
                s.setH43(strspinnerhabilityvalue21);
                s.setH44(strspinnerhabilityvalue22);
                s.setH51(strspinnerhabilityvalue23);
                s.setH52(strspinnerhabilityvalue24);
                s.setH53(strspinnerhabilityvalue25);
                s.setH54(strspinnerhabilityvalue26);
                s.setH61(strspinnerhabilityvalue27);
                s.setH62(strspinnerhabilityvalue28);
                s.setH63(strspinnerhabilityvalue29);
                s.setH64(strspinnerhabilityvalue30);
                s.setH71(strspinnerhabilityvalue31);
                s.setH72(strspinnerhabilityvalue32);
                s.setH81(strspinnerhabilityvalue33);
                s.setH82(strspinnerhabilityvalue34);
                s.setH83(strspinnerhabilityvalue35);
                s.setCommentf1(strtxtc1);
                s.setCommentf2(strtxtc2);
                s.setCommentf3(strtxtc3);
                s.setCommentf4(strtxtc4);
                s.setCommentf5(strtxtc5);
                s.setCommentf6(strtxtc6);
                if(s.alterar(codigo)){
                    Toast.makeText(getApplicationContext(), "Flight registred", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "An error ocorrued", Toast.LENGTH_LONG).show();
                }
                //Intent intent = new Intent(ActivityInsert.this, MainActivity.class);
                //startActivity(intent);
                finish();
            }
        });
        Button botaodeletar = (Button)findViewById(R.id.btndeletar);
        botaodeletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sheet s = new Sheet();
                s.setC(getBaseContext());
                if(s.remover(codigo)){
                    Toast.makeText(getApplicationContext(), "Flight registred", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "An error ocorrued", Toast.LENGTH_LONG).show();
                }
                //Intent intent = new Intent(ActivityInsert.this, MainActivity.class);
                //startActivity(intent);
                setResult(RESULT_OK);
                finish();
            }
        });

        Button botaoenviar = (Button)findViewById(R.id.btnenviar);
        botaoenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Sheet sh = new Sheet();
                    sh.setC(getBaseContext());
                    Sheet shenviar = new Sheet();
                    shenviar.setC(getBaseContext());
                    Cursor cursor = sh.getSheet(codigo);
                    if (cursor != null) {
                        cursor.moveToFirst();
                        shenviar.setId(cursor.getString(cursor.getColumnIndexOrThrow("_id")));
                        shenviar.setStudent(cursor.getString(cursor.getColumnIndexOrThrow("student")));
                        shenviar.setFlightdate(cursor.getString(cursor.getColumnIndexOrThrow("flightdate")));
                        shenviar.setLevel(cursor.getString(cursor.getColumnIndexOrThrow("level")));
                        shenviar.setFlightnumber(cursor.getString(cursor.getColumnIndexOrThrow("flightnumber")));
                        shenviar.setTakeoff(cursor.getString(cursor.getColumnIndexOrThrow("takeoff")));
                        shenviar.setLanding(cursor.getString(cursor.getColumnIndexOrThrow("landing")));
                        shenviar.setTime(cursor.getString(cursor.getColumnIndexOrThrow("time")));
                        shenviar.setGlider(cursor.getString(cursor.getColumnIndexOrThrow("glider")));
                        shenviar.setInpl(cursor.getString(cursor.getColumnIndexOrThrow("inpl")));
                        shenviar.setH11(cursor.getString(cursor.getColumnIndexOrThrow("h11")));
                        shenviar.setH12(cursor.getString(cursor.getColumnIndexOrThrow("h12")));
                        shenviar.setH13(cursor.getString(cursor.getColumnIndexOrThrow("h13")));
                        shenviar.setH14(cursor.getString(cursor.getColumnIndexOrThrow("h14")));
                        shenviar.setH15(cursor.getString(cursor.getColumnIndexOrThrow("h15")));
                        shenviar.setH16(cursor.getString(cursor.getColumnIndexOrThrow("h16")));
                        shenviar.setH17(cursor.getString(cursor.getColumnIndexOrThrow("h17")));
                        shenviar.setH21(cursor.getString(cursor.getColumnIndexOrThrow("h21")));
                        shenviar.setH22(cursor.getString(cursor.getColumnIndexOrThrow("h22")));
                        shenviar.setH23(cursor.getString(cursor.getColumnIndexOrThrow("h23")));
                        shenviar.setH24(cursor.getString(cursor.getColumnIndexOrThrow("h24")));
                        shenviar.setH31(cursor.getString(cursor.getColumnIndexOrThrow("h31")));
                        shenviar.setH32(cursor.getString(cursor.getColumnIndexOrThrow("h32")));
                        shenviar.setH33(cursor.getString(cursor.getColumnIndexOrThrow("h33")));
                        shenviar.setH34(cursor.getString(cursor.getColumnIndexOrThrow("h34")));
                        shenviar.setH35(cursor.getString(cursor.getColumnIndexOrThrow("h35")));
                        shenviar.setH36(cursor.getString(cursor.getColumnIndexOrThrow("h36")));
                        shenviar.setH37(cursor.getString(cursor.getColumnIndexOrThrow("h37")));
                        shenviar.setH41(cursor.getString(cursor.getColumnIndexOrThrow("h41")));
                        shenviar.setH42(cursor.getString(cursor.getColumnIndexOrThrow("h42")));
                        shenviar.setH43(cursor.getString(cursor.getColumnIndexOrThrow("h43")));
                        shenviar.setH44(cursor.getString(cursor.getColumnIndexOrThrow("h44")));
                        shenviar.setH51(cursor.getString(cursor.getColumnIndexOrThrow("h51")));
                        shenviar.setH52(cursor.getString(cursor.getColumnIndexOrThrow("h52")));
                        shenviar.setH53(cursor.getString(cursor.getColumnIndexOrThrow("h53")));
                        shenviar.setH54(cursor.getString(cursor.getColumnIndexOrThrow("h54")));
                        shenviar.setH61(cursor.getString(cursor.getColumnIndexOrThrow("h61")));
                        shenviar.setH62(cursor.getString(cursor.getColumnIndexOrThrow("h62")));
                        shenviar.setH63(cursor.getString(cursor.getColumnIndexOrThrow("h63")));
                        shenviar.setH64(cursor.getString(cursor.getColumnIndexOrThrow("h64")));
                        shenviar.setH71(cursor.getString(cursor.getColumnIndexOrThrow("h71")));
                        shenviar.setH72(cursor.getString(cursor.getColumnIndexOrThrow("h72")));
                        shenviar.setH81(cursor.getString(cursor.getColumnIndexOrThrow("h81")));
                        shenviar.setH82(cursor.getString(cursor.getColumnIndexOrThrow("h82")));
                        shenviar.setH83(cursor.getString(cursor.getColumnIndexOrThrow("h83")));
                        shenviar.setCommentf1(cursor.getString(cursor.getColumnIndexOrThrow("commentf1")));
                        shenviar.setCommentf2(cursor.getString(cursor.getColumnIndexOrThrow("commentf2")));
                        shenviar.setCommentf3(cursor.getString(cursor.getColumnIndexOrThrow("commentf3")));
                        shenviar.setCommentf4(cursor.getString(cursor.getColumnIndexOrThrow("commentf4")));
                        shenviar.setCommentf5(cursor.getString(cursor.getColumnIndexOrThrow("commentf5")));
                        shenviar.setCommentf6(cursor.getString(cursor.getColumnIndexOrThrow("commentf6")));
                        shenviar.setImportreg(cursor.getString(cursor.getColumnIndexOrThrow("import")));
                        SendAsyncTask sat = new SendAsyncTask();
                        sat.setC(getBaseContext());
                        sat.execute(shenviar);
                    } else {
                        Toast.makeText(getApplicationContext(), "É... não foi... erro", Toast.LENGTH_LONG).show();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
                //SheetJson sj = new SheetJson();
                //if(sj.sendJson()){
                    //Toast.makeText(getApplicationContext(), "flight sended", Toast.LENGTH_LONG).show();
                //}else{
                   // Toast.makeText(getApplicationContext(), "error in the send", Toast.LENGTH_LONG).show();
                //}
            }
        });

        tmplanding.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // Get the date
                //Toast.makeText(getApplicationContext(), "evento landing", Toast.LENGTH_LONG).show();
                EditText txtTime2 = (EditText) findViewById(R.id.txttime);
                txtTime2.setText(calcTime(tmptakeoff.getCurrentHour(),tmptakeoff.getCurrentMinute(), tmplanding.getCurrentHour(), tmplanding.getCurrentMinute()));

            }
        });

        tmptakeoff.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // Get the date
                //Toast.makeText(getApplicationContext(), "evento landing", Toast.LENGTH_LONG).show();
                EditText txtTime2 = (EditText) findViewById(R.id.txttime);
                txtTime2.setText(calcTime(tmptakeoff.getCurrentHour(),tmptakeoff.getCurrentMinute(), tmplanding.getCurrentHour(), tmplanding.getCurrentMinute()));

            }
        });

        spinnerLevel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                TextView lblhab01 = (TextView) findViewById(R.id.lblh01);
                TextView lblhab02 = (TextView) findViewById(R.id.lblh02);
                TextView lblhab03 = (TextView) findViewById(R.id.lblh03);
                TextView lblhab04 = (TextView) findViewById(R.id.lblh04);
                TextView lblhab05 = (TextView) findViewById(R.id.lblh05);
                TextView lblhab06 = (TextView) findViewById(R.id.lblh06);
                TextView lblhab07 = (TextView) findViewById(R.id.lblh07);
                TextView lblhab08 = (TextView) findViewById(R.id.lblh08);
                TextView lblhab09 = (TextView) findViewById(R.id.lblh09);
                TextView lblhab10 = (TextView) findViewById(R.id.lblh10);
                TextView lblhab11 = (TextView) findViewById(R.id.lblh11);
                TextView lblhab12 = (TextView) findViewById(R.id.lblh12);
                TextView lblhab13 = (TextView) findViewById(R.id.lblh13);
                TextView lblhab14 = (TextView) findViewById(R.id.lblh14);
                TextView lblhab15 = (TextView) findViewById(R.id.lblh15);
                TextView lblhab16 = (TextView) findViewById(R.id.lblh16);
                TextView lblhab17 = (TextView) findViewById(R.id.lblh17);
                TextView lblhab18 = (TextView) findViewById(R.id.lblh18);
                TextView lblhab19 = (TextView) findViewById(R.id.lblh19);
                TextView lblhab20 = (TextView) findViewById(R.id.lblh20);
                TextView lblhab21 = (TextView) findViewById(R.id.lblh21);
                TextView lblhab22 = (TextView) findViewById(R.id.lblh22);
                TextView lblhab23 = (TextView) findViewById(R.id.lblh23);
                TextView lblhab24 = (TextView) findViewById(R.id.lblh24);
                TextView lblhab25 = (TextView) findViewById(R.id.lblh25);
                TextView lblhab26 = (TextView) findViewById(R.id.lblh26);
                TextView lblhab27 = (TextView) findViewById(R.id.lblh27);
                TextView lblhab28 = (TextView) findViewById(R.id.lblh28);
                TextView lblhab29 = (TextView) findViewById(R.id.lblh29);
                TextView lblhab30 = (TextView) findViewById(R.id.lblh30);
                TextView lblhab31 = (TextView) findViewById(R.id.lblh31);
                TextView lblhab32 = (TextView) findViewById(R.id.lblh32);
                TextView lblhab33 = (TextView) findViewById(R.id.lblh33);
                TextView lblhab34 = (TextView) findViewById(R.id.lblh34);
                TextView lblhab35 = (TextView) findViewById(R.id.lblh35);




                switch (position){
                    case 0:
                        lblhab01.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab02.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab03.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab04.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab05.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab06.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab07.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab08.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab09.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab17.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab18.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab19.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab20.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab21.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab22.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab23.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab24.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab25.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab26.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab27.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab28.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab29.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab30.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab31.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab32.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab33.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab34.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab35.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                    case 1:
                        lblhab01.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab02.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab03.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab04.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab05.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab06.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab07.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab08.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab09.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab10.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab11.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab17.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab18.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab19.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab20.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab21.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab22.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab23.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab24.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab25.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab26.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab27.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab28.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab29.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab30.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab31.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab32.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab33.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab34.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab35.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                    case 2:
                        lblhab01.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab02.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab03.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab04.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab05.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab06.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab07.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab08.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab09.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab10.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab11.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab12.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab13.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab14.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab15.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab16.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab17.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab18.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab19.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab20.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab21.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab22.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab23.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab24.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab25.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab26.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab27.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab28.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab29.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab30.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab31.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab32.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab33.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab34.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab35.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                    case 3:
                        lblhab01.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab02.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab03.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab04.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab05.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab06.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab07.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab08.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab09.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab10.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab11.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab12.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab13.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab14.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab15.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab16.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab17.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab18.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab19.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab20.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab21.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab22.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab23.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab24.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab25.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab26.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab27.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab28.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab29.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab30.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab31.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab32.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab33.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab34.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab35.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                    case 4:
                        lblhab01.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab02.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab03.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab04.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab05.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab06.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab07.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab08.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab09.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab10.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab11.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab12.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab13.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab14.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab15.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab16.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab17.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab18.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab19.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab20.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab21.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab22.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab23.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab24.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab25.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab26.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab27.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab28.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab29.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab30.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab31.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab32.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab33.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab34.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab35.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                    case 5:
                        lblhab01.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab02.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab03.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab04.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab05.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab06.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab07.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab08.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab09.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab10.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab11.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab12.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab13.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab14.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab15.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab16.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab17.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab18.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab19.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab20.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab21.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab22.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab23.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab24.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab25.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab26.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab27.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab28.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab29.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab30.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab31.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab32.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab33.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab34.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab35.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                    case 6:
                        lblhab01.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab02.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab03.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab04.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab05.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab06.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab07.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab08.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab09.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab10.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab11.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab12.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab13.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab14.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab15.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab16.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab17.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab18.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab19.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab20.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab21.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab22.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab23.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab24.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab25.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab26.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab27.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab28.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab29.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab30.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab31.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab32.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab33.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab34.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        lblhab35.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                    case 7:
                        lblhab01.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab02.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab03.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab04.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab05.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab06.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab07.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab08.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab09.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab10.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab11.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab12.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab13.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab14.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab15.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab16.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab17.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab18.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab19.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab20.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab21.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab22.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab23.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab24.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab25.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab26.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab27.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab28.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab29.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab30.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab31.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab32.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab33.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab34.setBackgroundColor(Color.parseColor("#00FF7F"));
                        lblhab35.setBackgroundColor(Color.parseColor("#00FF7F"));
                        break;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        if(operacao == 1){
            botaocadastrar.setEnabled(true);
            botaoatualizar.setEnabled(false);
            botaodeletar.setEnabled(false);
            botaoenviar.setEnabled(false);
        }else{
            botaocadastrar.setEnabled(false);
            botaoatualizar.setEnabled(true);
            botaodeletar.setEnabled(true);
            botaoenviar.setEnabled(true);
        }
    }

    private void setSpinner(ArrayAdapter a, Cursor c, Database d, Spinner s, String field){
        String compareValue = c.getString(c.getColumnIndexOrThrow(field));
        int spinnerposicion = a.getPosition(compareValue);
        s.setSelection(spinnerposicion);
    }

    private void setValueToVar(){
        final Spinner spinnerStudent = (Spinner) findViewById(R.id.spinnerStudent);
        //final EditText txtDate = (EditText) findViewById(R.id.txtDate);
        final Spinner spinnerFlightNumber = (Spinner) findViewById(R.id.spinnerFlightNumber);
        final Spinner spinnerLevel = (Spinner) findViewById(R.id.spinnerLevel);
        //final EditText txtTakeoff = (EditText) findViewById(R.id.txtTakeoff);
        //final EditText txtLanding = (EditText) findViewById(R.id.txtLanding);
        final EditText txttime = (EditText) findViewById(R.id.txttime);
        final Spinner spinnerGlider = (Spinner) findViewById(R.id.spinnerGlider);
        final Spinner spinnerInpl = (Spinner) findViewById(R.id.spinnerInpl);
        final Spinner spinnerhabilityvalue01 = (Spinner) findViewById(R.id.spinnerhabilityvalue01);
        final Spinner spinnerhabilityvalue02 = (Spinner) findViewById(R.id.spinnerhabilityvalue02);
        final Spinner spinnerhabilityvalue03 = (Spinner) findViewById(R.id.spinnerhabilityvalue03);
        final Spinner spinnerhabilityvalue04 = (Spinner) findViewById(R.id.spinnerhabilityvalue04);
        final Spinner spinnerhabilityvalue05 = (Spinner) findViewById(R.id.spinnerhabilityvalue05);
        final Spinner spinnerhabilityvalue06 = (Spinner) findViewById(R.id.spinnerhabilityvalue06);
        final Spinner spinnerhabilityvalue07 = (Spinner) findViewById(R.id.spinnerhabilityvalue07);
        final Spinner spinnerhabilityvalue08 = (Spinner) findViewById(R.id.spinnerhabilityvalue08);
        final Spinner spinnerhabilityvalue09 = (Spinner) findViewById(R.id.spinnerhabilityvalue09);
        final Spinner spinnerhabilityvalue10 = (Spinner) findViewById(R.id.spinnerhabilityvalue10);
        final Spinner spinnerhabilityvalue11 = (Spinner) findViewById(R.id.spinnerhabilityvalue11);
        final Spinner spinnerhabilityvalue12 = (Spinner) findViewById(R.id.spinnerhabilityvalue12);
        final Spinner spinnerhabilityvalue13 = (Spinner) findViewById(R.id.spinnerhabilityvalue13);
        final Spinner spinnerhabilityvalue14 = (Spinner) findViewById(R.id.spinnerhabilityvalue14);
        final Spinner spinnerhabilityvalue15 = (Spinner) findViewById(R.id.spinnerhabilityvalue15);
        final Spinner spinnerhabilityvalue16 = (Spinner) findViewById(R.id.spinnerhabilityvalue16);
        final Spinner spinnerhabilityvalue17 = (Spinner) findViewById(R.id.spinnerhabilityvalue17);
        final Spinner spinnerhabilityvalue18 = (Spinner) findViewById(R.id.spinnerhabilityvalue18);
        final Spinner spinnerhabilityvalue19 = (Spinner) findViewById(R.id.spinnerhabilityvalue19);
        final Spinner spinnerhabilityvalue20 = (Spinner) findViewById(R.id.spinnerhabilityvalue20);
        final Spinner spinnerhabilityvalue21 = (Spinner) findViewById(R.id.spinnerhabilityvalue21);
        final Spinner spinnerhabilityvalue22 = (Spinner) findViewById(R.id.spinnerhabilityvalue22);
        final Spinner spinnerhabilityvalue23 = (Spinner) findViewById(R.id.spinnerhabilityvalue23);
        final Spinner spinnerhabilityvalue24 = (Spinner) findViewById(R.id.spinnerhabilityvalue24);
        final Spinner spinnerhabilityvalue25 = (Spinner) findViewById(R.id.spinnerhabilityvalue25);
        final Spinner spinnerhabilityvalue26 = (Spinner) findViewById(R.id.spinnerhabilityvalue26);
        final Spinner spinnerhabilityvalue27 = (Spinner) findViewById(R.id.spinnerhabilityvalue27);
        final Spinner spinnerhabilityvalue28 = (Spinner) findViewById(R.id.spinnerhabilityvalue28);
        final Spinner spinnerhabilityvalue29 = (Spinner) findViewById(R.id.spinnerhabilityvalue29);
        final Spinner spinnerhabilityvalue30 = (Spinner) findViewById(R.id.spinnerhabilityvalue30);
        final Spinner spinnerhabilityvalue31 = (Spinner) findViewById(R.id.spinnerhabilityvalue31);
        final Spinner spinnerhabilityvalue32 = (Spinner) findViewById(R.id.spinnerhabilityvalue32);
        final Spinner spinnerhabilityvalue33 = (Spinner) findViewById(R.id.spinnerhabilityvalue33);
        final Spinner spinnerhabilityvalue34 = (Spinner) findViewById(R.id.spinnerhabilityvalue34);
        final Spinner spinnerhabilityvalue35 = (Spinner) findViewById(R.id.spinnerhabilityvalue35);
        final EditText txtc1 = (EditText) findViewById(R.id.txtc1);
        final EditText txtc2 = (EditText) findViewById(R.id.txtc2);
        final EditText txtc3 = (EditText) findViewById(R.id.txtc3);
        final EditText txtc4 = (EditText) findViewById(R.id.txtc4);
        final EditText txtc5 = (EditText) findViewById(R.id.txtc5);
        final EditText txtc6 = (EditText) findViewById(R.id.txtc6);
        final TimePicker tmptakeoff = (TimePicker) findViewById(R.id.tmpTakeoff);
        final TimePicker tmplanding = (TimePicker) findViewById(R.id.tmpTakeoff);
        final DatePicker tmpdatDate = (DatePicker) findViewById(R.id.spinnerDate);

         strspinnerStudent = spinnerStudent.getSelectedItem().toString();


         String dia = String.format("%02d", new Object[] { tmpdatDate.getDayOfMonth() });
         String mes = String.format("%02d", new Object[] { tmpdatDate.getMonth() + 1 });
         String ano = String.valueOf(tmpdatDate.getYear());


         //strtxtDate = txtDate.getText().toString();
         strtxtDate = dia + "/" + mes + "/" + ano;


         strspinnerFlightNumber = spinnerFlightNumber.getSelectedItem().toString();
         strspinnerLevel = spinnerLevel.getSelectedItem().toString();
         //strtxtTakeoff = txtTakeoff.getText().toString();
         strtxtTakeoff = String.valueOf(tmptakeoff.getCurrentHour()) + ":" + String.valueOf(tmptakeoff.getCurrentMinute());
         //strtxtLanding = txtLanding.getText().toString();
         strtxtLanding = String.valueOf(tmptakeoff.getCurrentHour()) + ":" + String.valueOf(tmptakeoff.getCurrentMinute());
         strtxttime = txttime.getText().toString();
         strspinnerGlider = spinnerGlider.getSelectedItem().toString();
         strspinnerInpl = spinnerInpl.getSelectedItem().toString();
         strspinnerhabilityvalue01 = spinnerhabilityvalue01.getSelectedItem().toString();
         strspinnerhabilityvalue02 = spinnerhabilityvalue02.getSelectedItem().toString();
         strspinnerhabilityvalue03 = spinnerhabilityvalue03.getSelectedItem().toString();
         strspinnerhabilityvalue04 = spinnerhabilityvalue04.getSelectedItem().toString();
         strspinnerhabilityvalue05 = spinnerhabilityvalue05.getSelectedItem().toString();
         strspinnerhabilityvalue06 = spinnerhabilityvalue06.getSelectedItem().toString();
         strspinnerhabilityvalue07 = spinnerhabilityvalue07.getSelectedItem().toString();
         strspinnerhabilityvalue08 = spinnerhabilityvalue08.getSelectedItem().toString();
         strspinnerhabilityvalue09 = spinnerhabilityvalue09.getSelectedItem().toString();
         strspinnerhabilityvalue10 = spinnerhabilityvalue10.getSelectedItem().toString();
         strspinnerhabilityvalue11 = spinnerhabilityvalue11.getSelectedItem().toString();
         strspinnerhabilityvalue12 = spinnerhabilityvalue12.getSelectedItem().toString();
         strspinnerhabilityvalue13 = spinnerhabilityvalue13.getSelectedItem().toString();
         strspinnerhabilityvalue14 = spinnerhabilityvalue14.getSelectedItem().toString();
         strspinnerhabilityvalue15 = spinnerhabilityvalue15.getSelectedItem().toString();
         strspinnerhabilityvalue16 = spinnerhabilityvalue16.getSelectedItem().toString();
         strspinnerhabilityvalue17 = spinnerhabilityvalue17.getSelectedItem().toString();
         strspinnerhabilityvalue18 = spinnerhabilityvalue18.getSelectedItem().toString();
         strspinnerhabilityvalue19 = spinnerhabilityvalue19.getSelectedItem().toString();
         strspinnerhabilityvalue20 = spinnerhabilityvalue20.getSelectedItem().toString();
         strspinnerhabilityvalue21 = spinnerhabilityvalue21.getSelectedItem().toString();
         strspinnerhabilityvalue22 = spinnerhabilityvalue22.getSelectedItem().toString();
         strspinnerhabilityvalue23 = spinnerhabilityvalue23.getSelectedItem().toString();
         strspinnerhabilityvalue24 = spinnerhabilityvalue24.getSelectedItem().toString();
         strspinnerhabilityvalue25 = spinnerhabilityvalue25.getSelectedItem().toString();
         strspinnerhabilityvalue26 = spinnerhabilityvalue26.getSelectedItem().toString();
         strspinnerhabilityvalue27 = spinnerhabilityvalue27.getSelectedItem().toString();
         strspinnerhabilityvalue28 = spinnerhabilityvalue28.getSelectedItem().toString();
         strspinnerhabilityvalue29 = spinnerhabilityvalue29.getSelectedItem().toString();
         strspinnerhabilityvalue30 = spinnerhabilityvalue30.getSelectedItem().toString();
         strspinnerhabilityvalue31 = spinnerhabilityvalue31.getSelectedItem().toString();
         strspinnerhabilityvalue32 = spinnerhabilityvalue32.getSelectedItem().toString();
         strspinnerhabilityvalue33 = spinnerhabilityvalue33.getSelectedItem().toString();
         strspinnerhabilityvalue34 = spinnerhabilityvalue34.getSelectedItem().toString();
         strspinnerhabilityvalue35 = spinnerhabilityvalue35.getSelectedItem().toString();
         strtxtc1 = txtc1.getText().toString();
         strtxtc2 = txtc2.getText().toString();
         strtxtc3 = txtc3.getText().toString();
         strtxtc4 = txtc4.getText().toString();
         strtxtc5 = txtc5.getText().toString();
         strtxtc6 = txtc6.getText().toString();
    }

    private int trataHoras(String horabanco, int tipo){
        String[] partes = horabanco.split(":");
        if (tipo == 1){
            return Integer.valueOf(partes[0]);
        }else{
            return Integer.valueOf(partes[1]);
        }
    }

    private int trataData (String valor, int posicao){
        String[] partes = valor.split("/");
        switch (posicao){
            case 1:
                return Integer.valueOf(partes[0]);

            case 2:
                return Integer.valueOf(partes[1]);

            case 3:
                return Integer.valueOf(partes[2]);
            default:
                return 0;
        }
    }

    private String calcTime(int h1, int m1, int h2, int m2){
        try {
            int totalminutos = 0;
            int totalhoras = 0;
            int emprestimo = 0;
            totalminutos = m2 - m1;
            emprestimo = 0;
            if (totalminutos < 0) {
                totalminutos += 60;
                emprestimo = 1;
            }
            if (h1 > h2) {
                totalhoras = (24 - h1) + h2 - emprestimo;
            } else {
                totalhoras = h2 - h1 - emprestimo;
            }
            String horas = String.format("%02d", new Object[] { totalhoras });
            String minutos = String.format("%02d", new Object[] { totalminutos });
            String retorno = horas + ":" + minutos;
            return retorno;
        }catch(Exception e){
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "É... não foi... erro calculando o tempo de voo", Toast.LENGTH_LONG).show();
            return "00:00";
        }

    }

}

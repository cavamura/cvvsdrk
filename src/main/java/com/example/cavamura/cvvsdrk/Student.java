package com.example.cavamura.cvvsdrk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import java.util.ArrayList;
/**
 * Created by cavamura on 17/12/2017.
 */

public class Student {


    private int _id;
    private String canac;
    private String nome;
    private Database banco;
    private SQLiteDatabase db;
    private Context c;

    public Context getC() {
        return c;
    }

    public void setC(Context c) {
        this.c = c;
    }

    public Student() {
;
    }

    public Student(Context context) {
        banco = new Database(context);
        c = context;
    }

    public Student(String canac, String nome){
        this.canac = canac;
        this.nome = nome;
    }

    public String getCanac() {
        return canac;
    }

    public void setCanac(String canac) {
        this.canac = canac;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public Cursor getStudents(){
        Cursor cursor;
        String[] campos =  {"_id","canac","nome"};
        db = banco.getReadableDatabase();
        cursor = db.query("STUDENTS", campos, null, null, null, null, null, null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }


    public Student getStudent(String id){
        try{
        Cursor cursor;
        String[] campos =  {"_id","canac","nome"};
        String where = "canac = " + id;
        db = banco.getReadableDatabase();
        cursor = db.query("STUDENTS", campos, where, null, null, null, null, null);
        if(cursor!=null){
            cursor.moveToFirst();
            this.set_id(cursor.getInt(cursor.getColumnIndexOrThrow("_id")));
            this.setCanac(cursor.getString(cursor.getColumnIndexOrThrow("canac")));
            this.setNome(cursor.getString(cursor.getColumnIndexOrThrow("nome")));
            db.close();
            return this;
        }else{
            db.close();
            return null;
        }
        }catch(Exception e){
            return null;
        }
    }

    public ArrayList<String> getTurmas(){
        ArrayList<String> students = new ArrayList<String>();
        Cursor cursor = this.getStudents();
        if(cursor != null && cursor.moveToFirst()){
            do{
                String canac = cursor.getString(cursor.getColumnIndexOrThrow("canac"));
                String nome = cursor.getString(cursor.getColumnIndexOrThrow("nome"));
                Student s = new Student(canac, nome);
                students.add(canac);
            }while(cursor.moveToNext());
        }
        return students;
    }

    public boolean inserir() {
        try {
            if (banco == null) {
                banco = new Database(this.c); //create a new SQLiteOpenHelper object and pass a context
                // provide by activity (responsable object by connection)
            }
            if (db == null) {
                db = banco.getWritableDatabase(); //create a new SQLiteDatabase (responsable by sql
                // instructions)
            }
            ContentValues valores;
            long resultado;
            valores = new ContentValues();
            valores.put("canac", this.canac);
            valores.put("nome", this.nome);

            resultado = db.insert("students", null, valores);
            db.close();
            if (resultado == -1) {
                VVLogger.logSevereError("An error was generated when run insert processs");
                return false;
            }
            else{
                VVLogger.logInfo("A new student record was inserted");
                return true;
            }
        }catch(Exception e){
            VVLogger.logSevereError("An error was generated when run insert processs");
            return false;
        }
    }

    public boolean remover(String id){
        try {
            if (banco == null) {
                banco = new Database(this.c); //create a new SQLiteOpenHelper object and pass a context
                // provide by activity (responsable object by connection)
            }
            if (db == null) {
                db = banco.getWritableDatabase(); //create a new SQLiteDatabase (responsable by sql
                // instructions)
            }
            //String where = "_id =" + String.valueOf(id);
            String where = "canac =" + id;
            int resultado = db.delete("students",where,null);
            db.close();
            if (resultado == -1) {
                VVLogger.logSevereError("An error was generated when run delete processs");
                return false;
            }
            else{
                VVLogger.logInfo("A student record was deleted");
                return true;
            }
        }catch (Exception e){
            VVLogger.logSevereError("An error was generated when run delete processs");
            return false;
        }
    }


}

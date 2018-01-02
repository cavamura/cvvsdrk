package com.example.cavamura.cvvsdrk;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by cavamura on 25/12/2017.
 */

public class Sheet {

    private String tabela;
    private String id;
    private String student;
    private String flightdate;
    private String level;
    private String flightnumber;
    private String takeoff;
    private String landing;
    private String time;
    private String glider;
    private String inpl;
    private String h11;
    private String h12;
    private String h13;
    private String h14;
    private String h15;
    private String h16;
    private String h17;
    private String h21;
    private String h22;
    private String h23;
    private String h24;
    private String h31;
    private String h32;
    private String h33;
    private String h34;
    private String h35;
    private String h36;
    private String h37;
    private String h41;
    private String h42;
    private String h43;
    private String h44;
    private String h51;
    private String h52;
    private String h53;
    private String h54;
    private String h61;
    private String h62;
    private String h63;
    private String h64;
    private String h71;
    private String h72;
    private String h81;
    private String h82;
    private String h83;
    private String commentf1;
    private String commentf2;
    private String commentf3;
    private String commentf4;
    private String commentf5;
    private String commentf6;
    private String importreg;

    private SQLiteDatabase db;
    private Database banco;
    private Context c;

    public String getTabela() {
        return tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(String flightdate) {
        this.flightdate = flightdate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(String takeoff) {
        this.takeoff = takeoff;
    }

    public String getLanding() {
        return landing;
    }

    public void setLanding(String landing) {
        this.landing = landing;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGlider() {
        return glider;
    }

    public void setGlider(String glider) {
        this.glider = glider;
    }

    public String getInpl() {
        return inpl;
    }

    public void setInpl(String inpl) {
        this.inpl = inpl;
    }

    public String getH11() {
        return h11;
    }

    public void setH11(String h11) {
        this.h11 = h11;
    }

    public String getH12() {
        return h12;
    }

    public void setH12(String h12) {
        this.h12 = h12;
    }

    public String getH13() {
        return h13;
    }

    public void setH13(String h13) {
        this.h13 = h13;
    }

    public String getH14() {
        return h14;
    }

    public void setH14(String h14) {
        this.h14 = h14;
    }

    public String getH15() {
        return h15;
    }

    public void setH15(String h15) {
        this.h15 = h15;
    }

    public String getH16() {
        return h16;
    }

    public void setH16(String h16) {
        this.h16 = h16;
    }

    public String getH17() {
        return h17;
    }

    public void setH17(String h17) {
        this.h17 = h17;
    }

    public String getH21() {
        return h21;
    }

    public void setH21(String h21) {
        this.h21 = h21;
    }

    public String getH22() {
        return h22;
    }

    public void setH22(String h22) {
        this.h22 = h22;
    }

    public String getH23() {
        return h23;
    }

    public void setH23(String h23) {
        this.h23 = h23;
    }

    public String getH24() {
        return h24;
    }

    public void setH24(String h24) {
        this.h24 = h24;
    }

    public String getH31() {
        return h31;
    }

    public void setH31(String h31) {
        this.h31 = h31;
    }

    public String getH32() {
        return h32;
    }

    public void setH32(String h32) {
        this.h32 = h32;
    }

    public String getH33() {
        return h33;
    }

    public void setH33(String h33) {
        this.h33 = h33;
    }

    public String getH34() {
        return h34;
    }

    public void setH34(String h34) {
        this.h34 = h34;
    }

    public String getH35() {
        return h35;
    }

    public void setH35(String h35) {
        this.h35 = h35;
    }

    public String getH36() {
        return h36;
    }

    public void setH36(String h36) {
        this.h36 = h36;
    }

    public String getH37() {
        return h37;
    }

    public void setH37(String h37) {
        this.h37 = h37;
    }

    public String getH41() {
        return h41;
    }

    public void setH41(String h41) {
        this.h41 = h41;
    }

    public String getH42() {
        return h42;
    }

    public void setH42(String h42) {
        this.h42 = h42;
    }

    public String getH43() {
        return h43;
    }

    public void setH43(String h43) {
        this.h43 = h43;
    }

    public String getH44() {
        return h44;
    }

    public void setH44(String h44) {
        this.h44 = h44;
    }

    public String getH51() {
        return h51;
    }

    public void setH51(String h51) {
        this.h51 = h51;
    }

    public String getH52() {
        return h52;
    }

    public void setH52(String h52) {
        this.h52 = h52;
    }

    public String getH53() {
        return h53;
    }

    public void setH53(String h53) {
        this.h53 = h53;
    }

    public String getH54() {
        return h54;
    }

    public void setH54(String h54) {
        this.h54 = h54;
    }

    public String getH61() {
        return h61;
    }

    public void setH61(String h61) {
        this.h61 = h61;
    }

    public String getH62() {
        return h62;
    }

    public void setH62(String h62) {
        this.h62 = h62;
    }

    public String getH63() {
        return h63;
    }

    public void setH63(String h63) {
        this.h63 = h63;
    }

    public String getH64() {
        return h64;
    }

    public void setH64(String h64) {
        this.h64 = h64;
    }

    public String getH71() {
        return h71;
    }

    public void setH71(String h71) {
        this.h71 = h71;
    }

    public String getH72() {
        return h72;
    }

    public void setH72(String h72) {
        this.h72 = h72;
    }

    public String getH81() {
        return h81;
    }

    public void setH81(String h81) {
        this.h81 = h81;
    }

    public String getH82() {
        return h82;
    }

    public void setH82(String h82) {
        this.h82 = h82;
    }

    public String getH83() {
        return h83;
    }

    public void setH83(String h83) {
        this.h83 = h83;
    }

    public String getCommentf1() {
        return commentf1;
    }

    public void setCommentf1(String commentf1) {
        this.commentf1 = commentf1;
    }

    public String getCommentf2() {
        return commentf2;
    }

    public void setCommentf2(String commentf2) {
        this.commentf2 = commentf2;
    }

    public String getCommentf3() {
        return commentf3;
    }

    public void setCommentf3(String commentf3) {
        this.commentf3 = commentf3;
    }

    public String getCommentf4() {
        return commentf4;
    }

    public void setCommentf4(String commentf4) {
        this.commentf4 = commentf4;
    }

    public String getCommentf5() {
        return commentf5;
    }

    public void setCommentf5(String commentf5) {
        this.commentf5 = commentf5;
    }

    public String getCommentf6() {
        return commentf6;
    }

    public void setCommentf6(String commentf6) {
        this.commentf6 = commentf6;
    }

    public String getImportreg() {
        return importreg;
    }

    public void setImportreg(String importreg) {
        this.importreg = importreg;
    }

    public SQLiteDatabase getDb() {
        return db;
    }

    public void setDb(SQLiteDatabase db) {
        this.db = db;
    }

    public Database getBanco() {
        return banco;
    }

    public void setBanco(Database banco) {
        this.banco = banco;
    }

    public Context getC() {
        return c;
    }

    public void setC(Context c) {
        this.c = c;
    }

    public Sheet(){}

    public Sheet(String id,
                 String student,
                 String flightdate,
                 String level,
                 String flightnumber,
                 String takeoff,
                 String landing,
                 String time,
                 String glider,
                 String inpl,
                 String h11,
                 String h12,
                 String h13,
                 String h14,
                 String h15,
                 String h16,
                 String h17,
                 String h21,
                 String h22,
                 String h23,
                 String h24,
                 String h31,
                 String h32,
                 String h33,
                 String h34,
                 String h35,
                 String h36,
                 String h37,
                 String h41,
                 String h42,
                 String h43,
                 String h44,
                 String h51,
                 String h52,
                 String h53,
                 String h54,
                 String h61,
                 String h62,
                 String h63,
                 String h64,
                 String h71,
                 String h72,
                 String h81,
                 String h82,
                 String h83,
                 String commentf1,
                 String commentf2,
                 String commentf3,
                 String commentf4,
                 String commentf5,
                 String commentf6,
                 SQLiteDatabase db,
                 Database banco){

        this.id=id;
        this.student=student;
        this.flightdate=flightdate;
        this.level=level;
        this.flightnumber=flightnumber;
        this.takeoff=takeoff;
        this.landing=landing;
        this.time=time;
        this.glider=glider;
        this.inpl=inpl;
        this.h11=h11;
        this.h12=h12;
        this.h13=h13;
        this.h14=h14;
        this.h15=h15;
        this.h16=h16;
        this.h17=h17;
        this.h21=h21;
        this.h22=h22;
        this.h23=h23;
        this.h24=h24;
        this.h31=h31;
        this.h32=h32;
        this.h33=h33;
        this.h34=h34;
        this.h35=h35;
        this.h36=h36;
        this.h37=h37;
        this.h41=h41;
        this.h42=h42;
        this.h43=h43;
        this.h44=h44;
        this.h51=h51;
        this.h52=h52;
        this.h53=h53;
        this.h54=h54;
        this.h61=h61;
        this.h62=h62;
        this.h63=h63;
        this.h64=h64;
        this.h71=h71;
        this.h72=h72;
        this.h81=h81;
        this.h82=h82;
        this.h83=h83;
        this.commentf1=commentf1;
        this.commentf2=commentf2;
        this.commentf3=commentf3;
        this.commentf4=commentf4;
        this.commentf5=commentf5;
        this.commentf6=commentf6;
    }

    public Cursor carregaDados(){
        if (banco == null) {
            banco = new Database(this.c); //create a new SQLiteOpenHelper object and pass a context
            // provide by activity (responsable object by connection)
        }
        if (db == null) {
            db = banco.getWritableDatabase(); //create a new SQLiteDatabase (responsable by sql
            // instructions)
        }
        Cursor cursor;
        String[] campos =  {banco.ID, banco.FLIGHTDATE, banco.STUDENT,banco.FLIGHTNUMBER, banco.LEVEL};
        cursor = db.query(banco.TABELA, campos, null, null, null, null, null, null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public Cursor getSheet(int id){
        if (banco == null) {
            banco = new Database(this.c); //create a new SQLiteOpenHelper object and pass a context
            // provide by activity (responsable object by connection)
        }
        if (db == null) {
            db = banco.getWritableDatabase(); //create a new SQLiteDatabase (responsable by sql
            // instructions)

            //db = this.getC();
        }
        String where = banco.ID + "=" + id;
        Cursor cursor;
        String[] campos =  {banco.ID,
                banco.STUDENT,
                banco.FLIGHTNUMBER,
                banco.FLIGHTDATE,
                banco.LEVEL,
                banco.TAKEOFF,
                banco.LANDING,
                banco.TIME,
                banco.GLIDER,
                banco.INPL,
                banco.H11,
                banco.H12,
                banco.H13,
                banco.H14,
                banco.H15,
                banco.H16,
                banco.H17,
                banco.H21,
                banco.H22,
                banco.H23,
                banco.H24,
                banco.H31,
                banco.H32,
                banco.H33,
                banco.H34,
                banco.H35,
                banco.H36,
                banco.H37,
                banco.H41,
                banco.H42,
                banco.H43,
                banco.H44,
                banco.H51,
                banco.H52,
                banco.H53,
                banco.H54,
                banco.H61,
                banco.H62,
                banco.H63,
                banco.H64,
                banco.H71,
                banco.H72,
                banco.H81,
                banco.H82,
                banco.H83,
                banco.COMMENTF1,
                banco.COMMENTF2,
                banco.COMMENTF3,
                banco.COMMENTF4,
                banco.COMMENTF5,
                banco.COMMENTF6,
                "import"};
        cursor = db.query(banco.TABELA, campos, where, null, null, null, null, null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
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
            valores.put(Database.STUDENT, student);
            valores.put(Database.FLIGHTDATE, flightdate);
            valores.put(Database.LEVEL, level);
            valores.put(Database.FLIGHTNUMBER, flightnumber);
            valores.put(Database.TAKEOFF, takeoff);
            valores.put(Database.LANDING, landing);
            valores.put(Database.TIME, time);
            valores.put(Database.GLIDER, glider);
            valores.put(Database.INPL, inpl);
            valores.put(Database.H11, h11);
            valores.put(Database.H12, h12);
            valores.put(Database.H13, h13);
            valores.put(Database.H14, h14);
            valores.put(Database.H15, h15);
            valores.put(Database.H16, h16);
            valores.put(Database.H17, h17);
            valores.put(Database.H21, h21);
            valores.put(Database.H22, h22);
            valores.put(Database.H23, h23);
            valores.put(Database.H24, h24);
            valores.put(Database.H31, h31);
            valores.put(Database.H32, h32);
            valores.put(Database.H33, h33);
            valores.put(Database.H34, h34);
            valores.put(Database.H35, h35);
            valores.put(Database.H36, h36);
            valores.put(Database.H37, h37);
            valores.put(Database.H41, h41);
            valores.put(Database.H42, h42);
            valores.put(Database.H43, h43);
            valores.put(Database.H44, h44);
            valores.put(Database.H51, h51);
            valores.put(Database.H52, h52);
            valores.put(Database.H53, h53);
            valores.put(Database.H54, h54);
            valores.put(Database.H61, h61);
            valores.put(Database.H62, h62);
            valores.put(Database.H63, h63);
            valores.put(Database.H64, h64);
            valores.put(Database.H71, h71);
            valores.put(Database.H72, h72);
            valores.put(Database.H81, h81);
            valores.put(Database.H82, h82);
            valores.put(Database.H83, h83);
            valores.put(Database.COMMENTF1, commentf1);
            valores.put(Database.COMMENTF2, commentf2);
            valores.put(Database.COMMENTF3, commentf3);
            valores.put(Database.COMMENTF4, commentf4);
            valores.put(Database.COMMENTF5, commentf5);
            valores.put(Database.COMMENTF6, commentf6);
            resultado = db.insert(Database.TABELA, null, valores);
            db.close();
            if (resultado == -1) {
                VVLogger.logSevereError("An error was generated when run insert processs");
                return false;
            }
            else{
                VVLogger.logInfo("A new flight record was inserted");
                return true;
            }
        }catch(Exception e){
            VVLogger.logSevereError("An error was generated when run insert processs");
            return false;
        }
    }

    public boolean alterar(int id){
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
            String where;
            where = Database.ID + "=" + String.valueOf(id);
            valores = new ContentValues();
            valores.put(Database.STUDENT, student);
            valores.put(Database.FLIGHTDATE, flightdate);
            valores.put(Database.LEVEL, level);
            valores.put(Database.FLIGHTNUMBER, flightnumber);
            valores.put(Database.TAKEOFF, takeoff);
            valores.put(Database.LANDING, landing);
            valores.put(Database.TIME, time);
            valores.put(Database.GLIDER, glider);
            valores.put(Database.INPL, inpl);
            valores.put(Database.H11, h11);
            valores.put(Database.H12, h12);
            valores.put(Database.H13, h13);
            valores.put(Database.H14, h14);
            valores.put(Database.H15, h15);
            valores.put(Database.H16, h16);
            valores.put(Database.H17, h17);
            valores.put(Database.H21, h21);
            valores.put(Database.H22, h22);
            valores.put(Database.H23, h23);
            valores.put(Database.H24, h24);
            valores.put(Database.H31, h31);
            valores.put(Database.H32, h32);
            valores.put(Database.H33, h33);
            valores.put(Database.H34, h34);
            valores.put(Database.H35, h35);
            valores.put(Database.H36, h36);
            valores.put(Database.H37, h37);
            valores.put(Database.H41, h41);
            valores.put(Database.H42, h42);
            valores.put(Database.H43, h43);
            valores.put(Database.H44, h44);
            valores.put(Database.H51, h51);
            valores.put(Database.H52, h52);
            valores.put(Database.H53, h53);
            valores.put(Database.H54, h54);
            valores.put(Database.H61, h61);
            valores.put(Database.H62, h62);
            valores.put(Database.H63, h63);
            valores.put(Database.H64, h64);
            valores.put(Database.H71, h71);
            valores.put(Database.H72, h72);
            valores.put(Database.H81, h81);
            valores.put(Database.H82, h82);
            valores.put(Database.H83, h83);
            valores.put(Database.COMMENTF1, commentf1);
            valores.put(Database.COMMENTF2, commentf2);
            valores.put(Database.COMMENTF3, commentf3);
            valores.put(Database.COMMENTF4, commentf4);
            valores.put(Database.COMMENTF5, commentf5);
            valores.put(Database.COMMENTF6, commentf6);
            int resultado = db.update(Database.TABELA, valores, where, null);
            db.close();
            if (resultado == -1) {
                VVLogger.logSevereError("An error was generated when run update processs");
                return false;
            }
            else{
                VVLogger.logInfo("A flight record was updated");
                return true;
            }
        }catch (Exception e){
            VVLogger.logSevereError("An error was generated when run update processs");
            return false;
        }
    }

    public boolean remover(int id){
        try {
            if (banco == null) {
                banco = new Database(this.c); //create a new SQLiteOpenHelper object and pass a context
                // provide by activity (responsable object by connection)
            }
            if (db == null) {
                db = banco.getWritableDatabase(); //create a new SQLiteDatabase (responsable by sql
                // instructions)
            }
            String where = Database.ID + "=" + String.valueOf(id);
            int resultado = db.delete(Database.TABELA,where,null);
            db.close();
            if (resultado == -1) {
                VVLogger.logSevereError("An error was generated when run delete processs");
                return false;
            }
            else{
                VVLogger.logInfo("A flight record was deleted");
                return true;
            }
        }catch (Exception e){
            VVLogger.logSevereError("An error was generated when run delete processs");
            return false;
        }
    }




}

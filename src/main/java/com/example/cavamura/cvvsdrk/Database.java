package com.example.cavamura.cvvsdrk;

import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Date;
/**
 * Created by cavamura on 17/12/2017.
 */

public class Database extends SQLiteOpenHelper {
    public static final String NOME_BANCO = "bdflights.db";
    public static final String TABELA = "flights";
    public static final String ID = "_id";
    public static final String STUDENT = "student";
    public static final String FLIGHTDATE = "flightdate";
    public static final String LEVEL = "level";
    public static final String FLIGHTNUMBER = "flightnumber";
    public static final String TAKEOFF = "takeoff";
    public static final String LANDING = "landing";
    public static final String TIME = "time";
    public static final String GLIDER = "glider";
    public static final String INPL = "inpl";
    public static final String H11 = "h11"; //1
    public static final String H12 = "h12"; //2
    public static final String H13 = "h13"; //3
    public static final String H14 = "h14"; //4
    public static final String H15 = "h15"; //5
    public static final String H16 = "h16"; //6
    public static final String H17 = "h17"; //7
    public static final String H21 = "h21"; //8
    public static final String H22 = "h22"; //9
    public static final String H23 = "h23"; //10
    public static final String H24 = "h24"; //11
    public static final String H31 = "h31"; //12
    public static final String H32 = "h32"; //13
    public static final String H33 = "h33"; //14
    public static final String H34 = "h34"; //15
    public static final String H35 = "h35"; //16
    public static final String H36 = "h36"; //17
    public static final String H37 = "h37"; //18
    public static final String H41 = "h41"; //19
    public static final String H42 = "h42"; //20
    public static final String H43 = "h43"; //21
    public static final String H44 = "h44"; //22
    public static final String H51 = "h51"; //23
    public static final String H52 = "h52"; //24
    public static final String H53 = "h53"; //25
    public static final String H54 = "h54"; //26
    public static final String H61 = "h61"; //27
    public static final String H62 = "h62"; //28
    public static final String H63 = "h63"; //29
    public static final String H64 = "h64"; //30
    public static final String H71 = "h71"; //31
    public static final String H72 = "h72"; //32
    public static final String H81 = "h81"; //33
    public static final String H82 = "h82"; //34
    public static final String H83 = "h83"; //35
    public static final String COMMENTF1 = "commentf1";
    public static final String COMMENTF2 = "commentf2";
    public static final String COMMENTF3 = "commentf3";
    public static final String COMMENTF4 = "commentf4";
    public static final String COMMENTF5 = "commentf5";
    public static final String COMMENTF6 = "commentf6";
    public static final String IMPORT = "import";
    private static final int VERSAO = 4;

    private static final String DATABASE_ALTER_TEAM_1 = "ALTER TABLE "
            + TABELA + " ADD COLUMN " + IMPORT + " string;";

    private static final String DATABASE_ALTER_TEAM_2 = "CREATE TABLE STUDENTS (_id integer primary key autoincrement, canac text, nome text)";

    private static final String DATABASE_ALTER_TEAM_3 = "INSERT INTO STUDENTS (canac, nome) values ('285543','LUIZ CAVAMURA JUNIOR')";

    private static final String DATABASE_ALTER_TEAM_4 = "INSERT INTO STUDENTS (canac, nome) values ('123456','ZE')";

    private static final String DATABASE_ALTER_TEAM_5 = "CREATE TABLE INPLS (_id integer primary key autoincrement, canac text, nome text)";


    public Database(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "+TABELA+"("
                + ID + " integer primary key autoincrement,"
                + STUDENT + " text,"
                + FLIGHTDATE + " text,"
                + LEVEL + " text,"
                + FLIGHTNUMBER + " text,"
                + TAKEOFF + " text,"
                + LANDING + " text,"
                + TIME + " text,"
                + GLIDER + " text,"
                + INPL + " text,"
                + H11 + " integer,"
                + H12 + " integer,"
                + H13 + " integer,"
                + H14 + " integer,"
                + H15 + " integer,"
                + H16 + " integer,"
                + H17 + " integer,"
                + H21 + " integer,"
                + H22 + " integer,"
                + H23 + " integer,"
                + H24 + " integer,"
                + H31 + " integer,"
                + H32 + " integer,"
                + H33 + " integer,"
                + H34 + " integer,"
                + H35 + " integer,"
                + H36 + " integer,"
                + H37 + " integer,"
                + H41 + " integer,"
                + H42 + " integer,"
                + H43 + " integer,"
                + H44 + " integer,"
                + H51 + " integer,"
                + H52 + " integer,"
                + H53 + " integer,"
                + H54 + " integer,"
                + H61 + " integer,"
                + H62 + " integer,"
                + H63 + " integer,"
                + H64 + " integer,"
                + H71 + " integer,"
                + H72 + " integer,"
                + H81 + " integer,"
                + H82 + " integer,"
                + H83 + " integer,"
                + COMMENTF1 + " text,"
                + COMMENTF2 + " text,"
                + COMMENTF3 + " text,"
                + COMMENTF4 + " text,"
                + COMMENTF5 + " text,"
                + COMMENTF6 + " text,"
                + IMPORT + " text "
                +")";
        db.execSQL(sql);

        String sql2 = "CREATE TABLE STUDENTS (_id integer primary key autoincrement, canac text, nome text)";
        db.execSQL(sql2);

        String sql3 = "INSERT INTO STUDENTS (canac, nome) values ('285543','LUIZ CAVAMURA JUNIOR')";
        db.execSQL(sql3);

        String sql5 = "CREATE TABLE INPLS (_id integer primary key autoincrement, canac text, nome text)";
        db.execSQL(sql5);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        if (oldVersion < 2) {
            db.execSQL(DATABASE_ALTER_TEAM_1);
        }
        if (oldVersion < 3) {
            String tabela = "STUDENTS";
            db.execSQL("DROP TABLE IF EXISTS " + tabela);
            db.execSQL(DATABASE_ALTER_TEAM_2);
            db.execSQL(DATABASE_ALTER_TEAM_3);
            db.execSQL(DATABASE_ALTER_TEAM_4);
        }

        if (oldVersion < 4) {
            db.execSQL(DATABASE_ALTER_TEAM_5);
        }
        //onCreate(db);
    }
}

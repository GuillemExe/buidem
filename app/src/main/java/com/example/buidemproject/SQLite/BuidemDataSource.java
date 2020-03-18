package com.example.buidemproject.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BuidemDataSource {

    public static final String table_MAQUINES = "maquines";
    public static final String MAQUINES_ID = "";
    public static final String MAQUINES_NOMCLIENT = "";
    public static final String MAQUINES_ADREÇA = "";
    public static final String MAQUINES_CODIPOSTAL = "";
    public static final String MAQUINES_POBLACIO = "";
    public static final String MAQUINES_TELEFON = "";
    public static final String MAQUINES_EMAIL = "";
    public static final String MAQUINES_NUMEROSERIEMAQUINA = "";
    public static final String MAQUINES_DATAREVISIO = "";
    public static final String MAQUINES_TIPUSMAQUINA = "";
    public static final String MAQUINES_ZONA = "";

    public static final String table_ZONES = "zones";


    public static final String table_TIPUS = "tipus";


    private BuidemHelper dbHelper;
    private SQLiteDatabase dbW, dbR;


    // CONSTRUCTOR
    public BuidemDataSource(Context context) {
        // DB Connection
        dbHelper = new BuidemHelper(context);

        open();
    }

    private void open() {
        dbW = dbHelper.getWritableDatabase();
        dbR = dbHelper.getReadableDatabase();
    }

    // DESTRUCTOR
    protected void finalize () {
        dbW.close();
        dbR.close();
    }
}

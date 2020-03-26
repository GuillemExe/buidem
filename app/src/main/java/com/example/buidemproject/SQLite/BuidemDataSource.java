package com.example.buidemproject.SQLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BuidemDataSource {

    public static final String table_MAQUINES = "maquines";
    public static final String MAQUINES_ID = "_id";
    public static final String MAQUINES_NOMCLIENT = "nomclient";
    public static final String MAQUINES_ADREÇA = "adreca";
    public static final String MAQUINES_CODIPOSTAL = "codipostal";
    public static final String MAQUINES_POBLACIO = "poblacio";
    public static final String MAQUINES_TELEFON = "telefon";
    public static final String MAQUINES_EMAIL = "email";
    public static final String MAQUINES_NUMEROSERIEMAQUINA = "numeroseriemaquina";
    public static final String MAQUINES_DATAREVISIO = "datarevisio";
    public static final String MAQUINES_TIPUSMAQUINA = "tipusmaquina";
    public static final String MAQUINES_ZONA = "zona";

    public static final String table_ZONES = "zones";
    public static final String ZONES_ID = "_id";
    public static final String ZONES_ZONA = "zona";
    public static final String ZONES_LATITUD = "latitud";
    public static final String ZONES_LONGITUD = "longitud";

    public static final String table_TIPUS = "tipus";
    public static final String TIPUS_ID = "_id";
    public static final String TIPUS_TIPUSMAQUINA = "tipusmaquina";

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

    // CONSULTES

    // DEVUELVE TODA LA INFORMACION DE LAS TABLAS
    public Cursor maquines() {
        // TODAS LAS MAQUINAS
        String query = "SELECT * FROM maquines";
        return dbR.rawQuery(query, null);
    }
    public Cursor zones() {
        // TODAS LAS ZONAS
        String query = "SELECT * FROM zones";
        return dbR.rawQuery(query, null);
    }
    public Cursor tipus() {
        // TODAS LAS ZONAS
        String query = "SELECT * FROM tipus";
        return dbR.rawQuery(query, null);
    }
}

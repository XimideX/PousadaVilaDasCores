package com.example.pousadaviladascores.DAO;

import android.provider.BaseColumns;

public class DatabaseCreator {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private DatabaseCreator() {}

    /* Inner class that defines the table contents */
    public static class ApartmentEntriesTable implements BaseColumns {
        public static final String TABLE_NAME = "Apartment";
        public static final String RENTED_COLUMN_NAME = "Rented";
        public static final String DESCRIPTION_COLUMN_NAME = "Description";

    }

    public static class AirConditionerEntriesTable implements BaseColumns {
        public static final String TABLE_NAME = "AirConditioner";
        public static final String DESCRIPTION_COLUMN_NAME = "Description";
        public static final String LAST_CLEAN_DATE_COLUMN_NAME = "Last_Clean_Date";
        public static final String LAST_FILTER_CHANGE_DATE_COLUMN_NAME = "Last_Filter_Change_Date";
        public static final String LAST_CLEAN_COST_COLUMN_NAME = "Last_Clean_Cost";
        public static final String ID_APARTMENT_COLUMN_NAME = "Id_Apartment";
    }

    public static final String SQL_CREATE_APARTMENT_TABLE =
            "CREATE TABLE " + ApartmentEntriesTable.TABLE_NAME + " (" +
                    ApartmentEntriesTable._ID + " INTEGER PRIMARY KEY," +
                    ApartmentEntriesTable.RENTED_COLUMN_NAME + " INTEGER" +
                    ApartmentEntriesTable.DESCRIPTION_COLUMN_NAME + " TEXT)";
//                    "CONSTRAINT fk_air_conditioners" + " INTEGER" +
//                    "FOREIGN KEY (id_air_conditioner)" +
//                    "REFERENCES AirConditioner(" + AirConditionerEntriesTable._ID + ")" +

    public static final String SQL_CREATE_AIR_CONDITIONER_TABLE =
            "CREATE TABLE " + AirConditionerEntriesTable.TABLE_NAME + " (" +
                    AirConditionerEntriesTable._ID + " INTEGER PRIMARY KEY," +
                    AirConditionerEntriesTable.LAST_CLEAN_COST_COLUMN_NAME + " INTEGER" +
                    AirConditionerEntriesTable.LAST_CLEAN_DATE_COLUMN_NAME + " INTEGER" +
                    AirConditionerEntriesTable.LAST_FILTER_CHANGE_DATE_COLUMN_NAME + " INTEGER" +
                    AirConditionerEntriesTable.DESCRIPTION_COLUMN_NAME + " TEXT" +
                    AirConditionerEntriesTable.ID_APARTMENT_COLUMN_NAME + " INTEGER" +
                    "CONSTRAINT fk_apartment" + " INTEGER" +
                    "FOREIGN KEY (" + AirConditionerEntriesTable.ID_APARTMENT_COLUMN_NAME + ") " +
                    "REFERENCES Apartment(" + ApartmentEntriesTable._ID + ")" +
                    ");";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ApartmentEntriesTable.TABLE_NAME;
}

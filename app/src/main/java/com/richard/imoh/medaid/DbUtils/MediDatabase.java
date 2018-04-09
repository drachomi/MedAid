package com.richard.imoh.medaid.DbUtils;

import android.arch.persistence.room.Database;

/**
 * Created by LENOVO on 4/8/2018.
 */

@Database(entities = Medication.class,version = 1)
public abstract class MediDatabase {
    public abstract MediDao mediDao();
    public static final String DATABASE_NAME = "medication";




}

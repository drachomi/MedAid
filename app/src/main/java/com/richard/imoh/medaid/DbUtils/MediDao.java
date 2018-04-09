package com.richard.imoh.medaid.DbUtils;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

/**
 * Created by LENOVO on 4/8/2018.
 */
@Dao
public interface MediDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll (Medication medication);

    @Query("SELECT * FROM medication WHERE drug_name = name")
    void insertOne(String name);
}

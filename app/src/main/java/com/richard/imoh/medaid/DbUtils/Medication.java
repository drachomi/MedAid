package com.richard.imoh.medaid.DbUtils;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by LENOVO on 4/8/2018.
 */

@Entity(tableName = "medication")
public class Medication {

    @PrimaryKey
    public int id;
    public String drug_name;
    public String drug_description;
    public int morning_dose;
    public int afternoon_dose;
    public int evening_dose;
    public int total_tablets;
    public String start_time;
    public String end_time;

    public Medication(int id, String drug_name, String drug_description, int morning_dose, int afternoon_dose, int evening_dose, int total_tablets, String start_time, String end_time) {
        this.id = id;
        this.drug_name = drug_name;
        this.drug_description = drug_description;
        this.morning_dose = morning_dose;
        this.afternoon_dose = afternoon_dose;
        this.evening_dose = evening_dose;
        this.total_tablets = total_tablets;
        this.start_time = start_time;
        this.end_time = end_time;
    }
}

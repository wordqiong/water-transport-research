package com.example.helloworld.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;

@Entity(tableName = "user_Boat")
public class user_Boat extends User{
    //后续这些数据都有可能更改，故使用public更方便
    public String name;

    public String phone;

    public int weight;

    public int load_weight;

    public String load_type;

    public String depart;

    public user_Boat(String username, String password,Status status,String name, String phone, int weight, int load_weight, String load_type, String depart){
        super(username,password,status);
        this.name = name;
        this.phone = phone;
        this.weight = weight;
        this.load_type = load_type;
        this.load_weight = load_weight;
        this.depart = depart;
    }

    /*
    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getLoad_type(){
        return load_type;
    }

    public String getDepart(){
        return depart;
    }

    public int getWeight(){
        return weight;
    }

    public int getLoad_weight(){
        return load_weight;
    }
    */
}

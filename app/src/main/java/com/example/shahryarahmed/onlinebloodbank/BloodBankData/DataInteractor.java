package com.example.shahryarahmed.onlinebloodbank.BloodBankData;

import android.content.Context;
import android.util.Log;

import com.example.shahryarahmed.onlinebloodbank.Entities.BloodData;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Shahryar Ahmed on 4/18/2018.
 */

public class DataInteractor implements Contract.DataInteractor {

    private Context context;

    public DataInteractor(Context context) {
        this.context = context;
    }

    @Override
    public void setDataToFirebase(BloodData bloodData){

        Log.v("data","asdasdasda"+bloodData.getAbNegative());

        FirebaseDatabase.getInstance().getReference("users").setValue(bloodData);


    }
}

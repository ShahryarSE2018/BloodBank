package com.example.shahryarahmed.onlinebloodbank.Staff;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.shahryarahmed.onlinebloodbank.BloodBankData.Data;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Shahryar Ahmed on 4/13/2018.
 */

public class StaffInteractor implements Contract.StaffInteractor {

    private Context context;


    public StaffInteractor(Context context) {
        this.context = context;

    }
    public boolean flag;
    @Override

    public boolean checkDataInFirebase(final String hospitalName, final String password) {

        Intent intent = new Intent(context, Data.class);
        Bundle bundle = new Bundle();
        bundle.putString("hospitalName", hospitalName);
        bundle.putString("password", password);
        intent.putExtras(bundle);
        context.startService(intent);





        DatabaseReference root = FirebaseDatabase.getInstance().getReference("HospitalStaff");
        root.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                if (snapshot.hasChild(hospitalName + "_" + password)) {

                    Log.v("data", "inInteractor" + "       o_o" + hospitalName);

                    flag =true  ;

       }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        return flag;
    }

}
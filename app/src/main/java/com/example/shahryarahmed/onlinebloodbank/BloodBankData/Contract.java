package com.example.shahryarahmed.onlinebloodbank.BloodBankData;

import com.example.shahryarahmed.onlinebloodbank.Entities.BloodData;

/**
 * Created by Shahryar Ahmed on 4/18/2018.
 */

public interface Contract {
    interface DataView{

        void bindViews();
        void initialize();

    }

    interface DataPresenter{

        void setData(BloodData bloodData);
    }
    interface DataInteractor{

        void setDataToFirebase(BloodData bloodData);
    }
}

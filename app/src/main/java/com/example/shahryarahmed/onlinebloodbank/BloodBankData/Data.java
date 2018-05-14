package com.example.shahryarahmed.onlinebloodbank.BloodBankData;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shahryarahmed.onlinebloodbank.Entities.BloodData;
import com.example.shahryarahmed.onlinebloodbank.R;

public class Data extends AppCompatActivity implements Contract.DataView{

    private EditText oPositive;
    private EditText oNegative;
    private EditText aPositive;
    private EditText aNegative;
    private EditText bPositive;
    private EditText bNegative;
    private EditText abPositive;
    private EditText abNegative;
    private Button generateBlock;
    private Contract.DataPresenter dataPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        bindViews();
        initialize();
    }

    @Override
    public void bindViews() {

        oPositive = findViewById(R.id.oPositive);
        oNegative = findViewById(R.id.oNegative);
        aPositive = findViewById(R.id.aPositive);
        aNegative = findViewById(R.id.aNegative);
        bPositive = findViewById(R.id.bPositive);
        bNegative = findViewById(R.id.bNegative);
        abPositive = findViewById(R.id.abPositive);
        abNegative = findViewById(R.id.abNegative);
        generateBlock = findViewById(R.id.generateBlock);

    }

    @Override
    public void initialize() {

        dataPresenter = new DataPresenter(this,getApplicationContext());

        generateBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    int opositive = Integer.parseInt(oPositive.getText().toString());
                    int onegative = Integer.parseInt(oNegative.getText().toString());
                    int apositive = Integer.parseInt(aPositive.getText().toString());
                    int anegative = Integer.parseInt(aNegative.getText().toString());
                    int bpositive = Integer.parseInt(bPositive.getText().toString());
                    int bnegative = Integer.parseInt(bNegative.getText().toString());
                    int abpositive = Integer.parseInt(abPositive.getText().toString());
                    int abnegative = Integer.parseInt(abNegative.getText().toString());

                    BloodData bData = new BloodData(opositive, onegative, apositive, anegative, bpositive, bnegative, abpositive, abnegative);


                    dataPresenter.setData(bData);
                }

        });

    }
}

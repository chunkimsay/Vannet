package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        Button sendData = findViewById(R.id.button_Submit);
        sendData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Send_Data.class);

                EditText txt1 = findViewById(R.id.Member);
                String MEM = txt1.getText().toString();

                EditText txt2 = findViewById(R.id.Evaluation);
                String EVA = txt2.getText().toString();

                RadioGroup radioGender = findViewById(R.id.GENDER);
                int GenderId = radioGender.getCheckedRadioButtonId();
                if (GenderId > -1){
                    RadioButton GenderButton = findViewById(GenderId);
                    String GEN = GenderButton.getText().toString();
                    intent.putExtra(Connection.KEY_GENDER, GEN);
                }

                RadioGroup Group1 = findViewById(R.id.LerRespect);
                int Id1 = Group1.getCheckedRadioButtonId();
                if (Id1 > -1){
                    RadioButton Button1 = findViewById(Id1);
                    String CLA = Button1.getText().toString();
                    intent.putExtra(Connection.KEY_Clarity, CLA);

                }

                RadioGroup Group2 = findViewById(R.id.LerLanguage);
                int Id2 = Group2.getCheckedRadioButtonId();
                if (Id2 > -1){
                    RadioButton Button2 = findViewById(Id2);
                    String RES = Button2.getText().toString();
                    intent.putExtra(Connection.KEY_Respect, RES);

                }

                RadioGroup Group3 = findViewById(R.id.LerPreparation);
                int Id3 = Group3.getCheckedRadioButtonId();
                if (Id3 > -1){
                    RadioButton Button3 = findViewById(Id3);
                    String LAN = Button3.getText().toString();
                    intent.putExtra(Connection.KEY_Language, LAN);

                }

                RadioGroup Group4 = findViewById(R.id.LerInterest);
                int Id4 = Group4.getCheckedRadioButtonId();
                if (Id4 > -1){
                    RadioButton Button4 = findViewById(Id4);
                    String PRE = Button4.getText().toString();
                    intent.putExtra(Connection.KEY_Preparation, PRE);

                }


                RadioGroup Group5 = findViewById(R.id.LerContent);
                int Id5 = Group5.getCheckedRadioButtonId();
                if (Id5 > -1){
                    RadioButton Button5 = findViewById(Id5);
                    String INT = Button5.getText().toString();
                    intent.putExtra(Connection.KEY_Interest, INT);

                }

                RadioGroup Group6 = findViewById(R.id.LerChoice);
                int Id6 = Group6.getCheckedRadioButtonId();
                if (Id6 >-1){
                    RadioButton Button6 = findViewById(Id6);
                    String CHO = Button6.getText().toString();
                    intent.putExtra(Connection.KEY_Choice, CHO);


                }

                RadioGroup Group7 = findViewById(R.id.LerRelevancy);
                int Id7 = Group7.getCheckedRadioButtonId();
                if(Id7 > -1){
                    RadioButton Button7 = findViewById(Id7);
                    String REL = Button7.getText().toString();
                    intent.putExtra(Connection.KEY_Relevancy, REL);

                }


                RadioGroup Group8 = findViewById(R.id.LerProgress);
                int Id8 = Group8.getCheckedRadioButtonId();
                if (Id8 > -1){
                    RadioButton Button8 = findViewById(Id8);
                    String PRO = Button8.getText().toString();
                    intent.putExtra(Connection.KEY_Progress, PRO);

                }


                RadioGroup Group9 = findViewById(R.id.QA);
                int Id9 = Group9.getCheckedRadioButtonId();
                if (Id9 > -1){
                    RadioButton Button9 = findViewById(Id9);
                    String ANS = Button9.getText().toString();
                    intent.putExtra(connect.KEY_Answer, ANS);

                }

                EditText txtCmt = findViewById(R.id.Comment);
                String CMT = txtCmt.getText().toString();

                intent.putExtra(connect.KEY_MEMBER, MEM);
                intent.putExtra(connect.KEY_EVALUATION, EVA);
                intent.putExtra(connect.KEY_CMT, CMT);

                startActivity(intent);


            }
        });
    }

}
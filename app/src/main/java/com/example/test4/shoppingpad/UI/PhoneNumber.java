package com.example.test4.shoppingpad.UI;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.test4.shoppingpad.R;
import com.example.test4.shoppingpad.Controller.*;

/**
 * Created by bridgelabz4 on 1/2/16.
 */
public class PhoneNumber extends AppCompatActivity {
    Button b2;
    private static EditText e1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        b2=(Button)findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1=(EditText)findViewById(R.id.edit1);
                String number=e1.getText().toString();
                Toast.makeText(PhoneNumber.this, " "+number, Toast.LENGTH_SHORT).show();
                int i=phoneVarification.VerifyPhone(number);
                if(i == 1)
                {
                    Toast.makeText(PhoneNumber.this, "number ok", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(PhoneNumber.this,"error in number",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}

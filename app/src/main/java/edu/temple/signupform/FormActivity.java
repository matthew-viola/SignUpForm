package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button save = findViewById(R.id.btnSave);
        save.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name = findViewById(R.id.txtName);
                TextView email = findViewById(R.id.txtEmail);
                TextView pw = findViewById(R.id.txtPwd);
                TextView c = findViewById(R.id.txtConfirm);
                TextView success = findViewById(R.id.txtSuccess);
                if(!name.getText().toString().matches("") && !email.getText().toString().matches("") && !pw.getText().toString().matches("") && !c.getText().toString().matches("")){
                    if(pw.getText().toString().matches(c.getText().toString())){
                        success.setText("Welcome to the SignupForm App " + name.getText());
                    }
                    else{
                        Toast.makeText(FormActivity.this, "Passwords do not match",  Toast.LENGTH_LONG).show();

                    }
                }
                else{
                    Toast error2 = Toast.makeText(FormActivity.this, "Please fill out all of the fields",  Toast.LENGTH_LONG);
                    error2.show();
                }
            }
        }));
    }
}

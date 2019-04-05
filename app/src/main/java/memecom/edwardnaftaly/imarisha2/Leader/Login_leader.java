package memecom.edwardnaftaly.imarisha2.Leader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import memecom.edwardnaftaly.imarisha2.MainActivity;
import memecom.edwardnaftaly.imarisha2.R;

public class Login_leader extends AppCompatActivity {
private Button bregister,bregister_signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_leader);
        bregister = findViewById(R.id.register);
        bregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login_leader.this,Report_case.class);
                startActivity(i);
            }
        });
        bregister_signin = findViewById(R.id.register_signin);
        bregister_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login_leader.this,Register_leader.class);
                startActivity(i);
            }
        });

    }

}

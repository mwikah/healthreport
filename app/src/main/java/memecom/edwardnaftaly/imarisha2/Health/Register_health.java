package memecom.edwardnaftaly.imarisha2.Health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import memecom.edwardnaftaly.imarisha2.Leader.Register_leader;
import memecom.edwardnaftaly.imarisha2.Leader.Report_case;
import memecom.edwardnaftaly.imarisha2.R;

public class Register_health extends AppCompatActivity {
    private Button bregister,bregister_signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_health);
        bregister = findViewById(R.id.register);
        bregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register_health.this,Healthworker_report.class);
                startActivity(i);
            }
        });

        bregister_signin = findViewById(R.id.register_signin);
        bregister_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register_health.this,Login_health.class);
                startActivity(i);
            }
        });
    }
}

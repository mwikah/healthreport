package memecom.edwardnaftaly.imarisha2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import memecom.edwardnaftaly.imarisha2.Health.Login_health;
import memecom.edwardnaftaly.imarisha2.Leader.Login_leader;

public class MainActivity extends AppCompatActivity {
    private CardView cworker,cleader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cworker = findViewById(R.id.health);
        cworker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Login_health.class);
                startActivity(i);
            }
        });

        cleader = findViewById(R.id.leader);
        cleader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Login_leader.class);
                startActivity(i);
            }
        });
    }
}

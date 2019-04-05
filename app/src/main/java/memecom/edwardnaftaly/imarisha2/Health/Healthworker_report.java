package memecom.edwardnaftaly.imarisha2.Health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import memecom.edwardnaftaly.imarisha2.Leader.Report_case;
import memecom.edwardnaftaly.imarisha2.R;

public class Healthworker_report extends AppCompatActivity {
    ImageView ireport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthworker_report);
        ireport = findViewById(R.id.report);
        ireport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Healthworker_report.this,Report_case.class);
                startActivity(i);
            }
        });
    }
}

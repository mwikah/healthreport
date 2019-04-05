package memecom.edwardnaftaly.imarisha2.Health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import memecom.edwardnaftaly.imarisha2.Defaultmrrport;
import memecom.edwardnaftaly.imarisha2.Leader.Report_case;
import memecom.edwardnaftaly.imarisha2.LhwReport;
import memecom.edwardnaftaly.imarisha2.R;

public class Healthworker_report extends AppCompatActivity {
    ImageView ireport,hdefaultm,ilhwreport;
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

        hdefaultm = findViewById(R.id.defaultm);
        hdefaultm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Healthworker_report.this,Defaultmrrport.class);
                startActivity(i);
            }
        });

        ilhwreport = findViewById(R.id.lhwreport);
        ilhwreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Healthworker_report.this,LhwReport.class);
                startActivity(i);
            }
        });
    }
}

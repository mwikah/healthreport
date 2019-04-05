package memecom.edwardnaftaly.imarisha2.Leader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import memecom.edwardnaftaly.imarisha2.R;

public class Report_case extends AppCompatActivity {
    private TextView textreportcase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_case);

        textreportcase = findViewById(R.id.reportcase);
        textreportcase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Report_case.this,Reportcase_page.class);
                startActivity(i);
            }
        });
    }
}

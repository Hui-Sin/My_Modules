package sg.edu.rp.c346.id20018354.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView MCode;
    TextView MName;
    TextView AcadYear;
    TextView Sem;
    TextView MCredit;
    TextView Venue;
    Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        MCode=findViewById(R.id.textViewMCode);
        MName=findViewById(R.id.textViewMName);
        AcadYear=findViewById(R.id.textViewAcademicYear);
        Sem=findViewById(R.id.textViewSemester);
        MCredit=findViewById(R.id.textViewMCredit);
        Venue=findViewById(R.id.textViewVenue);
        btnback=findViewById(R.id.buttonback);

        String Code = getIntent().getStringExtra("Code");
        String Name = getIntent().getStringExtra("Name");
        String AY = getIntent().getStringExtra("AY");
        String Sems = getIntent().getStringExtra("Sem");
        String Credit = getIntent().getStringExtra("Credit");
        String Venues = getIntent().getStringExtra("Venue");
        MCode.setText(Code);
        MName.setText(Name);
        AcadYear.setText(AY);
        Sem.setText(Sems);
        MCredit.setText(Credit);
        Venue.setText(Venues);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ModuleDetailActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
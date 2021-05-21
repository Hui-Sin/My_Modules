package sg.edu.rp.c346.id20018354.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView C346Details;
    TextView C218Details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        C346Details=findViewById(R.id.textViewModule);
        C218Details=findViewById(R.id.textViewModule2);
        C346Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Code", "Module Code: C346");
                intent.putExtra("Name", "Module Name: Android Programming");
                intent.putExtra("AY", "Academic Year: 2021");
                intent.putExtra("Sem", "Semester: 1");
                intent.putExtra("Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: E62E");
                startActivity(intent);
            }
        });
        C218Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Code", "Module Code: C218");
                intent.putExtra("Name", "Module Name:  UI/UX Design for apps");
                intent.putExtra("AY", "Academic Year: 2021");
                intent.putExtra("Sem", "Semester: 1");
                intent.putExtra("Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: W64G");
                startActivity(intent);
            }
        });
    }
}
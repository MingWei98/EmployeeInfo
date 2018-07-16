package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;
    ArrayList<InfoItem> alInfo;
    CustomAdapter caInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.listViewInfo);

        alInfo = new ArrayList<>();
        InfoItem info1 = new InfoItem("John", "Software Technical Leader", 3400.0);
        InfoItem info2 = new InfoItem("May", "Programmer", 2200.0);

        alInfo.add(info1); alInfo.add(info2); alInfo.add(info1); alInfo.add(info2);
        alInfo.add(info1); alInfo.add(info2); alInfo.add(info1); alInfo.add(info2);
        alInfo.add(info1); alInfo.add(info2); alInfo.add(info1); alInfo.add(info2);
        alInfo.add(info1); alInfo.add(info2); alInfo.add(info1); alInfo.add(info2);
        alInfo.add(info1); alInfo.add(info2); alInfo.add(info1); alInfo.add(info2);
        alInfo.add(info1); alInfo.add(info2); alInfo.add(info1); alInfo.add(info2);

        caInfo = new CustomAdapter(this, R.layout.info_item, alInfo);

        lvInfo.setAdapter(caInfo);

    }
}

package aoc.example.hackerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtDisplay=findViewById(R.id.sent);
        String DataBundel= "";
        Bundle bundle=getIntent().getExtras();
        for (String key : bundle.keySet()) {
            Object value = bundle.get(key);
            DataBundel+= String.format("%s %s (%s)", key, value.toString(), value.getClass().getName());
        }
        txtDisplay.setText(DataBundel);
    }
}

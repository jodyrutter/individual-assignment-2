package aoc.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class
MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buSend=findViewById(R.id.button);
        final EditText etComment=findViewById(R.id.editText);
        buSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getPackageManager().getLaunchIntentForPackage("aoc.example.receiver" );
                intent.putExtra("Comment", etComment.getText().toString());
                startActivity(intent);
            }
        });
    }
}


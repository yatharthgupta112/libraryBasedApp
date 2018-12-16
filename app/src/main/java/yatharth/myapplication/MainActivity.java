package yatharth.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import yatharth.library.form;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        submit = findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent= new Intent(getApplicationContext(), form.class);
                    startActivity(intent);
                    Log.d("error start", "    started");
                }
                catch (Exception e)
                {
                    Log.d("error start", e.getMessage());
                }
            }
        });

    }
}

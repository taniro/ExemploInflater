package br.eaj.tads.exemploinflater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = findViewById(R.id.meu_layout);

        for (int i = 0; i < 100 ; i ++){

            LayoutInflater inflater = LayoutInflater.from(this);
            TextView text = (TextView) inflater.inflate(R.layout.textview_inflater, layout, false);

            text.setText("Texto: " + i);

            layout.addView(text);
        }

    }
}

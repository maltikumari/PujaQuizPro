package gita.pujaquizpro;

/**
 * Created by Malti on 14-May-17.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mahdi extends Activity {
        Button bt1;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_one);
            bt1=(Button)findViewById(R.id.button);
            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Mahdi.this, SecondActivity.class);
                    startActivity(intent);

                }
            });

        }

    }


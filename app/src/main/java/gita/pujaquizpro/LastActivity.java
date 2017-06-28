package gita.pujaquizpro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by PUJA on 05-04-2017.
 */

public class LastActivity extends Activity {
    TextView score;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        score=(TextView)findViewById(R.id.textView);
        bt=(Button)findViewById(R.id.button3);
      StringBuffer sb=new StringBuffer();
        sb.append("Correct Ans:"+QuestionActivity.correct+"\n");
        sb.append("Wrong Ans:"+QuestionActivity.wrong+"\n");
       sb.append("Final Score:"+QuestionActivity.marks+"\n");
        score.setText(sb);
        QuestionActivity.correct=0;
        QuestionActivity.wrong=0;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LastActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

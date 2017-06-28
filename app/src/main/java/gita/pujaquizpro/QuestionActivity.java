package gita.pujaquizpro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by PUJA on 19-03-2017.
 */
public class QuestionActivity extends Activity {
    TextView tv;
    RadioButton rb1, rb2, rb3, rb4;
    RadioGroup rg;
    Button btnext;
    String questions[] = {"1) ____________ controls the way in which the computer system functions and provides a means by which users can interact with the computer.", "2) The difference between people with access to computers and the Internet and those without this access is known as the:", "3) Servers are computers that provide resources to other computers connected to a:", "4) Word processing, spreadsheet, and photo-editing are examples of:", "5) A ____________ is approximately one billion bytes.", "6) All of the following are examples of input devices EXCEPT a:", "7) Computers use the ____________ language to process data.", "8) In the binary language each letter of the alphabet, each number and each special character is made up of a unique combination of:", "9) ____________ is data that has been organized or presented in a meaningful way.", "10) All of the following are examples of real security and privacy risks EXCEPT:"};
    String ans[] = {"A.The Operating System", "A.Digital Divide", "C.Network", "A.Application Software", "C.Gigabyte", "C.Printer", "C.Binary", "C.Eight Bits.", "B.Information", "D.Spam"};
    String opt[] = {"A.The Operating System", "B.The motherboard", "C.The platform", " D.Application software", "A.Digital Divide", "B.Internet divide.", "C.Web divide.", " D.Cyberway Divide.", "A.Mainframe", "B.supercomputer", "C.Network", "D.Client", "A.Application Software", "B.System Software.", "C.Operating System Software.", "D.Platform Software.", "A.Bit", "B.Kilobyte", "C.Gigabyte", "D.Megabyte", "A.Scanner", "B.Mouse", "C.Printer", "D.Keyboard", "A.Relational", "B.Megabyte", "C.Binary", "D.Processing", "A.Eight bytes.", "B.Eight characters.", "C.Eight bits.", "D.Eight kilobytes.", "A.A process", "B.Information", "C.Software", "D.Storage", "A.Viruses", "B.Identity theft.", "C.Hackers", "D.Spam"};
    int flag= 0;
    int Count=0;
    public static int marks, correct, wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        tv = (TextView) findViewById(R.id.textView2);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        btnext = (Button) findViewById(R.id.button);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ansText= ((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();
                if (ansText.equalsIgnoreCase(ans[flag])&&Count==0)
                {
                    correct++;
                    Count=1;
                    Toast.makeText(getApplicationContext(),String.valueOf(correct),Toast.LENGTH_LONG).show();
                }
                else
                {
                    wrong++;
                }
            }
        });

rb2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String ansText= ((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        if (ansText.equalsIgnoreCase(ans[flag])&&Count==0)
        {
            Count=1;
            correct++;
            Toast.makeText(getApplicationContext(),String.valueOf(correct),Toast.LENGTH_LONG).show();
        }
        else
        {
            wrong++;
        }
    }
});
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ansText= ((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();
                if (ansText.equalsIgnoreCase(ans[flag])&&Count==0)
                {
                    Count=1;
                    correct++;
                    Toast.makeText(getApplicationContext(),String.valueOf(correct),Toast.LENGTH_LONG).show();
                }
                else
                {
                    wrong++;
                }
            }
        });
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ansText= ((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();
                if (ansText.equalsIgnoreCase(ans[flag])&&Count==0)
                {
                    Count=1;
                    correct++;
                    Toast.makeText(getApplicationContext(),String.valueOf(correct),Toast.LENGTH_LONG).show();
                }
                else
                {
                    wrong++;
                }
            }
        });

        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Count=0;
                flag++;
                if(flag<=9) {
                    rg.clearCheck();
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag * 4]);
                    rb2.setText(opt[flag * 4 + 1]);
                    rb3.setText(opt[flag * 4 + 2]);
                    rb4.setText(opt[flag * 4 + 3]);

                }
                if(flag==10){
                    flag=0;
                    marks=correct;
                    Intent intent = new Intent(QuestionActivity.this, LastActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}

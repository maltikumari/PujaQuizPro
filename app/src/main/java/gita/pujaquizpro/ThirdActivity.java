package gita.pujaquizpro;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;


/**
 * Created by PUJA on 10-05-2017.
 */

public class ThirdActivity extends Activity {
    ViewPager vp;
    Swipe swipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        vp=(ViewPager)findViewById(R.id.pager);
        swipe= new Swipe(this);
        vp.setAdapter(swipe);
    }
}

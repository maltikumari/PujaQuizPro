package gita.pujaquizpro;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by PUJA on 10-05-2017.
 */
public class Swipe extends PagerAdapter {
    private int[] image={R.drawable.hh,R.drawable.ll,R.drawable.mm,R.drawable.pp,R.drawable.tt};
    private Context ctx;
    private LayoutInflater LayoutInflater;
    public Swipe (Context ctx)
    {
        this.ctx=ctx;
    }
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View img_view=LayoutInflater.inflate(R.layout.activity_swipe,container,false);
        ImageView iv=(ImageView)img_view.findViewById(R.id.imageView);
        iv.setImageResource(image[position]);
        container.addView(img_view);
        return img_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}

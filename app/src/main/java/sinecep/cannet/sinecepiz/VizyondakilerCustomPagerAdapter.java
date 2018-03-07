package sinecep.cannet.sinecepiz;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by cannet on 24.11.2017.
 */
public class VizyondakilerCustomPagerAdapter extends PagerAdapter {
    private List<Filmler> itemList;
    private Context context;

    private LayoutInflater inflater;

    public VizyondakilerCustomPagerAdapter(Context context, List<Filmler> itemList)
    {
        this.context=context;
        this.itemList=itemList;
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {

        return  itemList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.sinecep_activity_vizyondakiler,container,false);


        ImageView imgView= (ImageView) view.findViewById(R.id.Vafis);
        TextView tv= (TextView) view.findViewById(R.id.V_filmadi);
       TextView tv1=(TextView) view.findViewById(R.id.Vfilm_ing_adi);
        TextView tv2=(TextView) view.findViewById(R.id.V_konu);
        TextView tv3=(TextView) view.findViewById(R.id.V_oyuncular);
        TextView tv4= (TextView) view.findViewById(R.id.V_yonetmen);
        TextView tv5= (TextView) view.findViewById(R.id.V_sure);
        TextView tv6= (TextView) view.findViewById(R.id.V_tur);
        TextView tv7=(TextView) view.findViewById(R.id.V_ulkeadi);

        Filmler gecici=itemList.get(position); 
        Picasso.with(context).load(gecici.getFilm_resim()).into(imgView);
        tv.setText(gecici.getFilm_adi());
        tv1.setText(gecici.getFilm_ing_adi());
        tv2.setText(gecici.getFilm_konu());
        tv3.setText(gecici.getFilm_oyuncular());
        tv4.setText(gecici.getFilm_yonetmen());
        tv5.setText(gecici.getFilm_sure());
        tv6.setText(gecici.getFilm_tur());
        tv7.setText(gecici.getFilm_ulke());

        container.addView(view);


        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((FrameLayout)object);
    }
}

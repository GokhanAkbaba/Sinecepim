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
 * Created by cannet on 28.10.2017.
 */
public class CustomPagerAdapter extends PagerAdapter {

    private List<Filmler> itemList;
    private Context context;

    private LayoutInflater inflater;

    public CustomPagerAdapter(Context context, List<Filmler> itemList)
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
        View view = inflater.inflate(R.layout.sinecep_activitiy,container,false);


        ImageView imgView= (ImageView) view.findViewById(R.id.afis);
        TextView tv= (TextView) view.findViewById(R.id.film_adi);
        TextView tv1=(TextView) view.findViewById(R.id.film_ing_adi);
        TextView tv2=(TextView) view.findViewById(R.id.konu);
        TextView tv3=(TextView) view.findViewById(R.id.oyuncular);
        TextView tv4= (TextView) view.findViewById(R.id.VizTarih);
        TextView tv5= (TextView) view.findViewById(R.id.FilmYonet);
        TextView tv6= (TextView) view.findViewById(R.id.FilmSure);
        TextView tv7= (TextView) view.findViewById(R.id.FilmTur);
        TextView tv8=(TextView) view.findViewById(R.id.vizyondaki_ulkeadi);

        Filmler gecici=itemList.get(position);

       Picasso.with(context).load(gecici.getFilm_resim()).into(imgView);
        tv.setText(gecici.getFilm_adi());
        tv1.setText(gecici.getFilm_ing_adi());
        tv2.setText(gecici.getFilm_konu());
        tv3.setText(gecici.getFilm_oyuncular());
        tv4.setText(gecici.getVizyon_tarihi());
        tv5.setText(gecici.getFilm_yonetmen());
        tv6.setText(gecici.getFilm_sure());
        tv7.setText(gecici.getFilm_tur());
        tv8.setText(gecici.getFilm_ulke());

        container.addView(view);


        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((FrameLayout)object);
    }
}

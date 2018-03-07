package sinecep.cannet.sinecepiz;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Window;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cannet on 24.11.2017.
 */
public class Vizyondakiler_Activity extends Activity {
    public static List<Filmler> getListFromWebService(){
        List<Filmler> FilimList= new ArrayList<Filmler>();
        try {
            String json = new WebServis().execute("http://oftekfakitiraf.com/gokhanDosyalarSilmeyiniz/sine/vizyondaJson.php").get();
            Gson gson =new Gson();
            JsonParser jsonParser=new JsonParser();
            JsonArray jsonArray=jsonParser.parse(json).getAsJsonArray();


            for (int i=0;i<jsonArray.size();i++)
            {

                Filmler filmler=gson.fromJson(jsonArray.get(i),Filmler.class);
                FilimList.add(filmler);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return FilimList;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);

        ViewPager viewPager=(ViewPager) findViewById(R.id.ViewPager);

        VizyondakilerCustomPagerAdapter adapter=new VizyondakilerCustomPagerAdapter(this,Vizyondakiler_Activity.getListFromWebService());

        viewPager.setAdapter(adapter);
    }
}

package sinecep.cannet.sinecepiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by cannet on 29.10.2017.
 */
public class Ana_Sayfa_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.ana_sayfa);

       final Button vizyonGec=(Button)findViewById(R.id.vizyonButon);
        final Button yakindaGec=(Button)findViewById(R.id.yakindaButon);

        vizyonGec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vizyonGec=new Intent(getApplicationContext(),Vizyondakiler_Activity.class);
                startActivity(vizyonGec);
            }
        });

        yakindaGec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yakindaGec=new Intent(getApplicationContext(),SineCep_Activity.class);
                startActivity(yakindaGec);
            }
        });



    }
}

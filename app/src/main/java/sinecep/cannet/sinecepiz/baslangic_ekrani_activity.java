package sinecep.cannet.sinecepiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.Window;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

/**
 * Created by cannet on 29.10.2017.
 */
public class baslangic_ekrani_activity extends Activity {


    public boolean InternetControl(){
       ConnectivityManager connectivity = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivity.getActiveNetworkInfo()!=null){
            if(connectivity.getActiveNetworkInfo().isConnected ())
                return true;
        }

            return false;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        if(!InternetControl())
        {

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();

            alertDialog.setMessage("İnternet Bağlantınızı Kontrol Edin.");

            alertDialog.setButton("Tamam", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

                    System.exit(0);

                }
            });
            alertDialog.show();

        }

        requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.baslangic_ekran);
        FirebaseMessaging.getInstance().subscribeToTopic("test");
        FirebaseInstanceId.getInstance().getToken();
            Thread splashThread;
            splashThread = new Thread() {
                public void run() {
                    try {
                        synchronized (this) {
                            wait(3000);
                        }
                    } catch (InterruptedException ex) {
                    } finally {
                        Intent i = new Intent(getApplicationContext(), Ana_Sayfa_Activity.class);
                        startActivity(i);
                        finish();
                    }
                }
            };
            splashThread.start();
        }




}
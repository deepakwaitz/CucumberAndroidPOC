package cucumber.cukeulator.test;

import android.app.AlertDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;

import org.hamcrest.Description;

public class Utils {


    public static Boolean isCheck(Context context){
        boolean status=false;
        if(context==null){
            status=true;
        }else{
            ConnectivityManager conMgr =  (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = conMgr.getActiveNetworkInfo();
            if (netInfo == null){

            }else{

            }
        }

        return status;
    }


}

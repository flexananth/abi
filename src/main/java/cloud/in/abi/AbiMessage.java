package cloud.in.abi;

import android.content.Context;
import android.widget.Toast;

public class AbiMessage {

    public static void show(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}

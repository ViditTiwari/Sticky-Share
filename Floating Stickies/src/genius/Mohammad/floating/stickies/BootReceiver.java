package genius.Mohammad.floating.stickies;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {

	/**
	 * Simple receiver that fires upon turning on the device
	 * 
	 * @author Akshay koli <akoli0082@gmail.com>
	 *
	 * 
	 */

	public static boolean boot_up = false;

	boolean boot = false;

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent i = new Intent(context, MainActivity.class);
		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		// context.startActivity(i);
	}
}

package jquery.kuo.pluginclass.echo;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Echo extends CordovaPlugin{

	@override
	public boolean execute (String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals("testEcho")) {
			String message = args.getString(0);
			if (message != null && message.length() > 0){
				callbackContext.success(message);
			} else {
					callbackContext.error("Expected non-empty string argument.");
			}
			return true;
		}
		return false;
		

	}

}
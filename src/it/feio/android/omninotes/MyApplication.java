package it.feio.android.omninotes;

import it.feio.android.omninotes.utils.Constants;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;

@ReportsCrashes(formKey = "", 
				mailTo = Constants.DEV_EMAIL, 
//				mode = ReportingInteractionMode.TOAST, 
//				resToastText = R.string.crash_toast_text	
				mode = ReportingInteractionMode.DIALOG,
				resDialogIcon = R.drawable.ic_launcher,
				resDialogCommentPrompt = R.string.crash_dialog_comment_prompt,
				resDialogTitle = R.string.crash_dialog_title, 
				resDialogText = R.string.crash_dialog_text)
public class MyApplication extends Application {
	@Override
	public void onCreate() {
		// The following line triggers the initialization of ACRA
		super.onCreate();
		ACRA.init(this);
	}
}
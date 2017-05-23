package md5b8ee36f93d3035c82abb638897854590;


public class MainActivity
	extends md5b60ffeb829f638581ab2bb9b1a7f4f3f.FormsAppCompatActivity
	implements
		mono.android.IGCUserPeer,
		com.streethawk.library.push.ISHObserver
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onReceiveNonSHPushPayload:(Landroid/os/Bundle;)V:GetOnReceiveNonSHPushPayload_Landroid_os_Bundle_Handler:Com.Streethawk.Library.Push.ISHObserverInvoker, StreetHawkPush\n" +
			"n_onReceivePushData:(Lcom/streethawk/library/push/PushDataForApplication;)V:GetOnReceivePushData_Lcom_streethawk_library_push_PushDataForApplication_Handler:Com.Streethawk.Library.Push.ISHObserverInvoker, StreetHawkPush\n" +
			"n_onReceiveResult:(Lcom/streethawk/library/push/PushDataForApplication;I)V:GetOnReceiveResult_Lcom_streethawk_library_push_PushDataForApplication_IHandler:Com.Streethawk.Library.Push.ISHObserverInvoker, StreetHawkPush\n" +
			"n_shNotifyAppPage:(Ljava/lang/String;)V:GetShNotifyAppPage_Ljava_lang_String_Handler:Com.Streethawk.Library.Push.ISHObserverInvoker, StreetHawkPush\n" +
			"n_shReceivedRawJSON:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V:GetShReceivedRawJSON_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_Handler:Com.Streethawk.Library.Push.ISHObserverInvoker, StreetHawkPush\n" +
			"";
		mono.android.Runtime.register ("XamarinExample.Droid.MainActivity, XamarinExample.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainActivity.class, __md_methods);
	}


	public MainActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("XamarinExample.Droid.MainActivity, XamarinExample.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onReceiveNonSHPushPayload (android.os.Bundle p0)
	{
		n_onReceiveNonSHPushPayload (p0);
	}

	private native void n_onReceiveNonSHPushPayload (android.os.Bundle p0);


	public void onReceivePushData (com.streethawk.library.push.PushDataForApplication p0)
	{
		n_onReceivePushData (p0);
	}

	private native void n_onReceivePushData (com.streethawk.library.push.PushDataForApplication p0);


	public void onReceiveResult (com.streethawk.library.push.PushDataForApplication p0, int p1)
	{
		n_onReceiveResult (p0, p1);
	}

	private native void n_onReceiveResult (com.streethawk.library.push.PushDataForApplication p0, int p1);


	public void shNotifyAppPage (java.lang.String p0)
	{
		n_shNotifyAppPage (p0);
	}

	private native void n_shNotifyAppPage (java.lang.String p0);


	public void shReceivedRawJSON (java.lang.String p0, java.lang.String p1, java.lang.String p2)
	{
		n_shReceivedRawJSON (p0, p1, p2);
	}

	private native void n_shReceivedRawJSON (java.lang.String p0, java.lang.String p1, java.lang.String p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

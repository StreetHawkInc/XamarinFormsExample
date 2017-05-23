using System;

using Android.App;
using Android.Content.PM;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Xamarin.Forms;
using Android.Content;
using Com.Streethawk.Library.Push;
using Com.Streethawk.Library.Core;

namespace XamarinExample.Droid
{
    [Activity(Label = "XamarinExample", Icon = "@drawable/icon", Theme = "@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
    public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsAppCompatActivity , ISHObserver
    {
        
        public void OnReceiveNonSHPushPayload(Bundle p0)
        {
            // Put Break point here 
            String somethingToDo = "do something cool";
        }

        public void OnReceivePushData(PushDataForApplication p0)
        {
            // Put Break point here 
            String somethingToDo = "do something cool";
        }

        public void OnReceiveResult(PushDataForApplication p0, int p1)
        {
            // Put Break point here 
            String somethingToDo = "do something cool";
        }

        public void ShNotifyAppPage(string p0)
        {
            // Put Break point here 
            String somethingToDo = "do something cool";
        }

        public void ShReceivedRawJSON(string p0, string p1, string p2)
        {
            // Put Break point here 
            String somethingToDo = "do something cool";
        }

        protected override void OnCreate(Bundle bundle)
        {
            TabLayoutResource = Resource.Layout.Tabbar;
            ToolbarResource = Resource.Layout.Toolbar;

            base.OnCreate(bundle);

            global::Xamarin.Forms.Forms.Init(this, bundle);
            LoadApplication(new App());

            // Set this to your own APP KEY   <APP KEY> 
            StreetHawk.Instance.SetAppKey("SHPushPing_bison");
            // Set this to your own Project Key             <Project Key>
            Push.GetInstance(this).RegisterForPushMessaging("1058940905943");
            StreetHawk.Instance.Init(Application);
            Push.GetInstance(this).RegisterSHObserver(this);
        }



       
    }
}


package net.hydrakecat.transactiontoolargesample

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import com.gu.toolargetool.TooLargeTool

class MyApplication: Application() {
  override fun onCreate() {
    super.onCreate()

    TooLargeTool.startLogging(this)

    registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
      override fun onActivityPaused(activity: Activity?) {
      }

      override fun onActivityResumed(activity: Activity?) {
      }

      override fun onActivityStarted(activity: Activity?) {
      }

      override fun onActivityDestroyed(activity: Activity?) {
      }

      override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
        Log.d("MyApplication", "onActivitySaveInstanceState")
      }

      override fun onActivityStopped(activity: Activity?) {
        Log.d("MyApplication", "onActivityStopped")
      }

      override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
      }
    })
  }
}
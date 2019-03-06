package net.hydrakecat.transactiontoolargesample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<Button>(R.id.btn_open_view_pager_1).setOnClickListener {
      startActivity(Intent(this, ViewPager1Activity::class.java))
    }
    findViewById<Button>(R.id.btn_open_view_pager_2).setOnClickListener {
      startActivity(Intent(this, ViewPager2Activity::class.java))
    }
  }
}

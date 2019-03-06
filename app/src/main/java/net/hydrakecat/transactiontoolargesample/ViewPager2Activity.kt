package net.hydrakecat.transactiontoolargesample

import android.os.Bundle
import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class ViewPager2Activity : AppCompatActivity() {
  private var viewPager: ViewPager2? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_view_pager2)

    viewPager = findViewById(R.id.view_pager)
    viewPager!!.adapter = MyAdapter2(1_500, supportFragmentManager)
  }

  override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
    event ?: return super.onKeyDown(keyCode, event)
    if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT && event.action == KeyEvent.ACTION_DOWN) {
      viewPager?.setCurrentItem(viewPager!!.currentItem + 1, true)
          ?: return super.onKeyDown(keyCode, event)
      return true
    }
    return super.onKeyDown(keyCode, event)
  }
}

private class MyAdapter2(private val size: Int, fm: FragmentManager) : FragmentStateAdapter(fm) {
  override fun getItem(position: Int): Fragment {
    return MyFragment.newInstance(position)
  }

  override fun getItemCount() = size
}

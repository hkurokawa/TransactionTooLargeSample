package net.hydrakecat.transactiontoolargesample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPager1Activity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_view_pager1)

    val viewPager = findViewById<ViewPager>(R.id.view_pager)
    viewPager.adapter = MyAdapter1(1_500, supportFragmentManager)
  }
}

private class MyAdapter1(private val s: Int, fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
  override fun getItem(position: Int): Fragment {
    return MyFragment.newInstance(position)
  }

  override fun getCount() = s
}

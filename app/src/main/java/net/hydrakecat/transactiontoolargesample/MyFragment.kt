package net.hydrakecat.transactiontoolargesample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

const val ARG_KEY_NUM = "num"

class MyFragment : Fragment() {
  companion object {
    fun newInstance(num: Int): Fragment {
      val f = MyFragment()
      f.arguments = bundleOf(ARG_KEY_NUM to num)
      return f
    }
  }

  override fun onCreateView(
      inflater: LayoutInflater,
      container: ViewGroup?,
      savedInstanceState: Bundle?
  ): View? {
    val num = arguments!!.getInt(ARG_KEY_NUM)
    val root = inflater.inflate(R.layout.fragment_my, container, false)
    root.findViewById<TextView>(R.id.text).text = num.toString()
    return root
  }

  override fun onSaveInstanceState(outState: Bundle) {
    outState.putByteArray("dummy-data", ByteArray(1_000_000))
  }
}
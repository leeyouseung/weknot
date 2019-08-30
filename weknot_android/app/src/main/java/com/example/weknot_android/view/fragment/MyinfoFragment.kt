package com.example.weknot_android.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weknot_android.R
import com.example.weknot_android.base.BaseFragment
import com.example.weknot_android.databinding.MyinfoFragmentBinding

class MyinfoFragment : BaseFragment<MyinfoFragmentBinding>() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun layoutId(): Int {
        return R.layout.myinfo_fragment
    }
}
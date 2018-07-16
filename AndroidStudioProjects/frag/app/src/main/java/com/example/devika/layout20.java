/**
 * Created by DEVIKA on 24-Oct-16.
 */

package com.example.devika;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import devika.example.com.frag.R;


public class layout20 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */
        return inflater.inflate(
                R.layout.layout1, container, false);
    }
}
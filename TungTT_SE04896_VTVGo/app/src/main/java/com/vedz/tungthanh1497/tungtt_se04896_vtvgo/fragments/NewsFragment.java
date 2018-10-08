package com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.R;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.adapters.TabPagerNewsAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    FragmentActivity fragmentActivity;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        configureTabLayout(view);

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        fragmentActivity = (FragmentActivity) activity;
        super.onAttach(activity);
    }

    private void configureTabLayout(View view) {
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tl_news);
        tabLayout.addTab(tabLayout.newTab().setText("Mới nhất"));
        tabLayout.addTab(tabLayout.newTab().setText("Nóng nhất"));
        tabLayout.addTab(tabLayout.newTab().setText("Kinh tế"));
        tabLayout.addTab(tabLayout.newTab().setText("Thể thao"));
        tabLayout.addTab(tabLayout.newTab().setText("Giải trí"));
        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager_news);
        final PagerAdapter adapter = new TabPagerNewsAdapter(fragmentActivity.getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

}

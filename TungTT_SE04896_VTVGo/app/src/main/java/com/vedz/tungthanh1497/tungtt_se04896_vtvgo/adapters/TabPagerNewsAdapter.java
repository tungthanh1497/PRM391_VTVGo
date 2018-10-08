package com.vedz.tungthanh1497.tungtt_se04896_vtvgo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments.newsFragments.EconomyFragment;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments.newsFragments.EntertainmentFragment;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments.newsFragments.HottestFragment;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments.newsFragments.LatestFragment;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments.newsFragments.SportFragment;

public class TabPagerNewsAdapter extends FragmentPagerAdapter {
    int tabCount;

    public TabPagerNewsAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.tabCount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LatestFragment();
            case 1:
                return new HottestFragment();
            case 2:
                return new EconomyFragment();
            case 3:
                return new SportFragment();
            case 4:
                return new EntertainmentFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}

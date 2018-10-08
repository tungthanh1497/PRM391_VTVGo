package com.vedz.tungthanh1497.tungtt_se04896_vtvgo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments.GalleryFragment;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments.LiveFragment;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments.MenuFragment;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments.NewsFragment;
import com.vedz.tungthanh1497.tungtt_se04896_vtvgo.fragments.VideoFragment;

public class TabPagerMainAdapter extends FragmentPagerAdapter {
    int tabCount;

    public TabPagerMainAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.tabCount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LiveFragment();
            case 1:
                return new NewsFragment();
            case 2:
                return new VideoFragment();
            case 3:
                return new GalleryFragment();
            case 4:
                return new MenuFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}

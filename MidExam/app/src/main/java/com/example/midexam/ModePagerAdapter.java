package com.example.midexam;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ModePagerAdapter extends FragmentStateAdapter {

    private final String[] tabTitles = new String[]{"First", "Second", "Third"};

    public ModePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return TabFragment.newInstance(tabTitles[position]);
    }

    @Override
    public int getItemCount() {
        return tabTitles.length;
    }
}
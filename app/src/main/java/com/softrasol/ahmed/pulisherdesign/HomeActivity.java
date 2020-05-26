package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.softrasol.ahmed.pulisherdesign.Adapters.TabsAccessorAdapter;
import com.softrasol.ahmed.pulisherdesign.Fragments.EarningsPayoutFragment;
import com.softrasol.ahmed.pulisherdesign.Fragments.ProfileFragment;
import com.softrasol.ahmed.pulisherdesign.Fragments.PublicationListFragment;

public class HomeActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.ic_terms_cons,
            R.drawable.ic_payment,
            R.drawable.ic_profile
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tabLayoutImplementation();
        setupTabIcons();


    }

    private void tabLayoutImplementation() {

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        TabsAccessorAdapter adapter = new TabsAccessorAdapter(getSupportFragmentManager());
        adapter.setFragment(new PublicationListFragment(), "");
        adapter.setFragment(new EarningsPayoutFragment(), "");
        adapter.setFragment(new ProfileFragment(), "");

        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);

    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);


        tabLayout.getTabAt(0).getIcon().setColorFilter(Color.parseColor("#009688"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(1).getIcon().setColorFilter(Color.parseColor("#646464"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(2).getIcon().setColorFilter(Color.parseColor("#646464"), PorterDuff.Mode.SRC_IN);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#009688"), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#646464"), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}

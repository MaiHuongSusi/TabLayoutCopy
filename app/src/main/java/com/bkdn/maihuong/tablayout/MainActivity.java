package com.bkdn.maihuong.tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

interface ProcessClick{
    public void finishActivity();
}

public class MainActivity extends AppCompatActivity implements ProcessClick{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.vp);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab) ;

        CustomFragmentPagerAdapter customFragmentPagerAdapter = new CustomFragmentPagerAdapter(getSupportFragmentManager());
        customFragmentPagerAdapter.addData(new FragmentRoot(), "SUSI");
        customFragmentPagerAdapter.addData(new Fragment2(), "XINH");
        customFragmentPagerAdapter.addData(new Fragment3(), "DEP");
        customFragmentPagerAdapter.addData(new Fragment4(), "HIHI");
        viewPager.setAdapter(customFragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);



    }

    @Override
    public void finishActivity() {
        finish();
    }
}

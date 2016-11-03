package test.bawei.administrator.myliteraryfederation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;

import java.util.List;

import test.bawei.administrator.myliteraryfederation.com.bawei.fragment.Fragment01;
import test.bawei.administrator.myliteraryfederation.com.bawei.fragment.Fragment02;
import test.bawei.administrator.myliteraryfederation.com.bawei.fragment.Fragment03;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private ImageButton iv1;
    private ImageButton iv3;
    private ViewPager vp;
    private List<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //设置集合
//        fragmentList = new ArrayList<>();
//        //添加3个Fragment
//        fragmentList.add(new Fragment01());
//        fragmentList.add(new Fragment02());
//        fragmentList.add(new Fragment03());
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Fragment fragment = null;
                switch (position) {
                    case 0:
                        fragment = new Fragment01();
                        break;
                    case 1:
                        fragment = new Fragment02();
                        break;
                    case 2:
                        fragment = new Fragment03();
                        break;
                    default:
                        break;
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
    }

    //初始化控件
    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        iv1 = (ImageButton) findViewById(R.id.iv1);
        iv3 = (ImageButton) findViewById(R.id.iv3);
        ImageButton s1 = (ImageButton) findViewById(R.id.s1);
        ImageButton s2 = (ImageButton) findViewById(R.id.s2);
        ImageButton s3 = (ImageButton) findViewById(R.id.s3);
        //设置点击事件
        s1.setOnClickListener(this);
        s2.setOnClickListener(this);
        s3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.s1:
                vp.setCurrentItem(0);
                break;
            case R.id.s2:
                vp.setCurrentItem(1);
                break;
            case R.id.s3:
                vp.setCurrentItem(2);
                break;
            default:
                break;
        }
    }
}

package test.bawei.administrator.myliteraryfederation.com.bawei.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import test.bawei.administrator.myliteraryfederation.BeanGv;
import test.bawei.administrator.myliteraryfederation.GvAdapter;
import test.bawei.administrator.myliteraryfederation.LvAdapter;
import test.bawei.administrator.myliteraryfederation.R;

/**
 * Created by Administrator on 2016/11/3.
 */
public class Fragment01 extends Fragment {
    private List<BeanGv> gvList;
    private GridView gv;
    private ListView lv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.f01, container, false);
        //找控件
        gv = (GridView) inflate.findViewById(R.id.grid);
        lv = (ListView) inflate.findViewById(R.id.lv);
        return inflate;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        //设置GridView适配器
        gv.setAdapter(new GvAdapter(gvList, getContext()));
        lv.setAdapter(new LvAdapter(gvList, getContext()));//设置ListView适配器

    }

    //自定义数据
    private void initData() {
        gvList = new ArrayList<>();
        gvList.add(new BeanGv("作家协会", R.drawable.gv1));
        gvList.add(new BeanGv("美术家协会", R.drawable.gv2));
        gvList.add(new BeanGv("杂技家协会", R.drawable.gv3));
        gvList.add(new BeanGv("戏剧家协会", R.drawable.gv4));
        gvList.add(new BeanGv("舞蹈家协会", R.drawable.gv5));
        gvList.add(new BeanGv("音乐家协会", R.drawable.gv6));
        gvList.add(new BeanGv("曲艺家协会", R.drawable.gv7));
        gvList.add(new BeanGv("音乐协会", R.drawable.gv8));
        gvList.add(new BeanGv("文艺协会", R.drawable.gv9));
        gvList.add(new BeanGv("电影家协会", R.drawable.gv10));
        gvList.add(new BeanGv("书法协会", R.drawable.gv11));
        gvList.add(new BeanGv("文学院", R.drawable.gv12));
        gvList.add(new BeanGv("摄影家协会", R.drawable.gv13));
        gvList.add(new BeanGv("评论家协会", R.drawable.gv14));
    }
}

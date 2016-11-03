package test.bawei.administrator.myliteraryfederation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/11/3.
 */
public class LvAdapter extends BaseAdapter {
    private Context context;
    private List<BeanGv> gvList;

    public LvAdapter(List<BeanGv> gvList, Context context) {
        this.gvList = gvList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return gvList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = View.inflate(context, R.layout.lv, null);
        //找控件
        ImageView lv_image = (ImageView) inflate.findViewById(R.id.lv_image);
        TextView lv_text = (TextView) inflate.findViewById(R.id.lv_text);
        TextView lv_time = (TextView) inflate.findViewById(R.id.lv_time);
        lv_image.setImageResource(gvList.get(i).getId());
        lv_text.setText(gvList.get(i).getName());
//        获取当前的 年月日+时间
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss ");
        Date curDate = new Date(System.currentTimeMillis());//获取当前时间
        //转换成字符串
        String str = formatter.format(curDate);
        lv_time.setText(str);
        return inflate;
    }
}

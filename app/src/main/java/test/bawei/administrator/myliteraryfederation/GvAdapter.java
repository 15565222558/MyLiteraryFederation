package test.bawei.administrator.myliteraryfederation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/11/3.
 */
public class GvAdapter extends BaseAdapter {
    private Context context;
    private List<BeanGv> gvList;

    public GvAdapter(List<BeanGv> gvList, Context context) {
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
        View inflate = View.inflate(context, R.layout.gv, null);
        //找控件
        ImageView gv_image = (ImageView) inflate.findViewById(R.id.gv_image);
        TextView gv_text = (TextView) inflate.findViewById(R.id.gv_text);
        gv_image.setImageResource(gvList.get(i).getId());
        gv_text.setText(gvList.get(i).getName());
        return inflate;
    }
}

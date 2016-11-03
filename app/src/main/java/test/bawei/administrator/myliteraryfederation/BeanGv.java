package test.bawei.administrator.myliteraryfederation;

/**
 * Created by Administrator on 2016/11/3.
 */
public class BeanGv {
    private String name;
    private int id;

    public BeanGv(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public BeanGv() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

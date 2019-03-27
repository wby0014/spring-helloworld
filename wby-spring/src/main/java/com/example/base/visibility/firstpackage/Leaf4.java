package com.example.base.visibility.firstpackage;

/**
 * @author wubinyu
 * @date 2019/3/27 15:05.
 */
public abstract class Leaf4 implements Leaf6 {

    private String leaf4Str;

    public Leaf5 leaf5;

    public Leaf4() {
    }

    public Leaf4(Leaf7 leaf7) {
        this.leaf4Str = "leaf4";
        this.leaf5 = new Leaf5(this);
    }

    @Override
    public String toString() {
        return "Leaf4{" +
                "leaf4Str='" + leaf4Str + '\'' +
                '}';
    }
}

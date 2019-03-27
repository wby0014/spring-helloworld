package com.example.base.visibility.firstpackage;

/**
 * @author wubinyu
 * @date 2019/3/27 15:06.
 */
public class Leaf5 implements Leaf6 {

    private Leaf7 leaf7;

    public String leaf5Str;

    public Leaf5() {
    }

    public Leaf5(Leaf7 leaf7) {
        this.leaf7 = leaf7;
    }

    public Leaf7 getLeaf7() {
        return leaf7;
    }

}

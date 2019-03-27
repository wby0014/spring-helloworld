package com.example.base.visibility.firstpackage;

/**
 * @author wubinyu
 * @date 2019/3/27 15:05.
 */
public class Leaf1 extends Leaf2 {

    private String leaf1Str;


    public Leaf1() {
    }

    public Leaf1(String leaf1Str) {
        this(leaf1Str, null);
    }

    public Leaf1(String leaf1Str, Leaf7 leaf7) {
        super(leaf7);
        this.leaf1Str = leaf1Str;
    }

    @Override
    public String toString() {
        return "Leaf1{" +
                "leaf1Str='" + leaf1Str + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Leaf1 leaf1 = new Leaf1("leaf1");
        System.out.println(leaf1.leaf1Str);
        System.out.println(leaf1.leaf5.getLeaf7());
        System.out.println(leaf1.leaf2Str);
    }
}

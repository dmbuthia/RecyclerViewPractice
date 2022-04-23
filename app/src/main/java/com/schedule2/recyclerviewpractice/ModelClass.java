package com.schedule2.recyclerviewpractice;

public class ModelClass {
    private int img1;
    private String tv1;
    private String tv2;

    ModelClass(int img1, String tv1, String tv2){
        this.img1 = img1;
        this.tv1 = tv1;
        this.tv2 = tv2;
    }

    public int getImg1() {
        return img1;
    }

    public String getTv1() {
        return tv1;
    }

    public String getTv2() {
        return tv2;
    }
}

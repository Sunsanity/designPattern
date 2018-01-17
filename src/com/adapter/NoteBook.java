package com.adapter;

/**
 * 笔记本类及测试方法
 * Created by hasee on 2018/1/17.
 */
public class NoteBook {

    private ThreePlugIf threePlugIf;

    //构造对象时需要传入一个三项接口
    public NoteBook(ThreePlugIf threePlugIf) {
        this.threePlugIf = threePlugIf;
    }

    //笔记本的充电功能
    public void charge(){
        threePlugIf.powerWithThree();
    }

    /**
     * 适配器测试方法
     * @param args
     */
    public static void main(String[] args) {
        GBTwoPlug gbTwoPlug = new GBTwoPlug();
        ThreePlugIf adapter = new TwoPlugAdapter(gbTwoPlug);
        NoteBook noteBook = new NoteBook(adapter);

        noteBook.charge();
    }
}
package com.gupao.design.prototype;

import java.util.Date;

/**
 * <p>浅拷贝的测试类</p>
 *
 * @author Andy
 * @date 2018/3/10.
 */
public class ShallowCloneTest {

    public static void main(String[] args) {
        HighSpeedRail hsr = new HighSpeedRail();
        hsr.setName("高铁1");
        hsr.setShifts("G45");

        Train train = new Train();
        train.setBigLight("激光灯");
        train.setCarriage(14);
        train.setWheel("高速车轮");
        hsr.setProductionDate(new Date());
        hsr.setTrain(train);

        try {
            HighSpeedRail copy = (HighSpeedRail) hsr.clone();
            System.out.println(hsr.getTrain() == copy.getTrain());
            copy.setName("高铁2");
            copy.setShifts("G88");
            copy.setProductionDate(new Date());

            copy.getTrain().setBigLight("普通灯");
            copy.getTrain().setCarriage(18);
            copy.getTrain().setWheel("普通车轮");
            System.out.println(hsr.getTrain());
            System.out.println(copy.getTrain());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

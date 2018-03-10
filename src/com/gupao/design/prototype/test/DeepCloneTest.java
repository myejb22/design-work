package com.gupao.design.prototype.test;

import com.gupao.design.prototype.HighSpeedRail;
import com.gupao.design.prototype.Train;

import java.io.IOException;
import java.util.Date;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/10.
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        HighSpeedRail hsr = new HighSpeedRail();
        hsr.setName("高铁1");
        hsr.setShifts("G45");
        hsr.setProductionDate(new Date());

        Train train = new Train();
        train.setBigLight("激光灯");
        train.setCarriage(14);
        train.setWheel("高速车轮");
        hsr.setTrain(train);

        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            HighSpeedRail hsr2 = (HighSpeedRail)hsr.deepClone();
            hsr2.setName("高铁2");
            hsr2.setShifts("G88");
            hsr2.setProductionDate(new Date());
            System.out.println(hsr);
            System.out.println(hsr2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

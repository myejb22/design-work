package com.gupao.design.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>火车</p>
 *
 * @author Andy
 * @date 2018/3/10.
 */
public class Train implements Serializable{

    /**
     * 车厢的数量
     */
    private int carriage;

    /**
     * 轮子
     */
    private String wheel;

    /**
     * 大灯
     */
    private String bigLight;

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getBigLight() {
        return bigLight;
    }

    public void setBigLight(String bigLight) {
        this.bigLight = bigLight;
    }

    @Override
    public String toString() {
        return "Train{" +
                "carriage=" + carriage +
                ", wheel='" + wheel +
                ", bigLight='" + bigLight + '}';
    }
}

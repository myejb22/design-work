package com.gupao.design.prototype;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/10.
 */
public class Metro extends HighSpeedRail implements Serializable{

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

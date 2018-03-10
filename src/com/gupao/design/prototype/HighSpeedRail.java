package com.gupao.design.prototype;

import java.io.*;
import java.util.Date;

/**
 * <p>高铁</p>
 *
 * @author Andy
 * @date 2018/3/10.
 */
public class HighSpeedRail implements Serializable,Cloneable{

    private String name;

    /**
     * 班次
     */
    private String shifts;

    /**
     * 生产日期
     */
    private Date productionDate;

    private Train train;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShifts() {
        return shifts;
    }

    public void setShifts(String shifts) {
        this.shifts = shifts;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        oos.flush();
        oos.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object o = ois.readObject();
        ois.close();
        return o;
    }

    @Override
    public String toString() {
        return "HighSpeedRail{" +
                "name='" + name + '\'' +
                ", shifts='" + shifts + '\'' +
                "carriage=" + train.getCarriage() +
                ", wheel='" + train.getWheel() + '\'' +
                ", bigLight='" + train.getBigLight() + '\'' +
                ", productionDate=" + productionDate +
                "} ";
    }
}

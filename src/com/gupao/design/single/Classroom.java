package com.gupao.design.single;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/10.
 */
public class Classroom {

    private static final Map<String, Object> beans = new ConcurrentHashMap<>();

    /**
     * 通过注册式方式来进行序列化
     * //@param name
     * @return
     */
    /*public static Object getBean(String name) {
        synchronized (Headmaster.class) {
            if (null == name || "".equals(name)) {
                return new Headmaster();
            }

            Object obj = null;
            if (!beans.containsKey(name)) {
                try {
                    obj = Class.forName(name).newInstance();
                    beans.put(name, obj);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                return beans.get(name);
            }
            return obj;
        }
    }*/

    private static class ClassroomInner {
        private static int COUNT = 0;
        private static final Classroom INSTANCE = new Classroom();
    }

    public static final Classroom getInstance() {
        return ClassroomInner.INSTANCE;
    }

    /**
     * 组织活动的同学
     */
    public void intoClassroom(Student student) {
        if (ClassroomInner.COUNT == 0) {
            System.out.print("同学们依次进入教室统计开始：");
        }
        System.out.println(student.getName());
        ClassroomInner.COUNT++;
    }
}

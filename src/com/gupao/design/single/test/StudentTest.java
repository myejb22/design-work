package com.gupao.design.single.test;

import com.gupao.design.single.Classroom;
import com.gupao.design.single.Student;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/10.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("张三");

        Student st2 = new Student();
        st2.setName("李四");

       /* int count = 200;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(){
                @Override
                public void run() {
                    latch.countDown();

                    Object obj = Headmaster.getInstance();
                    System.out.println(Thread.currentThread().getName()+":"+obj);
                }
            }.start();

        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Classroom classroom = Classroom.getInstance();
        classroom.intoClassroom(st1);
        classroom.intoClassroom(st2);
    }
}

package com.tugrulaslan.batch;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by Tugrul ASLAN on 5/1/2017.
 */
public class JobStep1Writer implements ItemWriter<String> {
    public void write(List<? extends String> list) throws Exception {
        String obj = list.get(0);
        if(obj != null){
            System.out.println("writing " + obj);
        }
    }
}

package com.tugrulaslan.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Tugrul ASLAN on 5/1/2017.
 */
public class JobStep1Reader implements ItemReader {

    private Iterator<String> userIterator;

    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if(userIterator == null){
            userIterator = userListPopulator().iterator();
        }
        String obj = userIterator.hasNext() ? userIterator.next() : null;
        System.out.println("reading " + obj);
        return obj;
    }

    private List<String> userListPopulator(){
        List<String> userData = new ArrayList<String>();
        userData.add("A");
        userData.add("B");
        userData.add("C");
        return  userData;
    }


}

package com.tugrulaslan.dao;

import com.tugrulaslan.entity.Category;
import com.tugrulaslan.entity.Post;

/**
 * Created by Tugrul on 6/22/2015.
 */
public interface AppDAO {
    void saveObject(Object object);
    Category getCategoryByName(String categoryName);
}

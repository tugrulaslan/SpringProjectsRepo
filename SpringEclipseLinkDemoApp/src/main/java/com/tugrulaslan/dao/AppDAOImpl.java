package com.tugrulaslan.dao;

import com.tugrulaslan.entity.Category;
import com.tugrulaslan.entity.Post;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Created by Tugrul on 6/22/2015.
 */
@Repository
public class AppDAOImpl implements AppDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveObject(Object object) {
        entityManager.merge(object);
    }

    public Category getCategoryByName(String categoryName) {
        TypedQuery<Category> query = entityManager.createQuery("select c from Category As c where c.categoryName = ?1 ", Category.class);
        return query.setParameter(1, categoryName).getSingleResult();
    }

}

import com.tugrulaslan.dao.AppDAO;
import com.tugrulaslan.entity.Category;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Tugrul on 6/22/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:*applicationContext-test.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppDAOTest {

    @Autowired
    private AppDAO appDAO;

    private final static String parentCatName = "TESTPARENTCATEGORY";
    private final static String childCatName = "TESTCHILDCATEGORY";
    private final static String grandChildCatName = "TESTGRANDCHILDCATEGORY";
    private final static String postName = "TESTPOST";
    private final static String userName = "TESTUSER";
    private final static String userName2 = "TESTUSERTEST";
    private Date date = new Date();

    @Test
    public void stage01_CreateParentCategoryTest() {
        //Create the parent category
        appDAO.saveObject(new Category(parentCatName, date, null, null, null));

        //Fetch the parent category
        Category category = appDAO.getCategoryByName(parentCatName);

        //Check whether the object is not null
        assertNotNull(category);

        //Check the parent category name does match
        assertEquals(parentCatName, category.getCategoryName());
    }

    @Test
    public void stage02_CreateAndTestChildCategoryTest() {
        //Get the parent category
        Category parentCategory = appDAO.getCategoryByName(parentCatName);

        //Create the child category
        appDAO.saveObject(new Category(childCatName, date, parentCategory, null, null));

        //Fetch the newly created child category
        Category childCategory = appDAO.getCategoryByName(childCatName);

        //Collect parent category sub categories
        Set parentSubCategories = parentCategory.getSubCategories();

        //Check whether the parent object is not null
        assertNotNull(parentCategory);

        //Check whether the child object is not null
        assertNotNull(childCategory);

        //Check the child category name does match
        assertEquals(childCatName, childCategory.getCategoryName());

        //Check whether the parent category of the child is not null
        assertNotNull(childCategory.getParentCategory());

        //Check the child's parent category's name
        assertEquals(parentCatName, childCategory.getParentCategory().getCategoryName());

        //Check the child category has its parent
        assertEquals(1, parentCategory.getSubCategories().size());
    }

    @Test
    public void stage03_CreateGrandChildCategoryAsRootCategoryTest() {
        //Create grand child category
        appDAO.saveObject(new Category(grandChildCatName, date, null, null, null));

        //Check whether the grand child category has been created
        assertEquals(grandChildCatName, appDAO.getCategoryByName(grandChildCatName).getCategoryName());
    }

    @Test
    public void stage04_MoveGrandChildCategoryToParentCategoryTest() {
        //Fetch the grand child category
        Category grandChildCategory = appDAO.getCategoryByName(grandChildCatName);

        //Set grand child's parent category as parent category
        grandChildCategory.setParentCategory(appDAO.getCategoryByName(parentCatName));
        appDAO.saveObject(grandChildCategory);

        //Fetch the grand child category again and check whether its parent category has been assigned as the corresponding parent category
        assertEquals(parentCatName, appDAO.getCategoryByName(grandChildCatName).getParentCategory().getCategoryName());
    }

    @Test
    public void stage05_MoveGrandChildCategoryToChildCategoryTest() {
        //Fetch the grand child category
        Category grandChildCategory = appDAO.getCategoryByName(grandChildCatName);

        //Set grand child's parent category as parent category
        grandChildCategory.setParentCategory(appDAO.getCategoryByName(childCatName));
        appDAO.saveObject(grandChildCategory);

        //Fetch the grand child category again and check whether its parent category has been assigned as the corresponding child category
        assertEquals(childCatName, appDAO.getCategoryByName(grandChildCatName).getParentCategory().getCategoryName());
    }

}

package com.tugrulaslan;

import com.tugrulaslan.dao.PersonDAO;
import com.tugrulaslan.domain.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource resource = new ClassPathResource("spring.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        System.out.println(beanFactory.toString());

        PersonDAO personDAO = (PersonDAO) beanFactory.getBean("personDAO");

        List<Person> getAllPersons = personDAO.getAllPersons();
        List findUserByCommonName = personDAO.findUserByCommonName("tugrul");

        System.out.println("All user size: " + getAllPersons.size());
        System.out.println("Found user size: " + findUserByCommonName.size());


    }
}

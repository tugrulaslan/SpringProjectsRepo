package com.tugrulaslan.dao;

import com.tugrulaslan.domain.Person;
import com.tugrulaslan.utils.PersonAttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tugrul on 11.02.2014.
 */


public class PersonDAOImpl implements PersonDAO{

    private LdapTemplate ldapTemplate;

    public void setLdapTemplate(LdapTemplate ldapTemplate) {
        this.ldapTemplate = ldapTemplate;
    }


    @Override
    public List<Person> getAllPersons() {
        List<Person> contacts = new ArrayList<Person>();
        try {
            List search = ldapTemplate.search("", "(objectClass=person)", new PersonAttributesMapper());
            contacts.addAll(search);
        } catch (Exception e) {
            System.out.println("Exception while listing all users" + e);
        }

        return contacts;
    }

    @Override
    public List findUserByCommonName(String commonName) {
            AndFilter andFilter = new AndFilter();
            andFilter.and(new EqualsFilter("objectclass","person"));
            andFilter.and(new EqualsFilter("cn", commonName));
            return ldapTemplate.search("", andFilter.encode(), new PersonAttributesMapper());
    }
}

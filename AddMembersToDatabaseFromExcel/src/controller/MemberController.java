/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Members;
import org.hibernate.Session;
import resources.HibernateUtil;

/**
 *
 * @author Reshan Pubudu
 */
public class MemberController {

    public boolean addMember(Members members) throws Exception{

        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            boolean result = session.save(members) != null;
            session.getTransaction().commit();
            return result;
        }
      
    }
}

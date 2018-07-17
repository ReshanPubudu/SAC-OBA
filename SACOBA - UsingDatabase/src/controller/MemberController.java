/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Members;
import java.util.List;
import org.hibernate.Session;
import resources.HibernateUtil;

/**
 *
 * @author Reshan Pubudu
 */
public class MemberController {

    public boolean addMember(Members members) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            boolean result = session.save(members) != null;
            session.getTransaction().commit();
            return result;
        }
    }

    public List<Members> viewAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            List<Members> memberses = session.createQuery("from Members order by regNo asc").list();
            session.getTransaction().commit();
            return memberses;
        }
    }

    public List<Members> uniSearch(String where, String id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            List<Members> memberses = session.createQuery("from Members where " + where + " like '%" + id + "%'").list();
            session.getTransaction().commit();
            return memberses;
        }
    }

    public List<Members> anySearch(String any) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            List<Members> memberses = session.createQuery("from Members where regNo like '%" + any + "%' OR name like '%" + any + "%' OR initials like '%" + any + "%' OR no like '%" + any + "%' OR area like '%" + any + "%' OR city like '%" + any + "%'").list();
            session.getTransaction().commit();
            return memberses;
        }
    }

    public List<Members> addressSerch(String address) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            List<Members> memberses = session.createQuery("from Members where no like '%" + address + "%' OR area like '%" + address + "%' OR city like '%" + address + "%'").list();
            session.getTransaction().commit();
            return memberses;
        }
    }

    public boolean updateMember(Members members) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(members);
            session.getTransaction().commit();
            return true;
        }
    }

    public boolean deleteMember(Members members) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete(members);
            session.getTransaction().commit();
            return true;
        }
    }
}

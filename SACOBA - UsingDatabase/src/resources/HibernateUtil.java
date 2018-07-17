/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import entity.Members;
import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Reshan Pubudu
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    private static StandardServiceRegistry registry;

    static {
        try {
   
            File hibernateProperties = new File("settings/hibernate.properties");
            registry = new StandardServiceRegistryBuilder().loadProperties(hibernateProperties).build();

            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Members.class)
                    .buildMetadata().buildSessionFactory();

        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            StandardServiceRegistryBuilder.destroy(registry);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

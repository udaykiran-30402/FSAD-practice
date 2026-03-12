package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class ClientDemo 
{
    public static void main(String[] args) 
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Invoice.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        // Insert records
        Invoice i1 = new Invoice(1,"Laptop","12-03-2026","Paid");
        Invoice i2 = new Invoice(2,"Mobile","11-03-2026","Pending");

        session.save(i1);
        session.save(i2);

        tx.commit();

        // HQL Query (view all records)
        String hql = "from Invoice";

        Query<Invoice> query = session.createQuery(hql, Invoice.class);

        List<Invoice> list = query.list();

        for(Invoice inv : list)
        {
            System.out.println(inv.getId()+" "
            +inv.getName()+" "
            +inv.getDate()+" "
            +inv.getStatus());
        }

        session.close();
        sf.close();
    }
}
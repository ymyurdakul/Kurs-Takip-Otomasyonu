/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Dao;

import com.KursTakiipAbstractDao.HibernateUtil;
import com.KursTakip.Dto.Sozlesme;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;

 
public class SozlesmeDaoImp extends com.KursTakiipAbstractDao.SozlesmeDao {

    Session ses=null;
    public SozlesmeDaoImp()
    {
        ses=HibernateUtil.getSessionFactory().openSession();
    }
    public void close()
    {
        ses.close();
    }
    @Override
    public List<Sozlesme> getAll() {
       return  ses.createQuery("from sozlesme").list();
    }

    @Override
    public void save(Sozlesme t) {
        ses.getTransaction().begin();
        ses.save(t);
        ses.getTransaction().commit();
    }

    @Override
    public void deleter(Sozlesme t) {
        ses.getTransaction().begin();
        ses.delete(t);
        ses.getTransaction().commit();
    }

    @Override
    public void update(Sozlesme t) {
       ses.getTransaction().begin();
       ses.update(t);
       ses.getTransaction().commit();
    }

    @Override
    public Sozlesme getById(Serializable id) {
        Sozlesme sz=(Sozlesme)ses.get(Sozlesme.class, id);
        return sz;
    }
    
    
}

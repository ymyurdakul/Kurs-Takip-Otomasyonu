/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Dao;

import com.KursTakiipAbstractDao.HibernateUtil;
import com.KursTakiipAbstractDao.KullaniciDao;
import com.KursTakip.Dto.Kullanici;
import com.KursTakip.Dto.KullaniciId;
import org.hibernate.Session;

 
public class KullaniciDaoImp implements KullaniciDao{

    Session session;
    public KullaniciDaoImp()
    {
        session=HibernateUtil.getSessionFactory().openSession();
    }
    @Override
    public boolean kontrolEt(KullaniciId kul) {
           return session.get(Kullanici.class, kul)!=null;
    }

    @Override
    public void guncelle(Kullanici kul) {
        
    }

    @Override
    public void ekle(Kullanici kul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sil(Kullanici kul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}

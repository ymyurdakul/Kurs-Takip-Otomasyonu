 
package com.Dao;
 
import com.KursTakiipAbstractDao.HibernateUtil;
import com.KursTakiipAbstractDao.OgrenciDao;
import com.KursTakip.Dto.Ogrenci;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Temporal;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

 
public class OgrenciDaoImp extends OgrenciDao {

    Session session=HibernateUtil.getSessionFactory().openSession();
    @Override
    public List<Ogrenci> getAll() {
         return session.createQuery("from Ogrenci").list();
    }

    @Override
    public void save(Ogrenci t) {
        
        session.getTransaction().begin();
      session.save(t);
      session.getTransaction().commit();
       
    }

    @Override
    public void deleter(Ogrenci t) {
         session.getTransaction().begin();
      session.delete(t);
      session.getTransaction().commit();
    }

    @Override
    public void update(Ogrenci t) {
         session.getTransaction().begin();
      session.update(t);
      session.getTransaction().commit();
    }

    @Override
    public Ogrenci getById(Serializable id) {
          return(Ogrenci) session.get(Ogrenci.class, id);
    }
    public void close()
    {
        session.close();
    }

    @Override
    public List<Ogrenci> sartlıAra(List<SimpleExpression> constraints) {
         Criteria cr=session.createCriteria(Ogrenci.class);
         constraints.forEach(cr::add);
         return cr.list();
    }
    public boolean kayitKontrol(String aranan,String kontrol)
    {
     if(kontrol.equals("Tc"))
     {
     for(Ogrenci ogr:getAll())
     {
         if(ogr.getTc().equals(aranan.trim()))
             return true;
     }
     }
     if(kontrol.equals("Numara"))
     {
     for(Ogrenci ogr:getAll())
     {
         if(ogr.getNumara()!=null)
         if(ogr.getNumara().toString().equals(aranan.trim()))
             return true;
     }
     }
    
    
     return false;
     
    }
    public void closeSession()
    {
        session.close();
    }
  
      
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.KursTakiipAbstractDao;

import com.KursTakip.Dto.Ogrenci;
import java.io.Serializable;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

 
public  interface  BasicCrudDao<T>{
    public List<T>getAll();
    public void save(T t);
    public void deleter(T t);
    public void update(T t);
    public T getById(Serializable id);
}

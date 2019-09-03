/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.KursTakiipAbstractDao;

import com.KursTakip.Dto.Ogrenci;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

 
public abstract class OgrenciDao implements BasicCrudDao<Ogrenci>{
    public abstract List<Ogrenci> sartlıAra(List<SimpleExpression>constraints);
    
}

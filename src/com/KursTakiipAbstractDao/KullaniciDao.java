/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.KursTakiipAbstractDao;

import com.KursTakip.Dto.Kullanici;
import com.KursTakip.Dto.KullaniciId;

/**
 *
 * @author Mustafa
 */
public interface KullaniciDao {
    public boolean kontrolEt(KullaniciId kul);
    public void guncelle(Kullanici kul);
    public void ekle(Kullanici kul);
    public void sil(Kullanici kul);
    
}

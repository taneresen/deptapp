
package com.bilisim.deptapp;

import com.bilisim.deptapp.entity.Ogrenci;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Calistir {
    public static void main(String[] args) {
        
        long baslangic = System.currentTimeMillis();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("deptappPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Ogrenci ogr1 =new Ogrenci();
        ogr1.setAd("Taner");
        ogr1.setSoyad("Esen");
        ogr1.setMaas(5000);
        ogr1.setYas(39);
        em.persist(ogr1);
        
        Ogrenci ogr2 =new Ogrenci();
        ogr2.setAd("Yusuf");
        ogr2.setSoyad("Esen");
        ogr2.setMaas(9000);
        ogr2.setYas(70);
        em.persist(ogr2);
        
        em.getTransaction().commit();
        long bitis = System.currentTimeMillis();
        long sonuc = bitis - baslangic;
        System.out.println(sonuc+"milisaniye,yani "+sonuc/100+"saniyede kayd etti");
        em.close();
        emf.close();  
    }
 }


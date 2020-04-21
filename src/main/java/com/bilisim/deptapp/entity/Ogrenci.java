
package com.bilisim.deptapp.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ogrenci implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long no;
    private String ad;
    private String soyad;
    private int yas;
    private double maas;

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the no fields are not set
        if (!(object instanceof Ogrenci)) {
            return false;
        }
        Ogrenci other = (Ogrenci) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bilisim.deptapp.entity.Ogrenci[ id=" + no + " ]";
    }
    
}

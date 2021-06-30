/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package01;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author anik
 */
@Entity
@Table(name = "shop", catalog = "tolet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Shop_1.findAll", query = "SELECT s FROM Shop_1 s")
    , @NamedQuery(name = "Shop_1.findByShopType", query = "SELECT s FROM Shop_1 s WHERE s.shopType = :shopType")
    , @NamedQuery(name = "Shop_1.findByShopSize", query = "SELECT s FROM Shop_1 s WHERE s.shopSize = :shopSize")
    , @NamedQuery(name = "Shop_1.findByLocation", query = "SELECT s FROM Shop_1 s WHERE s.location = :location")
    , @NamedQuery(name = "Shop_1.findByRentPerMonth", query = "SELECT s FROM Shop_1 s WHERE s.rentPerMonth = :rentPerMonth")
    , @NamedQuery(name = "Shop_1.findByEmail", query = "SELECT s FROM Shop_1 s WHERE s.email = :email")
    , @NamedQuery(name = "Shop_1.findByPhone", query = "SELECT s FROM Shop_1 s WHERE s.phone = :phone")})
public class Shop_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ShopType")
    private String shopType;
    @Basic(optional = false)
    @Column(name = "ShopSize")
    private String shopSize;
    @Basic(optional = false)
    @Column(name = "Location")
    private String location;
    @Basic(optional = false)
    @Column(name = "RentPerMonth")
    private String rentPerMonth;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Id
    @Basic(optional = false)
    @Column(name = "Phone")
    private String phone;

    public Shop_1() {
    }

    public Shop_1(String phone) {
        this.phone = phone;
    }

    public Shop_1(String phone, String shopType, String shopSize, String location, String rentPerMonth, String email) {
        this.phone = phone;
        this.shopType = shopType;
        this.shopSize = shopSize;
        this.location = location;
        this.rentPerMonth = rentPerMonth;
        this.email = email;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        String oldShopType = this.shopType;
        this.shopType = shopType;
        changeSupport.firePropertyChange("shopType", oldShopType, shopType);
    }

    public String getShopSize() {
        return shopSize;
    }

    public void setShopSize(String shopSize) {
        String oldShopSize = this.shopSize;
        this.shopSize = shopSize;
        changeSupport.firePropertyChange("shopSize", oldShopSize, shopSize);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    public String getRentPerMonth() {
        return rentPerMonth;
    }

    public void setRentPerMonth(String rentPerMonth) {
        String oldRentPerMonth = this.rentPerMonth;
        this.rentPerMonth = rentPerMonth;
        changeSupport.firePropertyChange("rentPerMonth", oldRentPerMonth, rentPerMonth);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phone != null ? phone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shop_1)) {
            return false;
        }
        Shop_1 other = (Shop_1) object;
        if ((this.phone == null && other.phone != null) || (this.phone != null && !this.phone.equals(other.phone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Package01.Shop_1[ phone=" + phone + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

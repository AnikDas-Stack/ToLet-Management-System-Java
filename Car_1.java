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
@Table(name = "car", catalog = "tolet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Car_1.findAll", query = "SELECT c FROM Car_1 c")
    , @NamedQuery(name = "Car_1.findByCompanyName", query = "SELECT c FROM Car_1 c WHERE c.companyName = :companyName")
    , @NamedQuery(name = "Car_1.findByOwnerName", query = "SELECT c FROM Car_1 c WHERE c.ownerName = :ownerName")
    , @NamedQuery(name = "Car_1.findByOfficeAddress", query = "SELECT c FROM Car_1 c WHERE c.officeAddress = :officeAddress")
    , @NamedQuery(name = "Car_1.findByWebsite", query = "SELECT c FROM Car_1 c WHERE c.website = :website")
    , @NamedQuery(name = "Car_1.findByEmail", query = "SELECT c FROM Car_1 c WHERE c.email = :email")
    , @NamedQuery(name = "Car_1.findByPhone", query = "SELECT c FROM Car_1 c WHERE c.phone = :phone")})
public class Car_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CompanyName")
    private String companyName;
    @Basic(optional = false)
    @Column(name = "OwnerName")
    private String ownerName;
    @Basic(optional = false)
    @Column(name = "OfficeAddress")
    private String officeAddress;
    @Basic(optional = false)
    @Column(name = "Website")
    private String website;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Phone")
    private String phone;

    public Car_1() {
    }

    public Car_1(String companyName) {
        this.companyName = companyName;
    }

    public Car_1(String companyName, String ownerName, String officeAddress, String website, String email, String phone) {
        this.companyName = companyName;
        this.ownerName = ownerName;
        this.officeAddress = officeAddress;
        this.website = website;
        this.email = email;
        this.phone = phone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        String oldCompanyName = this.companyName;
        this.companyName = companyName;
        changeSupport.firePropertyChange("companyName", oldCompanyName, companyName);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        String oldOwnerName = this.ownerName;
        this.ownerName = ownerName;
        changeSupport.firePropertyChange("ownerName", oldOwnerName, ownerName);
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        String oldOfficeAddress = this.officeAddress;
        this.officeAddress = officeAddress;
        changeSupport.firePropertyChange("officeAddress", oldOfficeAddress, officeAddress);
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        String oldWebsite = this.website;
        this.website = website;
        changeSupport.firePropertyChange("website", oldWebsite, website);
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
        hash += (companyName != null ? companyName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Car_1)) {
            return false;
        }
        Car_1 other = (Car_1) object;
        if ((this.companyName == null && other.companyName != null) || (this.companyName != null && !this.companyName.equals(other.companyName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Package01.Car_1[ companyName=" + companyName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

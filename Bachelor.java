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
@Table(name = "bachelor", catalog = "tolet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bachelor.findAll", query = "SELECT b FROM Bachelor b")
    , @NamedQuery(name = "Bachelor.findByNumberOfSeat", query = "SELECT b FROM Bachelor b WHERE b.numberOfSeat = :numberOfSeat")
    , @NamedQuery(name = "Bachelor.findByOccupation", query = "SELECT b FROM Bachelor b WHERE b.occupation = :occupation")
    , @NamedQuery(name = "Bachelor.findByLocation", query = "SELECT b FROM Bachelor b WHERE b.location = :location")
    , @NamedQuery(name = "Bachelor.findByAvailableFrom", query = "SELECT b FROM Bachelor b WHERE b.availableFrom = :availableFrom")
    , @NamedQuery(name = "Bachelor.findByRent", query = "SELECT b FROM Bachelor b WHERE b.rent = :rent")
    , @NamedQuery(name = "Bachelor.findByPhone", query = "SELECT b FROM Bachelor b WHERE b.phone = :phone")})
public class Bachelor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NumberOfSeat")
    private String numberOfSeat;
    @Basic(optional = false)
    @Column(name = "Occupation")
    private String occupation;
    @Basic(optional = false)
    @Column(name = "Location")
    private String location;
    @Basic(optional = false)
    @Column(name = "AvailableFrom")
    private String availableFrom;
    @Basic(optional = false)
    @Column(name = "Rent")
    private String rent;
    @Id
    @Basic(optional = false)
    @Column(name = "Phone")
    private String phone;

    public Bachelor() {
    }

    public Bachelor(String phone) {
        this.phone = phone;
    }

    public Bachelor(String phone, String numberOfSeat, String occupation, String location, String availableFrom, String rent) {
        this.phone = phone;
        this.numberOfSeat = numberOfSeat;
        this.occupation = occupation;
        this.location = location;
        this.availableFrom = availableFrom;
        this.rent = rent;
    }

    public String getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(String numberOfSeat) {
        String oldNumberOfSeat = this.numberOfSeat;
        this.numberOfSeat = numberOfSeat;
        changeSupport.firePropertyChange("numberOfSeat", oldNumberOfSeat, numberOfSeat);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        String oldOccupation = this.occupation;
        this.occupation = occupation;
        changeSupport.firePropertyChange("occupation", oldOccupation, occupation);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    public String getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(String availableFrom) {
        String oldAvailableFrom = this.availableFrom;
        this.availableFrom = availableFrom;
        changeSupport.firePropertyChange("availableFrom", oldAvailableFrom, availableFrom);
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        String oldRent = this.rent;
        this.rent = rent;
        changeSupport.firePropertyChange("rent", oldRent, rent);
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
        if (!(object instanceof Bachelor)) {
            return false;
        }
        Bachelor other = (Bachelor) object;
        if ((this.phone == null && other.phone != null) || (this.phone != null && !this.phone.equals(other.phone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Package01.Bachelor[ phone=" + phone + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

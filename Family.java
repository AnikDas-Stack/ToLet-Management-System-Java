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
@Table(name = "family", catalog = "tolet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Family.findAll", query = "SELECT f FROM Family f")
    , @NamedQuery(name = "Family.findByNumberOfFlat", query = "SELECT f FROM Family f WHERE f.numberOfFlat = :numberOfFlat")
    , @NamedQuery(name = "Family.findByNumberOfRoom", query = "SELECT f FROM Family f WHERE f.numberOfRoom = :numberOfRoom")
    , @NamedQuery(name = "Family.findByLocation", query = "SELECT f FROM Family f WHERE f.location = :location")
    , @NamedQuery(name = "Family.findByAvailableFrom", query = "SELECT f FROM Family f WHERE f.availableFrom = :availableFrom")
    , @NamedQuery(name = "Family.findByRent", query = "SELECT f FROM Family f WHERE f.rent = :rent")
    , @NamedQuery(name = "Family.findByPhone", query = "SELECT f FROM Family f WHERE f.phone = :phone")})
public class Family implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NumberOfFlat")
    private String numberOfFlat;
    @Basic(optional = false)
    @Column(name = "NumberOfRoom")
    private String numberOfRoom;
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

    public Family() {
    }

    public Family(String phone) {
        this.phone = phone;
    }

    public Family(String phone, String numberOfFlat, String numberOfRoom, String location, String availableFrom, String rent) {
        this.phone = phone;
        this.numberOfFlat = numberOfFlat;
        this.numberOfRoom = numberOfRoom;
        this.location = location;
        this.availableFrom = availableFrom;
        this.rent = rent;
    }

    public String getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(String numberOfFlat) {
        String oldNumberOfFlat = this.numberOfFlat;
        this.numberOfFlat = numberOfFlat;
        changeSupport.firePropertyChange("numberOfFlat", oldNumberOfFlat, numberOfFlat);
    }

    public String getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(String numberOfRoom) {
        String oldNumberOfRoom = this.numberOfRoom;
        this.numberOfRoom = numberOfRoom;
        changeSupport.firePropertyChange("numberOfRoom", oldNumberOfRoom, numberOfRoom);
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
        if (!(object instanceof Family)) {
            return false;
        }
        Family other = (Family) object;
        if ((this.phone == null && other.phone != null) || (this.phone != null && !this.phone.equals(other.phone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Package01.Family[ phone=" + phone + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

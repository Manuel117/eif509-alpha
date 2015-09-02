package una.cr.alpha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

import org.appfuse.model.BaseObject;

@Entity @Table(name="menu")
public class Menu extends BaseObject {
    private Long id;
	private String description;
	private Date mondayDate;
	private Long monday;
	private Boolean mondayState;
	private Date tuesdayDate;
	private Long tuesday;
	private Boolean tuesdayState;
	private Date wednesdayDate;
	private Long wednesday;
	private Boolean wednesdayState;
	private Date thursdayDate;
	private Long thursday;
	private Boolean thursdayState;
	private Date fridayDate;
	private Long friday;
	private Boolean fridayState;
	private Date saturdayDate;
	private Long saturday;
	private Boolean saturdayState;
	private Date sundayDate;
	private Long sunday;
	private Boolean sundayState;
	
	 // START SNIPPET: id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    public Long getId() {
        return id;
    }
    // END SNIPET: id
    public void setId(Long id) {
        this.id = id;
    }
	
    @Column(name="description", length=255)
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
   //------------------------- 
    @Column(name="mondaydate")
    public Date getMondayDate() {
        return mondayDate;
    }
    public void setMondayDate(Date mondayDate) {
        this.mondayDate = mondayDate;
    }
    
    @Column(name="monday")
    public Long getMonday() {
        return monday;
    }
    public void setMonday(Long monday) {
        this.monday = monday;
    }
    
    @Column(name="mondaystate")
    public Boolean getMondayState() {
        return mondayState;
    }
    public void setMondayState(Boolean mondayState) {
        this.mondayState = mondayState;
    }
    //------------------------- 
    @Column(name="tuesdaydate")
    public Date getTuesdayDate() {
        return tuesdayDate;
    }
    public void setTuesdayDate(Date tuesdayDate) {
        this.tuesdayDate = tuesdayDate;
    }
    
    @Column(name="tuesday")
    public Long getTuesday() {
        return tuesday;
    }
    public void setTuesday(Long tuesday) {
        this.tuesday = tuesday;
    }
    
    @Column(name="tuesdaystate")
    public Boolean getTuesdayState() {
        return tuesdayState;
    }
    public void setTuesdayState(Boolean tuesdayState) {
        this.tuesdayState = tuesdayState;
    } //------------------------- 
    @Column(name="wednesdaydate")
    public Date getWednesdayDate() {
        return wednesdayDate;
    }
    public void setWednesdayDate(Date wednesdayDate) {
        this.wednesdayDate = wednesdayDate;
    }
    
    @Column(name="wednesday")
    public Long getWednesday() {
        return wednesday;
    }
    public void setWednesday(Long wednesday) {
        this.wednesday = wednesday;
    }
    
    @Column(name="wednesdaystate")
    public Boolean getWednesdayState() {
        return wednesdayState;
    }
    public void setWednesdayState(Boolean wednesdayState) {
        this.wednesdayState = wednesdayState;
    } //------------------------- 
    @Column(name="thursdaydate")
    public Date getThursdayDate() {
        return thursdayDate;
    }
    public void setThurdayDate(Date thursdayDate) {
        this.thursdayDate = thursdayDate;
    }
    
    @Column(name="thursday")
    public Long getThursday() {
        return thursday;
    }
    public void setThursday(Long thursday) {
        this.thursday = thursday;
    }
    
    @Column(name="thursdaystate")
    public Boolean getThursdayState() {
        return thursdayState;
    }
    public void setThursdayState(Boolean thursdayState) {
        this.thursdayState = thursdayState;
    } //------------------------- 
    @Column(name="fridaydate")
    public Date getFridayDate() {
        return fridayDate;
    }
    public void setFridayDate(Date fridayDate) {
        this.fridayDate = fridayDate;
    }
    
    @Column(name="friday")
    public Long getFriday() {
        return friday;
    }
    public void setFriday(Long friday) {
        this.friday = friday;
    }
    
    @Column(name="fridaystate")
    public Boolean getFridayState() {
        return fridayState;
    }
    public void setFridayState(Boolean fridayState) {
        this.fridayState = fridayState;
    } //------------------------- 
    @Column(name="saturdaydate")
    public Date getSaturdayDate() {
        return saturdayDate;
    }
    public void setSaturdayDate(Date saturdayDate) {
        this.saturdayDate = saturdayDate;
    }
    
    @Column(name="saturday")
    public Long getSaturday() {
        return saturday;
    }
    public void setSaturday(Long saturday) {
        this.saturday = saturday;
    }
    
    @Column(name="saturdaysate")
    public Boolean getSaturdayState() {
        return saturdayState;
    }
    public void setSaturdayState(Boolean saturdayState) {
        this.saturdayState = saturdayState;
    } //------------------------- 
    @Column(name="sundaydate")
    public Date getSundayDate() {
        return sundayDate;
    }
    public void setSundayDate(Date sundayDate) {
        this.sundayDate = sundayDate;
    }
    
    @Column(name="sunday")
    public Long getSunday() {
        return sunday;
    }
    public void setSunday(Long sunday) {
        this.sunday = sunday;
    }
    
    @Column(name="sundaySate")
    public Boolean getSundayState() {
        return mondayState;
    }
    public void setSundayState(Boolean sundaySate) {
        this.sundayState = sundaySate;
    }
    //-----------------------------------------
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (description != null ? !description.equals(menu.description) : menu.description != null) return false;
        
        if (mondayDate != null ? !mondayDate.equals(menu.mondayDate) : menu.mondayDate != null) return false;
	    if (monday != null ? !monday.equals(menu.monday) : menu.monday != null) return false;
        if (mondayState != null ? !mondayState.equals(menu.mondayState) : menu.mondayState != null) return false;
        
        if (tuesdayDate != null ? !tuesdayDate.equals(menu.tuesdayDate) : menu.tuesdayDate != null) return false;
	    if (tuesday != null ? !tuesday.equals(menu.tuesday) : menu.tuesday != null) return false;
        if (tuesdayState != null ? !tuesdayState.equals(menu.tuesdayState) : menu.tuesdayState != null) return false; 
        
        if (wednesdayDate != null ? !wednesdayDate.equals(menu.wednesdayDate) : menu.wednesdayDate != null) return false;
	    if (wednesday != null ? !wednesday.equals(menu.wednesday) : menu.wednesday != null) return false;
        if (wednesdayState != null ? !wednesdayState.equals(menu.wednesdayState) : menu.wednesdayState != null) return false; 
        
        if (thursdayDate != null ? !thursdayDate.equals(menu.thursdayDate) : menu.thursdayDate != null) return false;
	    if (thursday != null ? !thursday.equals(menu.thursday) : menu.thursday != null) return false;
        if (thursdayState != null ? !thursdayState.equals(menu.thursdayState) : menu.thursdayState != null) return false; 
        
        if (fridayDate != null ? !fridayDate.equals(menu.fridayDate) : menu.fridayDate != null) return false;
	    if (friday != null ? !friday.equals(menu.friday) : menu.friday != null) return false;
        if (fridayState != null ? !fridayState.equals(menu.fridayState) : menu.fridayState != null) return false; 
        
        if (saturdayDate != null ? !saturdayDate.equals(menu.saturdayDate) : menu.saturdayDate != null) return false;
	    if (saturday != null ? !saturday.equals(menu.saturday) : menu.saturday != null) return false;
        if (saturdayState != null ? !saturdayState.equals(menu.saturdayState) : menu.saturdayState != null) return false; 
        
        if (sundayDate != null ? !sundayDate.equals(menu.sundayDate) : menu.sundayDate != null) return false;
	    if (sunday != null ? !sunday.equals(menu.sunday) : menu.sunday != null) return false;
        if (sundayState != null ? !sundayState.equals(menu.sundayState) : menu.sundayState != null) return false; 
        return true;
    }

    public int hashCode() {
        int result=0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", mondayDate='" + mondayDate + '\'' +
                ", monday='" + monday + '\'' +
                ", mondayState='" + mondayState + '\'' +
                ", tuesdayDate='" + tuesdayDate + '\'' +
                ", tuesday='" + tuesday + '\'' +
                ", tuesdayState='" + tuesdayState + '\'' +
                ", wednesdayDate='" + wednesdayDate + '\'' +
                ", wednesday='" + wednesday + '\'' +
                ", wednesdayState='" + wednesdayState + '\'' +
                ", thursdayDate='" + thursdayDate + '\'' +
                ", thursday='" + thursday + '\'' +
                ", thursdayState='" + thursdayState + '\'' +
                ", fridayDate='" + fridayDate + '\'' +
                ", friday='" + friday + '\'' +
                ", fridayState='" + fridayState + '\'' +
                ", saturdayDate='" + saturdayDate + '\'' +
                ", saturday='" + saturday + '\'' +
                ", saturdayState='" + saturdayState + '\'' +
                ", sundayDate='" + sundayDate + '\'' +
                ", sunday='" + sunday + '\'' +
                ", sundayState='" + sundayState + '\'' +
                '}';
    }
    
    
}

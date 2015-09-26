package una.cr.alpha.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.appfuse.model.BaseObject;


@Entity 
@XmlRootElement
@Table(name="menu")
public class Menu extends BaseObject{
	

	private Long idmenu;
	
    private Date date;
    
    private Dish iddish;
    
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdmenu() {
		return idmenu;
	}
	public void setIdmenu(Long idmenu) {
		this.idmenu = idmenu;
	}
	
	@Column(name="date", nullable=false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@OneToOne
	@JoinColumn(name="iddish")
	public Dish getIddish() {
		return iddish;
	}
	public void setIddish(Dish iddish) {
		this.iddish = iddish;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((iddish == null) ? 0 : iddish.hashCode());
		result = prime * result + ((idmenu == null) ? 0 : idmenu.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (iddish == null) {
			if (other.iddish != null)
				return false;
		} else if (!iddish.equals(other.iddish))
			return false;
		if (idmenu == null) {
			if (other.idmenu != null)
				return false;
		} else if (!idmenu.equals(other.idmenu))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Menu [idmenu=" + idmenu + ", date=" + date + ", iddish=" + iddish + "]";
	}
	
	
	
	
     
}

package una.cr.alpha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.appfuse.model.BaseObject;

@Entity
@Table(name="rate")
public class Rate extends BaseObject{
	
	private Long idrate;
	private Person idperson;
	private Dish iddish;
	private int rate_value;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdrate() {
		return idrate;
	}
	public void setIdrate(Long idrate) {
		this.idrate = idrate;
	}
	
	@OneToOne
	@JoinColumn(name="idpersona")
	public Person getIdperson() {
		return idperson;
	}
	public void setIdperson(Person idperson) {
		this.idperson = idperson;
	}
	@OneToOne
	@JoinColumn(name="iddish")
	public Dish getIddish() {
		return iddish;
	}
	public void setIddish(Dish iddish) {
		this.iddish = iddish;
	}
	@Column(name="rate_value",nullable=false)
	public int getRate() {
		return rate_value;
	}
	public void setRate(int rate_value) {
		this.rate_value = rate_value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iddish == null) ? 0 : iddish.hashCode());
		result = prime * result + ((idperson == null) ? 0 : idperson.hashCode());
		result = prime * result + ((idrate == null) ? 0 : idrate.hashCode());
		result = prime * result + rate_value;
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
		Rate other = (Rate) obj;
		if (iddish == null) {
			if (other.iddish != null)
				return false;
		} else if (!iddish.equals(other.iddish))
			return false;
		if (idperson == null) {
			if (other.idperson != null)
				return false;
		} else if (!idperson.equals(other.idperson))
			return false;
		if (idrate == null) {
			if (other.idrate != null)
				return false;
		} else if (!idrate.equals(other.idrate))
			return false;
		if (rate_value != other.rate_value)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rate [idrate=" + idrate + ", idperson=" + idperson + ", iddish=" + iddish + ", rate_value=" + rate_value + "]";
	}
	
	

}

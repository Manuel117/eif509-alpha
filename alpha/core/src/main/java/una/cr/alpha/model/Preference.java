package una.cr.alpha.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.appfuse.model.BaseObject;

public class Preference extends BaseObject{

	private Long idpreference;
	private String description;
	private CatalogValue idcatalog_value;
	private Person idpersona;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdpreference() {
		return idpreference;
	}
	public void setIdpreference(Long idpreference) {
		this.idpreference = idpreference;
	}
	
	@Column(name="description", length=255, nullable=false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@OneToOne
	@JoinColumn(name="idcatalog_value")
	public CatalogValue getIdcatalog_value() {
		return idcatalog_value;
	}
	public void setIdcatalog_value(CatalogValue idcatalog_value) {
		this.idcatalog_value = idcatalog_value;
	}
	
	@OneToOne
	@JoinColumn(name="idpersona")
	public Person getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(Person idpersona) {
		this.idpersona = idpersona;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((idcatalog_value == null) ? 0 : idcatalog_value.hashCode());
		result = prime * result + ((idpersona == null) ? 0 : idpersona.hashCode());
		result = prime * result + ((idpreference == null) ? 0 : idpreference.hashCode());
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
		Preference other = (Preference) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (idcatalog_value == null) {
			if (other.idcatalog_value != null)
				return false;
		} else if (!idcatalog_value.equals(other.idcatalog_value))
			return false;
		if (idpersona == null) {
			if (other.idpersona != null)
				return false;
		} else if (!idpersona.equals(other.idpersona))
			return false;
		if (idpreference == null) {
			if (other.idpreference != null)
				return false;
		} else if (!idpreference.equals(other.idpreference))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Preference [idpreference=" + idpreference + ", description=" + description + ", idcatalog_value="
				+ idcatalog_value + ", idpersona=" + idpersona + "]";
	}
	
	
}

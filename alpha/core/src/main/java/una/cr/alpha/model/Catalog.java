package una.cr.alpha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

/**
 * Clase categoria, modelo de la tabla catalog
 * Fecha creacion: 20/09/15
 * 
 * @author andreyvasquez
 *
 */

@Entity 
@XmlRootElement
@Table(name="catalog")
public class Catalog extends BaseObject{
	private Long idcatalog;
	private String description;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdCatalog() {
		return idcatalog;
	}
	
	public void setIdCatalog(Long idcatalog) {
		this.idcatalog = idcatalog;
	}
	
	@Column(name="description", length=155, nullable=false)
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((idcatalog == null) ? 0 : idcatalog.hashCode());
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
		Catalog other = (Catalog) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (idcatalog == null) {
			if (other.idcatalog != null)
				return false;
		} else if (!idcatalog.equals(other.idcatalog))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Catalog [idcatalog=" + idcatalog + ", description=" + description + "]";
	}
	
	
	
}

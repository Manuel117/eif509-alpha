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

/**
 * Clase categoria valor, modelo de la tabla catalog_value
 * Fecha creacion: 20/09/15
 * 
 * @author andreyvasquez
 *
 */

@Entity 
@Table(name="catalog")
public class CatalogValue extends BaseObject{
	private Long idcatalog_value;
	private Catalog catalog;
	private String description;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdCatalogValue() {
		return idcatalog_value;
	}
	
	public void setIdCatalogValue(Long idcatalog_value) {
		this.idcatalog_value = idcatalog_value;
	}
	
	@OneToOne
	@JoinColumn(name="idcatalog")
	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	@Column(name="description", length=45, nullable=false)
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
		result = prime * result + ((catalog == null) ? 0 : catalog.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((idcatalog_value == null) ? 0 : idcatalog_value.hashCode());
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
		CatalogValue other = (CatalogValue) obj;
		if (catalog == null) {
			if (other.catalog != null)
				return false;
		} else if (!catalog.equals(other.catalog))
			return false;
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
		return true;
	}

	@Override
	public String toString() {
		return "CatalogValue [idcatalog_value=" + idcatalog_value + ", catalog=" + catalog + ", description="
				+ description + "]";
	}
	
	
	
}

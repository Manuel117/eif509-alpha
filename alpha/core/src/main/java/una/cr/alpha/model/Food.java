package una.cr.alpha.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@Entity
@XmlRootElement
@Table(name="food")
public class Food extends BaseObject{

	private Long idfood;
	private String name;
	private CatalogValue idcatalog_value;
	private List<Dish> dishes = new ArrayList<Dish>();
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdfood() {
		return idfood;
	}
	public void setIdfood(Long idfood) {
		this.idfood = idfood;
	}
	
	@Column(name="name", length=155, nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToOne
	@JoinColumn(name="idcatalog_value")
	public CatalogValue getIdcatalog_value() {
		return idcatalog_value;
	}
	public void setIdcatalog_value(CatalogValue idcatalog_value) {
		this.idcatalog_value = idcatalog_value;
	}
	
	@ManyToMany(cascade = {CascadeType.ALL},mappedBy="foods")
	public List<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dishes == null) ? 0 : dishes.hashCode());
		result = prime * result + ((idcatalog_value == null) ? 0 : idcatalog_value.hashCode());
		result = prime * result + ((idfood == null) ? 0 : idfood.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Food other = (Food) obj;
		if (dishes == null) {
			if (other.dishes != null)
				return false;
		} else if (!dishes.equals(other.dishes))
			return false;
		if (idcatalog_value == null) {
			if (other.idcatalog_value != null)
				return false;
		} else if (!idcatalog_value.equals(other.idcatalog_value))
			return false;
		if (idfood == null) {
			if (other.idfood != null)
				return false;
		} else if (!idfood.equals(other.idfood))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Food [idfood=" + idfood + ", name=" + name + ", idcatalog_value=" + idcatalog_value + ", dishes="
				+ dishes + "]";
	}
	
	
	
}

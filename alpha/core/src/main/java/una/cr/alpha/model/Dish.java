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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@Entity
@XmlRootElement
@Table(name="dish")
public class Dish extends BaseObject{
    private Long iddish;
    private String description;
    private String photo;
    private CatalogValue idcatalog_value;
    private List<Food> foods = new ArrayList<Food>();
    
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIddish() {
		return iddish;
	}
	public void setIddish(Long iddish) {
		this.iddish = iddish;
	}
	
	@Column(name="discription", length=155, nullable=false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="photo", length=155, nullable=false)
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	@OneToOne
	@JoinColumn(name="idcatalog_value")
	public CatalogValue getIdcatalog_value() {
		return idcatalog_value;
	}
	public void setIdcatalog_value(CatalogValue idcatalog_value) {
		this.idcatalog_value = idcatalog_value;
	}
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="foodxdish", joinColumns={@JoinColumn(name="iddish")}, inverseJoinColumns={@JoinColumn(name="idfood")})
	public List<Food> getFoods() {
		return foods;
	}
	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((foods == null) ? 0 : foods.hashCode());
		result = prime * result + ((idcatalog_value == null) ? 0 : idcatalog_value.hashCode());
		result = prime * result + ((iddish == null) ? 0 : iddish.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
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
		Dish other = (Dish) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (foods == null) {
			if (other.foods != null)
				return false;
		} else if (!foods.equals(other.foods))
			return false;
		if (idcatalog_value == null) {
			if (other.idcatalog_value != null)
				return false;
		} else if (!idcatalog_value.equals(other.idcatalog_value))
			return false;
		if (iddish == null) {
			if (other.iddish != null)
				return false;
		} else if (!iddish.equals(other.iddish))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dish [iddish=" + iddish + ", description=" + description + ", photo=" + photo + ", idcatalog_value="
				+ idcatalog_value + ", foods=" + foods + "]";
	}
		
   
}

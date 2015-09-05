package una.cr.alpha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.appfuse.model.BaseObject;

@Entity @Table(name="preference")
public class Preference extends BaseObject {
	private Long id;
    private Dish dish_id;
    
    // START SNIPPET: id
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
    // END SNIPET: id
	
	public void setId(Long id) {
		this.id = id;
	}
	
    @OneToOne
	@JoinColumn(name="dish_id")
	public Dish getDish_id() {
		return dish_id;
	}
    
	public void setDish_id(Dish dish_id) {
		this.dish_id = dish_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dish_id == null) ? 0 : dish_id.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (dish_id == null) {
			if (other.dish_id != null)
				return false;
		} else if (!dish_id.equals(other.dish_id))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Preference [id=" + id + ", dish_id=" + dish_id + "]";
	}
	
	

}

package una.cr.alpha.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@Entity
@XmlRootElement
@Table(name="goto")
public class Goto extends BaseObject{

	private Long idgoto;
	private Date date;
	private Person user;
	private Menu idmenu;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdgoto() {
		return idgoto;
	}
	public void setIdgoto(Long idgoto) {
		this.idgoto = idgoto;
	}
	@Column(name="date", nullable=true)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@OneToOne
	@JoinColumn(name="idpersona")
	public Person getUser() {
		return user;
	}
	public void setUser(Person user) {
		this.user = user;
	}
	@OneToOne
	@JoinColumn(name="idmenu")
	public Menu getIdmenu() {
		return idmenu;
	}
	public void setIdmenu(Menu idmenu) {
		this.idmenu = idmenu;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((idgoto == null) ? 0 : idgoto.hashCode());
		result = prime * result + ((idmenu == null) ? 0 : idmenu.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Goto other = (Goto) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idgoto == null) {
			if (other.idgoto != null)
				return false;
		} else if (!idgoto.equals(other.idgoto))
			return false;
		if (idmenu == null) {
			if (other.idmenu != null)
				return false;
		} else if (!idmenu.equals(other.idmenu))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Goto [idgoto=" + idgoto + ", date=" + date + ", user=" + user + ", idmenu=" + idmenu + "]";
	}
	
	
}

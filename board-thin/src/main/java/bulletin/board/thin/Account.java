package bulletin.board.thin;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@SessionScoped
public class Account {

	@Getter
	@Setter
	@ManagedProperty("#{main}")
	private Main main;

	@Getter
	@Setter
	private Integer id;

	public String getName() {

		return main.findUserById(id).getName();
	}

	public String login() {

		if (id == 0) {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("User auswählen !!"));

			return "/start.xhtml";
		}

		return "/main.xhtml";
	}

}

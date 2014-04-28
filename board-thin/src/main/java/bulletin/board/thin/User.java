package bulletin.board.thin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@SessionScoped
public class User {

	@Getter
	@Setter
	private String name;
}

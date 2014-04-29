package bulletin.board.thin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@SessionScoped
public class Account {

	@Getter
	@Setter
	@Size(min=2, max=20)
	private String name;
}

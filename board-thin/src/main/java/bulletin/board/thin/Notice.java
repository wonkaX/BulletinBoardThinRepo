package bulletin.board.thin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@ViewScoped
public class Notice {

	@Getter
	@Setter
	@Size(min=2, max=20)
	private String item;
	
	@Getter
	@Setter	
	@Min(1)
	private Integer amount;
	
	@Getter
	@Setter
	@Min(1)
	private Integer pricePerItem;
	
	public String addToList() {
		
		// TODO: add to list !
		
		return "/main.xhtml";
	}
}

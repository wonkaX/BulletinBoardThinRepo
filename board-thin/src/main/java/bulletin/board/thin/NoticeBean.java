package bulletin.board.thin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import bulletin.board.core.system.Notice;
import bulletin.board.core.system.NoticeType;
import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "notice")
@ViewScoped
public class NoticeBean {
	
	@Getter
	@Setter
	@ManagedProperty("#{main}")	
	private Main main;
	
	@Getter
	@Setter
	@ManagedProperty("#{account}")
	private Account account;
	
	@Getter
	@Setter
	private Integer itemId;

	@Getter
	@Setter	
	private Integer tempAmount;
	
	@Getter
	@Setter	
	private Integer tempPricePerItem;		

	public String addToList() {	
		
		main.getBoard().addNotice(new Notice(NoticeType.SUPPLY, main.findUserById(account.getId()), main.findItemById(itemId), tempAmount, tempPricePerItem));
		
		return "/main.xhtml";
	}
	
}

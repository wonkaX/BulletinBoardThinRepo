package bulletin.board.thin;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import bulletin.board.core.facade.Board;
import bulletin.board.core.facade.Item;
import bulletin.board.core.facade.User;
import bulletin.board.core.system.Notice;
import bulletin.board.core.system.NoticeType;

@ManagedBean
@SessionScoped
public class Main {

	@Getter
	private Board board = new Board();		

	@Getter
	@Setter
	private String tempItem;

	@Getter
	@Setter	
	private Integer tempAmount;
	
	@Getter
	@Setter	
	private Integer tempPricePerItem;
	
	public String addToList() {
			
		User usr = new User() {
			
			public String getName() {
				
				return "Chef";
			}
		};
		
		Item itm = new Item() {
			
			public String getName() {
				
				return tempItem;
			}
		};		
		
		board.addNotice(new Notice(NoticeType.SUPPLY, usr, itm, tempAmount, tempPricePerItem));
		
		return "/main.xhtml";
	}
}



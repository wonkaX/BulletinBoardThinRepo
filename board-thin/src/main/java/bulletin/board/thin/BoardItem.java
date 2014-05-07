package bulletin.board.thin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import bulletin.board.core.facade.Item;

@AllArgsConstructor
public final class BoardItem implements Item {

	@Getter
	private String name;
	
	@Getter
	private Integer id;	
}

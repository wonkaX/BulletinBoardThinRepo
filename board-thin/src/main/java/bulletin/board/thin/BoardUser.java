package bulletin.board.thin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import bulletin.board.core.facade.User;

@AllArgsConstructor
public final class BoardUser implements User {

	@Getter
	private String name;
	
	@Getter
	private Integer id;
	
}

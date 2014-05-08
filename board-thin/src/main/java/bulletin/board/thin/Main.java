package bulletin.board.thin;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import lombok.Getter;
import bulletin.board.core.facade.Board;
import bulletin.board.core.facade.User;
import bulletin.board.core.system.Notice;
import bulletin.board.core.system.NoticeType;

@ManagedBean
@ApplicationScoped
public class Main {

	@Getter
	private Board board = new Board();

	@Getter
	private List<BoardUser> userList;

	@Getter
	private List<BoardItem> itemList;

	public Main() {

		userList = new ArrayList<BoardUser>();
		userList.add(new BoardUser("Jeff", 1));
		userList.add(new BoardUser("Frank", 2));
		userList.add(new BoardUser("Mary", 3));
		userList.add(new BoardUser("Rose", 4));

		itemList = new ArrayList<BoardItem>();
		itemList.add(new BoardItem("Meat", 1));
		itemList.add(new BoardItem("Milk", 2));
		itemList.add(new BoardItem("Egg", 3));

		User bot = new User() {

			public Integer getId() {
				return 0;
			}

			public String getName() {
				return "Bot";
			}
		};

		board.addNotice(new Notice(NoticeType.SUPPLY, bot, findItemById(1), 2,
				28));
		board.addNotice(new Notice(NoticeType.SUPPLY, bot, findItemById(2), 3,
				11));
		board.addNotice(new Notice(NoticeType.SUPPLY, bot, findItemById(3), 5,
				8));
	}

	public BoardUser findUserById(Integer id) {

		for (BoardUser user : userList) {
			if (user.getId().equals(id)) {
				return user;
			}
		}

		return null;
	}

	public BoardItem findItemById(Integer id) {

		for (BoardItem item : itemList) {
			if (item.getId().equals(id)) {
				return item;
			}
		}

		return null;
	}

}

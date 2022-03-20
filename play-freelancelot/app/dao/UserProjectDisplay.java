package dao;

/** Contains constructor and variable that are used to show the information on HTML page
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
public class UserProjectDisplay {
		public UserProjectDisplay() {
		super();
	}

		public String title;
		public int owner_id;
		public String type;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getOwner_id() {
			return owner_id;
		}

		public void setOwner_id(int owner_id) {
			this.owner_id = owner_id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public UserProjectDisplay(String title, String type,int owner_id) {
			super();
			this.title = title;
			this.type = type;
			this.owner_id=owner_id;
		}
		
}

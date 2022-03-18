package dao;

/** Contains constructor and variable that are used to show the information on HTML page
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
public class UserProjectDisplay {
		public String title;
		public int owner_id;
		public String type;

		public UserProjectDisplay(String title, String type,int owner_id) {
			super();
			this.title = title;
			this.type = type;
			this.owner_id=owner_id;
		}
		
}

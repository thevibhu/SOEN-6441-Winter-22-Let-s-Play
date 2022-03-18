package dao;

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

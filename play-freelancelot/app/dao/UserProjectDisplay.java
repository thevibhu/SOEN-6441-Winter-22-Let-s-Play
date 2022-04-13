package dao;

import java.sql.Date;
import java.text.SimpleDateFormat;

/** Contains constructor and variable that are used to show the information on HTML page
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
public class UserProjectDisplay {
		/**
		 * Constructor 
		 */
		public UserProjectDisplay() {
			super();
		}
		
		/**
		 * @param title Title of the Project
		 */
		public String title;
		
		/**
		 * @param owner_id Owner Id of the Project
		 */
		public int owner_id;
		
		/**
		 * @param type Type of the Project
		 */
		public String type;

		
		/** gets Title of the project.
	   	 * @version 1.0
	   	 * @return Title of the project.
	   	 * @since 1.0
	   	*/
		public String getTitle() {
			return title;
		}

		/** sets Title of the project.
	   	 * @version 1.0
	   	 * @param title Title of the project.
	   	 * @since 1.0
	   	*/
		public void setTitle(String title) {
			this.title = title;
		}

		/** gets Owner ID of the project.
	   	 * @version 1.0
	   	 * @return Owner ID of the project.
	   	 * @since 1.0
	   	*/
		public int getOwner_id() {
			return owner_id;
		}
		
		/** sets Owner ID of the project.
	   	 * @version 1.0
	   	 * @param owner_id Owner ID of the project.
	   	 * @since 1.0
	   	*/
		public void setOwner_id(int owner_id) {
			this.owner_id = owner_id;
		}

		/** gets Title of the project.
	   	 * @version 1.0
	   	 * @return Type of the project.
	   	 * @since 1.0
	   	*/
		public String getType() {
			return type;
		}
		
		
		/** sets Type of the project.
	   	 * @version 1.0
	   	 * @param type Type of the project.
	   	 * @since 1.0
	   	*/
		public void setType(String type) {
			this.type = type;
		}
	    public String time_submitted;

	    public String getTime_submitted() {
			return time_submitted;
		}

		public void setTime_submitted(int time_submitted) {
			this.time_submitted = new SimpleDateFormat("MMMM d, yyyy")
					.format(new Date(time_submitted * 1000L));
		}
	    
		/**
		 * Constructor sets the value for the Title, Type and Id
		 * @param title Title of the project
		 * @param type Type of the project
		 * @param owner_id Owner ID of the project
		 */
		public UserProjectDisplay(String title,int time_submitted, String type,int owner_id) {
			super();
			this.time_submitted = new SimpleDateFormat("MMMM d, yyyy")
					.format(new Date(time_submitted * 1000L));
			this.title = title;
			this.type = type;
			this.owner_id=owner_id;
		}
		
}

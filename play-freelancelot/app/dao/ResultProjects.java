package dao;

import java.util.ArrayList;

/** Represents result from the FreelancerAPI call which holds the User projects which are returned by userId.
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
public class ResultProjects {
	    public ArrayList<UserProjectDetails> projects;

	    
	    /** gets the projects
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @return projects list
		 * @since 1.0
		*/
		public ArrayList<UserProjectDetails> getProjects() {
			return projects;
		}

		  /** sets the projects
				 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
				 * @version 1.0
				 * @param projects list
				 * @since 1.0
				*/
		public void setProjects(ArrayList<UserProjectDetails> projects) {
			this.projects = projects;
		}
}

package dao;

import java.util.ArrayList;

/** Represents result from the FreelancerAPI call which holds the User projects which are returned by userId.
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
public class ResultProjects {
	    public ArrayList<UserProjectDetails> projects;

		public ArrayList<UserProjectDetails> getProjects() {
			return projects;
		}

		public void setProjects(ArrayList<UserProjectDetails> projects) {
			this.projects = projects;
		}
}

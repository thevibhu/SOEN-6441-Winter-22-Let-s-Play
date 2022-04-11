package dao;


/** Represents the job details of the project, from which we can fetch skills.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Job {
	 	public int id;
	    public String name;
		public Category category;
		public String seo_url;
	    public boolean local;
		
	    
	    /** gets the id of the job.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @return id of the job.
		 * @since 1.0
		*/
	    public int getId() {
			return id;
		}
	    
	    /** sets the id of the job.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @param id of the job.
		 * @since 1.0
		*/
		public void setId(int id) {
			this.id = id;
		}
		
		/** gets the name of the job.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @return name of the job.
		 * @since 1.0
		*/
		public String getName() {
				return name;
			}
		
		/** sets the name of the job.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @param name of the job.
		 * @since 1.0
		*/
	    public void setName(String name) {
				this.name = name;
			}
			
	    /** gets the category of the job.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @return category of the job.
		 * @since 1.0
		*/
		public Category getCategory() {
			return category;
		}
		
		 /** sets the category of the job.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @param category of the job.
		 * @since 1.0
		*/
		public void setCategory(Category category) {
			this.category = category;
		}
		
		/** gets the seo_url of the job.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @return seo_url of the job.
		 * @since 1.0
		*/
		public String getSeo_url() {
			return seo_url;
		}
		
		/** sets the seo_url of the job.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @param seo_url of the job.
		 * @since 1.0
		*/
		public void setSeo_url(String seo_url) {
			this.seo_url = seo_url;
		}
		
		/** checks if the job is local.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @return local check.
		 * @since 1.0
		*/
		public boolean isLocal() {
			return local;
		}
		/** sets if the job is local.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @param local check.
		 * @since 1.0
		*/
		public void setLocal(boolean local) {
			this.local = local;
		}
}

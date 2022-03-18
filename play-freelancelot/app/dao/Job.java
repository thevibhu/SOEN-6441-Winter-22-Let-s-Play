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
		
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
				return name;
			}
	    public void setName(String name) {
				this.name = name;
			}
			
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		public String getSeo_url() {
			return seo_url;
		}
		public void setSeo_url(String seo_url) {
			this.seo_url = seo_url;
		}
		public boolean isLocal() {
			return local;
		}
		public void setLocal(boolean local) {
			this.local = local;
		}
}

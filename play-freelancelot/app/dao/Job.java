package dao;

public class Job {
	 	public int id;
	    public String name;
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Category category;
	    public String seo_url;
	    public boolean local;
}

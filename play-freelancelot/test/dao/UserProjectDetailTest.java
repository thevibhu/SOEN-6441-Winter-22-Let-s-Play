package dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class UserProjectDetailTest {
	
	@Test
	public void test() {
	UserProjectDetails Dtest = new UserProjectDetails();
	BidStats bid = new BidStats();
	bid.setBid_avg(1);
	Budget bug = new Budget();
	bug.setMaximum(10);
	Dtest.setBudget(bug);
	Currency c = new Currency();
	Dtest.setCurrency(c);
	Dtest.setDeleted(false);
	Dtest.setEnterprise_ids(null);
	Dtest.setFeatured(false);
	Dtest.setFrontend_project_status("status");
	Dtest.setHidebids(false);
	Dtest.setHireme(false);
	HourlyProjectInfo h = new HourlyProjectInfo();
	h.setDuration_enum("enum");
	Dtest.setHourly_project_info(h);
	Dtest.setId(0);
	Dtest.setIs_buyer_kyc_required(false);
	Dtest.setIs_escrow_project(false);
	Job j = new Job();
	j.setId(0);
	Dtest.setLanguage("language");
	Dtest.setLocal(false);
	Dtest.setLocation(null);
	Dtest.setNegotiated(false);
	Dtest.setNonpublic(false);
	Dtest.setOwner_id(0);
	ArrayList<String> pool = new ArrayList<String>();
	pool.add("pool");
	Dtest.setPool_ids(pool);
	Dtest.setPreview_description("pd");
	ProjectRejectReason pr = new ProjectRejectReason();
	pr.setDescription("desc");
	Dtest.setProject_reject_reason(pr);
	Dtest.setType("fixed");
	Dtest.setSeo_url("seo");
	Dtest.setStatus("active");
	Dtest.setSubmitdate(0);
	Dtest.setTime_free_bids_expire(0);
	Dtest.setTime_submitted(0);
	Dtest.setTitle("title");
	
	TrueLocation tl = new TrueLocation();
	tl.setCountry(null);
	
	Dtest.setTrue_location(tl);
	Upgrades u = new Upgrades();
	u.setFeatured(false);
	Dtest.setUpgrades(u);
	Dtest.setUrgent(false);
	Dtest.setIs_seller_kyc_required(false);
	//assertEquals(1, Dtest.getBid_stats().getBid_avg());
	assertEquals(0, Dtest.getBidperiod());
	assertEquals(10,(int)Dtest.getBudget().getMaximum());
	assertEquals("status", Dtest.getFrontend_project_status());
	//assertEquals("enum", Dtest.getHourly_project_info());
	assertEquals(0, Dtest.getId());
	assertEquals("language", Dtest.getLanguage());
	assertEquals(0, Dtest.getOwner_id());
	assertEquals("pool", Dtest.getPool_ids().get(0));
	assertEquals("pd", Dtest.getPreview_description());
	assertEquals("desc", Dtest.getProject_reject_reason().getDescription());
	assertEquals("fixed", Dtest.getType());
	assertEquals("seo", Dtest.getSeo_url());
	assertEquals("active", Dtest.getStatus());
	assertEquals(0, Dtest.getTime_free_bids_expire());
	assertEquals(0, Dtest.getSubmitdate());
	assertEquals(0, Dtest.getTime_submitted());
	assertEquals("title", Dtest.getTitle());
	assertEquals(false, Dtest.getUpgrades().isFeatured());
	assertEquals(false, Dtest.isIs_buyer_kyc_required());
	assertEquals(false, Dtest.isIs_buyer_kyc_required());
	assertEquals(false, Dtest.isIs_escrow_project());
	assertEquals(false, Dtest.isNegotiated());
	assertEquals(false, Dtest.isLocal());
	assertEquals(false, Dtest.isHireme());
	assertEquals(false, Dtest.isUrgent());
	assertEquals(false, Dtest.isDeleted());
	assertEquals(false, Dtest.isNonpublic());
	assertEquals(false, Dtest.isFeatured());
	assertEquals(false, Dtest.isHidebids());
	assertEquals(false, Dtest.isIs_seller_kyc_required());

	}
}

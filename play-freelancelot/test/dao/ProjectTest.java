package dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ProjectTest {

	@Test
	public void test() {
		Project p = new Project();
		BidStats b = new BidStats();
		b.setBid_avg(1);
		p.setBid_stats(b);
		p.setBidperiod(0);
		Budget bb = new Budget();
		bb.setMaximum(10);
		p.setBudget(bb);
		Currency c = new Currency();
		p.setCurrency(c);
		p.setDeleted(false);
		p.setEnterprise_ids(null);
		p.setEnterprise_metadata_values(null);
		p.setFeatured(false);
		p.setFrontend_project_status("status");
		p.setHidebids(false);
		p.setHireme(false);
		HourlyProjectInfo h = new HourlyProjectInfo();
		h.setDuration_enum("enum");
		p.setHourly_project_info(h);
		p.setId(0);
		p.setIs_buyer_kyc_required(false);
		p.setIs_escrow_project(false);
		Job j = new Job();
		j.setId(0);
		ArrayList<Job> jj = new ArrayList<Job>();
		jj.add(j);
		p.setJobs(jj);
		p.setLanguage("language");
		p.setLocal(false);
		p.setLocation(null);
		p.setNegotiated(false);
		p.setNonpublic(false);
		p.setOwner_id(0);
		ArrayList<String> pool = new ArrayList<String>();
		pool.add("pool");
		p.setPool_ids(pool);
		p.setPreview_description("pd");
		ProjectRejectReason pr = new ProjectRejectReason();
		pr.setDescription("desc");
		p.setProject_reject_reason(pr);
		p.setProject_type("fixed");
		p.setSeo_url("seo");
		p.setStatus("active");
		p.setSubmitdate(0);
		p.setTime_free_bids_expire(0);
		p.setTime_submitted(0);
		p.setTime_updated(0);
		p.setTitle("title");
		TrueLocation tl = new TrueLocation();
		tl.setCountry(null);
		p.setTrue_location(tl);
		Upgrades u = new Upgrades();
		u.setFeatured(false);
		p.setUpgrades(u);
		p.setUrgent(false);
		p.setIs_seller_kyc_required(false);
		
		
		
		assertEquals(1, p.getBid_stats().getBid_avg());
		assertEquals(0, p.getBidperiod());
		assertEquals(10,(int)p.getBudget().getMaximum());
		assertEquals("status", p.getFrontend_project_status());
		assertEquals("enum", p.getHourly_project_info().getDuration_enum());
		assertEquals(0, p.getId());
		assertEquals(0, p.getJobs().get(0).getId());
		assertEquals("language", p.getLanguage());
		assertEquals(0, p.getOwner_id());
		assertEquals("pool", p.getPool_ids().get(0));
		assertEquals("pd", p.getPreview_description());
		assertEquals("desc", p.getProject_reject_reason().getDescription());
		assertEquals("fixed", p.getProject_type());
		assertEquals("seo", p.getSeo_url());
		assertEquals("active", p.getStatus());
		assertEquals(0, p.getTime_free_bids_expire());
		assertEquals(0, p.getSubmitdate());
		assertEquals(0, p.getTime_submitted());
		assertEquals(0, p.getTime_updated());
		assertEquals("title", p.getTitle());
		assertEquals(false, p.getUpgrades().isFeatured());
		assertEquals(false, p.isIs_buyer_kyc_required());
		assertEquals(false, p.isIs_buyer_kyc_required());
		assertEquals(false, p.isIs_escrow_project());
		assertEquals(false, p.isNegotiated());
		assertEquals(false, p.isLocal());
		assertEquals(false, p.isHireme());
		assertEquals(false, p.isUrgent());
		assertEquals(false, p.isDeleted());
		assertEquals(false, p.isNonpublic());
		assertEquals(false, p.isFeatured());
		assertEquals(false, p.isHidebids());
		assertEquals(false, p.isIs_seller_kyc_required());

		
		
		
		
	}

}

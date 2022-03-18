package dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpgradesTest {

	@Test
	public void test() {
		
		Upgrades u = new Upgrades();
		u.setFeatured(false);
		u.setFulltime(false);
		u.setIp_contract(false);
		u.setMysealed(false);
		u.setnDA(false);
		u.setNon_compete(false);
		u.setNonpublic(false);
		u.setPf_only(false);
		u.setProject_management(false);
		u.setQualified(false);
		u.setUrgent(false);
		
		assertEquals(false, u.isFeatured());
		assertEquals(false, u.isFulltime());
		assertEquals(false, u.isIp_contract());
		assertEquals(false, u.isMysealed());
		assertEquals(false, u.isnDA());
		assertEquals(false, u.isNon_compete());
		assertEquals(false, u.isPf_only());
		assertEquals(false, u.isProject_management());
		assertEquals(false, u.isQualified());
		assertEquals(false, u.isUrgent());
		
		
	}

}

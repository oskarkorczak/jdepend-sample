package infra;

import core.Gateway;

public class CloudEntityManager {

	public void save(Object entity) {
		System.out.println("Saving entity: " + entity);
//		new Gateway(this).report(entity);
	}
}

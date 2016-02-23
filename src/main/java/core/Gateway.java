package core;

import infra.CloudEntityManager;

public class Gateway {

//	private CloudEntityManager cloud;

//	public Gateway(CloudEntityManager cloud) {
//		this.cloud = cloud;
//	}

	public void report(Object entity) {
		System.out.println("Reporting entity: " + entity);
//		cloud.save(entity);
	}
}

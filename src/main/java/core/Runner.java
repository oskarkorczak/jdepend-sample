package core;

import infra.CloudEntityManager;

public class Runner {

	public static void main(String[] args) {
//		CloudEntityManager cloud = new CloudEntityManager();
//		new Gateway(cloud).report("smoke test");
		new Gateway().report("smoke test");
	}
}

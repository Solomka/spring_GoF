package guru.springframework.gof.prototype;

import org.junit.Test;

/**
 * Created by Admin on 4/21/2015.
 */
public class DocumentPrototypeManagerTest {

	@Test
	public void testGetClonedDocument() throws Exception {

		/*
		 * The client will receive a copy of the prototype object and the HR
		 * manager will be able to update the copy with the vendor name to
		 * create an agreement.
		 */
		PrototypeCapableDocument clonedTAndC = PrototypeCapableDocumentManager.getClonedDocument("tandc");
		clonedTAndC.setVendorName("Mary Parker");
		
		System.out.println(clonedTAndC);
		System.out.println(PrototypeCapableDocumentManager.getClonedDocument("tandc"));

		PrototypeCapableDocument clonedNDA = PrototypeCapableDocumentManager.getClonedDocument("nda");
		clonedNDA.setVendorName("Patrick Smith");
		
		System.out.println(clonedNDA);
	}
}
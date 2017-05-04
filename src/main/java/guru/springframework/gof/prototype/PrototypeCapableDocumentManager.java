package guru.springframework.gof.prototype;

/**
 * class that will create and store the prototype objects and return a copy
 * whenever a client asks for an agreement
 * 
 * The client will receive a copy of the prototype object and the HR manager
 * will be able to update the copy with the vendor name to create an agreement.
 * 
 * Created by Admin on 4/21/2015.
 */
public class PrototypeCapableDocumentManager {
	private static java.util.Map<String, PrototypeCapableDocument> prototypes = new java.util.HashMap<String, PrototypeCapableDocument>();

	static {
		TermsAndConditions tAndC = new TermsAndConditions();
		tAndC.setVendorName("Vendor Name Placeholder");
		/*
		 * Retrieve Terms and Conditions from database/network call/disk I/O
		 * here
		 */
		tAndC.setContent("Please read and accept the terms and conditions...");
		prototypes.put("tandc", tAndC);

		AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
		authorizedSignatory.setName("Andrew Clark");
		authorizedSignatory.setDesignation("Operation Head");
		NDAgreement nda = new NDAgreement();
		nda.setVendorName("Vendor Name Placeholder");
		/*
		 * Retrieve Non Disclosure Agreement from database/network call/disk I/O
		 * here
		 */
		nda.setContent("Please read and accept the NDA...");
		nda.setAuthorizedSignatory(authorizedSignatory);
		prototypes.put("nda", nda);
	}

	// client fabric
	public static PrototypeCapableDocument getClonedDocument(final String type) {
		PrototypeCapableDocument clonedDoc = null;
		try {
			PrototypeCapableDocument doc = prototypes.get(type);
			clonedDoc = doc.cloneDocument();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedDoc;
	}
}

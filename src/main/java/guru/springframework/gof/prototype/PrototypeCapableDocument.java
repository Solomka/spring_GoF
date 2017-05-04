package guru.springframework.gof.prototype;

/**
 * Represents document that can be cloned
 * 
 * Is a Java interface or abstract class that defines the contract for classes
 * that permits cloning of its objects.
 * 
 * Created by Admin on 4/21/2015.
 */
public abstract class PrototypeCapableDocument implements Cloneable {
	private String vendorName;
	private String content;

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public abstract PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException;
}

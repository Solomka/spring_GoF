package guru.springframework.gof.prototype;

/**
 * 
 * ConcretePrototype (TAndC and NDAgreement): Are classes that provide operations to clone its objects.
 * 
 * Created by Admin on 4/21/2015.
 */
public class TermsAndConditions extends PrototypeCapableDocument {

    @Override
    public PrototypeCapableDocument cloneDocument() {
        /*Clone with shallow copy*/
        TermsAndConditions tAndC = null;
        try {
            tAndC = (TermsAndConditions) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tAndC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
    }

}
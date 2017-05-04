package guru.springframework.gof.composite;

/*
 * An abstract base class for the objects in the tree structure.
 *  This class defines the default behavior for all objects 
 *  and behaviors to access and manage child components in the tree.
 */
public abstract class CatalogComponent {

	public void add(CatalogComponent catalogComponent) {
		throw new UnsupportedOperationException("Cannot add item to catalog.");
	}

	public void remove(CatalogComponent catalogComponent) {
		throw new UnsupportedOperationException("Cannot remove item from catalog.");
	}

	public String getName() {
		throw new UnsupportedOperationException("Cannot return name.");
	}

	public double getPrice() {
		throw new UnsupportedOperationException("Cannot return price.");
	}

	public void print() {
		throw new UnsupportedOperationException("Cannot print.");
	}

}

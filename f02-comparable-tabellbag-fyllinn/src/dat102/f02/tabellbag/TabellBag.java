package dat102.f02.tabellbag;

/**
 * En implementasjon av BagADT
 * 
 * @author Lars-Petter Helland
 */
public class TabellBag<T> implements BagADT<T>{

	private static final int DEFAULT_KAPASITET = 10;

	private T[] tabell;
	private int antall;

	/************************************************************/

	public TabellBag() {
		this(DEFAULT_KAPASITET);
	}

	@SuppressWarnings("unchecked")
	public TabellBag(int kapasitet) {
		tabell = (T[]) new Object[kapasitet];
		antall = 0;
	}

    @Override
    public int getNumberOfEntries() {
        return antall;
    }

    @Override
    public boolean isEmpty() {
        return antall == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (antall>=tabell.length) {
            return false;
        }
        tabell[antall] = newEntry;
        antall++;
        return true;
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T temp = tabell[antall-1];
        tabell[antall-1] = null;
        antall--;
        return temp;
    }

    @Override
    public boolean remove(T anEntry) {
        int funnetIndeks = -1;
        int i = 0;
        while (i< antall && funnetIndeks == -1) {
            if (anEntry.equals(tabell[i])) {
                funnetIndeks = i;
            }
            i++;
        }
        if (funnetIndeks == -1) {
            return false;
        }

        tabell[funnetIndeks] = tabell[antall -1];
        tabell[antall - 1] = null;
        antall--;

        return true;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int temp = 0;
        for (int i = 0; i<antall; i++) {
            if (tabell[i].equals(anEntry)) {
                temp++;
            }
        }
        return temp;
    }

    @Override
    public boolean contains(T anEntry) {
        return getFrequencyOf(anEntry) > 0;
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    /************************************************************/

}

package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] a;

	public ArrayList() {
		this.a = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > a.length) {
			throw new IndexOutOfBoundsException();
		}
		return a[loc];

	}

	public void add(T val) {
		T[] a1 = (T[]) new Object[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			a1[i] = a[i];
		}
		a1[a.length] = val;
		a = a1;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > a.length) {
			throw new IndexOutOfBoundsException();
		}
		T[] a1 = (T[]) new Object[a.length + 1];
		for (int i = 0; i < a.length + 1; i++) {
			if (i < loc) {
				a1[i] = a[i];
			} else if (i == loc) {
				a1[i] = val;
			} else {
				a1[i] = a[i - 1];
			}
		}
		a = a1;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > a.length) {
			throw new IndexOutOfBoundsException();
		}
		a[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > a.length) {
			throw new IndexOutOfBoundsException();
		}
		T[] a1 = (T[]) new Object[a.length - 1];
		for (int i = 0; i < a.length - 1; i++) {
			if (i < loc) {
				a1[i] = a[i];
			} else {
				a1[i] = a[i + 1];
			}
		}
		a = a1;
	}

	public boolean contains(T val) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return a.length;
	}

}
package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] a;
	
	public ArrayList() {
		this.a = (T[]) new Object[0];
	}
	
	
	public T get(int loc) throws IndexOutOfBoundsException {
	if(!(a.length == 0)) {
		return a[loc];
	}
		return null;
	}
	
	public void add(T val) {
		T[] a1 = (T[]) new Object[a.length+1];
		for(int i = 0; i<a.length; i++) {
			a1[i] = a[i];
		}
		a1[a.length] = val;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] a1 = (T[]) new Object[a.length+1];
		for (int i = 0; i < a.length + 1; i++) { 
            if (i < loc - 1) {
                a1[i] = a[i]; 
            }
            else if (i == loc - 1) {
                a1[i] = val;
            }
            else {
                a1[i] = a[i - 1]; 
            }
        } 
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		a[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] a1 = (T[]) new Object[a.length-1];
		for (int i = 0; i < a.length + 1; i++) { 
            if (i < loc - 1) {
                a1[i] = a[i]; 
            }
            else {
                a1[i] = a[i + 1]; 
            }
        } 
	}
	
	public boolean contains(T val) {
		for(int i = 0; i<a.length; i++) {
			if(a[i] == val) {
				return true;
			}
		}
		return false;
	}


	public int size() {
		return a.length;
	}


}
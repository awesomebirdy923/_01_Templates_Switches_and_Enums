package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {

	T var;

	T[] arr;

	public ArrayList() {
		arr = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		return arr[loc];
	}

	public void add(T val) {
		T[] newList = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newList[i] = arr[i];
		}
		newList[newList.length - 1] = val;
		arr = newList;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newList = (T[]) new Object[arr.length + 1];
		boolean passed = false;
		for (int i = 0; i < newList.length; i++) {
			if (i != loc && !passed) {
				newList[i] = arr[i];
			} else {
				if (i == loc) {
					newList[i] = val;
					passed = !passed;
				} else {
					newList[i] = arr[i - 1];
				}
			}
		}
		arr = newList;
		for (int i = 0; i < newList.length; i++) {
			System.out.println(newList[i]);
		}
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newList = (T[]) new Object[arr.length - 1];
		boolean goneThrough = false;
		for (int i = 0; i < newList.length; i++) {
			if (i != loc && !goneThrough) {

			}
		}
	}

	public boolean contains(T val) {

		return false;
	}
}
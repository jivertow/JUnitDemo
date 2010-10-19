package main.java;

public class MdpJunitDemo implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		if (s == null) return true;
		if(s.length()==0) return true;
		else return false;
	}

	@Override
	public String capitalize(String s) {
		String firstPart = s.substring(0,1);
		String secondPart = s.substring(1);
		return firstPart.toUpperCase() + secondPart.toLowerCase();
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		if (s == null) throw new NullPointerException("Invalid string");
		else{
			return new StringBuffer(s).reverse().toString();
		}

	}

	@Override
	public String join(String... strings) {
		String result = "";
		for(int i = 0; i<strings.length; i++){
			if (i == (strings.length - 1)) result = result + strings[i];
			else result = result + strings[i] + " ";
			}
		return result;
	}

}

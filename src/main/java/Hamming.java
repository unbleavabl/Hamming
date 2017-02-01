public class Hamming {
	public static int compute(String str1,String str2){
		if(str1.length()!=str2.length())
			throw new IllegalArgumentException();
		int HammingDistance = 0;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				HammingDistance++;
			}
		}
		return HammingDistance;
	}
}

package titbits;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = "sfjdfj dfdnfjdnjf dfdjnfjdnfjd fd dfaaa".split(" ");
		String finalstring="";
		for(String sitem: s ){
			
			char[] ch = sitem.toCharArray();
			char temp;
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<ch.length/2;i++){
				temp=ch[i];
				ch[i]=ch[ch.length-i-1];
				ch[ch.length-i-1]=temp;
			}
			for(char ch1 : ch)
				sb.append(ch1);			
			finalstring+=" "+sb;
		}
		System.out.println(finalstring);
	}

}

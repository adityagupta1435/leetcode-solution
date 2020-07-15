class Solution {
    public String reverseWords(String str) {
        StringBuilder sb=new StringBuilder(str.trim());
       
        for(int i=0;i<sb.length()-1;i++) {
        	if(sb.charAt(i)==' '&&sb.charAt(i+1)==' ') {
        		sb.deleteCharAt(i);
        		i--;
        	}
        }
        StringBuilder sb1=new StringBuilder("");
        int k=sb.length();
        for(int i=sb.length()-1;i>=0;i--) {
        	if(sb.charAt(i)==' ') {
        		sb1.append(sb.substring(i+1, k)).append(" ");
        		k=i;
        	}
        }
        sb1.append(sb.substring(0,k));
        return sb1.toString();
    }
}

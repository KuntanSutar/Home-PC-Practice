// Beakkal!!!

class Asach 
{ 
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
		
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
		System.out.println(charArray[j]);
        charArray[j] = temp; 
		
        return String.valueOf(charArray); 
    } 
  
	public static void main(String[] args) 
    { 
        String str = "ABC"; 
        int n = str.length(); 
        Asach asch = new Asach(); 
        String result = asch.swap(str, 0, n-1); 
		System.out.println(result);
    } 
} 
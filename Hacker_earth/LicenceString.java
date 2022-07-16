import java.lang.*;
class LicenceString {
	public static void main(String[] args) {
		System.out.println(licenceString("abe-3AC-rKL", 2));
	}
    public static String licenceString(String s, int k) {
        String ans="";
        char arr[]=s.toCharArray();
        int cnt=0;  // 5
        for(int i=0;i<arr.length;i++){
            if(arr[i] != '-')
                cnt++;
        }
        int rem=cnt%k;   // 1
        int quetion=cnt/k;  // 2
        int temp=0;
        while(rem > 0){
            if(arr[temp] != '-'){
                ans+=String.valueOf(arr[temp++]);
                rem--;
                System.out.println("First WHile");
            }
        }
        if(temp != 0){
            ans+=String.valueOf('-');
        }
        while(true){
            String t="";
            int i;
            for(i=temp;i<arr.length;i++){
                if(arr[i] != '-'){
                    if(arr[i] >= 97 && arr[i] <= 123){
                        arr[i]=Character.toUpperCase(arr[i]);
                    }
                    t+=String.valueOf(arr[i]);
                }
                if(t.length() == quetion){
                    temp=i;
                    break;
                }
            }
            ans+="-";
            ans+=t;
            if(temp >= arr.length){
                break;
            }
            System.out.println("Second  WHile");
        }
        return ans;
    }
}
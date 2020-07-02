class Q12 {
    public String intToRoman(int num) {
        class Trans{
            int digit = 0; //是数的第几位，初始为个位
            char[][] Roman = {{'I','V','X'},{'X','L','C'},{'C','D','M'},{'M','M','M'}};
        }

        String ans = "";
        int temp;
        Trans a = new Trans();
        while(num!=0){
            temp = num%10;
            num=num/10;
            if(temp<=3&&temp>0){
                for(int i=0;i<temp;i++){
                    ans=a.Roman[a.digit][0]+ans;
                }
            }
            if(temp==4){
                ans=a.Roman[a.digit][1]+ans;
                ans=a.Roman[a.digit][0]+ans;
            }
            if(temp<9&&temp>4){

                for(int i=0;i<temp-5;i++){
                    ans=a.Roman[a.digit][0]+ans;
                }
                ans=a.Roman[a.digit][1]+ans;
            }
            if(temp==9){
                ans=a.Roman[a.digit][2]+ans;
                ans=a.Roman[a.digit][0]+ans;
            }
            a.digit+=1;
        }
        return ans;
    }
}
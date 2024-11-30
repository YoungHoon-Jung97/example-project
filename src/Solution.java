class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int tempN=1;
        int tempD=1;

        if (denom1 == denom2 ){
            tempN= numer1+numer2;
            tempD= denom1;
        }
        else{
            tempN=numer1*denom2+numer2*denom1;
            //System.out.println(tempN);
            tempD= denom1*denom2;
            //System.out.println(tempD);
        }

        int temp = tempD;
        for(int i=2;i<=temp;i++){

            if (tempN%i==0 && tempD%i==0){
                    tempN=tempN/i;
                    //System.out.println("분자 :" + tempN);
                    tempD=tempD/i;
                    //System.out.println("분모 :" + tempD);
                    i=2;
            }

        }

        int[] answer = {tempN,tempD};



        return answer;
    }
}
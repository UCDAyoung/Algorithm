/* 작성 : 21.06.17 
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 * 
 */
package package1;

public class Pro_42840_yet {

}



/* 예외를 찾지 못하여 실패 
class Solution {
    static int sum1 = 0;
    static int sum2 = 0;
    static int sum3 = 0;
    static int[] result;
    static int highNum=0;//높은 점수를 받은 학생 숫자 
    static int MAX=0;
    
    public int[] solution(int[] answers) {
    
    for(int i=0 ; i<answers.length;i++){
        one(i,answers);
        two(i,answers);
        three(i,answers);   
    }
    check();
    return aftercheck();     
    }
    
    public static void one(int i,int[] answers){
        if(answers[i] == (i+1)%6){
            sum1++;    
        }
        return;
    }
    public static void two(int i,int[] answers){
        
        int twoAns=0;
        int num = i+1; //i는 0부터 시작 then, num은 1부터 시작 
        if(num%2==0){  //짝수 
            int even = num %8; 
            switch(even){
                case 0:
                    twoAns=5;
                    break;//반목문이 아니더라도 break를 해주지 않으면 안끝남
                case 2:
                    twoAns=1;
                    break;
                case 4:
                    twoAns=3;
                    break;
                case 6:
                    twoAns=4;
                    break;
            }            
        }else if(num%2!=0){//홀수 
            twoAns=2;
        }
                 
        if(answers[i] == twoAns)
            sum2++;        
        return;
    }
    public static void three(int i,int[] answers){
        int threeAns=0;
        int num = i%10;
        switch(num){
            case 0,1:
                threeAns=3;
                break;
            case 2,3:
                threeAns=1;
                break;
            case 4,5:
                threeAns=2;
                break;
            case 6,7:
                threeAns=4;
                break;
            case 8,9:
                threeAns=5;
                break;
        }
        if(answers[i] == threeAns)
            sum3++;
        return;
    }
    public static void check(){
        MAX = Math.max(Math.max(sum1,sum2),sum3);
        
        
        if(MAX==sum1)
            highNum +=1;
        if(MAX==sum2)
            highNum +=1;
        if(MAX==sum3)
            highNum +=1;
        //if문을 이어서 만든 것과 else if의 차이 : 첫 조건을 마치고 다음 조건으로 들어감 하지만, else if문은 끝나는구나..?
        if(MAX==0)
            highNum=0;
    }
        public static int[] aftercheck(){
        if(highNum==3){
            result = new int[]{1,2,3};
        }else if(highNum==2){
            if(MAX == sum1 && MAX == sum2)
                result = new int[]{1,2};
            else if(MAX == sum2 && MAX == sum3)
                result = new int[]{2,3};
            else if(MAX == sum1 && MAX == sum3)
                result = new int[]{1,3};
        }else if(highNum==1){
            result = new int[]{1};  
        }
        return result;
    }
}
*/
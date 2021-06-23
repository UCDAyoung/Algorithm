/*
 * "주어진 두 배열이 길이가 같다" 라는 말이 set, hash를 이용할 수 있다는 것을 말을 해주는 것 같음.
 */
package hash;
import java.util.*;
public class Pro_42579 {
	public static void main(String[] args) {
	}
	public int[] solution(String[] genres, int[] plays) {
		int len = genres.length;
	    HashMap<Songs,Integer> maps = new HashMap<Songs,Integer>();
	    Songs[] songs = new Songs[len];
	      
	  //클래스에 담기 
	      for(int i=0 ;i<len; i++){
	    	  songs[i](genres[i],plays[i],i);
	      }
	      
	  //장르 묶기     
	      for(int i=0 ;i<len;i++){
	          if(maps.containsKey(genres[i])==true){
	              maps.put(genres[i],maps.get(genres[i])+plays[i]);
	          }else{
	              maps.put(genres[i],plays[i]);
	          }
	      }
	  //장르 순서잡기 
	      Object[] keyset = maps.keySet().toArray(); //keyset은 set - list - list를 배열로 변환 by toArray() 
	      Arrays.sort(keyset,Collections.reverseOrder());
	      
	      // 정렬된 장르를 하나씩 뽑아서 내부정렬?
	      // 내림차순으로 똑같이 정렬, 만약 같으면 고유번호찾아서 오름차순
	      
	      //플레이수 정렬 
	      for(int i=0 ; i<keyset.length; i++){
	 
	      }
	          
	      
	      
	      
	      int[] answer = {};
	      return answer;
	  }
	  
	  public static Songs[] swap(Songs[] songs,int n1, int n2){
	      Songs temp = songs[n1];
	      songs[n1] = songs[n2];
	      songs[n2] = temp;
	      
	      return songs;
	  }
}


class Songs {
  String genre;
  int play;
  int idx;
  Songs(String genre,int play,int idx){
      this.genre = genre;
      this.play = play;
      this.idx = idx; 
  }
  
}
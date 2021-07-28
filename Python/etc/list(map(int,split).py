#input말고 map함수로 입력 받기
import sys

a = list(map(int,sys.stdin.readline().split()))

#e.g 입력 10 20 30

#1.  input으로 입력 받을 시 문자열 형태로 "10 20 30"
#2. split() : 공백문자 기준으로 문자를 나누어 리스트에 들어가게 된다.
input().split() #[10,20,30] 여전히 10,20,30은 문자열
#2.1 숫자로 입력받고 싶으면 -> map()함수를 사용해서 변형
map(int,input().split()) #[10,20,30]


#배열 초기화방법

#0으로 배열 초기화
b = [0 for _ in range(10)]
b = [0]*10
#2차원 배열 초기화
b2 = [[0]*3 for _ in range(5)]  #3행 5열
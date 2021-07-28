# m권의 책만들 수 있다. -> 포인트
# 일단 정렬한다
# 큰걸 최대한 적게 가야한다... 가장 작은 거리부터 왔다갔다하면 된다.

import sys

#Input = [list(map(int,sys.stdin.readline().split()))]  #input[0] == 책 갯수 #input[1] = 들 수 있는 최대 권 수
n,m = map(int,sys.stdin.readline().split())
books = list(map(int,sys.stdin.readline().split()))     # [[-37, 2, -6, -39, -29, 11, -28]] list 2개에 싸인거 뭐니..?

                                                        #for i in len(books):   #인덱스로만 돌리려는 습관 버리자..
#양수,음수 나눈다
minus = []
plus = []

for book in books:
    if book <0:
        minus.append(abs(book)) #절대값을 씌움
    else:
        plus.append(book)

#정렬(내림차순)
minus.sort(reverse=True)
plus.sort(reverse=True)


minusMove = []
plusMove = []
# m권만큼 건너뜀
for i in range(0,len(minus),m):
    minusMove.append(minus[i])
for i in range(0,len(plus),m):
    plusMove.append(plus[i])

result = 0
maxMove = 0

if minusMove:
    maxMove = max(minusMove[0],maxMove)
    print(maxMove)
if plusMove:
    maxMove = max(plusMove[0],maxMove)
    print(maxMove)
# 최대값은 1번 밖에 안가니까/  음수랑 양수중에 최대값을 골라내는 작업인것같은데요?

result = (sum(minusMove) + sum(plusMove))*2 -maxMove
print(result)




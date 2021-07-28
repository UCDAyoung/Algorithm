#참고 사이트
#daleseo.com / littlefoxdiary.tistory.com/3
#k번째 최소값/최대값을 구할 때 최소힙 및 최대힙을 사용하면 효율적으로 구할 수 있다.
#왜지 ?

import heapq
import sys

n = int(input())
list = []
#board = [list(map(int,input.split(" "))) for _ in range(n)] #이중배열
#    list = sorted(list,reverse=True)[:n]

heapq.heapify(list) # list to heap

for _ in range(n):
    for x in map(int,sys.stdin.readline().split()):
        heapq.heappush(list,x)
        if len(list) > n: #파이썬 len??
            heapq.heappop(list)
print(heapq.heappop(list))


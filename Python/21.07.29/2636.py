#bfs
#0이 주변에 1개라도 있으면 삭제  #단 삭제하는 갯수를 세야함
#만약 삭제했는데 더 이상 남은 1이 없다? 그럼 답
#최대 가로세로 100개씩

import sys
from collections import deque

time = 0            #치즈 시간
dx = [-1,0,1,0]     #주변 0있는지 확인
dy = [0,-1,0,1]
#입력 및 초기화
x,y = list(map(int,sys.stdin.readline().split()))
arr = [[0 for col in range(y)] for row in range(x)]                     #이중배열 초기화  [ [열 ] 행  ]
arr = [list(map(int,sys.stdin.readline().split())) for i in range(x)]   #이중배열 입력받는 법? 처음사용해보는 기법
visited = [[False]*y for _ in range(x)]

#bfs
def bfs(i, j):
    q = deque()  # 왜 deque?
    q.append([i,j])
    visited[i][j] = True
    cnt = 0  # 사라진 갯수

    while q:
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < x and 0 <= ny < y:
                if arr[nx][ny] == 0:
                    arr[i][j] = 0
                    cnt += 1
                if arr[nx][ny] == 1 and visited[nx][ny] == False:
                    q.append([nx,ny])
    return cnt

for i in range(x):
    for j in range(y):
        if arr[i][j] == 1:
            bfs(i,j,arr)
            time += 1

print(time)
print(cnt)







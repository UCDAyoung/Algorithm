#[0,0] 부터 시작해서 만나는 1들은 0으로 바꿔주고, 계속해서 1을 찾아 녹이는 방식으로 가면 된다?
#0만 넣고, 1을 넣지 않느게 포인트다...
#체크해야할 것들  1. 방문여부, 카운팅, 반복횟수
import sys
from collections import deque

dx = [-1,0,1,0]
dy = [0,-1,0,1]
time = 0

def bfs():
    #선언 및 초기화
    visited = [[False] * col for _ in range(row)]
    cnt = 0
    q = deque()
    #시작점
    q.append([0,0])
    visited[0][0] = True
    while q:
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            #사방에 방문안한 0이라면 큐에 넣는다.
            if 0 <= nx < row and 0 <= ny < col:
                if arr[nx][ny] == 0 and visited[nx][ny] == False:
                    q.append([nx,ny])
                    visited[nx][ny]= True
                #1이라면 0으로 녹이고, cnt 센다.
                elif arr[nx][ny] == 1:
                    arr[nx][ny] = 0
                    visited[nx][ny] = True
                    cnt+=1
    return cnt
#입력
row,col= list(map(int,sys.stdin.readline().split())) #세로 == 행의 갯수 == row  #가로 == 열의 갯수 == col
arr = [list(map(int, sys.stdin.readline().split())) for i in range(row)]

ans = []
while True:
    cnt = bfs()  #bfs
    ans.append(cnt)
    if cnt == 0: #녹일만한 치즈가 없으므로
        break

    time +=1     #반복횟수

print(time)
print(ans[-2])

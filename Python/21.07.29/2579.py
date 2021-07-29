#점화식 :
#길이가 n인 계단 m의 경우의 수
        #D[n][m] = D[n-1]+D[n+1] 단, 예외의 수가 좀 있음
#예외
        #처음 0, 그리고 0은 D[n-1] , 9는 D[n+1]이 적용이 안됨 .



n = int(input())
D = [[0]*10 for _ in range(101)]    #전체 배열 초기화
D[1] = [0]+[1]*9                    #길이 1인 경우 초기화 bottom-Up
sum = 0

#계단
for i in range(2,n+1):              #범위
    for j in range(10):
                                    #예외 처리
        if j==0:
            D[i][j] = D[i-1][j+1]
        elif j==9:
            D[i][j] = D[i-1][j - 1]
        else:
            D[i][j] = D[i-1][j-1] + D[i-1][j+1]
                                    #범위 계산 잘못해서 틀림..
for j in range(0,10):
    sum += D[n][j]

print(sum%1000000000)





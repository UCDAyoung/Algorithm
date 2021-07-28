#1 = 0
#2 = 1
#3 = 2
#4 = 2

#bottom-up 방식 / 배열 사용
x = int(input())                # 입력
dp = [0,0,1,1]                  # 횟수 저장할 배열

for i in range(4,x+1):
    dp.append(dp[i-1]+1)  #n-1 한 경우
    if i % 2 == 0:
        dp[i] = min(dp[i],dp[i // 2] + 1)
    if i % 3 == 0:
        dp[i] = min(dp[i], dp[i // 3] + 1)

print(dp[x])

#top-down 방식 / 딕셔너리 사용
x = int(input())
d= {0:0,1:0,2:1,3:1}                                #일부러 in 메소드를 이용하기 위해 딕셔너리 사용
def dp(n):
    if n in d:
        return d[n]                                  #배열에 이미 0,1,2 케이스를 넣어놓았기 때문에 따로 1이 되었을 때 끝이 난다고 해줄 필요가 없음.

    temp = 1+min(dp(n//3)+n%3,dp(n//2)+n%2)         #왜 더해주는건지 모르겠음.
    d[n] = temp
    return temp

print(dp(x))
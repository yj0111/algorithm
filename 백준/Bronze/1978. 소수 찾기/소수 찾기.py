import sys
input = sys.stdin.readline

n = int(input())
numbers = list(map(int, input().split()))
answer = 0

for num in numbers:
    cnt = 0
    for i in range(1, num + 1):
        if num % i == 0:
            cnt += 1

    if cnt == 2:
        answer += 1

print(answer)
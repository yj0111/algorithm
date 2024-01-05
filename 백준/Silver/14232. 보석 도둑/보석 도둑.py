n = int(input())
answer = []

for i in range(2,int(n ** 0.5) + 1):
    while n%i == 0:
        answer.append(i)
        n //= i
        
if n != 1:
    answer.append(n)

print(len(answer))
print(*answer)
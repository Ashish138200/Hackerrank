n, k = map(int, input().split())
x = 240 - k
c = 0
for i in range(1, n + 1):
    if x - 5 * i >= 0:
        x -= 5 * i
        c = c + 1
    else:
        break

print(c)
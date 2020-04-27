m = int(input())
s1 = input()
n = int(input())
s2 = input()
a = list(s1.split())
b = list(s2.split())
x = 0
y = 0
for i in range(0, m):
    item = int(a[i])
    x = x * 10 + item
for j in range(0, n):
    item = int(b[j])
    y = y * 10 + item
z = list(str(x + y))
lg = max(m, n)
a = []
lz = len(z)
if (lg == lz):
    a.append("0")
    for i in range(0, lg):
        a.append(z[i])
    for i in a:
        print(i, "", end="")
else:
    for i in z:
        print(i, "", end="")


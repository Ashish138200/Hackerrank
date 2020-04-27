n=int(input())
x=input()
l=list(x.split())
l.sort()
for i in range(0,n):
    print(l[i]+' ',end="")
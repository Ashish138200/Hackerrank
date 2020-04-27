# test case 2 failed
n=int(input())
x=input()
l=list(x.split())
n=len(l)
c=0
s=0
for i in range(0,n):
    l[i]=int(l[i])
for i in range(0,n):
    s=s+l[i]
    if(l[i]==-1 and s<0):   #-1 -1 -1 4 5
        c=c+1
print(c)
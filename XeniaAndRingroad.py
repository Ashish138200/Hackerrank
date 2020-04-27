n,m=map(int,input().split())
x=input()
a=list(x.split())
for i in range(m):
    a[i]=int(a[i])
c=a[0]-1
for i in range(1,m):
    if(a[i]>=a[i-1]):
        c+=a[i]-a[i-1]
    else:
        c+=n+a[i]-a[i-1]
print(c)
n,k=map(int,input().split())
x=input()
l=list(x.split())
ind=k-1
c=0
for i in range(n):
    l[i]=int(l[i])
for i in range(n):
    if(l[i]>=l[ind]):
        c+=1
print(c-1)
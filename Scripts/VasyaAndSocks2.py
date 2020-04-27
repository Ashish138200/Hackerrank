x=input()
l=list(x.split())
n=int(l[0])
m=int(l[1])
c=0
for i in range(0,n):
    c=c+1
    if(c%m==0):
        c=c+1
print(c)
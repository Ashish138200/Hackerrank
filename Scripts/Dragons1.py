s,n=map(int,input().split())
a=[]
f=1
for i in range(n):
    xi,yi=map(int,input().split())
    a.append([xi,yi])
a=sorted(a)
for i in range(n):
    if(s>a[i][0]):
        s=s+a[i][1]
    else:
        f=0
        break
if f==1:
    print("YES")
else:
    print("NO")

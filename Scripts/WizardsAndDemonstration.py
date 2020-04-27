import math
a=(input())
l=list(a.split())
n=int(l[0])
x=int(l[1])
y=int(l[2])
per=int(math.ceil((y/100)*n))
if(per>x):
    print(per-x)
else:
    print("0")
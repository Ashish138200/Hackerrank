m,n,a=input().split()
m=int(x)
n=int(y)
a=int(z)
if (n%a==0):
    l=int(n/a)
else:
    l=int((n/a)+1)
if (m%a==0):
    b=int(m/a)
else:
    b=int((m/a)+1)
print(l*b)
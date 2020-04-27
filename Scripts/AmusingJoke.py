s1=input()
s2=input()
s3=input()
s=s1+s2
l=list(s)
l1=list(s3)
l.sort()
l1.sort()
f=0
if(l == l1 and len(l)==len(l1)):
    f=1
else:
    f=0
if(f==1):
    print("YES")
else:
    print("NO")

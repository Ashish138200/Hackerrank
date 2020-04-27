x=input()
l=list(x.split())
n=int(l[0])
m=int(l[1])
i=0
def head():
    for i in range(m):
        print("#",end="")
    print()
def lrbody():
    for j in range(m):
        if(i!=j):
            print(".",end="")
        else:
            print("#",end="")
    print()
def rlbody():
    for k in range(m):
        if(m!=k+1):
            print(".",end="")
        else:
            print("#",end="")
    print()
c=0
for a in range(1,n+1):
    if(a%2!=0):
        head()
    if(a%2==0):
        if(c==0):
            rlbody()
            c=1
        else:
            lrbody()
            c=0